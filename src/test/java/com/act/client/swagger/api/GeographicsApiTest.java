package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.model.ActWebApiModelsGeographicsCountry;
import com.act.client.swagger.model.ActWebApiModelsGeographicsMask;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GeographicsApi
 */
public class GeographicsApiTest {

    private GeographicsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(GeographicsApi.class);
    }

    
    /**
     * Get all countries with phone format masks matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void geographicsGetCountriesTest() {
        // List<ActWebApiModelsGeographicsCountry> response = api.geographicsGetCountries();

        // TODO: test validations
    }

    
    /**
     * Get default phone format mask for a given country.  If missing, it will try to return the freeform mask.
     *
     * 
     */
    @Test
    public void geographicsGetDefaultMaskAndCountryTest() {
        String country = null;
        // ActWebApiModelsGeographicsMask response = api.geographicsGetDefaultMaskAndCountry(country);

        // TODO: test validations
    }

    
    /**
     * Get all phone format mask matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void geographicsGetPhoneFormatsOrRefreshTest() {
        Boolean refresh = null;
        // List<ActWebApiModelsGeographicsMask> response = api.geographicsGetPhoneFormatsOrRefresh(refresh);

        // TODO: test validations
    }

    /**
     * Get all phone format mask matching an (optional) OData query.
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void geographicsGetPhoneFormatsOrRefreshTestQueryMap() {
        GeographicsApi.GeographicsGetPhoneFormatsOrRefreshQueryParams queryParams = new GeographicsApi.GeographicsGetPhoneFormatsOrRefreshQueryParams()
            .refresh(null);
        // List<ActWebApiModelsGeographicsMask> response = api.geographicsGetPhoneFormatsOrRefresh(queryParams);

    // TODO: test validations
    }
    
}
