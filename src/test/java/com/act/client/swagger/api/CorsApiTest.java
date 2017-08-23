package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.model.SystemObject;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CorsApi
 */
public class CorsApiTest {

    private CorsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(CorsApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void corsDeleteAllowedCorsOriginByIdTest() {
        String id = null;
        // SystemObject response = api.corsDeleteAllowedCorsOriginById(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void corsGetAllowedCorsTest() {
        // String response = api.corsGetAllowedCors();

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void corsGetAllowedCorsByIdTest() {
        String id = null;
        // String response = api.corsGetAllowedCorsById(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void corsPutAllowedCorsOriginByIdTest() {
        String id = null;
        // String response = api.corsPutAllowedCorsOriginById(id);

        // TODO: test validations
    }

    
}
