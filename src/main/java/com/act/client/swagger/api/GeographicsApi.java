package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.EncodingUtils;

import com.act.client.swagger.model.ActWebApiModelsGeographicsCountry;
import com.act.client.swagger.model.ActWebApiModelsGeographicsMask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public interface GeographicsApi extends ApiClient.Api {


  /**
   * Get all countries with phone format masks matching an (optional) OData query.
   * 
   * @return List&lt;ActWebApiModelsGeographicsCountry&gt;
   */
  @RequestLine("GET /api/geographics/phonenumber/countries")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsGeographicsCountry> geographicsGetCountries();

  /**
   * Get default phone format mask for a given country.  If missing, it will try to return the freeform mask.
   * 
    * @param country The country to get the default mask. (required)
   * @return ActWebApiModelsGeographicsMask
   */
  @RequestLine("GET /api/geographics/phonenumber/masks/{country}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsGeographicsMask geographicsGetDefaultMaskAndCountry(@Param("country") String country);

  /**
   * Get all phone format mask matching an (optional) OData query.
   * 
    * @param refresh Refreshing the Act! phone format mask cache. (optional)
   * @return List&lt;ActWebApiModelsGeographicsMask&gt;
   */
  @RequestLine("GET /api/geographics/phonenumber/masks?refresh={refresh}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsGeographicsMask> geographicsGetPhoneFormatsOrRefresh(@Param("refresh") Boolean refresh);

  /**
   * Get all phone format mask matching an (optional) OData query.
   * 
   * Note, this is equivalent to the other <code>geographicsGetPhoneFormatsOrRefresh</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GeographicsGetPhoneFormatsOrRefreshQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>refresh - Refreshing the Act! phone format mask cache. (optional)</li>
   *   </ul>
   * @return List&lt;ActWebApiModelsGeographicsMask&gt;
   */
  @RequestLine("GET /api/geographics/phonenumber/masks?refresh={refresh}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  List<ActWebApiModelsGeographicsMask> geographicsGetPhoneFormatsOrRefresh(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>geographicsGetPhoneFormatsOrRefresh</code> method in a fluent style.
   */
  public static class GeographicsGetPhoneFormatsOrRefreshQueryParams extends HashMap<String, Object> {
    public GeographicsGetPhoneFormatsOrRefreshQueryParams refresh(final Boolean value) {
      put("refresh", EncodingUtils.encode(value));
      return this;
    }
  }
}
