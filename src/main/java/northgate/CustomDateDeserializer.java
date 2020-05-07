package northgate;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;



class CustomDateDeserializer extends StdDeserializer<Date> {
        
        private SimpleDateFormat formatter = 
          new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
     
        public CustomDateDeserializer() {
            this(null);
        }
     
        public CustomDateDeserializer(Class<?> vc) {
            super(vc);
        }
     
        @Override
        public Date deserialize(JsonParser jsonparser, DeserializationContext context)
          throws IOException, JsonProcessingException {
            String date;
            if (jsonparser.getText().length() > 10) {
                formatter = 
                        new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                date = jsonparser.getText().split("[.]")[0];
            }else {
                formatter = 
                        new SimpleDateFormat("yyyy-MM-dd");
                date = jsonparser.getText();

            }
            try {
                return formatter.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }

   
 
    }