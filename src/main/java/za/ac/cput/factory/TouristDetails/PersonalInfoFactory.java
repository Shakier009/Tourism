package za.ac.cput.factory.TouristDetails;

import za.ac.cput.domain.TouristDetails.PersonalInfo;

public class PersonalInfoFactory {

    public static PersonalInfo getPersonalInfo(String birthPlce, int age) {
        return new PersonalInfo.Builder().
                birthPlce(birthPlce).
                age(age).

                build();
    }
}
