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
    public void Given_Goog83_Wocity17_When_Randomizer83_Then_ChooseGoog() throws Exception {
        //Arrange
        var cityRepository = Mockito.mock(ICityRepository.class);

        var cityService = new CityService(cityRepository, 123);

        var cities = new ArrayList<City>();
        cities.add(new City("Goog", 83));
        cities.add(new City("Wocity", 17));

        //WHEN someone asks db for cities
        //THEN return predetermined cities
        when(cityRepository.getCities()).thenReturn(cities);

        // Act
        var randomCity = cityService.getRandomCity();

        //Assert
        Assert.isTrue(randomCity.getName().equals("Goog"), "Goog is supposed to be chosen!");
    }
}
