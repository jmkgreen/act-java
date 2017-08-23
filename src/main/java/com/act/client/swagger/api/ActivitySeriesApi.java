package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.EncodingUtils;

import com.act.client.swagger.model.ActWebApiModelsActivitiesActivitySeries;
import com.act.client.swagger.model.SystemObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public interface ActivitySeriesApi extends ApiClient.Api {


  /**
   * Delete an existing series activity.
   * This will not remove activities that were part of the series and were rescheduled.
    * @param id The unique identifier (id) for a given series activity. (required)
   * @return SystemObject
   */
  @RequestLine("DELETE /api/ActivitySeries/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemObject activitySeriesDeleteById(@Param("id") String id);

  /**
   * Get all series activities matching an (optional) OData query.
   * 
   * @return List&lt;ActWebApiModelsActivitiesActivitySeries&gt;
   */
  @RequestLine("GET /api/ActivitySeries")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsActivitiesActivitySeries> activitySeriesGet();

  /**
   * Get a specific series activity.
   * 
    * @param id The unique identifier (id) for a given series activity. (required)
   * @return ActWebApiModelsActivitiesActivitySeries
   */
  @RequestLine("GET /api/ActivitySeries/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsActivitiesActivitySeries activitySeriesGetById(@Param("id") String id);

  /**
   * Partially update an already existing series activity
   * 
    * @param id The unique identifier (id) for a given series activity. (required)
    * @param series The series activity definition (required)
   * @return ActWebApiModelsActivitiesActivitySeries
   */
  @RequestLine("PATCH /api/ActivitySeries/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsActivitiesActivitySeries activitySeriesPatchById(@Param("id") String id, ActWebApiModelsActivitiesActivitySeries series);

  /**
   * Create a new series activity.
   * 
    * @param series The series activity definition. (required)
   * @return ActWebApiModelsActivitiesActivitySeries
   */
  @RequestLine("POST /api/ActivitySeries")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsActivitiesActivitySeries activitySeriesPost(ActWebApiModelsActivitiesActivitySeries series);

  /**
   * Update an already existing series activity
   * 
    * @param id The unique identifier (id) for a given series activity. (required)
    * @param series The series activity definition (required)
   * @return ActWebApiModelsActivitiesActivitySeries
   */
  @RequestLine("PUT /api/ActivitySeries/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActWebApiModelsActivitiesActivitySeries activitySeriesPutById(@Param("id") String id, ActWebApiModelsActivitiesActivitySeries series);
}
