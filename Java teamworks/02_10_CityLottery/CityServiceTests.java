package com.datorium.Datorium.API;

import com.datorium.Datorium.API.CityLottery.City;
import com.datorium.Datorium.API.CityLottery.CityRepository;
import com.datorium.Datorium.API.CityLottery.CityService;
import com.datorium.Datorium.API.CityLottery.ICityRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.util.Assert;

import java.util.ArrayList;

import static org.mockito.Mockito.when;

public class CityServiceTests {

    // when there is goog and wocity
    // goog has 10% (10 citizens)
    // wocity has 90% (90 citizens)
    // randomizer chooses 9
    // choose goog

    @Test
    public void Given_Goog83_Wocity17_When_Randomizer82_Then_ChooseGoog() throws Exception {
        //Arrange
        //1. CityService needs cityRepository in the constructor
        //2. Make a fake cityRepository
        // Instead of using db, we are using fake data
        var cityRepository = Mockito.mock(ICityRepository.class);

        // 3. Create a city service, by providing fake repository
        // 4. Add a seed for the city service, that gives us
        // repeatable result
        var cityService = new CityService(cityRepository, 123);

        // 5. Create a list of fake cities
        var cities = new ArrayList<City>();
        // 6. Add fake cities, to our fake city list
        cities.add(new City("Goog", 83));
        cities.add(new City("Wocity", 17));

        // 7. Set it up, that when we want to get cities
        // we actually get these fake cities prepared in
        // point 6
        when(cityRepository.getCities()).thenReturn(cities);

        // Act
        var randomCity = cityService.getRandomCity();

        //Assert
        Assert.isTrue(randomCity.getName().equals("Goog"), "Goog is supposed to be chosen!");
    }
}
