package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.model.ActWebApiModelsContactsContact;
import com.act.client.swagger.model.ActWebApiModelsGroupsGroup;
import com.act.client.swagger.model.SystemObject;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsApi
 */
public class GroupsApiTest {

    private GroupsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(GroupsApi.class);
    }

    
    /**
     * Delete an existing group.
     *
     * 
     */
    @Test
    public void groupsDeleteByIdTest() {
        String id = null;
        // SystemObject response = api.groupsDeleteById(id);

        // TODO: test validations
    }

    
    /**
     * Disassociate a contact (if it is present) from a group.
     *
     * 
     */
    @Test
    public void groupsDeleteContactAndContactIdByIdTest() {
        String contactId = null;
        String id = null;
        // SystemObject response = api.groupsDeleteContactAndContactIdById(contactId, id);

        // TODO: test validations
    }

    
    /**
     * Get all groups matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void groupsGetTest() {
        // List<ActWebApiModelsGroupsGroup> response = api.groupsGet();

        // TODO: test validations
    }

    
    /**
     * Get all group(s) that are associated with a given contact and matches an (optional) OData Query.
     *
     * 
     */
    @Test
    public void groupsGetByContactByIdTest() {
        String id = null;
        // List<ActWebApiModelsGroupsGroup> response = api.groupsGetByContactById(id);

        // TODO: test validations
    }

    
    /**
     * Get all group(s) that are associated with a given group and matches an (optional) OData Query.
     *
     * 
     */
    @Test
    public void groupsGetByGroupByIdTest() {
        String id = null;
        // List<ActWebApiModelsGroupsGroup> response = api.groupsGetByGroupById(id);

        // TODO: test validations
    }

    
    /**
     * Get a specific Group.
     *
     * 
     */
    @Test
    public void groupsGetByIdTest() {
        String id = null;
        // ActWebApiModelsGroupsGroup response = api.groupsGetById(id);

        // TODO: test validations
    }

    
    /**
     * Get all group(s) that are associated with a given opportunity and matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void groupsGetByOpportunityByIdTest() {
        String id = null;
        // List<ActWebApiModelsGroupsGroup> response = api.groupsGetByOpportunityById(id);

        // TODO: test validations
    }

    
    /**
     * Update (partially) an already existing group.
     *
     * 
     */
    @Test
    public void groupsPatchByIdTest() {
        String id = null;
        ActWebApiModelsGroupsGroup group = null;
        // ActWebApiModelsGroupsGroup response = api.groupsPatchById(id, group);

        // TODO: test validations
    }

    
    /**
     * Create a new group.
     *
     * 
     */
    @Test
    public void groupsPostTest() {
        ActWebApiModelsGroupsGroup group = null;
        // ActWebApiModelsGroupsGroup response = api.groupsPost(group);

        // TODO: test validations
    }

    
    /**
     * Update an already existing group.
     *
     * 
     */
    @Test
    public void groupsPutByIdTest() {
        String id = null;
        ActWebApiModelsGroupsGroup group = null;
        // ActWebApiModelsGroupsGroup response = api.groupsPutById(id, group);

        // TODO: test validations
    }

    
    /**
     * Associate the contact (if it is not already present) to a group.
     *
     * 
     */
    @Test
    public void groupsPutContactAndContactIdByIdTest() {
        String contactId = null;
        String id = null;
        // ActWebApiModelsContactsContact response = api.groupsPutContactAndContactIdById(contactId, id);

        // TODO: test validations
    }

    
}
