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
 * MicrosoftODataEdmIEdmSchemaElement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class MicrosoftODataEdmIEdmSchemaElement {
  /**
   * Gets or Sets schemaElementKind
   */
  public enum SchemaElementKindEnum {
    NONE("None"),
    
    TYPEDEFINITION("TypeDefinition"),
    
    VALUETERM("ValueTerm"),
    
    ACTION("Action"),
    
    ENTITYCONTAINER("EntityContainer"),
    
    FUNCTION("Function");

    private String value;

    SchemaElementKindEnum(String value) {
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
    public static SchemaElementKindEnum fromValue(String text) {
      for (SchemaElementKindEnum b : SchemaElementKindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("schemaElementKind")
  private SchemaElementKindEnum schemaElementKind = null;

  @JsonProperty("namespace")
  private String namespace = null;

  @JsonProperty("name")
  private String name = null;

   /**
   * Get schemaElementKind
   * @return schemaElementKind
  **/
  @ApiModelProperty(value = "")
  public SchemaElementKindEnum getSchemaElementKind() {
    return schemaElementKind;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @ApiModelProperty(value = "")
  public String getNamespace() {
    return namespace;
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
    MicrosoftODataEdmIEdmSchemaElement microsoftODataEdmIEdmSchemaElement = (MicrosoftODataEdmIEdmSchemaElement) o;
    return Objects.equals(this.schemaElementKind, microsoftODataEdmIEdmSchemaElement.schemaElementKind) &&
        Objects.equals(this.namespace, microsoftODataEdmIEdmSchemaElement.namespace) &&
        Objects.equals(this.name, microsoftODataEdmIEdmSchemaElement.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaElementKind, namespace, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicrosoftODataEdmIEdmSchemaElement {\n");
    
    sb.append("    schemaElementKind: ").append(toIndentedString(schemaElementKind)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

