package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.model.ActWebApiModelsContactsContact;
import com.act.client.swagger.model.SystemObject;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactsApi
 */
public class ContactsApiTest {

    private ContactsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ContactsApi.class);
    }

    
    /**
     * Delete an existing contact.
     *
     * 
     */
    @Test
    public void contactsDeleteByIdTest() {
        String id = null;
        // SystemObject response = api.contactsDeleteById(id);

        // TODO: test validations
    }

    
    /**
     * Get all contacts matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void contactsGetTest() {
        // List<ActWebApiModelsContactsContact> response = api.contactsGet();

        // TODO: test validations
    }

    
    /**
     * Get all contact(s) that are associated with a given company and matching an (optional) OData query..
     *
     * 
     */
    @Test
    public void contactsGetByCompanyByIdTest() {
        String id = null;
        // List<ActWebApiModelsContactsContact> response = api.contactsGetByCompanyById(id);

        // TODO: test validations
    }

    
    /**
     * Get all contact(s) that are associated with a given group and matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void contactsGetByGroupByIdTest() {
        String id = null;
        // List<ActWebApiModelsContactsContact> response = api.contactsGetByGroupById(id);

        // TODO: test validations
    }

    
    /**
     * Get a specific contacts that is associated of a given group.
     *
     * 
     */
    @Test
    public void contactsGetByGroupByIdAndContactIdTest() {
        String id = null;
        String contactId = null;
        // ActWebApiModelsContactsContact response = api.contactsGetByGroupByIdAndContactId(id, contactId);

        // TODO: test validations
    }

    
    /**
     * Get a specific contact.
     *
     * 
     */
    @Test
    public void contactsGetByIdTest() {
        String id = null;
        // ActWebApiModelsContactsContact response = api.contactsGetById(id);

        // TODO: test validations
    }

    
    /**
     * Get all contact(s) that are associated with a given opportunity and matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void contactsGetByOpportunityByIdTest() {
        String id = null;
        // List<ActWebApiModelsContactsContact> response = api.contactsGetByOpportunityById(id);

        // TODO: test validations
    }

    
    /**
     * Update (partially) an already existing contact.
     *
     * 
     */
    @Test
    public void contactsPatchByIdTest() {
        String id = null;
        ActWebApiModelsContactsContact contact = null;
        // ActWebApiModelsContactsContact response = api.contactsPatchById(id, contact);

        // TODO: test validations
    }

    
    /**
     * Create a new Contact.
     *
     * 
     */
    @Test
    public void contactsPostTest() {
        ActWebApiModelsContactsContact contact = null;
        // ActWebApiModelsContactsContact response = api.contactsPost(contact);

        // TODO: test validations
    }

    
    /**
     * Update an already existing contact.
     *
     * 
     */
    @Test
    public void contactsPutByIdTest() {
        String id = null;
        ActWebApiModelsContactsContact contact = null;
        // ActWebApiModelsContactsContact response = api.contactsPutById(id, contact);

        // TODO: test validations
    }

    
}
