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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SystemWebODataQueryODataRawQueryOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class SystemWebODataQueryODataRawQueryOptions {
  @JsonProperty("filter")
  private String filter = null;

  @JsonProperty("orderBy")
  private String orderBy = null;

  @JsonProperty("top")
  private String top = null;

  @JsonProperty("skip")
  private String skip = null;

  @JsonProperty("select")
  private String select = null;

  @JsonProperty("expand")
  private String expand = null;

  @JsonProperty("count")
  private String count = null;

  @JsonProperty("format")
  private String format = null;

  @JsonProperty("skipToken")
  private String skipToken = null;

  @JsonProperty("deltaToken")
  private String deltaToken = null;

   /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(value = "")
  public String getFilter() {
    return filter;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @ApiModelProperty(value = "")
  public String getOrderBy() {
    return orderBy;
  }

   /**
   * Get top
   * @return top
  **/
  @ApiModelProperty(value = "")
  public String getTop() {
    return top;
  }

   /**
   * Get skip
   * @return skip
  **/
  @ApiModelProperty(value = "")
  public String getSkip() {
    return skip;
  }

   /**
   * Get select
   * @return select
  **/
  @ApiModelProperty(value = "")
  public String getSelect() {
    return select;
  }

   /**
   * Get expand
   * @return expand
  **/
  @ApiModelProperty(value = "")
  public String getExpand() {
    return expand;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public String getCount() {
    return count;
  }

   /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(value = "")
  public String getFormat() {
    return format;
  }

   /**
   * Get skipToken
   * @return skipToken
  **/
  @ApiModelProperty(value = "")
  public String getSkipToken() {
    return skipToken;
  }

   /**
   * Get deltaToken
   * @return deltaToken
  **/
  @ApiModelProperty(value = "")
  public String getDeltaToken() {
    return deltaToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemWebODataQueryODataRawQueryOptions systemWebODataQueryODataRawQueryOptions = (SystemWebODataQueryODataRawQueryOptions) o;
    return Objects.equals(this.filter, systemWebODataQueryODataRawQueryOptions.filter) &&
        Objects.equals(this.orderBy, systemWebODataQueryODataRawQueryOptions.orderBy) &&
        Objects.equals(this.top, systemWebODataQueryODataRawQueryOptions.top) &&
        Objects.equals(this.skip, systemWebODataQueryODataRawQueryOptions.skip) &&
        Objects.equals(this.select, systemWebODataQueryODataRawQueryOptions.select) &&
        Objects.equals(this.expand, systemWebODataQueryODataRawQueryOptions.expand) &&
        Objects.equals(this.count, systemWebODataQueryODataRawQueryOptions.count) &&
        Objects.equals(this.format, systemWebODataQueryODataRawQueryOptions.format) &&
        Objects.equals(this.skipToken, systemWebODataQueryODataRawQueryOptions.skipToken) &&
        Objects.equals(this.deltaToken, systemWebODataQueryODataRawQueryOptions.deltaToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, orderBy, top, skip, select, expand, count, format, skipToken, deltaToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemWebODataQueryODataRawQueryOptions {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    select: ").append(toIndentedString(select)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    skipToken: ").append(toIndentedString(skipToken)).append("\n");
    sb.append("    deltaToken: ").append(toIndentedString(deltaToken)).append("\n");
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

