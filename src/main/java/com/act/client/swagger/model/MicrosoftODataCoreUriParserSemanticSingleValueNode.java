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
import com.act.client.swagger.model.MicrosoftODataEdmIEdmTypeReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MicrosoftODataCoreUriParserSemanticSingleValueNode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class MicrosoftODataCoreUriParserSemanticSingleValueNode {
  @JsonProperty("typeReference")
  private MicrosoftODataEdmIEdmTypeReference typeReference = null;

  /**
   * Gets or Sets kind
   */
  public enum KindEnum {
    NONE("None"),
    
    CONSTANT("Constant"),
    
    CONVERT("Convert"),
    
    NONENTITYRANGEVARIABLEREFERENCE("NonentityRangeVariableReference"),
    
    BINARYOPERATOR("BinaryOperator"),
    
    UNARYOPERATOR("UnaryOperator"),
    
    SINGLEVALUEPROPERTYACCESS("SingleValuePropertyAccess"),
    
    COLLECTIONPROPERTYACCESS("CollectionPropertyAccess"),
    
    SINGLEVALUEFUNCTIONCALL("SingleValueFunctionCall"),
    
    ANY("Any"),
    
    COLLECTIONNAVIGATIONNODE("CollectionNavigationNode"),
    
    SINGLENAVIGATIONNODE("SingleNavigationNode"),
    
    SINGLEVALUEOPENPROPERTYACCESS("SingleValueOpenPropertyAccess"),
    
    SINGLEENTITYCAST("SingleEntityCast"),
    
    ALL("All"),
    
    ENTITYCOLLECTIONCAST("EntityCollectionCast"),
    
    ENTITYRANGEVARIABLEREFERENCE("EntityRangeVariableReference"),
    
    SINGLEENTITYFUNCTIONCALL("SingleEntityFunctionCall"),
    
    COLLECTIONFUNCTIONCALL("CollectionFunctionCall"),
    
    ENTITYCOLLECTIONFUNCTIONCALL("EntityCollectionFunctionCall"),
    
    NAMEDFUNCTIONPARAMETER("NamedFunctionParameter"),
    
    PARAMETERALIAS("ParameterAlias"),
    
    ENTITYSET("EntitySet"),
    
    KEYLOOKUP("KeyLookup"),
    
    SEARCHTERM("SearchTerm"),
    
    COLLECTIONOPENPROPERTYACCESS("CollectionOpenPropertyAccess"),
    
    COLLECTIONPROPERTYCAST("CollectionPropertyCast"),
    
    SINGLEVALUECAST("SingleValueCast");

    private String value;

    KindEnum(String value) {
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
    public static KindEnum fromValue(String text) {
      for (KindEnum b : KindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("kind")
  private KindEnum kind = null;

  public MicrosoftODataCoreUriParserSemanticSingleValueNode typeReference(MicrosoftODataEdmIEdmTypeReference typeReference) {
    this.typeReference = typeReference;
    return this;
  }

   /**
   * Get typeReference
   * @return typeReference
  **/
  @ApiModelProperty(value = "")
  public MicrosoftODataEdmIEdmTypeReference getTypeReference() {
    return typeReference;
  }

  public void setTypeReference(MicrosoftODataEdmIEdmTypeReference typeReference) {
    this.typeReference = typeReference;
  }

   /**
   * Get kind
   * @return kind
  **/
  @ApiModelProperty(value = "")
  public KindEnum getKind() {
    return kind;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicrosoftODataCoreUriParserSemanticSingleValueNode microsoftODataCoreUriParserSemanticSingleValueNode = (MicrosoftODataCoreUriParserSemanticSingleValueNode) o;
    return Objects.equals(this.typeReference, microsoftODataCoreUriParserSemanticSingleValueNode.typeReference) &&
        Objects.equals(this.kind, microsoftODataCoreUriParserSemanticSingleValueNode.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeReference, kind);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicrosoftODataCoreUriParserSemanticSingleValueNode {\n");
    
    sb.append("    typeReference: ").append(toIndentedString(typeReference)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
