package northgate;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Reader {

    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        ObjectMapper mapper = new ObjectMapper();

        try {
            //for really big files I would chop them up into 1Mb files at the bean boundarys and feed them in a loop
            //this is only any good for what has been given
            File file = new File("person test data.json");
            // Convert JSON string from file to Object

            Bean[] bean = mapper.readValue(file,Bean[].class);
            List<Bean> bean5 = new ArrayList<Bean>();
            for(Bean item : bean) {
                bean5.add(item);
            }
            final SimpleDateFormat dmyFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date barrier =dmyFormat.parse("1999-12-31");
                //imperitive for small lists
//                            Set<Bean> bean2 = new HashSet<Bean>();
//                            for(Bean item : bean5) {
//                                if (item.getDate_of_birth().getTime() < barrier.getTime()) {
//                                    bean2.add(item);
//                                }
//                            }

                //functional for biglists
                Set<Bean> bean2 = bean5.parallelStream().filter(u ->(u.getDate_of_birth().getTime() < barrier.getTime()
                        )).collect(Collectors.toSet());

                List<Bean> bean3 = new ArrayList<Bean>(bean2);
                Collections.sort(bean3, new Comparator() {

                    public int compare(Object o1, Object o2) {
                        Bean b1 = (Bean) o1;
                        Bean b2 = (Bean) o2;

                        if (b1.getFirst_name().compareTo( b2.getFirst_name()) != 0) {
                            return b1.getFirst_name().compareTo(b2.getFirst_name());
                        } else if (b1.getLast_name().compareTo(b2.getLast_name()) != 0){
                            return b1.getLast_name().compareTo(b2.getLast_name());
                        }
                        return 0;
                    }

                }  );
                System.out.println(bean3);

            } catch (ParseException e) {
                e.printStackTrace();
            }

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
