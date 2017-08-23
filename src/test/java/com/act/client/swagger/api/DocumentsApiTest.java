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
 * API tests for DocumentsApi
 */
public class DocumentsApiTest {

    private DocumentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(DocumentsApi.class);
    }

    
    /**
     * Delete an existing history document.
     *
     * 
     */
    @Test
    public void documentsDeleteByIdTest() {
        String id = null;
        // SystemObject response = api.documentsDeleteById(id);

        // TODO: test validations
    }

    
    /**
     * Get all history documents matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void documentsGetTest() {
        // List<ActWebApiModelsHistoriesHistory> response = api.documentsGet();

        // TODO: test validations
    }

    
    /**
     * Get a specific history document.
     *
     * 
     */
    @Test
    public void documentsGetByIdTest() {
        String id = null;
        // ActWebApiModelsHistoriesHistory response = api.documentsGetById(id);

        // TODO: test validations
    }

    
    /**
     * Create a new history document.
     *
     * 
     */
    @Test
    public void documentsPostTest() {
        ActWebApiModelsHistoriesHistory history = null;
        // ActWebApiModelsHistoriesHistory response = api.documentsPost(history);

        // TODO: test validations
    }

    
    /**
     * Update an already existing history
     *
     * 
     */
    @Test
    public void documentsPutByIdTest() {
        String id = null;
        ActWebApiModelsHistoriesHistory history = null;
        // ActWebApiModelsHistoriesHistory response = api.documentsPutById(id, history);

        // TODO: test validations
    }

    
}
