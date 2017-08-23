package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.model.ActWebApiModelsAnalyticsPeriodicRevenue;
import org.threeten.bp.OffsetDateTime;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnalyticsApi
 */
public class AnalyticsApiTest {

    private AnalyticsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AnalyticsApi.class);
    }

    
    /**
     * Generates actual vs predicated revenue data for specific opportunties.
     *
     * 
     */
    @Test
    public void analyticsGetOpportunityActualVersusPredictedRevenueOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartTest() {
        String argsInterval = null;
        OffsetDateTime argsStart = null;
        OffsetDateTime argsEnd = null;
        Integer argsFiscalYearStart = null;
        // List<ActWebApiModelsAnalyticsPeriodicRevenue> response = api.analyticsGetOpportunityActualVersusPredictedRevenueOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStart(argsInterval, argsStart, argsEnd, argsFiscalYearStart);

        // TODO: test validations
    }

    /**
     * Generates actual vs predicated revenue data for specific opportunties.
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void analyticsGetOpportunityActualVersusPredictedRevenueOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartTestQueryMap() {
        AnalyticsApi.AnalyticsGetOpportunityActualVersusPredictedRevenueOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartQueryParams queryParams = new AnalyticsApi.AnalyticsGetOpportunityActualVersusPredictedRevenueOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartQueryParams()
            .argsInterval(null)
            .argsStart(null)
            .argsEnd(null)
            .argsFiscalYearStart(null);
        // List<ActWebApiModelsAnalyticsPeriodicRevenue> response = api.analyticsGetOpportunityActualVersusPredictedRevenueOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStart(queryParams);

    // TODO: test validations
    }
    
    /**
     * Generates periodic revenue data for specific opportunties.
     *
     * 
     */
    @Test
    public void analyticsGetOpportunityRevenueVersusCostOrProductIdsOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartTest() {
        List<String> productIds = null;
        String argsInterval = null;
        OffsetDateTime argsStart = null;
        OffsetDateTime argsEnd = null;
        Integer argsFiscalYearStart = null;
        // List<ActWebApiModelsAnalyticsPeriodicRevenue> response = api.analyticsGetOpportunityRevenueVersusCostOrProductIdsOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStart(productIds, argsInterval, argsStart, argsEnd, argsFiscalYearStart);

        // TODO: test validations
    }

    /**
     * Generates periodic revenue data for specific opportunties.
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void analyticsGetOpportunityRevenueVersusCostOrProductIdsOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartTestQueryMap() {
        AnalyticsApi.AnalyticsGetOpportunityRevenueVersusCostOrProductIdsOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartQueryParams queryParams = new AnalyticsApi.AnalyticsGetOpportunityRevenueVersusCostOrProductIdsOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartQueryParams()
            .productIds(null)
            .argsInterval(null)
            .argsStart(null)
            .argsEnd(null)
            .argsFiscalYearStart(null);
        // List<ActWebApiModelsAnalyticsPeriodicRevenue> response = api.analyticsGetOpportunityRevenueVersusCostOrProductIdsOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStart(queryParams);

    // TODO: test validations
    }
    
}
