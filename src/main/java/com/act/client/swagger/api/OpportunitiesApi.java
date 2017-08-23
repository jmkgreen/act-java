package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.EncodingUtils;

import com.act.client.swagger.model.ActWebApiModelsCompaniesCompany;
import com.act.client.swagger.model.ActWebApiModelsContactsContact;
import com.act.client.swagger.model.ActWebApiModelsGroupsGroup;
import com.act.client.swagger.model.ActWebApiModelsOpportunitiesOpportunity;
import com.act.client.swagger.model.ActWebApiModelsOpportunitiesOpportunityProduct;
import com.act.client.swagger.model.ActWebApiModelsOpportunitiesProcess;
import com.act.client.swagger.model.ActWebApiModelsOpportunitiesStage;
import com.act.client.swagger.model.SystemObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public interface OpportunitiesApi extends ApiClient.Api {


  /**
   * Delete an existing opportunity.
   * 
    * @param id The unique identifier (id) for a given opportunity. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/Opportunities/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject opportunitiesDeleteById(@Param("id") String id);

  /**
   * Disassociate a contact (if it is present) from an opportunity.
   * 
    * @param id The unique identifier (id) for a given opportunity. (required)
    * @param companyId The unique identifier (id) for a given company that is associated with a opportunity. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/opportunities/{id}/companies/{companyId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject opportunitiesDeleteCompanyByIdAndCompanyId(@Param("id") String id, @Param("companyId") String companyId);

  /**
   * Disassociate a contact (if it is present) from an opportunity.
   * 
    * @param id The unique identifier (id) for a given opportunity. (required)
    * @param contactId The unique identifier (id) for a given contact that is associated with a opportunity. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/opportunities/{id}/contacts/{contactId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject opportunitiesDeleteContactByIdAndContactId(@Param("id") String id, @Param("contactId") String contactId);

  /**
   * Disassociate a group (if it is present) from an opportunity.
   * 
    * @param id The unique identifier (id) for a given opportunity. (required)
    * @param groupId The unique identifier (id) for a given group that is associated with a opportunity. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/opportunities/{id}/groups/{groupId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject opportunitiesDeleteGroupByIdAndGroupId(@Param("id") String id, @Param("groupId") String groupId);

  /**
   * Disassociate a product (if it is present) from an opportunity.
   * 
    * @param id The unique identifier (id) for a given opportunity. (required)
    * @param productId The unique identifier (id) for a given product that is associated with a opportunity. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/opportunities/{id}/products/{productId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject opportunitiesDeleteProductByIdAndProductId(@Param("id") String id, @Param("productId") String productId);

  /**
   * Get all opportunity matching an (optional) OData query.
   * 
   * @return List&lt;ActWebApiModelsOpportunitiesOpportunity&gt;
   */
  @RequestLine("GET /api/Opportunities")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsOpportunitiesOpportunity> opportunitiesGet();

  /**
   * Get a specific opportunity.
   * 
    * @param id The unique identifier (id) for a given opportunity. (required)
   * @return ActWebApiModelsOpportunitiesOpportunity
   */
  @RequestLine("GET /api/Opportunities/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsOpportunitiesOpportunity opportunitiesGetById(@Param("id") String id);

  /**
   * Get a opportunity process.
   * 
    * @param processId The unique identifier (id) for a given process. (required)
   * @return ActWebApiModelsOpportunitiesProcess
   */
  @RequestLine("GET /api/opportunities/processes/{processId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsOpportunitiesProcess opportunitiesGetProcessAndProcessId(@Param("processId") String processId);

  /**
   * Get all processes matching an (optional) OData query.
   * 
   * @return List&lt;ActWebApiModelsOpportunitiesProcess&gt;
   */
  @RequestLine("GET /api/opportunities/processes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsOpportunitiesProcess> opportunitiesGetProcesses();

  /**
   * Get all product(s) that are associated with a given opportunity and matching an (optional) OData query.
   * 
    * @param opportunityId The unique identifier (id) for a given opportunity. (required)
    * @param id The unique identifier (id) for a given opportunity product. (required)
   * @return ActWebApiModelsOpportunitiesOpportunityProduct
   */
  @RequestLine("GET /api/opportunities/{opportunityId}/products/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsOpportunitiesOpportunityProduct opportunitiesGetProductAndOpportunityIdById(@Param("opportunityId") String opportunityId, @Param("id") String id);

  /**
   * Get all product(s) that are associated with a given opportunity and matching an (optional) OData query.
   * 
    * @param id The unique identifier (id) for a given opportunity. (required)
   * @return List&lt;ActWebApiModelsOpportunitiesOpportunityProduct&gt;
   */
  @RequestLine("GET /api/opportunities/{id}/products")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsOpportunitiesOpportunityProduct> opportunitiesGetProductsById(@Param("id") String id);

  /**
   * Gets a stage.
   * 
    * @param stageId The unique identifier (id) for a given stage. (required)
   * @return ActWebApiModelsOpportunitiesStage
   */
  @RequestLine("GET /api/opportunities/stages/{stageId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsOpportunitiesStage opportunitiesGetStageAndStageId(@Param("stageId") String stageId);

  /**
   * Get all stages for a given process and matching an (optional) OData query.
   * 
    * @param processId The unique identifier (id) for a given process. (required)
   * @return List&lt;ActWebApiModelsOpportunitiesStage&gt;
   */
  @RequestLine("GET /api/opportunities/processes/{processId}/stages")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsOpportunitiesStage> opportunitiesGetStagesByProcessAndProcessId(@Param("processId") String processId);

  /**
   * Partially update an already existing opportunity.
   * 
    * @param id The unique identifier (id) for a given opportunity. (required)
    * @param opportunity The opportunity definition. (required)
   * @return ActWebApiModelsOpportunitiesOpportunity
   */
  @RequestLine("PATCH /api/Opportunities/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsOpportunitiesOpportunity opportunitiesPatchById(@Param("id") String id, ActWebApiModelsOpportunitiesOpportunity opportunity);

  /**
   * Partially update an already existing opportunity product.
   * 
    * @param id The unique identifier (id) for a given opportunity. (required)
    * @param productId The unique identifier (id) for a given opportunity product. (required)
    * @param product The opportunity product definition. (required)
   * @return ActWebApiModelsOpportunitiesOpportunityProduct
   */
  @RequestLine("PATCH /api/opportunities/{id}/products/{productId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsOpportunitiesOpportunityProduct opportunitiesPatchProductByIdAndProductId(@Param("id") String id, @Param("productId") String productId, ActWebApiModelsOpportunitiesOpportunityProduct product);

  /**
   * Create a new Opportunity.
   * 
    * @param opportunity The opportunity definition. (required)
   * @return ActWebApiModelsOpportunitiesOpportunity
   */
  @RequestLine("POST /api/Opportunities")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsOpportunitiesOpportunity opportunitiesPost(ActWebApiModelsOpportunitiesOpportunity opportunity);

  /**
   * Create a new Opportunity Product.
   * 
    * @param id The unique identifier (id) for a given opportunity. (required)
    * @param product The opportunity product definition. (required)
   * @return ActWebApiModelsOpportunitiesOpportunityProduct
   */
  @RequestLine("POST /api/opportunities/{id}/products")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsOpportunitiesOpportunityProduct opportunitiesPostProductById(@Param("id") String id, ActWebApiModelsOpportunitiesOpportunityProduct product);

  /**
   * Update an already existing opportunity.
   * 
    * @param id The unique identifier (id) for a given opportunity. (required)
    * @param opportunity The opportunity definition. (required)
   * @return ActWebApiModelsOpportunitiesOpportunity
   */
  @RequestLine("PUT /api/Opportunities/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsOpportunitiesOpportunity opportunitiesPutById(@Param("id") String id, ActWebApiModelsOpportunitiesOpportunity opportunity);

  /**
   * Associate the contact (if it is not already present) to a opportunity.
   * 
    * @param id The unique identifier (id) for a given opportunity. (required)
    * @param companyId The unique identifier (id) for a given company that aren&#39;t associated with a opportunity. (required)
   * @return ActWebApiModelsCompaniesCompany
   */
  @RequestLine("PUT /api/opportunities/{id}/companies/{companyId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsCompaniesCompany opportunitiesPutCompanyInOpportunityByIdAndCompanyId(@Param("id") String id, @Param("companyId") String companyId);

  /**
   * Associate the contact (if it is not already present) to a opportunity.
   * 
    * @param id The unique identifier (id) for a given opportunity. (required)
    * @param contactId The unique identifier (id) for a given contact that aren&#39;t associated with a opportunity. (required)
   * @return ActWebApiModelsContactsContact
   */
  @RequestLine("PUT /api/opportunities/{id}/contacts/{contactId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsContactsContact opportunitiesPutContactInOpportunityByIdAndContactId(@Param("id") String id, @Param("contactId") String contactId);

  /**
   * Associate the group (if it is not already present) to a opportunity.
   * 
    * @param id The unique identifier (id) for a given opportunity. (required)
    * @param groupId The unique identifier (id) for a given group that aren&#39;t associated with a opportunity. (required)
   * @return ActWebApiModelsGroupsGroup
   */
  @RequestLine("PUT /api/opportunities/{id}/groups/{groupId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsGroupsGroup opportunitiesPutGroupInOpportunityByIdAndGroupId(@Param("id") String id, @Param("groupId") String groupId);

  /**
   * Update an already existing opportunity.
   * 
    * @param id The unique identifier (id) for a given opportunity. (required)
    * @param productId The unique identifier (id) for a given opportunity product. (required)
    * @param product The opportunity product definition. (required)
   * @return ActWebApiModelsOpportunitiesOpportunityProduct
   */
  @RequestLine("PUT /api/opportunities/{id}/products/{productId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsOpportunitiesOpportunityProduct opportunitiesPutProductByIdAndProductId(@Param("id") String id, @Param("productId") String productId, ActWebApiModelsOpportunitiesOpportunityProduct product);
}
