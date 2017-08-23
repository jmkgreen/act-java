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
public interface HistoryApi extends ApiClient.Api {


  /**
   * Delete an existing history.
   * 
    * @param id The unique identifier (id) for a given history entry. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/History/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject historyDeleteById(@Param("id") String id);

  /**
   * Disassociate a contact (if it is present) from history item.
   * 
    * @param id The unique identifier (id) for a given history item. (required)
    * @param contactId The unique identifier (id) for a given contact that is associated with history item. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/history/{id}/contacts/{contactId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject historyDeleteContactByIdAndContactId(@Param("id") String id, @Param("contactId") String contactId);

  /**
   * Get all history itmes matching an (optional) OData query.
   * 
   * @return List&lt;ActWebApiModelsHistoriesHistory&gt;
   */
  @RequestLine("GET /api/History")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsHistoriesHistory> historyGet();

  /**
   * Get all history items that are associated with a given activity and matching an (optional) OData query.
   * 
    * @param id The unique identifier (id) for a given activity. (required)
   * @return List&lt;ActWebApiModelsHistoriesHistory&gt;
   */
  @RequestLine("GET /api/activities/{id}/history")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsHistoriesHistory> historyGetByActivityById(@Param("id") String id);

  /**
   * Get all history itmes for a given company and matching an (optional) OData query.
   * 
    * @param id The unique identifier (id) for a given company that is associated with a history item. (required)
   * @return List&lt;ActWebApiModelsHistoriesHistory&gt;
   */
  @RequestLine("GET /api/companies/{id}/history")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsHistoriesHistory> historyGetByCompanyById(@Param("id") String id);

  /**
   * Get all history itmes for a given contact and matching an (optional) OData query.
   * 
    * @param id The unique identifier (id) for a given contact that is associated with a history item. (required)
   * @return List&lt;ActWebApiModelsHistoriesHistory&gt;
   */
  @RequestLine("GET /api/contacts/{id}/history")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsHistoriesHistory> historyGetByContactById(@Param("id") String id);

  /**
   * Get all history itmes for a given group and matching an (optional) OData query.
   * 
    * @param id The unique identifier (id) for a given contact that is associated with a history item. (required)
   * @return List&lt;ActWebApiModelsHistoriesHistory&gt;
   */
  @RequestLine("GET /api/groups/{id}/history")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsHistoriesHistory> historyGetByGroupById(@Param("id") String id);

  /**
   * Get a specific history entry.
   * 
    * @param id The unique identifier (id) for a given history entry. (required)
   * @return ActWebApiModelsHistoriesHistory
   */
  @RequestLine("GET /api/History/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsHistoriesHistory historyGetById(@Param("id") String id);

  /**
   * Get all history itmes for a given opportunity and matching an (optional) OData query.
   * 
    * @param id The unique identifier (id) for a given opportunity that is associated with a history item. (required)
   * @return List&lt;ActWebApiModelsHistoriesHistory&gt;
   */
  @RequestLine("GET /api/opportunities/{id}/history")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsHistoriesHistory> historyGetByOpportunityById(@Param("id") String id);

  /**
   * Partially update an already existing history
   * 
    * @param id The unique identifier (id) for a given history item. (required)
    * @param history The history definition. (required)
   * @return ActWebApiModelsHistoriesHistory
   */
  @RequestLine("PATCH /api/History/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsHistoriesHistory historyPatchById(@Param("id") String id, ActWebApiModelsHistoriesHistory history);

  /**
   * Create a new history item.
   * 
    * @param history The history definition. (required)
   * @return ActWebApiModelsHistoriesHistory
   */
  @RequestLine("POST /api/History")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsHistoriesHistory historyPost(ActWebApiModelsHistoriesHistory history);

  /**
   * Update an already existing history
   * 
    * @param id The unique identifier (id) for a given history item. (required)
    * @param history The history definition. (required)
   * @return ActWebApiModelsHistoriesHistory
   */
  @RequestLine("PUT /api/History/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsHistoriesHistory historyPutById(@Param("id") String id, ActWebApiModelsHistoriesHistory history);

  /**
   * Associate the contact (if it is not already present) to history item.
   * 
    * @param id The unique identifier (id) for a given history item. (required)
    * @param contactId The unique identifier (id) for a given contact that is associated with a history item. (required)
   * @return ActWebApiModelsHistoriesHistory
   */
  @RequestLine("PUT /api/history/{id}/contacts/{contactId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsHistoriesHistory historyPutContactInHistoryByIdAndContactId(@Param("id") String id, @Param("contactId") String contactId);
}
