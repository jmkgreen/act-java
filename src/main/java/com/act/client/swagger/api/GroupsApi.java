package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.EncodingUtils;

import com.act.client.swagger.model.ActWebApiModelsContactsContact;
import com.act.client.swagger.model.ActWebApiModelsGroupsGroup;
import com.act.client.swagger.model.SystemObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public interface GroupsApi extends ApiClient.Api {


  /**
   * Delete an existing group.
   * 
    * @param id The unique identifier (id) for a given group. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/Groups/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject groupsDeleteById(@Param("id") String id);

  /**
   * Disassociate a contact (if it is present) from a group.
   * 
    * @param contactId The unique identifier (id) for a given contact that is associated with a group. (required)
    * @param id The unique identifier (id) for a given group. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/contacts/{contactId}/groups/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject groupsDeleteContactAndContactIdById(@Param("contactId") String contactId, @Param("id") String id);

  /**
   * Get all groups matching an (optional) OData query.
   * 
   * @return List&lt;ActWebApiModelsGroupsGroup&gt;
   */
  @RequestLine("GET /api/Groups")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsGroupsGroup> groupsGet();

  /**
   * Get all group(s) that are associated with a given contact and matches an (optional) OData Query.
   * 
    * @param id The unique identifier (id) for a given contact. (required)
   * @return List&lt;ActWebApiModelsGroupsGroup&gt;
   */
  @RequestLine("GET /api/contacts/{id}/groups")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsGroupsGroup> groupsGetByContactById(@Param("id") String id);

  /**
   * Get all group(s) that are associated with a given group and matches an (optional) OData Query.
   * 
    * @param id The unique identifier (id) for a given group. (required)
   * @return List&lt;ActWebApiModelsGroupsGroup&gt;
   */
  @RequestLine("GET /api/groups/{id}/groups")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsGroupsGroup> groupsGetByGroupById(@Param("id") String id);

  /**
   * Get a specific Group.
   * 
    * @param id The unique identifier (id) for a given group. (required)
   * @return ActWebApiModelsGroupsGroup
   */
  @RequestLine("GET /api/Groups/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsGroupsGroup groupsGetById(@Param("id") String id);

  /**
   * Get all group(s) that are associated with a given opportunity and matching an (optional) OData query.
   * 
    * @param id The unique identifier (id) for a given opportunity. (required)
   * @return List&lt;ActWebApiModelsGroupsGroup&gt;
   */
  @RequestLine("GET /api/opportunities/{id}/groups")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsGroupsGroup> groupsGetByOpportunityById(@Param("id") String id);

  /**
   * Update (partially) an already existing group.
   * 
    * @param id The unique identifier (id) for a given group. (required)
    * @param group The group definition. (required)
   * @return ActWebApiModelsGroupsGroup
   */
  @RequestLine("PATCH /api/Groups/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsGroupsGroup groupsPatchById(@Param("id") String id, ActWebApiModelsGroupsGroup group);

  /**
   * Create a new group.
   * 
    * @param group The Group definition. (required)
   * @return ActWebApiModelsGroupsGroup
   */
  @RequestLine("POST /api/Groups")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsGroupsGroup groupsPost(ActWebApiModelsGroupsGroup group);

  /**
   * Update an already existing group.
   * 
    * @param id The unique identifier (id) for a given group. (required)
    * @param group The group definition. (required)
   * @return ActWebApiModelsGroupsGroup
   */
  @RequestLine("PUT /api/Groups/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsGroupsGroup groupsPutById(@Param("id") String id, ActWebApiModelsGroupsGroup group);

  /**
   * Associate the contact (if it is not already present) to a group.
   * 
    * @param contactId The unique identifier (id) for a given contact that is associated with a group. (required)
    * @param id The unique identifier (id) for a given group. (required)
   * @return ActWebApiModelsContactsContact
   */
  @RequestLine("PUT /api/contacts/{contactId}/groups/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsContactsContact groupsPutContactAndContactIdById(@Param("contactId") String contactId, @Param("id") String id);
}
