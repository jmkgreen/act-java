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
 * MicrosoftODataEdmIEdmType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class MicrosoftODataEdmIEdmType {
  /**
   * Gets or Sets typeKind
   */
  public enum TypeKindEnum {
    NONE("None"),
    
    PRIMITIVE("Primitive"),
    
    ENTITY("Entity"),
    
    COMPLEX("Complex"),
    
    COLLECTION("Collection"),
    
    ENTITYREFERENCE("EntityReference"),
    
    ENUM("Enum"),
    
    TYPEDEFINITION("TypeDefinition");

    private String value;

    TypeKindEnum(String value) {
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
    public static TypeKindEnum fromValue(String text) {
      for (TypeKindEnum b : TypeKindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("typeKind")
  private TypeKindEnum typeKind = null;

   /**
   * Get typeKind
   * @return typeKind
  **/
  @ApiModelProperty(value = "")
  public TypeKindEnum getTypeKind() {
    return typeKind;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicrosoftODataEdmIEdmType microsoftODataEdmIEdmType = (MicrosoftODataEdmIEdmType) o;
    return Objects.equals(this.typeKind, microsoftODataEdmIEdmType.typeKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeKind);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicrosoftODataEdmIEdmType {\n");
    
    sb.append("    typeKind: ").append(toIndentedString(typeKind)).append("\n");
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

