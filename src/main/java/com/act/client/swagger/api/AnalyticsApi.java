package com.act.client.swagger.api;

import com.act.client.swagger.ApiClient;
import com.act.client.swagger.EncodingUtils;

import com.act.client.swagger.model.ActWebApiModelsAnalyticsPeriodicRevenue;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public interface AnalyticsApi extends ApiClient.Api {


  /**
   * Generates actual vs predicated revenue data for specific opportunties.
   * 
    * @param argsInterval An intervening period of time. (optional)
    * @param argsStart The start date that the period requesting. (optional)
    * @param argsEnd The end date that the period requesting. (optional)
    * @param argsFiscalYearStart The oppourtunity products that will be evaludated to generate the revenue data. (optional)
   * @return List&lt;ActWebApiModelsAnalyticsPeriodicRevenue&gt;
   */
  @RequestLine("GET /api/opportunity/analytics/revenue/actual-predicted?args.interval={argsInterval}&args.start={argsStart}&args.end={argsEnd}&args.fiscalYearStart={argsFiscalYearStart}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsAnalyticsPeriodicRevenue> analyticsGetOpportunityActualVersusPredictedRevenueOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStart(@Param("argsInterval") String argsInterval, @Param("argsStart") OffsetDateTime argsStart, @Param("argsEnd") OffsetDateTime argsEnd, @Param("argsFiscalYearStart") Integer argsFiscalYearStart);

  /**
   * Generates actual vs predicated revenue data for specific opportunties.
   * 
   * Note, this is equivalent to the other <code>analyticsGetOpportunityActualVersusPredictedRevenueOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStart</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AnalyticsGetOpportunityActualVersusPredictedRevenueOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>argsInterval - An intervening period of time. (optional)</li>
   *   <li>argsStart - The start date that the period requesting. (optional)</li>
   *   <li>argsEnd - The end date that the period requesting. (optional)</li>
   *   <li>argsFiscalYearStart - The oppourtunity products that will be evaludated to generate the revenue data. (optional)</li>
   *   </ul>
   * @return List&lt;ActWebApiModelsAnalyticsPeriodicRevenue&gt;
   */
  @RequestLine("GET /api/opportunity/analytics/revenue/actual-predicted?args.interval={argsInterval}&args.start={argsStart}&args.end={argsEnd}&args.fiscalYearStart={argsFiscalYearStart}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  List<ActWebApiModelsAnalyticsPeriodicRevenue> analyticsGetOpportunityActualVersusPredictedRevenueOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStart(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>analyticsGetOpportunityActualVersusPredictedRevenueOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStart</code> method in a fluent style.
   */
  public static class AnalyticsGetOpportunityActualVersusPredictedRevenueOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartQueryParams extends HashMap<String, Object> {
    public AnalyticsGetOpportunityActualVersusPredictedRevenueOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartQueryParams argsInterval(final String value) {
      put("args.interval", EncodingUtils.encode(value));
      return this;
    }
    public AnalyticsGetOpportunityActualVersusPredictedRevenueOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartQueryParams argsStart(final OffsetDateTime value) {
      put("args.start", EncodingUtils.encode(value));
      return this;
    }
    public AnalyticsGetOpportunityActualVersusPredictedRevenueOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartQueryParams argsEnd(final OffsetDateTime value) {
      put("args.end", EncodingUtils.encode(value));
      return this;
    }
    public AnalyticsGetOpportunityActualVersusPredictedRevenueOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartQueryParams argsFiscalYearStart(final Integer value) {
      put("args.fiscalYearStart", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Generates periodic revenue data for specific opportunties.
   * 
    * @param productIds  (optional)
    * @param argsInterval An intervening period of time. (optional)
    * @param argsStart The start date that the period requesting. (optional)
    * @param argsEnd The end date that the period requesting. (optional)
    * @param argsFiscalYearStart The oppourtunity products that will be evaludated to generate the revenue data. (optional)
   * @return List&lt;ActWebApiModelsAnalyticsPeriodicRevenue&gt;
   */
  @RequestLine("GET /api/opportunity/analytics/revenue/cost?productIds={productIds}&args.interval={argsInterval}&args.start={argsStart}&args.end={argsEnd}&args.fiscalYearStart={argsFiscalYearStart}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ActWebApiModelsAnalyticsPeriodicRevenue> analyticsGetOpportunityRevenueVersusCostOrProductIdsOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStart(@Param("productIds") List<String> productIds, @Param("argsInterval") String argsInterval, @Param("argsStart") OffsetDateTime argsStart, @Param("argsEnd") OffsetDateTime argsEnd, @Param("argsFiscalYearStart") Integer argsFiscalYearStart);

  /**
   * Generates periodic revenue data for specific opportunties.
   * 
   * Note, this is equivalent to the other <code>analyticsGetOpportunityRevenueVersusCostOrProductIdsOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStart</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AnalyticsGetOpportunityRevenueVersusCostOrProductIdsOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>productIds -  (optional)</li>
   *   <li>argsInterval - An intervening period of time. (optional)</li>
   *   <li>argsStart - The start date that the period requesting. (optional)</li>
   *   <li>argsEnd - The end date that the period requesting. (optional)</li>
   *   <li>argsFiscalYearStart - The oppourtunity products that will be evaludated to generate the revenue data. (optional)</li>
   *   </ul>
   * @return List&lt;ActWebApiModelsAnalyticsPeriodicRevenue&gt;
   */
  @RequestLine("GET /api/opportunity/analytics/revenue/cost?productIds={productIds}&args.interval={argsInterval}&args.start={argsStart}&args.end={argsEnd}&args.fiscalYearStart={argsFiscalYearStart}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  List<ActWebApiModelsAnalyticsPeriodicRevenue> analyticsGetOpportunityRevenueVersusCostOrProductIdsOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStart(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>analyticsGetOpportunityRevenueVersusCostOrProductIdsOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStart</code> method in a fluent style.
   */
  public static class AnalyticsGetOpportunityRevenueVersusCostOrProductIdsOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartQueryParams extends HashMap<String, Object> {
    public AnalyticsGetOpportunityRevenueVersusCostOrProductIdsOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartQueryParams productIds(final List<String> value) {
      put("productIds", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public AnalyticsGetOpportunityRevenueVersusCostOrProductIdsOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartQueryParams argsInterval(final String value) {
      put("args.interval", EncodingUtils.encode(value));
      return this;
    }
    public AnalyticsGetOpportunityRevenueVersusCostOrProductIdsOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartQueryParams argsStart(final OffsetDateTime value) {
      put("args.start", EncodingUtils.encode(value));
      return this;
    }
    public AnalyticsGetOpportunityRevenueVersusCostOrProductIdsOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartQueryParams argsEnd(final OffsetDateTime value) {
      put("args.end", EncodingUtils.encode(value));
      return this;
    }
    public AnalyticsGetOpportunityRevenueVersusCostOrProductIdsOrArgsIntervalOrArgsStartOrArgsEndOrArgsFiscalYearStartQueryParams argsFiscalYearStart(final Integer value) {
      put("args.fiscalYearStart", EncodingUtils.encode(value));
      return this;
    }
  }
}
