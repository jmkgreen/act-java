package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.model.ActWebApiModelsSystemInfo;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SystemApi
 */
public class SystemApiTest {

    private SystemApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SystemApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void systemGetTest() {
        // ActWebApiModelsSystemInfo response = api.systemGet();

        // TODO: test validations
    }

    
}
