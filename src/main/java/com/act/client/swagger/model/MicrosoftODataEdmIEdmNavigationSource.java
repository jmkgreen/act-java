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
import com.act.client.swagger.model.MicrosoftODataEdmExpressionsIEdmPathExpression;
import com.act.client.swagger.model.MicrosoftODataEdmIEdmNavigationPropertyBinding;
import com.act.client.swagger.model.MicrosoftODataEdmIEdmType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * MicrosoftODataEdmIEdmNavigationSource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class MicrosoftODataEdmIEdmNavigationSource {
  @JsonProperty("navigationPropertyBindings")
  private List<MicrosoftODataEdmIEdmNavigationPropertyBinding> navigationPropertyBindings = null;

  @JsonProperty("path")
  private MicrosoftODataEdmExpressionsIEdmPathExpression path = null;

  @JsonProperty("type")
  private MicrosoftODataEdmIEdmType type = null;

  @JsonProperty("name")
  private String name = null;

  public MicrosoftODataEdmIEdmNavigationSource navigationPropertyBindings(List<MicrosoftODataEdmIEdmNavigationPropertyBinding> navigationPropertyBindings) {
    this.navigationPropertyBindings = navigationPropertyBindings;
    return this;
  }

  public MicrosoftODataEdmIEdmNavigationSource addNavigationPropertyBindingsItem(MicrosoftODataEdmIEdmNavigationPropertyBinding navigationPropertyBindingsItem) {
    if (this.navigationPropertyBindings == null) {
      this.navigationPropertyBindings = new ArrayList<MicrosoftODataEdmIEdmNavigationPropertyBinding>();
    }
    this.navigationPropertyBindings.add(navigationPropertyBindingsItem);
    return this;
  }

   /**
   * Get navigationPropertyBindings
   * @return navigationPropertyBindings
  **/
  @ApiModelProperty(value = "")
  public List<MicrosoftODataEdmIEdmNavigationPropertyBinding> getNavigationPropertyBindings() {
    return navigationPropertyBindings;
  }

  public void setNavigationPropertyBindings(List<MicrosoftODataEdmIEdmNavigationPropertyBinding> navigationPropertyBindings) {
    this.navigationPropertyBindings = navigationPropertyBindings;
  }

  public MicrosoftODataEdmIEdmNavigationSource path(MicrosoftODataEdmExpressionsIEdmPathExpression path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public MicrosoftODataEdmExpressionsIEdmPathExpression getPath() {
    return path;
  }

  public void setPath(MicrosoftODataEdmExpressionsIEdmPathExpression path) {
    this.path = path;
  }

  public MicrosoftODataEdmIEdmNavigationSource type(MicrosoftODataEdmIEdmType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public MicrosoftODataEdmIEdmType getType() {
    return type;
  }

  public void setType(MicrosoftODataEdmIEdmType type) {
    this.type = type;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicrosoftODataEdmIEdmNavigationSource microsoftODataEdmIEdmNavigationSource = (MicrosoftODataEdmIEdmNavigationSource) o;
    return Objects.equals(this.navigationPropertyBindings, microsoftODataEdmIEdmNavigationSource.navigationPropertyBindings) &&
        Objects.equals(this.path, microsoftODataEdmIEdmNavigationSource.path) &&
        Objects.equals(this.type, microsoftODataEdmIEdmNavigationSource.type) &&
        Objects.equals(this.name, microsoftODataEdmIEdmNavigationSource.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(navigationPropertyBindings, path, type, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicrosoftODataEdmIEdmNavigationSource {\n");
    
    sb.append("    navigationPropertyBindings: ").append(toIndentedString(navigationPropertyBindings)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
