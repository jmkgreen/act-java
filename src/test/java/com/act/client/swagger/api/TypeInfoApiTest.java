package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.model.ActWebApiModelsMetaDataPicklistsPickListItem;
import com.act.client.swagger.model.ActWebApiModelsMetadataTypeCodesActivityType;
import com.act.client.swagger.model.ActWebApiModelsMetadataTypeCodesHistoryType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TypeInfoApi
 */
public class TypeInfoApiTest {

    private TypeInfoApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(TypeInfoApi.class);
    }

    
    /**
     * Get a specific activity type.
     *
     * 
     */
    @Test
    public void typeInfoGetActivityTypeByIdByIdTest() {
        Integer id = null;
        // List<ActWebApiModelsMetadataTypeCodesActivityType> response = api.typeInfoGetActivityTypeByIdById(id);

        // TODO: test validations
    }

    
    /**
     * Get a specific activity type by name.
     *
     * 
     */
    @Test
    public void typeInfoGetActivityTypeByNameAndNameTest() {
        String name = null;
        // List<ActWebApiModelsMetadataTypeCodesActivityType> response = api.typeInfoGetActivityTypeByNameAndName(name);

        // TODO: test validations
    }

    
    /**
     * Gets all activity types.
     *
     * 
     */
    @Test
    public void typeInfoGetActivityTypesTest() {
        // List<ActWebApiModelsMetadataTypeCodesActivityType> response = api.typeInfoGetActivityTypes();

        // TODO: test validations
    }

    
    /**
     * Get a specific history type by name.
     *
     * 
     */
    @Test
    public void typeInfoGetHistoryTypeByNameAndNameTest() {
        String name = null;
        // List<ActWebApiModelsMetadataTypeCodesActivityType> response = api.typeInfoGetHistoryTypeByNameAndName(name);

        // TODO: test validations
    }

    
    /**
     * Gets all history types.
     *
     * 
     */
    @Test
    public void typeInfoGetHistoryTypesTest() {
        // List<ActWebApiModelsMetadataTypeCodesHistoryType> response = api.typeInfoGetHistoryTypes();

        // TODO: test validations
    }

    
    /**
     * Gets all history types for a specific activity type.
     *
     * 
     */
    @Test
    public void typeInfoGetHistoryTypesByActivityTypeIdByIdTest() {
        Integer id = null;
        // List<ActWebApiModelsMetadataTypeCodesHistoryType> response = api.typeInfoGetHistoryTypesByActivityTypeIdById(id);

        // TODO: test validations
    }

    
    /**
     * Gets all history types for a specific activity type by name.
     *
     * 
     */
    @Test
    public void typeInfoGetHistoryTypesByActivityTypeNameAndNameTest() {
        String name = null;
        // List<ActWebApiModelsMetadataTypeCodesHistoryType> response = api.typeInfoGetHistoryTypesByActivityTypeNameAndName(name);

        // TODO: test validations
    }

    
    /**
     * Get a specific history document type by name.
     *
     * 
     */
    @Test
    public void typeInfoGetLibraryDocumentHistoryTypeByNameAndNameTest() {
        String name = null;
        // List<ActWebApiModelsMetadataTypeCodesActivityType> response = api.typeInfoGetLibraryDocumentHistoryTypeByNameAndName(name);

        // TODO: test validations
    }

    
    /**
     * Gets all history document types.
     *
     * 
     */
    @Test
    public void typeInfoGetLibraryDocumentHistoryTypesTest() {
        // List<ActWebApiModelsMetadataTypeCodesHistoryType> response = api.typeInfoGetLibraryDocumentHistoryTypes();

        // TODO: test validations
    }

    
    /**
     * Get regarding picklist by name.
     *
     * 
     */
    @Test
    public void typeInfoGetRegardingAndNameTest() {
        String name = null;
        // List<ActWebApiModelsMetaDataPicklistsPickListItem> response = api.typeInfoGetRegardingAndName(name);

        // TODO: test validations
    }

    
    /**
     * Get regarding picklist.
     *
     * 
     */
    @Test
    public void typeInfoGetRegardingByIdTest() {
        Integer id = null;
        // List<ActWebApiModelsMetaDataPicklistsPickListItem> response = api.typeInfoGetRegardingById(id);

        // TODO: test validations
    }

    
}
