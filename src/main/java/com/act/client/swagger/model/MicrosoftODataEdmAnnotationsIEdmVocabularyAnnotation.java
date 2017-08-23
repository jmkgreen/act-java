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
import com.act.client.swagger.model.MicrosoftODataEdmIEdmTerm;
import com.act.client.swagger.model.MicrosoftODataEdmIEdmVocabularyAnnotatable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MicrosoftODataEdmAnnotationsIEdmVocabularyAnnotation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class MicrosoftODataEdmAnnotationsIEdmVocabularyAnnotation {
  @JsonProperty("qualifier")
  private String qualifier = null;

  @JsonProperty("term")
  private MicrosoftODataEdmIEdmTerm term = null;

  @JsonProperty("target")
  private MicrosoftODataEdmIEdmVocabularyAnnotatable target = null;

   /**
   * Get qualifier
   * @return qualifier
  **/
  @ApiModelProperty(value = "")
  public String getQualifier() {
    return qualifier;
  }

  public MicrosoftODataEdmAnnotationsIEdmVocabularyAnnotation term(MicrosoftODataEdmIEdmTerm term) {
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/
  @ApiModelProperty(value = "")
  public MicrosoftODataEdmIEdmTerm getTerm() {
    return term;
  }

  public void setTerm(MicrosoftODataEdmIEdmTerm term) {
    this.term = term;
  }

  public MicrosoftODataEdmAnnotationsIEdmVocabularyAnnotation target(MicrosoftODataEdmIEdmVocabularyAnnotatable target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(value = "")
  public MicrosoftODataEdmIEdmVocabularyAnnotatable getTarget() {
    return target;
  }

  public void setTarget(MicrosoftODataEdmIEdmVocabularyAnnotatable target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicrosoftODataEdmAnnotationsIEdmVocabularyAnnotation microsoftODataEdmAnnotationsIEdmVocabularyAnnotation = (MicrosoftODataEdmAnnotationsIEdmVocabularyAnnotation) o;
    return Objects.equals(this.qualifier, microsoftODataEdmAnnotationsIEdmVocabularyAnnotation.qualifier) &&
        Objects.equals(this.term, microsoftODataEdmAnnotationsIEdmVocabularyAnnotation.term) &&
        Objects.equals(this.target, microsoftODataEdmAnnotationsIEdmVocabularyAnnotation.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualifier, term, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicrosoftODataEdmAnnotationsIEdmVocabularyAnnotation {\n");
    
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

