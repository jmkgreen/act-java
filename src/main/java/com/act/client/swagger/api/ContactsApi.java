package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.EncodingUtils;

import com.act.client.swagger.model.ActWebApiModelsContactsContact;
import com.act.client.swagger.model.SystemObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public interface ContactsApi extends ApiClient.Api {


  /**
   * Delete an existing contact.
   * 
    * @param id The unique identifier (id) for a given contact. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/Contacts/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject contactsDeleteById(@Param("id") String id);

  /**
   * Get all contacts matching an (optional) OData query.
   * 
   * @return List&lt;ActWebApiModelsContactsContact&gt;
   */
  @RequestLine("GET /api/Contacts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsContactsContact> contactsGet();

  /**
   * Get all contact(s) that are associated with a given company and matching an (optional) OData query..
   * 
    * @param id The unique identifier (id) for a given company. (required)
   * @return List&lt;ActWebApiModelsContactsContact&gt;
   */
  @RequestLine("GET /api/companies/{id}/contacts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsContactsContact> contactsGetByCompanyById(@Param("id") String id);

  /**
   * Get all contact(s) that are associated with a given group and matching an (optional) OData query.
   * 
    * @param id The unique identifier (id) for a given group. (required)
   * @return List&lt;ActWebApiModelsContactsContact&gt;
   */
  @RequestLine("GET /api/groups/{id}/contacts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsContactsContact> contactsGetByGroupById(@Param("id") String id);

  /**
   * Get a specific contacts that is associated of a given group.
   * 
    * @param id The unique identifier (id) for a given group. (required)
    * @param contactId The unique identifier (id) for a given contact. (required)
   * @return ActWebApiModelsContactsContact
   */
  @RequestLine("GET /api/groups/{id}/contacts/{contactId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsContactsContact contactsGetByGroupByIdAndContactId(@Param("id") String id, @Param("contactId") String contactId);

  /**
   * Get a specific contact.
   * 
    * @param id The unique identifier (id) for a given contact. (required)
   * @return ActWebApiModelsContactsContact
   */
  @RequestLine("GET /api/Contacts/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsContactsContact contactsGetById(@Param("id") String id);

  /**
   * Get all contact(s) that are associated with a given opportunity and matching an (optional) OData query.
   * 
    * @param id The unique identifier (id) for a given opportunity. (required)
   * @return List&lt;ActWebApiModelsContactsContact&gt;
   */
  @RequestLine("GET /api/opportunities/{id}/contacts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsContactsContact> contactsGetByOpportunityById(@Param("id") String id);

  /**
   * Update (partially) an already existing contact.
   * 
    * @param id The unique identifier (id) for a given contact. (required)
    * @param contact The contact definition. (required)
   * @return ActWebApiModelsContactsContact
   */
  @RequestLine("PATCH /api/Contacts/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsContactsContact contactsPatchById(@Param("id") String id, ActWebApiModelsContactsContact contact);

  /**
   * Create a new Contact.
   * 
    * @param contact The contact definition. (required)
   * @return ActWebApiModelsContactsContact
   */
  @RequestLine("POST /api/Contacts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsContactsContact contactsPost(ActWebApiModelsContactsContact contact);

  /**
   * Update an already existing contact.
   * 
    * @param id The unique identifier (id) for a given contact. (required)
    * @param contact The contact definition. (required)
   * @return ActWebApiModelsContactsContact
   */
  @RequestLine("PUT /api/Contacts/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsContactsContact contactsPutById(@Param("id") String id, ActWebApiModelsContactsContact contact);
}
