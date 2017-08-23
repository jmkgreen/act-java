package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.EncodingUtils;

import com.act.client.swagger.model.ActWebApiModelsSystemInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public interface SystemApi extends ApiClient.Api {


  /**
   * 
   * 
   * @return ActWebApiModelsSystemInfo
   */
  @RequestLine("GET /api/System")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsSystemInfo systemGet();
}
