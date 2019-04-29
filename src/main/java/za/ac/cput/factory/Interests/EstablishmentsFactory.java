package za.ac.cput.factory.Interests;

import za.ac.cput.domain.Interests.Establishments;

public class EstablishmentsFactory {

    public static Establishments getEstablishments(String location, String estId){
        return new Establishments.Builder().
                location(location).
                estId(estId).

                build();
}

    }