package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.EncodingUtils;

import com.act.client.swagger.model.ActWebApiModelsHistoriesHistory;
import com.act.client.swagger.model.SystemObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public interface DocumentsApi extends ApiClient.Api {


  /**
   * Delete an existing history document.
   * 
    * @param id The unique identifier (id) for a given history document. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/Documents/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject documentsDeleteById(@Param("id") String id);

  /**
   * Get all history documents matching an (optional) OData query.
   * 
   * @return List&lt;ActWebApiModelsHistoriesHistory&gt;
   */
  @RequestLine("GET /api/Documents")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsHistoriesHistory> documentsGet();

  /**
   * Get a specific history document.
   * 
    * @param id The unique identifier (id) for a given history document. (required)
   * @return ActWebApiModelsHistoriesHistory
   */
  @RequestLine("GET /api/Documents/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsHistoriesHistory documentsGetById(@Param("id") String id);

  /**
   * Create a new history document.
   * 
    * @param history The history definition. (required)
   * @return ActWebApiModelsHistoriesHistory
   */
  @RequestLine("POST /api/Documents")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsHistoriesHistory documentsPost(ActWebApiModelsHistoriesHistory history);

  /**
   * Update an already existing history
   * 
    * @param id The unique identifier (id) for a given history item. (required)
    * @param history The history definition. (required)
   * @return ActWebApiModelsHistoriesHistory
   */
  @RequestLine("PUT /api/Documents/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsHistoriesHistory documentsPutById(@Param("id") String id, ActWebApiModelsHistoriesHistory history);
}
