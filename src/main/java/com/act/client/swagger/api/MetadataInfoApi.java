package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.EncodingUtils;

import com.act.client.swagger.model.ActWebApiModelsMetaDataPicklistsPickList;
import com.act.client.swagger.model.ActWebApiModelsMetaDataPicklistsPickListItem;
import com.act.client.swagger.model.ActWebApiModelsMetaDataSchemaColumn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public interface MetadataInfoApi extends ApiClient.Api {


  /**
   * Get all field metadata matching an (optional) OData query.
   * 
    * @param recordType Specifies the core mutable record types within the ACT! application. (required)
   * @return List&lt;ActWebApiModelsMetaDataSchemaColumn&gt;
   */
  @RequestLine("GET /api/metadata/fields?recordType={recordType}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsMetaDataSchemaColumn> metadataInfoGetFieldsAndRecordType(@Param("recordType") String recordType);

  /**
   * Get all field metadata matching an (optional) OData query.
   * 
   * Note, this is equivalent to the other <code>metadataInfoGetFieldsAndRecordType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MetadataInfoGetFieldsAndRecordTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recordType - Specifies the core mutable record types within the ACT! application. (required)</li>
   *   </ul>
   * @return List&lt;ActWebApiModelsMetaDataSchemaColumn&gt;
   */
  @RequestLine("GET /api/metadata/fields?recordType={recordType}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  List<ActWebApiModelsMetaDataSchemaColumn> metadataInfoGetFieldsAndRecordType(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>metadataInfoGetFieldsAndRecordType</code> method in a fluent style.
   */
  public static class MetadataInfoGetFieldsAndRecordTypeQueryParams extends HashMap<String, Object> {
    public MetadataInfoGetFieldsAndRecordTypeQueryParams recordType(final String value) {
      put("recordType", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a specific field metadata.
   * 
    * @param recordType Specifies the core mutable record types within the ACT! application. (required)
    * @param id A unique identifier for a field. (required)
   * @return List&lt;ActWebApiModelsMetaDataSchemaColumn&gt;
   */
  @RequestLine("GET /api/metadata/fields/{id}?recordType={recordType}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsMetaDataSchemaColumn> metadataInfoGetFieldsAndRecordTypeById(@Param("recordType") String recordType, @Param("id") String id);

  /**
   * Get a specific field metadata.
   * 
   * Note, this is equivalent to the other <code>metadataInfoGetFieldsAndRecordTypeById</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MetadataInfoGetFieldsAndRecordTypeByIdQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id A unique identifier for a field. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recordType - Specifies the core mutable record types within the ACT! application. (required)</li>
   *   </ul>
   * @return List&lt;ActWebApiModelsMetaDataSchemaColumn&gt;
   */
  @RequestLine("GET /api/metadata/fields/{id}?recordType={recordType}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  List<ActWebApiModelsMetaDataSchemaColumn> metadataInfoGetFieldsAndRecordTypeById(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>metadataInfoGetFieldsAndRecordTypeById</code> method in a fluent style.
   */
  public static class MetadataInfoGetFieldsAndRecordTypeByIdQueryParams extends HashMap<String, Object> {
    public MetadataInfoGetFieldsAndRecordTypeByIdQueryParams recordType(final String value) {
      put("recordType", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get all picklist metadata matching an (optional) OData query.
   * 
    * @param recordType Specifies the core mutable record types within the ACT! application. (required)
   * @return List&lt;ActWebApiModelsMetaDataPicklistsPickList&gt;
   */
  @RequestLine("GET /api/metadata/picklists?recordType={recordType}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsMetaDataPicklistsPickList> metadataInfoGetPicklistAndRecordType(@Param("recordType") String recordType);

  /**
   * Get all picklist metadata matching an (optional) OData query.
   * 
   * Note, this is equivalent to the other <code>metadataInfoGetPicklistAndRecordType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MetadataInfoGetPicklistAndRecordTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recordType - Specifies the core mutable record types within the ACT! application. (required)</li>
   *   </ul>
   * @return List&lt;ActWebApiModelsMetaDataPicklistsPickList&gt;
   */
  @RequestLine("GET /api/metadata/picklists?recordType={recordType}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  List<ActWebApiModelsMetaDataPicklistsPickList> metadataInfoGetPicklistAndRecordType(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>metadataInfoGetPicklistAndRecordType</code> method in a fluent style.
   */
  public static class MetadataInfoGetPicklistAndRecordTypeQueryParams extends HashMap<String, Object> {
    public MetadataInfoGetPicklistAndRecordTypeQueryParams recordType(final String value) {
      put("recordType", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a specific picklist metadata.
   * 
    * @param recordType Specifies the core mutable record types within the ACT! application. (required)
    * @param id A unique identifier for a field. (required)
   * @return List&lt;ActWebApiModelsMetaDataPicklistsPickList&gt;
   */
  @RequestLine("GET /api/metadata/picklists/{id}?recordType={recordType}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsMetaDataPicklistsPickList> metadataInfoGetPicklistAndRecordTypeById(@Param("recordType") String recordType, @Param("id") String id);

  /**
   * Get a specific picklist metadata.
   * 
   * Note, this is equivalent to the other <code>metadataInfoGetPicklistAndRecordTypeById</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MetadataInfoGetPicklistAndRecordTypeByIdQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id A unique identifier for a field. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recordType - Specifies the core mutable record types within the ACT! application. (required)</li>
   *   </ul>
   * @return List&lt;ActWebApiModelsMetaDataPicklistsPickList&gt;
   */
  @RequestLine("GET /api/metadata/picklists/{id}?recordType={recordType}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  List<ActWebApiModelsMetaDataPicklistsPickList> metadataInfoGetPicklistAndRecordTypeById(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>metadataInfoGetPicklistAndRecordTypeById</code> method in a fluent style.
   */
  public static class MetadataInfoGetPicklistAndRecordTypeByIdQueryParams extends HashMap<String, Object> {
    public MetadataInfoGetPicklistAndRecordTypeByIdQueryParams recordType(final String value) {
      put("recordType", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Gets all picklist item(s).
   * 
    * @param pickListId The unique identifier (id) for a given PickList. (required)
   * @return List&lt;ActWebApiModelsMetaDataPicklistsPickListItem&gt;
   */
  @RequestLine("GET /api/metadata/picklists/{pickListId}/items")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsMetaDataPicklistsPickListItem> metadataInfoGetPicklistItemsAndPickListId(@Param("pickListId") String pickListId);

  /**
   * Gets a specific picklist item.
   * 
    * @param pickListId The unique identifier (id) for a given PickList. (required)
    * @param id The unique identifier (id) for a given item within a PickList. (required)
   * @return List&lt;ActWebApiModelsMetaDataPicklistsPickListItem&gt;
   */
  @RequestLine("GET /api/metadata/picklists/{pickListId}/items/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsMetaDataPicklistsPickListItem> metadataInfoGetPicklistItemsAndPickListIdById(@Param("pickListId") String pickListId, @Param("id") String id);
}
