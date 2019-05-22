package za.ac.cput.repository.impl.TourDestination;

import za.ac.cput.domain.TourDestination.Cities;

import za.ac.cput.repository.TourDestination.CitiesRepository;

import java.util.HashSet;
import java.util.Set;

    public class CitiesRepositoryImpl implements CitiesRepository {

        private static CitiesRepositoryImpl repository = null;
        private Set<Cities> cities;

        private CitiesRepositoryImpl() {
            this.cities = new HashSet<>();
        }

        public static CitiesRepository getRepository(){
            if(repository == null) repository = new CitiesRepositoryImpl();
            return repository;
        }

        public Cities create(Cities cities){
            this.cities.add(cities);
            return cities;
        }

        public Cities read(String cityName){
            return null;
        }

        public Cities update(Cities cities) {
            return null;
        }

        public void delete(String cityName) {

        }

        public Set<Cities> getAll(){
            return this.cities;
        }
}
