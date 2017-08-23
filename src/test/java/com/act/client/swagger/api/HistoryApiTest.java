package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.model.ActWebApiModelsHistoriesHistory;
import com.act.client.swagger.model.SystemObject;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HistoryApi
 */
public class HistoryApiTest {

    private HistoryApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(HistoryApi.class);
    }

    
    /**
     * Delete an existing history.
     *
     * 
     */
    @Test
    public void historyDeleteByIdTest() {
        String id = null;
        // SystemObject response = api.historyDeleteById(id);

        // TODO: test validations
    }

    
    /**
     * Disassociate a contact (if it is present) from history item.
     *
     * 
     */
    @Test
    public void historyDeleteContactByIdAndContactIdTest() {
        String id = null;
        String contactId = null;
        // SystemObject response = api.historyDeleteContactByIdAndContactId(id, contactId);

        // TODO: test validations
    }

    
    /**
     * Get all history itmes matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void historyGetTest() {
        // List<ActWebApiModelsHistoriesHistory> response = api.historyGet();

        // TODO: test validations
    }

    
    /**
     * Get all history items that are associated with a given activity and matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void historyGetByActivityByIdTest() {
        String id = null;
        // List<ActWebApiModelsHistoriesHistory> response = api.historyGetByActivityById(id);

        // TODO: test validations
    }

    
    /**
     * Get all history itmes for a given company and matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void historyGetByCompanyByIdTest() {
        String id = null;
        // List<ActWebApiModelsHistoriesHistory> response = api.historyGetByCompanyById(id);

        // TODO: test validations
    }

    
    /**
     * Get all history itmes for a given contact and matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void historyGetByContactByIdTest() {
        String id = null;
        // List<ActWebApiModelsHistoriesHistory> response = api.historyGetByContactById(id);

        // TODO: test validations
    }

    
    /**
     * Get all history itmes for a given group and matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void historyGetByGroupByIdTest() {
        String id = null;
        // List<ActWebApiModelsHistoriesHistory> response = api.historyGetByGroupById(id);

        // TODO: test validations
    }

    
    /**
     * Get a specific history entry.
     *
     * 
     */
    @Test
    public void historyGetByIdTest() {
        String id = null;
        // ActWebApiModelsHistoriesHistory response = api.historyGetById(id);

        // TODO: test validations
    }

    
    /**
     * Get all history itmes for a given opportunity and matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void historyGetByOpportunityByIdTest() {
        String id = null;
        // List<ActWebApiModelsHistoriesHistory> response = api.historyGetByOpportunityById(id);

        // TODO: test validations
    }

    
    /**
     * Partially update an already existing history
     *
     * 
     */
    @Test
    public void historyPatchByIdTest() {
        String id = null;
        ActWebApiModelsHistoriesHistory history = null;
        // ActWebApiModelsHistoriesHistory response = api.historyPatchById(id, history);

        // TODO: test validations
    }

    
    /**
     * Create a new history item.
     *
     * 
     */
    @Test
    public void historyPostTest() {
        ActWebApiModelsHistoriesHistory history = null;
        // ActWebApiModelsHistoriesHistory response = api.historyPost(history);

        // TODO: test validations
    }

    
    /**
     * Update an already existing history
     *
     * 
     */
    @Test
    public void historyPutByIdTest() {
        String id = null;
        ActWebApiModelsHistoriesHistory history = null;
        // ActWebApiModelsHistoriesHistory response = api.historyPutById(id, history);

        // TODO: test validations
    }

    
    /**
     * Associate the contact (if it is not already present) to history item.
     *
     * 
     */
    @Test
    public void historyPutContactInHistoryByIdAndContactIdTest() {
        String id = null;
        String contactId = null;
        // ActWebApiModelsHistoriesHistory response = api.historyPutContactInHistoryByIdAndContactId(id, contactId);

        // TODO: test validations
    }

    
}
