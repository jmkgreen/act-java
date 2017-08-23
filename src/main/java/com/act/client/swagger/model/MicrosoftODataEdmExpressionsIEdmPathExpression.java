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
import java.util.ArrayList;
import java.util.List;

/**
 * MicrosoftODataEdmExpressionsIEdmPathExpression
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class MicrosoftODataEdmExpressionsIEdmPathExpression {
  @JsonProperty("path")
  private List<String> path = null;

  /**
   * Gets or Sets expressionKind
   */
  public enum ExpressionKindEnum {
    NONE("None"),
    
    BINARYCONSTANT("BinaryConstant"),
    
    BOOLEANCONSTANT("BooleanConstant"),
    
    DATETIMEOFFSETCONSTANT("DateTimeOffsetConstant"),
    
    DECIMALCONSTANT("DecimalConstant"),
    
    FLOATINGCONSTANT("FloatingConstant"),
    
    GUIDCONSTANT("GuidConstant"),
    
    INTEGERCONSTANT("IntegerConstant"),
    
    STRINGCONSTANT("StringConstant"),
    
    DURATIONCONSTANT("DurationConstant"),
    
    NULL("Null"),
    
    RECORD("Record"),
    
    COLLECTION("Collection"),
    
    PATH("Path"),
    
    PARAMETERREFERENCE("ParameterReference"),
    
    OPERATIONREFERENCE("OperationReference"),
    
    PROPERTYREFERENCE("PropertyReference"),
    
    VALUETERMREFERENCE("ValueTermReference"),
    
    ENTITYSETREFERENCE("EntitySetReference"),
    
    ENUMMEMBERREFERENCE("EnumMemberReference"),
    
    IF("If"),
    
    CAST("Cast"),
    
    ISTYPE("IsType"),
    
    OPERATIONAPPLICATION("OperationApplication"),
    
    LABELEDEXPRESSIONREFERENCE("LabeledExpressionReference"),
    
    LABELED("Labeled"),
    
    PROPERTYPATH("PropertyPath"),
    
    NAVIGATIONPROPERTYPATH("NavigationPropertyPath"),
    
    DATECONSTANT("DateConstant"),
    
    TIMEOFDAYCONSTANT("TimeOfDayConstant"),
    
    ENUMMEMBER("EnumMember");

    private String value;

    ExpressionKindEnum(String value) {
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
    public static ExpressionKindEnum fromValue(String text) {
      for (ExpressionKindEnum b : ExpressionKindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("expressionKind")
  private ExpressionKindEnum expressionKind = null;

  public MicrosoftODataEdmExpressionsIEdmPathExpression path(List<String> path) {
    this.path = path;
    return this;
  }

  public MicrosoftODataEdmExpressionsIEdmPathExpression addPathItem(String pathItem) {
    if (this.path == null) {
      this.path = new ArrayList<String>();
    }
    this.path.add(pathItem);
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public List<String> getPath() {
    return path;
  }

  public void setPath(List<String> path) {
    this.path = path;
  }

   /**
   * Get expressionKind
   * @return expressionKind
  **/
  @ApiModelProperty(value = "")
  public ExpressionKindEnum getExpressionKind() {
    return expressionKind;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicrosoftODataEdmExpressionsIEdmPathExpression microsoftODataEdmExpressionsIEdmPathExpression = (MicrosoftODataEdmExpressionsIEdmPathExpression) o;
    return Objects.equals(this.path, microsoftODataEdmExpressionsIEdmPathExpression.path) &&
        Objects.equals(this.expressionKind, microsoftODataEdmExpressionsIEdmPathExpression.expressionKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, expressionKind);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicrosoftODataEdmExpressionsIEdmPathExpression {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    expressionKind: ").append(toIndentedString(expressionKind)).append("\n");
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

