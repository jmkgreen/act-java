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
 * A company entity that displayed as a sub-child to a parent entity.
 */
@ApiModel(description = "A company entity that displayed as a sub-child to a parent entity.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class ActWebApiModelsCompaniesEmbeddedCompany {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  public ActWebApiModelsCompaniesEmbeddedCompany id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Gets a unique identifier (id) for a given company.
   * @return id
  **/
  @ApiModelProperty(value = "Gets a unique identifier (id) for a given company.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ActWebApiModelsCompaniesEmbeddedCompany name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets the name of the company.
   * @return name
  **/
  @ApiModelProperty(value = "Gets the name of the company.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActWebApiModelsCompaniesEmbeddedCompany actWebApiModelsCompaniesEmbeddedCompany = (ActWebApiModelsCompaniesEmbeddedCompany) o;
    return Objects.equals(this.id, actWebApiModelsCompaniesEmbeddedCompany.id) &&
        Objects.equals(this.name, actWebApiModelsCompaniesEmbeddedCompany.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActWebApiModelsCompaniesEmbeddedCompany {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
