package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.model.ActWebApiModelsActivitiesActivitySeries;
import com.act.client.swagger.model.SystemObject;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActivitySeriesApi
 */
public class ActivitySeriesApiTest {

    private ActivitySeriesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ActivitySeriesApi.class);
    }

    
    /**
     * Delete an existing series activity.
     *
     * This will not remove activities that were part of the series and were rescheduled.
     */
    @Test
    public void activitySeriesDeleteByIdTest() {
        String id = null;
        // SystemObject response = api.activitySeriesDeleteById(id);

        // TODO: test validations
    }

    
    /**
     * Get all series activities matching an (optional) OData query.
     *
     * 
     */
    @Test
    public void activitySeriesGetTest() {
        // List<ActWebApiModelsActivitiesActivitySeries> response = api.activitySeriesGet();

        // TODO: test validations
    }

    
    /**
     * Get a specific series activity.
     *
     * 
     */
    @Test
    public void activitySeriesGetByIdTest() {
        String id = null;
        // ActWebApiModelsActivitiesActivitySeries response = api.activitySeriesGetById(id);

        // TODO: test validations
    }

    
    /**
     * Partially update an already existing series activity
     *
     * 
     */
    @Test
    public void activitySeriesPatchByIdTest() {
        String id = null;
        ActWebApiModelsActivitiesActivitySeries series = null;
        // ActWebApiModelsActivitiesActivitySeries response = api.activitySeriesPatchById(id, series);

        // TODO: test validations
    }

    
    /**
     * Create a new series activity.
     *
     * 
     */
    @Test
    public void activitySeriesPostTest() {
        ActWebApiModelsActivitiesActivitySeries series = null;
        // ActWebApiModelsActivitiesActivitySeries response = api.activitySeriesPost(series);

        // TODO: test validations
    }

    
    /**
     * Update an already existing series activity
     *
     * 
     */
    @Test
    public void activitySeriesPutByIdTest() {
        String id = null;
        ActWebApiModelsActivitiesActivitySeries series = null;
        // ActWebApiModelsActivitiesActivitySeries response = api.activitySeriesPutById(id, series);

        // TODO: test validations
    }

    
}
