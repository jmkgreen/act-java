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
import com.act.client.swagger.model.MicrosoftODataEdmIEdmModel;
import com.act.client.swagger.model.MicrosoftODataEdmIEdmNavigationSource;
import com.act.client.swagger.model.MicrosoftODataEdmIEdmType;
import com.act.client.swagger.model.SystemWebODataRoutingODataPath;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SystemWebODataODataQueryContext
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class SystemWebODataODataQueryContext {
  @JsonProperty("model")
  private MicrosoftODataEdmIEdmModel model = null;

  @JsonProperty("elementType")
  private MicrosoftODataEdmIEdmType elementType = null;

  @JsonProperty("navigationSource")
  private MicrosoftODataEdmIEdmNavigationSource navigationSource = null;

  @JsonProperty("elementClrType")
  private String elementClrType = null;

  @JsonProperty("path")
  private SystemWebODataRoutingODataPath path = null;

  public SystemWebODataODataQueryContext model(MicrosoftODataEdmIEdmModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(value = "")
  public MicrosoftODataEdmIEdmModel getModel() {
    return model;
  }

  public void setModel(MicrosoftODataEdmIEdmModel model) {
    this.model = model;
  }

  public SystemWebODataODataQueryContext elementType(MicrosoftODataEdmIEdmType elementType) {
    this.elementType = elementType;
    return this;
  }

   /**
   * Get elementType
   * @return elementType
  **/
  @ApiModelProperty(value = "")
  public MicrosoftODataEdmIEdmType getElementType() {
    return elementType;
  }

  public void setElementType(MicrosoftODataEdmIEdmType elementType) {
    this.elementType = elementType;
  }

  public SystemWebODataODataQueryContext navigationSource(MicrosoftODataEdmIEdmNavigationSource navigationSource) {
    this.navigationSource = navigationSource;
    return this;
  }

   /**
   * Get navigationSource
   * @return navigationSource
  **/
  @ApiModelProperty(value = "")
  public MicrosoftODataEdmIEdmNavigationSource getNavigationSource() {
    return navigationSource;
  }

  public void setNavigationSource(MicrosoftODataEdmIEdmNavigationSource navigationSource) {
    this.navigationSource = navigationSource;
  }

   /**
   * Get elementClrType
   * @return elementClrType
  **/
  @ApiModelProperty(value = "")
  public String getElementClrType() {
    return elementClrType;
  }

  public SystemWebODataODataQueryContext path(SystemWebODataRoutingODataPath path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public SystemWebODataRoutingODataPath getPath() {
    return path;
  }

  public void setPath(SystemWebODataRoutingODataPath path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemWebODataODataQueryContext systemWebODataODataQueryContext = (SystemWebODataODataQueryContext) o;
    return Objects.equals(this.model, systemWebODataODataQueryContext.model) &&
        Objects.equals(this.elementType, systemWebODataODataQueryContext.elementType) &&
        Objects.equals(this.navigationSource, systemWebODataODataQueryContext.navigationSource) &&
        Objects.equals(this.elementClrType, systemWebODataODataQueryContext.elementClrType) &&
        Objects.equals(this.path, systemWebODataODataQueryContext.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, elementType, navigationSource, elementClrType, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemWebODataODataQueryContext {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
    sb.append("    navigationSource: ").append(toIndentedString(navigationSource)).append("\n");
    sb.append("    elementClrType: ").append(toIndentedString(elementClrType)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

