package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.EncodingUtils;

import com.act.client.swagger.model.ActWebApiModelsUsersUserInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public interface UsersApi extends ApiClient.Api {


  /**
   * Get a specific user
   * 
    * @param id The unique identifier (id) for a given user. (required)
   * @return ActWebApiModelsUsersUserInfo
   */
  @RequestLine("GET /api/Users/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsUsersUserInfo usersGetById(@Param("id") String id);
}
