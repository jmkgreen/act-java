package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.EncodingUtils;

import com.act.client.swagger.model.ActWebApiModelsMetaDataPicklistsPickListItem;
import com.act.client.swagger.model.ActWebApiModelsMetadataTypeCodesActivityType;
import com.act.client.swagger.model.ActWebApiModelsMetadataTypeCodesHistoryType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public interface TypeInfoApi extends ApiClient.Api {


  /**
   * Get a specific activity type.
   * 
    * @param id The unique identifier (id) for a given activity type. (required)
   * @return List&lt;ActWebApiModelsMetadataTypeCodesActivityType&gt;
   */
  @RequestLine("GET /api/activitytypes/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsMetadataTypeCodesActivityType> typeInfoGetActivityTypeByIdById(@Param("id") Integer id);

  /**
   * Get a specific activity type by name.
   * 
    * @param name The name of the activity type. (required)
   * @return List&lt;ActWebApiModelsMetadataTypeCodesActivityType&gt;
   */
  @RequestLine("GET /api/activitytypes/name={name}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsMetadataTypeCodesActivityType> typeInfoGetActivityTypeByNameAndName(@Param("name") String name);

  /**
   * Gets all activity types.
   * 
   * @return List&lt;ActWebApiModelsMetadataTypeCodesActivityType&gt;
   */
  @RequestLine("GET /api/activitytypes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsMetadataTypeCodesActivityType> typeInfoGetActivityTypes();

  /**
   * Get a specific history type by name.
   * 
    * @param name The name of the history document type. (required)
   * @return List&lt;ActWebApiModelsMetadataTypeCodesActivityType&gt;
   */
  @RequestLine("GET /api/historytypes/{name}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsMetadataTypeCodesActivityType> typeInfoGetHistoryTypeByNameAndName(@Param("name") String name);

  /**
   * Gets all history types.
   * 
   * @return List&lt;ActWebApiModelsMetadataTypeCodesHistoryType&gt;
   */
  @RequestLine("GET /api/historytypes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsMetadataTypeCodesHistoryType> typeInfoGetHistoryTypes();

  /**
   * Gets all history types for a specific activity type.
   * 
    * @param id The unique identifier (id) for a given activity type. (required)
   * @return List&lt;ActWebApiModelsMetadataTypeCodesHistoryType&gt;
   */
  @RequestLine("GET /api/activitytypes/{id}/historytypes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsMetadataTypeCodesHistoryType> typeInfoGetHistoryTypesByActivityTypeIdById(@Param("id") Integer id);

  /**
   * Gets all history types for a specific activity type by name.
   * 
    * @param name The name of the activity type to filter by. (required)
   * @return List&lt;ActWebApiModelsMetadataTypeCodesHistoryType&gt;
   */
  @RequestLine("GET /api/activitytypes/name={name}/historytypes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsMetadataTypeCodesHistoryType> typeInfoGetHistoryTypesByActivityTypeNameAndName(@Param("name") String name);

  /**
   * Get a specific history document type by name.
   * 
    * @param name The name of the history document type. (required)
   * @return List&lt;ActWebApiModelsMetadataTypeCodesActivityType&gt;
   */
  @RequestLine("GET /api/documents/historytypes/{name}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsMetadataTypeCodesActivityType> typeInfoGetLibraryDocumentHistoryTypeByNameAndName(@Param("name") String name);

  /**
   * Gets all history document types.
   * 
   * @return List&lt;ActWebApiModelsMetadataTypeCodesHistoryType&gt;
   */
  @RequestLine("GET /api/documents/historytypes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsMetadataTypeCodesHistoryType> typeInfoGetLibraryDocumentHistoryTypes();

  /**
   * Get regarding picklist by name.
   * 
    * @param name  (required)
   * @return List&lt;ActWebApiModelsMetaDataPicklistsPickListItem&gt;
   */
  @RequestLine("GET /api/activitytypes/name={name}/regarding")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsMetaDataPicklistsPickListItem> typeInfoGetRegardingAndName(@Param("name") String name);

  /**
   * Get regarding picklist.
   * 
    * @param id  (required)
   * @return List&lt;ActWebApiModelsMetaDataPicklistsPickListItem&gt;
   */
  @RequestLine("GET /api/activitytypes/{id}/regarding")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsMetaDataPicklistsPickListItem> typeInfoGetRegardingById(@Param("id") Integer id);
}
