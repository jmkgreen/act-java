package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.model.ActWebApiModelsCompaniesCompany;
import com.act.client.swagger.model.ActWebApiModelsContactsContact;
import com.act.client.swagger.model.SystemObject;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CompaniesApi
 */
public class CompaniesApiTest {

    private CompaniesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(CompaniesApi.class);
    }

    
    /**
     * Delete an existing company.
     *
     * 
     */
    @Test
    public void companiesDeleteByIdTest() {
        String id = null;
        // SystemObject response = api.companiesDeleteById(id);

        // TODO: test validations
    }

    
    /**
     * Disassociate a contact (if it is present) from an company.
     *
     * 
     */
    @Test
    public void companiesDeleteContactByIdAndContactIdTest() {
        String id = null;
        String contactId = null;
        // SystemObject response = api.companiesDeleteContactByIdAndContactId(id, contactId);

        // TODO: test validations
    }

    
    /**
     * Get all companies matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void companiesGetTest() {
        // List<ActWebApiModelsCompaniesCompany> response = api.companiesGet();

        // TODO: test validations
    }

    
    /**
     * Get all companies that are associated with a given activity and matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void companiesGetByActivityByIdTest() {
        String id = null;
        // List<ActWebApiModelsCompaniesCompany> response = api.companiesGetByActivityById(id);

        // TODO: test validations
    }

    
    /**
     * Get all companies that are associated with a given contact and matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void companiesGetByContactByIdTest() {
        String id = null;
        // List<ActWebApiModelsCompaniesCompany> response = api.companiesGetByContactById(id);

        // TODO: test validations
    }

    
    /**
     * Get a specific company.
     *
     * 
     */
    @Test
    public void companiesGetByIdTest() {
        String id = null;
        // ActWebApiModelsCompaniesCompany response = api.companiesGetById(id);

        // TODO: test validations
    }

    
    /**
     * Get all companies that are associated with a given opportunity and matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void companiesGetByOpportunityByIdTest() {
        String id = null;
        // List<ActWebApiModelsCompaniesCompany> response = api.companiesGetByOpportunityById(id);

        // TODO: test validations
    }

    
    /**
     * Update (partially) an already existing company.
     *
     * 
     */
    @Test
    public void companiesPatchByIdTest() {
        String id = null;
        ActWebApiModelsCompaniesCompany company = null;
        // ActWebApiModelsCompaniesCompany response = api.companiesPatchById(id, company);

        // TODO: test validations
    }

    
    /**
     * Create a new company.
     *
     * 
     */
    @Test
    public void companiesPostTest() {
        ActWebApiModelsCompaniesCompany company = null;
        // ActWebApiModelsCompaniesCompany response = api.companiesPost(company);

        // TODO: test validations
    }

    
    /**
     * Update an already existing company.
     *
     * 
     */
    @Test
    public void companiesPutByIdTest() {
        String id = null;
        ActWebApiModelsCompaniesCompany company = null;
        // ActWebApiModelsCompaniesCompany response = api.companiesPutById(id, company);

        // TODO: test validations
    }

    
    /**
     * Associate the contact (if it is not already present) to a company.
     *
     * 
     */
    @Test
    public void companiesPutContactByIdAndContactIdTest() {
        String id = null;
        String contactId = null;
        // ActWebApiModelsContactsContact response = api.companiesPutContactByIdAndContactId(id, contactId);

        // TODO: test validations
    }

    
}
