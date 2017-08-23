package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.model.ActWebApiModelsProductsProduct;
import com.act.client.swagger.model.SystemObject;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductsApi
 */
public class ProductsApiTest {

    private ProductsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ProductsApi.class);
    }

    
    /**
     * Delete an existing product.
     *
     * 
     */
    @Test
    public void productsDeleteByIdTest() {
        String id = null;
        // SystemObject response = api.productsDeleteById(id);

        // TODO: test validations
    }

    
    /**
     * Get all products matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void productsGetTest() {
        // List<ActWebApiModelsProductsProduct> response = api.productsGet();

        // TODO: test validations
    }

    
    /**
     * Get a specific product.
     *
     * 
     */
    @Test
    public void productsGetByIdTest() {
        String id = null;
        // ActWebApiModelsProductsProduct response = api.productsGetById(id);

        // TODO: test validations
    }

    
    /**
     * Partially update an already existing product.
     *
     * 
     */
    @Test
    public void productsPatchByIdTest() {
        String id = null;
        ActWebApiModelsProductsProduct product = null;
        // ActWebApiModelsProductsProduct response = api.productsPatchById(id, product);

        // TODO: test validations
    }

    
    /**
     * Create a new product.
     *
     * 
     */
    @Test
    public void productsPostTest() {
        ActWebApiModelsProductsProduct product = null;
        // ActWebApiModelsProductsProduct response = api.productsPost(product);

        // TODO: test validations
    }

    
    /**
     * Update an already existing product.
     *
     * 
     */
    @Test
    public void productsPutByIdTest() {
        String id = null;
        ActWebApiModelsProductsProduct product = null;
        // ActWebApiModelsProductsProduct response = api.productsPutById(id, product);

        // TODO: test validations
    }

    
}
