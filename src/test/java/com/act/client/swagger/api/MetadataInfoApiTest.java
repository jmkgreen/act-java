package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.model.ActWebApiModelsMetaDataPicklistsPickList;
import com.act.client.swagger.model.ActWebApiModelsMetaDataPicklistsPickListItem;
import com.act.client.swagger.model.ActWebApiModelsMetaDataSchemaColumn;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MetadataInfoApi
 */
public class MetadataInfoApiTest {

    private MetadataInfoApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(MetadataInfoApi.class);
    }

    
    /**
     * Get all field metadata matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void metadataInfoGetFieldsAndRecordTypeTest() {
        String recordType = null;
        // List<ActWebApiModelsMetaDataSchemaColumn> response = api.metadataInfoGetFieldsAndRecordType(recordType);

        // TODO: test validations
    }

    /**
     * Get all field metadata matching an (optional) OData query.
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void metadataInfoGetFieldsAndRecordTypeTestQueryMap() {
        MetadataInfoApi.MetadataInfoGetFieldsAndRecordTypeQueryParams queryParams = new MetadataInfoApi.MetadataInfoGetFieldsAndRecordTypeQueryParams()
            .recordType(null);
        // List<ActWebApiModelsMetaDataSchemaColumn> response = api.metadataInfoGetFieldsAndRecordType(queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a specific field metadata.
     *
     * 
     */
    @Test
    public void metadataInfoGetFieldsAndRecordTypeByIdTest() {
        String recordType = null;
        String id = null;
        // List<ActWebApiModelsMetaDataSchemaColumn> response = api.metadataInfoGetFieldsAndRecordTypeById(recordType, id);

        // TODO: test validations
    }

    /**
     * Get a specific field metadata.
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void metadataInfoGetFieldsAndRecordTypeByIdTestQueryMap() {
        String id = null;
        MetadataInfoApi.MetadataInfoGetFieldsAndRecordTypeByIdQueryParams queryParams = new MetadataInfoApi.MetadataInfoGetFieldsAndRecordTypeByIdQueryParams()
            .recordType(null);
        // List<ActWebApiModelsMetaDataSchemaColumn> response = api.metadataInfoGetFieldsAndRecordTypeById(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get all picklist metadata matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void metadataInfoGetPicklistAndRecordTypeTest() {
        String recordType = null;
        // List<ActWebApiModelsMetaDataPicklistsPickList> response = api.metadataInfoGetPicklistAndRecordType(recordType);

        // TODO: test validations
    }

    /**
     * Get all picklist metadata matching an (optional) OData query.
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void metadataInfoGetPicklistAndRecordTypeTestQueryMap() {
        MetadataInfoApi.MetadataInfoGetPicklistAndRecordTypeQueryParams queryParams = new MetadataInfoApi.MetadataInfoGetPicklistAndRecordTypeQueryParams()
            .recordType(null);
        // List<ActWebApiModelsMetaDataPicklistsPickList> response = api.metadataInfoGetPicklistAndRecordType(queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a specific picklist metadata.
     *
     * 
     */
    @Test
    public void metadataInfoGetPicklistAndRecordTypeByIdTest() {
        String recordType = null;
        String id = null;
        // List<ActWebApiModelsMetaDataPicklistsPickList> response = api.metadataInfoGetPicklistAndRecordTypeById(recordType, id);

        // TODO: test validations
    }

    /**
     * Get a specific picklist metadata.
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void metadataInfoGetPicklistAndRecordTypeByIdTestQueryMap() {
        String id = null;
        MetadataInfoApi.MetadataInfoGetPicklistAndRecordTypeByIdQueryParams queryParams = new MetadataInfoApi.MetadataInfoGetPicklistAndRecordTypeByIdQueryParams()
            .recordType(null);
        // List<ActWebApiModelsMetaDataPicklistsPickList> response = api.metadataInfoGetPicklistAndRecordTypeById(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Gets all picklist item(s).
     *
     * 
     */
    @Test
    public void metadataInfoGetPicklistItemsAndPickListIdTest() {
        String pickListId = null;
        // List<ActWebApiModelsMetaDataPicklistsPickListItem> response = api.metadataInfoGetPicklistItemsAndPickListId(pickListId);

        // TODO: test validations
    }

    
    /**
     * Gets a specific picklist item.
     *
     * 
     */
    @Test
    public void metadataInfoGetPicklistItemsAndPickListIdByIdTest() {
        String pickListId = null;
        String id = null;
        // List<ActWebApiModelsMetaDataPicklistsPickListItem> response = api.metadataInfoGetPicklistItemsAndPickListIdById(pickListId, id);

        // TODO: test validations
    }

    
}
