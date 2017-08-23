package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.EncodingUtils;

import com.act.client.swagger.model.SystemObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public interface CorsApi extends ApiClient.Api {


  /**
   * 
   * 
    * @param id  (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/Cors/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject corsDeleteAllowedCorsOriginById(@Param("id") String id);

  /**
   * 
   * 
   * @return String
   */
  @RequestLine("GET /api/Cors")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  String corsGetAllowedCors();

  /**
   * 
   * 
    * @param id  (required)
   * @return String
   */
  @RequestLine("GET /api/Cors/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  String corsGetAllowedCorsById(@Param("id") String id);

  /**
   * 
   * 
    * @param id  (required)
   * @return String
   */
  @RequestLine("PUT /api/Cors/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  String corsPutAllowedCorsOriginById(@Param("id") String id);
}
