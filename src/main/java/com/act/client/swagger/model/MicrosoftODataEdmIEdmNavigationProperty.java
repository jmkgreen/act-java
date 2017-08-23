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
import com.act.client.swagger.model.MicrosoftODataEdmIEdmNavigationProperty;
import com.act.client.swagger.model.MicrosoftODataEdmIEdmReferentialConstraint;
import com.act.client.swagger.model.MicrosoftODataEdmIEdmStructuredType;
import com.act.client.swagger.model.MicrosoftODataEdmIEdmTypeReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MicrosoftODataEdmIEdmNavigationProperty
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class MicrosoftODataEdmIEdmNavigationProperty {
  @JsonProperty("partner")
  private MicrosoftODataEdmIEdmNavigationProperty partner = null;

  /**
   * Gets or Sets onDelete
   */
  public enum OnDeleteEnum {
    NONE("None"),
    
    CASCADE("Cascade");

    private String value;

    OnDeleteEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OnDeleteEnum fromValue(String text) {
      for (OnDeleteEnum b : OnDeleteEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("onDelete")
  private OnDeleteEnum onDelete = null;

  @JsonProperty("containsTarget")
  private Boolean containsTarget = null;

  @JsonProperty("referentialConstraint")
  private MicrosoftODataEdmIEdmReferentialConstraint referentialConstraint = null;

  /**
   * Gets or Sets propertyKind
   */
  public enum PropertyKindEnum {
    NONE("None"),
    
    STRUCTURAL("Structural"),
    
    NAVIGATION("Navigation");

    private String value;

    PropertyKindEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PropertyKindEnum fromValue(String text) {
      for (PropertyKindEnum b : PropertyKindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("propertyKind")
  private PropertyKindEnum propertyKind = null;

  @JsonProperty("type")
  private MicrosoftODataEdmIEdmTypeReference type = null;

  @JsonProperty("declaringType")
  private MicrosoftODataEdmIEdmStructuredType declaringType = null;

  @JsonProperty("name")
  private String name = null;

  public MicrosoftODataEdmIEdmNavigationProperty partner(MicrosoftODataEdmIEdmNavigationProperty partner) {
    this.partner = partner;
    return this;
  }

   /**
   * Get partner
   * @return partner
  **/
  @ApiModelProperty(value = "")
  public MicrosoftODataEdmIEdmNavigationProperty getPartner() {
    return partner;
  }

  public void setPartner(MicrosoftODataEdmIEdmNavigationProperty partner) {
    this.partner = partner;
  }

   /**
   * Get onDelete
   * @return onDelete
  **/
  @ApiModelProperty(value = "")
  public OnDeleteEnum getOnDelete() {
    return onDelete;
  }

   /**
   * Get containsTarget
   * @return containsTarget
  **/
  @ApiModelProperty(value = "")
  public Boolean isContainsTarget() {
    return containsTarget;
  }

  public MicrosoftODataEdmIEdmNavigationProperty referentialConstraint(MicrosoftODataEdmIEdmReferentialConstraint referentialConstraint) {
    this.referentialConstraint = referentialConstraint;
    return this;
  }

   /**
   * Get referentialConstraint
   * @return referentialConstraint
  **/
  @ApiModelProperty(value = "")
  public MicrosoftODataEdmIEdmReferentialConstraint getReferentialConstraint() {
    return referentialConstraint;
  }

  public void setReferentialConstraint(MicrosoftODataEdmIEdmReferentialConstraint referentialConstraint) {
    this.referentialConstraint = referentialConstraint;
  }

   /**
   * Get propertyKind
   * @return propertyKind
  **/
  @ApiModelProperty(value = "")
  public PropertyKindEnum getPropertyKind() {
    return propertyKind;
  }

  public MicrosoftODataEdmIEdmNavigationProperty type(MicrosoftODataEdmIEdmTypeReference type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public MicrosoftODataEdmIEdmTypeReference getType() {
    return type;
  }

  public void setType(MicrosoftODataEdmIEdmTypeReference type) {
    this.type = type;
  }

  public MicrosoftODataEdmIEdmNavigationProperty declaringType(MicrosoftODataEdmIEdmStructuredType declaringType) {
    this.declaringType = declaringType;
    return this;
  }

   /**
   * Get declaringType
   * @return declaringType
  **/
  @ApiModelProperty(value = "")
  public MicrosoftODataEdmIEdmStructuredType getDeclaringType() {
    return declaringType;
  }

  public void setDeclaringType(MicrosoftODataEdmIEdmStructuredType declaringType) {
    this.declaringType = declaringType;
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
    MicrosoftODataEdmIEdmNavigationProperty microsoftODataEdmIEdmNavigationProperty = (MicrosoftODataEdmIEdmNavigationProperty) o;
    return Objects.equals(this.partner, microsoftODataEdmIEdmNavigationProperty.partner) &&
        Objects.equals(this.onDelete, microsoftODataEdmIEdmNavigationProperty.onDelete) &&
        Objects.equals(this.containsTarget, microsoftODataEdmIEdmNavigationProperty.containsTarget) &&
        Objects.equals(this.referentialConstraint, microsoftODataEdmIEdmNavigationProperty.referentialConstraint) &&
        Objects.equals(this.propertyKind, microsoftODataEdmIEdmNavigationProperty.propertyKind) &&
        Objects.equals(this.type, microsoftODataEdmIEdmNavigationProperty.type) &&
        Objects.equals(this.declaringType, microsoftODataEdmIEdmNavigationProperty.declaringType) &&
        Objects.equals(this.name, microsoftODataEdmIEdmNavigationProperty.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partner, onDelete, containsTarget, referentialConstraint, propertyKind, type, declaringType, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicrosoftODataEdmIEdmNavigationProperty {\n");
    
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    onDelete: ").append(toIndentedString(onDelete)).append("\n");
    sb.append("    containsTarget: ").append(toIndentedString(containsTarget)).append("\n");
    sb.append("    referentialConstraint: ").append(toIndentedString(referentialConstraint)).append("\n");
    sb.append("    propertyKind: ").append(toIndentedString(propertyKind)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    declaringType: ").append(toIndentedString(declaringType)).append("\n");
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
