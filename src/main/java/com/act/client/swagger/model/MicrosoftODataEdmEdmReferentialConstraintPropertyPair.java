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
import com.act.client.swagger.model.MicrosoftODataEdmIEdmStructuralProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MicrosoftODataEdmEdmReferentialConstraintPropertyPair
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class MicrosoftODataEdmEdmReferentialConstraintPropertyPair {
  @JsonProperty("dependentProperty")
  private MicrosoftODataEdmIEdmStructuralProperty dependentProperty = null;

  @JsonProperty("principalProperty")
  private MicrosoftODataEdmIEdmStructuralProperty principalProperty = null;

  public MicrosoftODataEdmEdmReferentialConstraintPropertyPair dependentProperty(MicrosoftODataEdmIEdmStructuralProperty dependentProperty) {
    this.dependentProperty = dependentProperty;
    return this;
  }

   /**
   * Get dependentProperty
   * @return dependentProperty
  **/
  @ApiModelProperty(value = "")
  public MicrosoftODataEdmIEdmStructuralProperty getDependentProperty() {
    return dependentProperty;
  }

  public void setDependentProperty(MicrosoftODataEdmIEdmStructuralProperty dependentProperty) {
    this.dependentProperty = dependentProperty;
  }

  public MicrosoftODataEdmEdmReferentialConstraintPropertyPair principalProperty(MicrosoftODataEdmIEdmStructuralProperty principalProperty) {
    this.principalProperty = principalProperty;
    return this;
  }

   /**
   * Get principalProperty
   * @return principalProperty
  **/
  @ApiModelProperty(value = "")
  public MicrosoftODataEdmIEdmStructuralProperty getPrincipalProperty() {
    return principalProperty;
  }

  public void setPrincipalProperty(MicrosoftODataEdmIEdmStructuralProperty principalProperty) {
    this.principalProperty = principalProperty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicrosoftODataEdmEdmReferentialConstraintPropertyPair microsoftODataEdmEdmReferentialConstraintPropertyPair = (MicrosoftODataEdmEdmReferentialConstraintPropertyPair) o;
    return Objects.equals(this.dependentProperty, microsoftODataEdmEdmReferentialConstraintPropertyPair.dependentProperty) &&
        Objects.equals(this.principalProperty, microsoftODataEdmEdmReferentialConstraintPropertyPair.principalProperty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependentProperty, principalProperty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicrosoftODataEdmEdmReferentialConstraintPropertyPair {\n");
    
    sb.append("    dependentProperty: ").append(toIndentedString(dependentProperty)).append("\n");
    sb.append("    principalProperty: ").append(toIndentedString(principalProperty)).append("\n");
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

