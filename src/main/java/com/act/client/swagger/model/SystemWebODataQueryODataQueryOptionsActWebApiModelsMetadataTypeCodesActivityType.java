/*
 * act.web.api
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.act.client.swagger.model;

import java.util.Objects;
import com.act.client.swagger.model.SystemObject;
import com.act.client.swagger.model.SystemWebODataODataQueryContext;
import com.act.client.swagger.model.SystemWebODataQueryCountQueryOption;
import com.act.client.swagger.model.SystemWebODataQueryFilterQueryOption;
import com.act.client.swagger.model.SystemWebODataQueryODataRawQueryOptions;
import com.act.client.swagger.model.SystemWebODataQueryOrderByQueryOption;
import com.act.client.swagger.model.SystemWebODataQuerySelectExpandQueryOption;
import com.act.client.swagger.model.SystemWebODataQuerySkipQueryOption;
import com.act.client.swagger.model.SystemWebODataQueryTopQueryOption;
import com.act.client.swagger.model.SystemWebODataQueryValidatorsODataQueryValidator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SystemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class SystemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType {
  @JsonProperty("ifMatch")
  private SystemObject ifMatch = null;

  @JsonProperty("ifNoneMatch")
  private SystemObject ifNoneMatch = null;

  @JsonProperty("context")
  private SystemWebODataODataQueryContext context = null;

  @JsonProperty("request")
  private SystemObject request = null;

  @JsonProperty("rawValues")
  private SystemWebODataQueryODataRawQueryOptions rawValues = null;

  @JsonProperty("selectExpand")
  private SystemWebODataQuerySelectExpandQueryOption selectExpand = null;

  @JsonProperty("filter")
  private SystemWebODataQueryFilterQueryOption filter = null;

  @JsonProperty("orderBy")
  private SystemWebODataQueryOrderByQueryOption orderBy = null;

  @JsonProperty("skip")
  private SystemWebODataQuerySkipQueryOption skip = null;

  @JsonProperty("top")
  private SystemWebODataQueryTopQueryOption top = null;

  @JsonProperty("count")
  private SystemWebODataQueryCountQueryOption count = null;

  @JsonProperty("validator")
  private SystemWebODataQueryValidatorsODataQueryValidator validator = null;

  public SystemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType ifMatch(SystemObject ifMatch) {
    this.ifMatch = ifMatch;
    return this;
  }

   /**
   * Get ifMatch
   * @return ifMatch
  **/
  @ApiModelProperty(value = "")
  public SystemObject getIfMatch() {
    return ifMatch;
  }

  public void setIfMatch(SystemObject ifMatch) {
    this.ifMatch = ifMatch;
  }

  public SystemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType ifNoneMatch(SystemObject ifNoneMatch) {
    this.ifNoneMatch = ifNoneMatch;
    return this;
  }

   /**
   * Get ifNoneMatch
   * @return ifNoneMatch
  **/
  @ApiModelProperty(value = "")
  public SystemObject getIfNoneMatch() {
    return ifNoneMatch;
  }

  public void setIfNoneMatch(SystemObject ifNoneMatch) {
    this.ifNoneMatch = ifNoneMatch;
  }

  public SystemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType context(SystemWebODataODataQueryContext context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(value = "")
  public SystemWebODataODataQueryContext getContext() {
    return context;
  }

  public void setContext(SystemWebODataODataQueryContext context) {
    this.context = context;
  }

  public SystemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType request(SystemObject request) {
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @ApiModelProperty(value = "")
  public SystemObject getRequest() {
    return request;
  }

  public void setRequest(SystemObject request) {
    this.request = request;
  }

  public SystemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType rawValues(SystemWebODataQueryODataRawQueryOptions rawValues) {
    this.rawValues = rawValues;
    return this;
  }

   /**
   * Get rawValues
   * @return rawValues
  **/
  @ApiModelProperty(value = "")
  public SystemWebODataQueryODataRawQueryOptions getRawValues() {
    return rawValues;
  }

  public void setRawValues(SystemWebODataQueryODataRawQueryOptions rawValues) {
    this.rawValues = rawValues;
  }

  public SystemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType selectExpand(SystemWebODataQuerySelectExpandQueryOption selectExpand) {
    this.selectExpand = selectExpand;
    return this;
  }

   /**
   * Get selectExpand
   * @return selectExpand
  **/
  @ApiModelProperty(value = "")
  public SystemWebODataQuerySelectExpandQueryOption getSelectExpand() {
    return selectExpand;
  }

  public void setSelectExpand(SystemWebODataQuerySelectExpandQueryOption selectExpand) {
    this.selectExpand = selectExpand;
  }

  public SystemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType filter(SystemWebODataQueryFilterQueryOption filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(value = "")
  public SystemWebODataQueryFilterQueryOption getFilter() {
    return filter;
  }

  public void setFilter(SystemWebODataQueryFilterQueryOption filter) {
    this.filter = filter;
  }

  public SystemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType orderBy(SystemWebODataQueryOrderByQueryOption orderBy) {
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @ApiModelProperty(value = "")
  public SystemWebODataQueryOrderByQueryOption getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(SystemWebODataQueryOrderByQueryOption orderBy) {
    this.orderBy = orderBy;
  }

  public SystemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType skip(SystemWebODataQuerySkipQueryOption skip) {
    this.skip = skip;
    return this;
  }

   /**
   * Get skip
   * @return skip
  **/
  @ApiModelProperty(value = "")
  public SystemWebODataQuerySkipQueryOption getSkip() {
    return skip;
  }

  public void setSkip(SystemWebODataQuerySkipQueryOption skip) {
    this.skip = skip;
  }

  public SystemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType top(SystemWebODataQueryTopQueryOption top) {
    this.top = top;
    return this;
  }

   /**
   * Get top
   * @return top
  **/
  @ApiModelProperty(value = "")
  public SystemWebODataQueryTopQueryOption getTop() {
    return top;
  }

  public void setTop(SystemWebODataQueryTopQueryOption top) {
    this.top = top;
  }

  public SystemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType count(SystemWebODataQueryCountQueryOption count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public SystemWebODataQueryCountQueryOption getCount() {
    return count;
  }

  public void setCount(SystemWebODataQueryCountQueryOption count) {
    this.count = count;
  }

  public SystemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType validator(SystemWebODataQueryValidatorsODataQueryValidator validator) {
    this.validator = validator;
    return this;
  }

   /**
   * Get validator
   * @return validator
  **/
  @ApiModelProperty(value = "")
  public SystemWebODataQueryValidatorsODataQueryValidator getValidator() {
    return validator;
  }

  public void setValidator(SystemWebODataQueryValidatorsODataQueryValidator validator) {
    this.validator = validator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType systemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType = (SystemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType) o;
    return Objects.equals(this.ifMatch, systemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType.ifMatch) &&
        Objects.equals(this.ifNoneMatch, systemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType.ifNoneMatch) &&
        Objects.equals(this.context, systemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType.context) &&
        Objects.equals(this.request, systemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType.request) &&
        Objects.equals(this.rawValues, systemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType.rawValues) &&
        Objects.equals(this.selectExpand, systemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType.selectExpand) &&
        Objects.equals(this.filter, systemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType.filter) &&
        Objects.equals(this.orderBy, systemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType.orderBy) &&
        Objects.equals(this.skip, systemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType.skip) &&
        Objects.equals(this.top, systemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType.top) &&
        Objects.equals(this.count, systemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType.count) &&
        Objects.equals(this.validator, systemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType.validator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ifMatch, ifNoneMatch, context, request, rawValues, selectExpand, filter, orderBy, skip, top, count, validator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemWebODataQueryODataQueryOptionsActWebApiModelsMetadataTypeCodesActivityType {\n");
    
    sb.append("    ifMatch: ").append(toIndentedString(ifMatch)).append("\n");
    sb.append("    ifNoneMatch: ").append(toIndentedString(ifNoneMatch)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    rawValues: ").append(toIndentedString(rawValues)).append("\n");
    sb.append("    selectExpand: ").append(toIndentedString(selectExpand)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    validator: ").append(toIndentedString(validator)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

