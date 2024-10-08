package com.datorium.Datorium.API.CityLottery;

import java.util.Random;

public class CityService {

    private ICityRepository cityRepository;
    private int seed;
    public CityService(ICityRepository cityRepository, int seed){
        this.cityRepository = cityRepository;
        this.seed = seed;
    }

    public CityService(ICityRepository cityRepository){
        this.cityRepository = cityRepository;
    }
    /*
     * 0. Prepare a list of cities
     * 1. Count total amount of citizens -> 100
     * 2. Choose random number -> 56
     * 3. Loop going through all of the cities
     * 4. Choose the city with correct lottery ticket
     * */



    public City getRandomCity() throws Exception {
        var cities = cityRepository.getCities();
        //1. Count total amount of citizens -> 100
        var totalCitizenCount = 0;
        for (City city: cities){
            totalCitizenCount += city.getPopulation();
        }
        //2. Choose random number -> 56
        // If we have seed, then random = new Random(seed) else random = new Random()
        Random random = (seed != 0)
                ? new Random(seed)
                : new Random();

        int randomValue = random.nextInt(totalCitizenCount);

        //3. Loop going through all of the cities
        //4. Choose the city with correct lottery ticket
        //population -> 25
        //randomValue -> 56
        //We subtract 56 - 25 = 31
        // BECAUSE ITS NOT BELOW OR EQUAL TO 0, GO TO NEXT
        // 31 - 75 -> because it's below 0, we choose this city
        for(City city: cities){
            randomValue -= city.getPopulation();

            if(randomValue <= 0){
                return city;
            }
        }
        throw new Exception("Something wrong");
    }


}
