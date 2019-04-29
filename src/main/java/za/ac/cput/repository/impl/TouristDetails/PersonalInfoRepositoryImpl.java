package za.ac.cput.repository.impl.TouristDetails;

import za.ac.cput.domain.TouristDetails.PersonalInfo;
import za.ac.cput.repository.TouristDetails.PersonalInfoRepository;


import java.util.HashSet;
import java.util.Set;


    public class PersonalInfoRepositoryImpl implements PersonalInfoRepository {

        private static PersonalInfoRepository repository = null;
        private Set<PersonalInfo> personalInfo;

        private PersonalInfoRepositoryImpl() {
            this.personalInfo = new HashSet<>();
        }

        public static PersonalInfoRepository getRepository(){
            if(repository == null) repository = new PersonalInfoRepositoryImpl();
            return repository;
        }

        public PersonalInfo create(PersonalInfo personalInfo){
            this.personalInfo.add(personalInfo);
            return personalInfo;
        }

        public PersonalInfo read(String birthPlce){
            //find the student in the set and return it if it exist
            return null;
        }

        public PersonalInfo update(PersonalInfo personalInfo) {
            // find the student, update it and return the updated student
            return null;
        }

        public void delete(String birthPlce) {
            //find the student and delete it if it exists

        }

        public Set<PersonalInfo> getAll(){
            return this.personalInfo;
        }
}
