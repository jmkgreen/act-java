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
import com.act.client.swagger.model.MicrosoftODataCoreUriParserSemanticOrderByClause;
import com.act.client.swagger.model.SystemWebODataODataQueryContext;
import com.act.client.swagger.model.SystemWebODataQueryOrderByNode;
import com.act.client.swagger.model.SystemWebODataQueryValidatorsOrderByQueryValidator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * SystemWebODataQueryOrderByQueryOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class SystemWebODataQueryOrderByQueryOption {
  @JsonProperty("context")
  private SystemWebODataODataQueryContext context = null;

  @JsonProperty("orderByNodes")
  private List<SystemWebODataQueryOrderByNode> orderByNodes = null;

  @JsonProperty("rawValue")
  private String rawValue = null;

  @JsonProperty("validator")
  private SystemWebODataQueryValidatorsOrderByQueryValidator validator = null;

  @JsonProperty("orderByClause")
  private MicrosoftODataCoreUriParserSemanticOrderByClause orderByClause = null;

  public SystemWebODataQueryOrderByQueryOption context(SystemWebODataODataQueryContext context) {
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

  public SystemWebODataQueryOrderByQueryOption orderByNodes(List<SystemWebODataQueryOrderByNode> orderByNodes) {
    this.orderByNodes = orderByNodes;
    return this;
  }

  public SystemWebODataQueryOrderByQueryOption addOrderByNodesItem(SystemWebODataQueryOrderByNode orderByNodesItem) {
    if (this.orderByNodes == null) {
      this.orderByNodes = new ArrayList<SystemWebODataQueryOrderByNode>();
    }
    this.orderByNodes.add(orderByNodesItem);
    return this;
  }

   /**
   * Get orderByNodes
   * @return orderByNodes
  **/
  @ApiModelProperty(value = "")
  public List<SystemWebODataQueryOrderByNode> getOrderByNodes() {
    return orderByNodes;
  }

  public void setOrderByNodes(List<SystemWebODataQueryOrderByNode> orderByNodes) {
    this.orderByNodes = orderByNodes;
  }

   /**
   * Get rawValue
   * @return rawValue
  **/
  @ApiModelProperty(value = "")
  public String getRawValue() {
    return rawValue;
  }

  public SystemWebODataQueryOrderByQueryOption validator(SystemWebODataQueryValidatorsOrderByQueryValidator validator) {
    this.validator = validator;
    return this;
  }

   /**
   * Get validator
   * @return validator
  **/
  @ApiModelProperty(value = "")
  public SystemWebODataQueryValidatorsOrderByQueryValidator getValidator() {
    return validator;
  }

  public void setValidator(SystemWebODataQueryValidatorsOrderByQueryValidator validator) {
    this.validator = validator;
  }

  public SystemWebODataQueryOrderByQueryOption orderByClause(MicrosoftODataCoreUriParserSemanticOrderByClause orderByClause) {
    this.orderByClause = orderByClause;
    return this;
  }

   /**
   * Get orderByClause
   * @return orderByClause
  **/
  @ApiModelProperty(value = "")
  public MicrosoftODataCoreUriParserSemanticOrderByClause getOrderByClause() {
    return orderByClause;
  }

  public void setOrderByClause(MicrosoftODataCoreUriParserSemanticOrderByClause orderByClause) {
    this.orderByClause = orderByClause;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemWebODataQueryOrderByQueryOption systemWebODataQueryOrderByQueryOption = (SystemWebODataQueryOrderByQueryOption) o;
    return Objects.equals(this.context, systemWebODataQueryOrderByQueryOption.context) &&
        Objects.equals(this.orderByNodes, systemWebODataQueryOrderByQueryOption.orderByNodes) &&
        Objects.equals(this.rawValue, systemWebODataQueryOrderByQueryOption.rawValue) &&
        Objects.equals(this.validator, systemWebODataQueryOrderByQueryOption.validator) &&
        Objects.equals(this.orderByClause, systemWebODataQueryOrderByQueryOption.orderByClause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, orderByNodes, rawValue, validator, orderByClause);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemWebODataQueryOrderByQueryOption {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    orderByNodes: ").append(toIndentedString(orderByNodes)).append("\n");
    sb.append("    rawValue: ").append(toIndentedString(rawValue)).append("\n");
    sb.append("    validator: ").append(toIndentedString(validator)).append("\n");
    sb.append("    orderByClause: ").append(toIndentedString(orderByClause)).append("\n");
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
