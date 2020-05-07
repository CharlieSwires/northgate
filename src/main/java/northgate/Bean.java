package northgate;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;



public class Bean {
        private String person_id; //"49fdd3c7-971d-4599-9cd7-a6ccf5513995",
        @JsonDeserialize(using = CustomDateDeserializer.class)
        private Date created_datetime; //"2020-04-14 08:17:30.660950",
        private String created_by_username; //"Unable to get username",
        @JsonDeserialize(using = CustomDateDeserializer.class)
        private Date updated_datetime; //"2020-04-14 08:17:30.660950",
        private String updated_by_username; //"Unable to get username",
        private String first_name; //"James",
        private String middle_name; //"Michael",
        private String last_name; //"Smith",
        @JsonDeserialize(using = CustomDateDeserializer.class)
        private Date date_of_birth; //"2000-04-14",
        private Boolean deleted; //false,
        private Integer gender; //2,
        private Integer ethnicity; //3,
        private Integer nationality; //4,
        private Integer preferred_language; //5,
        private Integer religion; //6,
        private String other; //null,
        private Integer status_id; //29001,
        private String person_reference_number; //"LN43385",
        private String mobile_phone; //null,
        private String other_phone; //null,
        private String email_address; //null,
        private String staff_allocation; //null,
        private String team_allocation; //null,
        private String interpreter_required; //null,
        private String person_custody_details_id; //null,
        private String team_id; //null,
        private String org_id; //null,
        private String area_id; //null
        
        public Bean() {
            
        }
        public String getPerson_id() {
            return person_id;
        }
        public void setPerson_id(String person_id) {
            this.person_id = person_id;
        }
        public String getCreated_by_username() {
            return created_by_username;
        }
        public void setCreated_by_username(String created_by_username) {
            this.created_by_username = created_by_username;
        }
        public Date getUpdated_datetime() {
            return updated_datetime;
        }
        public void setUpdated_datetime(Date updated_datetime) {
            this.updated_datetime = updated_datetime;
        }
        public String getUpdated_by_username() {
            return updated_by_username;
        }
        public void setUpdated_by_username(String updated_by_username) {
            this.updated_by_username = updated_by_username;
        }
        public String getFirst_name() {
            return first_name;
        }
        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }
        public String getMiddle_name() {
            return middle_name;
        }
        public void setMiddle_name(String middle_name) {
            this.middle_name = middle_name;
        }
        public String getLast_name() {
            return last_name;
        }
        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }
        public Date getDate_of_birth() {
            return date_of_birth;
        }
        public void setDate_of_birth(Date date_of_birth) {
            this.date_of_birth = date_of_birth;
        }
        public Boolean getDeleted() {
            return deleted;
        }
        public void setDeleted(Boolean deleted) {
            this.deleted = deleted;
        }
        public Integer getGender() {
            return gender;
        }
        public void setGender(Integer gender) {
            this.gender = gender;
        }
        public Integer getEthnicity() {
            return ethnicity;
        }
        public void setEthnicity(Integer ethnicity) {
            this.ethnicity = ethnicity;
        }
        public Integer getNationality() {
            return nationality;
        }
        public void setNationality(Integer nationality) {
            this.nationality = nationality;
        }
        public Integer getPreferred_language() {
            return preferred_language;
        }
        public void setPreferred_language(Integer preferred_language) {
            this.preferred_language = preferred_language;
        }
        public Integer getReligion() {
            return religion;
        }
        public void setReligion(Integer religion) {
            this.religion = religion;
        }
        public String getOther() {
            return other;
        }
        public void setOther(String other) {
            this.other = other;
        }
        public Integer getStatus_id() {
            return status_id;
        }
        public void setStatus_id(Integer status_id) {
            this.status_id = status_id;
        }
        public String getPerson_reference_number() {
            return person_reference_number;
        }
        public void setPerson_reference_number(String person_reference_number) {
            this.person_reference_number = person_reference_number;
        }
        public String getMobile_phone() {
            return mobile_phone;
        }
        public void setMobile_phone(String mobile_phone) {
            this.mobile_phone = mobile_phone;
        }
        public String getOther_phone() {
            return other_phone;
        }
        public void setOther_phone(String other_phone) {
            this.other_phone = other_phone;
        }
        public String getEmail_address() {
            return email_address;
        }
        public void setEmail_address(String email_address) {
            this.email_address = email_address;
        }
        public String getStaff_allocation() {
            return staff_allocation;
        }
        public void setStaff_allocation(String staff_allocation) {
            this.staff_allocation = staff_allocation;
        }
        public String getTeam_allocation() {
            return team_allocation;
        }
        public void setTeam_allocation(String team_allocation) {
            this.team_allocation = team_allocation;
        }
        public String getInterpreter_required() {
            return interpreter_required;
        }
        public void setInterpreter_required(String interpreter_required) {
            this.interpreter_required = interpreter_required;
        }
        public String getPerson_custody_details_id() {
            return person_custody_details_id;
        }
        public void setPerson_custody_details_id(String person_custody_details_id) {
            this.person_custody_details_id = person_custody_details_id;
        }
        public String getTeam_id() {
            return team_id;
        }
        public void setTeam_id(String team_id) {
            this.team_id = team_id;
        }
        public String getOrg_id() {
            return org_id;
        }
        public void setOrg_id(String org_id) {
            this.org_id = org_id;
        }
        public String getArea_id() {
            return area_id;
        }
        public void setArea_id(String area_id) {
            this.area_id = area_id;
        }
        @Override
        public String toString() {
            return "\nItem [first_name=" + first_name + ", middle_name=" + middle_name + ", last_name="
                    + last_name + ", age=" + age(date_of_birth)  + "]";
        }
        private int age(Date dob) {
            Date current = new Date();
            long diff = current.getTime()-dob.getTime();
            int age = (int)(((((diff / 1000.0)/60.0)/60.0)/24.0)/365.25);
            return age;
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((date_of_birth == null) ? 0 : date_of_birth.hashCode());
            result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
            result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
            result = prime * result + ((middle_name == null) ? 0 : middle_name.hashCode());
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Bean other = (Bean) obj;
            if (date_of_birth == null) {
                if (other.date_of_birth != null)
                    return false;
            } else if (!date_of_birth.equals(other.date_of_birth))
                return false;
            if (first_name == null) {
                if (other.first_name != null)
                    return false;
            } else if (!first_name.equals(other.first_name))
                return false;
            if (last_name == null) {
                if (other.last_name != null)
                    return false;
            } else if (!last_name.equals(other.last_name))
                return false;
            if (middle_name == null) {
                if (other.middle_name != null)
                    return false;
            } else if (!middle_name.equals(other.middle_name))
                return false;
            return true;
        }
        public Date getCreated_datetime() {
            return created_datetime;
        }
        public void setCreated_datetime(Date created_datetime) {
            this.created_datetime = created_datetime;
        }
    


}
