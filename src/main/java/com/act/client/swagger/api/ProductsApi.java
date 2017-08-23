package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.EncodingUtils;

import com.act.client.swagger.model.ActWebApiModelsProductsProduct;
import com.act.client.swagger.model.SystemObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public interface ProductsApi extends ApiClient.Api {


  /**
   * Delete an existing product.
   * 
    * @param id The unique identifier (id) for a given product. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/Products/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject productsDeleteById(@Param("id") String id);

  /**
   * Get all products matching an (optional) OData query.
   * 
   * @return List&lt;ActWebApiModelsProductsProduct&gt;
   */
  @RequestLine("GET /api/Products")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsProductsProduct> productsGet();

  /**
   * Get a specific product.
   * 
    * @param id The unique identifier (id) for a given product. (required)
   * @return ActWebApiModelsProductsProduct
   */
  @RequestLine("GET /api/Products/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsProductsProduct productsGetById(@Param("id") String id);

  /**
   * Partially update an already existing product.
   * 
    * @param id The unique identifier (id) for a given product. (required)
    * @param product The product definition. (required)
   * @return ActWebApiModelsProductsProduct
   */
  @RequestLine("PATCH /api/Products/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsProductsProduct productsPatchById(@Param("id") String id, ActWebApiModelsProductsProduct product);

  /**
   * Create a new product.
   * 
    * @param product The product definition. (required)
   * @return ActWebApiModelsProductsProduct
   */
  @RequestLine("POST /api/Products")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsProductsProduct productsPost(ActWebApiModelsProductsProduct product);

  /**
   * Update an already existing product.
   * 
    * @param id The unique identifier (id) for a given product. (required)
    * @param product The product definition. (required)
   * @return ActWebApiModelsProductsProduct
   */
  @RequestLine("PUT /api/Products/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsProductsProduct productsPutById(@Param("id") String id, ActWebApiModelsProductsProduct product);
}
