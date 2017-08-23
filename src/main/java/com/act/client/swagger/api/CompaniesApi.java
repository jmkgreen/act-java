package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.EncodingUtils;

import com.act.client.swagger.model.ActWebApiModelsCompaniesCompany;
import com.act.client.swagger.model.ActWebApiModelsContactsContact;
import com.act.client.swagger.model.SystemObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public interface CompaniesApi extends ApiClient.Api {


  /**
   * Delete an existing company.
   * 
    * @param id The unique identifier (id) for a given company. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/Companies/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject companiesDeleteById(@Param("id") String id);

  /**
   * Disassociate a contact (if it is present) from an company.
   * 
    * @param id The unique identifier (id) for a given opportunity. (required)
    * @param contactId The unique identifier (id) for a given contact that is associated with a opportunity. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/companies/{id}/contacts/{contactId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject companiesDeleteContactByIdAndContactId(@Param("id") String id, @Param("contactId") String contactId);

  /**
   * Get all companies matching an (optional) OData query.
   * 
   * @return List&lt;ActWebApiModelsCompaniesCompany&gt;
   */
  @RequestLine("GET /api/Companies")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsCompaniesCompany> companiesGet();

  /**
   * Get all companies that are associated with a given activity and matching an (optional) OData query.
   * 
    * @param id The unique identifier (id) for a given contact. (required)
   * @return List&lt;ActWebApiModelsCompaniesCompany&gt;
   */
  @RequestLine("GET /api/activities/{id}/companies")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsCompaniesCompany> companiesGetByActivityById(@Param("id") String id);

  /**
   * Get all companies that are associated with a given contact and matching an (optional) OData query.
   * 
    * @param id The unique identifier (id) for a given contact. (required)
   * @return List&lt;ActWebApiModelsCompaniesCompany&gt;
   */
  @RequestLine("GET /api/contacts/{id}/companies")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsCompaniesCompany> companiesGetByContactById(@Param("id") String id);

  /**
   * Get a specific company.
   * 
    * @param id The unique identifier (id) for a given company. (required)
   * @return ActWebApiModelsCompaniesCompany
   */
  @RequestLine("GET /api/Companies/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsCompaniesCompany companiesGetById(@Param("id") String id);

  /**
   * Get all companies that are associated with a given opportunity and matching an (optional) OData query.
   * 
    * @param id The unique identifier (id) for a given opportunity. (required)
   * @return List&lt;ActWebApiModelsCompaniesCompany&gt;
   */
  @RequestLine("GET /api/opportunities/{id}/companies")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsCompaniesCompany> companiesGetByOpportunityById(@Param("id") String id);

  /**
   * Update (partially) an already existing company.
   * 
    * @param id The unique identifier (id) for a given company. (required)
    * @param company The company definition. (required)
   * @return ActWebApiModelsCompaniesCompany
   */
  @RequestLine("PATCH /api/Companies/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsCompaniesCompany companiesPatchById(@Param("id") String id, ActWebApiModelsCompaniesCompany company);

  /**
   * Create a new company.
   * 
    * @param company The company definition. (required)
   * @return ActWebApiModelsCompaniesCompany
   */
  @RequestLine("POST /api/Companies")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsCompaniesCompany companiesPost(ActWebApiModelsCompaniesCompany company);

  /**
   * Update an already existing company.
   * 
    * @param id The unique identifier (id) for a given company. (required)
    * @param company The company definition. (required)
   * @return ActWebApiModelsCompaniesCompany
   */
  @RequestLine("PUT /api/Companies/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsCompaniesCompany companiesPutById(@Param("id") String id, ActWebApiModelsCompaniesCompany company);

  /**
   * Associate the contact (if it is not already present) to a company.
   * 
    * @param id The unique identifier (id) for a given company. (required)
    * @param contactId The unique identifier (id) for a given contact that aren&#39;t associated with a company. (required)
   * @return ActWebApiModelsContactsContact
   */
  @RequestLine("PUT /api/companies/{id}/contacts/{contactId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsContactsContact companiesPutContactByIdAndContactId(@Param("id") String id, @Param("contactId") String contactId);
}
