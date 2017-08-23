package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.model.ActWebApiModelsUsersUserInfo;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
public class UsersApiTest {

    private UsersApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(UsersApi.class);
    }

    
    /**
     * Get a specific user
     *
     * 
     */
    @Test
    public void usersGetByIdTest() {
        String id = null;
        // ActWebApiModelsUsersUserInfo response = api.usersGetById(id);

        // TODO: test validations
    }

    
}
