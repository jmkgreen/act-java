package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.model.ActWebApiModelsCompaniesCompany;
import com.act.client.swagger.model.ActWebApiModelsContactsContact;
import com.act.client.swagger.model.ActWebApiModelsGroupsGroup;
import com.act.client.swagger.model.ActWebApiModelsOpportunitiesOpportunity;
import com.act.client.swagger.model.ActWebApiModelsOpportunitiesOpportunityProduct;
import com.act.client.swagger.model.ActWebApiModelsOpportunitiesProcess;
import com.act.client.swagger.model.ActWebApiModelsOpportunitiesStage;
import com.act.client.swagger.model.SystemObject;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OpportunitiesApi
 */
public class OpportunitiesApiTest {

    private OpportunitiesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(OpportunitiesApi.class);
    }

    
    /**
     * Delete an existing opportunity.
     *
     * 
     */
    @Test
    public void opportunitiesDeleteByIdTest() {
        String id = null;
        // SystemObject response = api.opportunitiesDeleteById(id);

        // TODO: test validations
    }

    
    /**
     * Disassociate a contact (if it is present) from an opportunity.
     *
     * 
     */
    @Test
    public void opportunitiesDeleteCompanyByIdAndCompanyIdTest() {
        String id = null;
        String companyId = null;
        // SystemObject response = api.opportunitiesDeleteCompanyByIdAndCompanyId(id, companyId);

        // TODO: test validations
    }

    
    /**
     * Disassociate a contact (if it is present) from an opportunity.
     *
     * 
     */
    @Test
    public void opportunitiesDeleteContactByIdAndContactIdTest() {
        String id = null;
        String contactId = null;
        // SystemObject response = api.opportunitiesDeleteContactByIdAndContactId(id, contactId);

        // TODO: test validations
    }

    
    /**
     * Disassociate a group (if it is present) from an opportunity.
     *
     * 
     */
    @Test
    public void opportunitiesDeleteGroupByIdAndGroupIdTest() {
        String id = null;
        String groupId = null;
        // SystemObject response = api.opportunitiesDeleteGroupByIdAndGroupId(id, groupId);

        // TODO: test validations
    }

    
    /**
     * Disassociate a product (if it is present) from an opportunity.
     *
     * 
     */
    @Test
    public void opportunitiesDeleteProductByIdAndProductIdTest() {
        String id = null;
        String productId = null;
        // SystemObject response = api.opportunitiesDeleteProductByIdAndProductId(id, productId);

        // TODO: test validations
    }

    
    /**
     * Get all opportunity matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void opportunitiesGetTest() {
        // List<ActWebApiModelsOpportunitiesOpportunity> response = api.opportunitiesGet();

        // TODO: test validations
    }

    
    /**
     * Get a specific opportunity.
     *
     * 
     */
    @Test
    public void opportunitiesGetByIdTest() {
        String id = null;
        // ActWebApiModelsOpportunitiesOpportunity response = api.opportunitiesGetById(id);

        // TODO: test validations
    }

    
    /**
     * Get a opportunity process.
     *
     * 
     */
    @Test
    public void opportunitiesGetProcessAndProcessIdTest() {
        String processId = null;
        // ActWebApiModelsOpportunitiesProcess response = api.opportunitiesGetProcessAndProcessId(processId);

        // TODO: test validations
    }

    
    /**
     * Get all processes matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void opportunitiesGetProcessesTest() {
        // List<ActWebApiModelsOpportunitiesProcess> response = api.opportunitiesGetProcesses();

        // TODO: test validations
    }

    
    /**
     * Get all product(s) that are associated with a given opportunity and matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void opportunitiesGetProductAndOpportunityIdByIdTest() {
        String opportunityId = null;
        String id = null;
        // ActWebApiModelsOpportunitiesOpportunityProduct response = api.opportunitiesGetProductAndOpportunityIdById(opportunityId, id);

        // TODO: test validations
    }

    
    /**
     * Get all product(s) that are associated with a given opportunity and matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void opportunitiesGetProductsByIdTest() {
        String id = null;
        // List<ActWebApiModelsOpportunitiesOpportunityProduct> response = api.opportunitiesGetProductsById(id);

        // TODO: test validations
    }

    
    /**
     * Gets a stage.
     *
     * 
     */
    @Test
    public void opportunitiesGetStageAndStageIdTest() {
        String stageId = null;
        // ActWebApiModelsOpportunitiesStage response = api.opportunitiesGetStageAndStageId(stageId);

        // TODO: test validations
    }

    
    /**
     * Get all stages for a given process and matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void opportunitiesGetStagesByProcessAndProcessIdTest() {
        String processId = null;
        // List<ActWebApiModelsOpportunitiesStage> response = api.opportunitiesGetStagesByProcessAndProcessId(processId);

        // TODO: test validations
    }

    
    /**
     * Partially update an already existing opportunity.
     *
     * 
     */
    @Test
    public void opportunitiesPatchByIdTest() {
        String id = null;
        ActWebApiModelsOpportunitiesOpportunity opportunity = null;
        // ActWebApiModelsOpportunitiesOpportunity response = api.opportunitiesPatchById(id, opportunity);

        // TODO: test validations
    }

    
    /**
     * Partially update an already existing opportunity product.
     *
     * 
     */
    @Test
    public void opportunitiesPatchProductByIdAndProductIdTest() {
        String id = null;
        String productId = null;
        ActWebApiModelsOpportunitiesOpportunityProduct product = null;
        // ActWebApiModelsOpportunitiesOpportunityProduct response = api.opportunitiesPatchProductByIdAndProductId(id, productId, product);

        // TODO: test validations
    }

    
    /**
     * Create a new Opportunity.
     *
     * 
     */
    @Test
    public void opportunitiesPostTest() {
        ActWebApiModelsOpportunitiesOpportunity opportunity = null;
        // ActWebApiModelsOpportunitiesOpportunity response = api.opportunitiesPost(opportunity);

        // TODO: test validations
    }

    
    /**
     * Create a new Opportunity Product.
     *
     * 
     */
    @Test
    public void opportunitiesPostProductByIdTest() {
        String id = null;
        ActWebApiModelsOpportunitiesOpportunityProduct product = null;
        // ActWebApiModelsOpportunitiesOpportunityProduct response = api.opportunitiesPostProductById(id, product);

        // TODO: test validations
    }

    
    /**
     * Update an already existing opportunity.
     *
     * 
     */
    @Test
    public void opportunitiesPutByIdTest() {
        String id = null;
        ActWebApiModelsOpportunitiesOpportunity opportunity = null;
        // ActWebApiModelsOpportunitiesOpportunity response = api.opportunitiesPutById(id, opportunity);

        // TODO: test validations
    }

    
    /**
     * Associate the contact (if it is not already present) to a opportunity.
     *
     * 
     */
    @Test
    public void opportunitiesPutCompanyInOpportunityByIdAndCompanyIdTest() {
        String id = null;
        String companyId = null;
        // ActWebApiModelsCompaniesCompany response = api.opportunitiesPutCompanyInOpportunityByIdAndCompanyId(id, companyId);

        // TODO: test validations
    }

    
    /**
     * Associate the contact (if it is not already present) to a opportunity.
     *
     * 
     */
    @Test
    public void opportunitiesPutContactInOpportunityByIdAndContactIdTest() {
        String id = null;
        String contactId = null;
        // ActWebApiModelsContactsContact response = api.opportunitiesPutContactInOpportunityByIdAndContactId(id, contactId);

        // TODO: test validations
    }

    
    /**
     * Associate the group (if it is not already present) to a opportunity.
     *
     * 
     */
    @Test
    public void opportunitiesPutGroupInOpportunityByIdAndGroupIdTest() {
        String id = null;
        String groupId = null;
        // ActWebApiModelsGroupsGroup response = api.opportunitiesPutGroupInOpportunityByIdAndGroupId(id, groupId);

        // TODO: test validations
    }

    
    /**
     * Update an already existing opportunity.
     *
     * 
     */
    @Test
    public void opportunitiesPutProductByIdAndProductIdTest() {
        String id = null;
        String productId = null;
        ActWebApiModelsOpportunitiesOpportunityProduct product = null;
        // ActWebApiModelsOpportunitiesOpportunityProduct response = api.opportunitiesPutProductByIdAndProductId(id, productId, product);

        // TODO: test validations
    }

    
}
