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
import com.act.client.swagger.model.ActWebApiModelsGeographicsCountry;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class ActWebApiModelsGeographicsMask {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("country")
  private ActWebApiModelsGeographicsCountry country = null;

  @JsonProperty("default")
  private Boolean _default = null;

  @JsonProperty("format")
  private String format = null;

  @JsonProperty("isActive")
  private Boolean isActive = null;

  public ActWebApiModelsGeographicsMask id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier (id) for this phone format mask.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier (id) for this phone format mask.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ActWebApiModelsGeographicsMask country(ActWebApiModelsGeographicsCountry country) {
    this.country = country;
    return this;
  }

   /**
   * A territory where this phone format mask is uses.
   * @return country
  **/
  @ApiModelProperty(value = "A territory where this phone format mask is uses.")
  public ActWebApiModelsGeographicsCountry getCountry() {
    return country;
  }

  public void setCountry(ActWebApiModelsGeographicsCountry country) {
    this.country = country;
  }

  public ActWebApiModelsGeographicsMask _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Indicates that this mask is the default phone format mask.
   * @return _default
  **/
  @ApiModelProperty(value = "Indicates that this mask is the default phone format mask.")
  public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public ActWebApiModelsGeographicsMask format(String format) {
    this.format = format;
    return this;
  }

   /**
   * The mask that is used to format the phone number.
   * @return format
  **/
  @ApiModelProperty(value = "The mask that is used to format the phone number.")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public ActWebApiModelsGeographicsMask isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates that this mask is in an active state or not.
   * @return isActive
  **/
  @ApiModelProperty(value = "Indicates that this mask is in an active state or not.")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActWebApiModelsGeographicsMask actWebApiModelsGeographicsMask = (ActWebApiModelsGeographicsMask) o;
    return Objects.equals(this.id, actWebApiModelsGeographicsMask.id) &&
        Objects.equals(this.country, actWebApiModelsGeographicsMask.country) &&
        Objects.equals(this._default, actWebApiModelsGeographicsMask._default) &&
        Objects.equals(this.format, actWebApiModelsGeographicsMask.format) &&
        Objects.equals(this.isActive, actWebApiModelsGeographicsMask.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, country, _default, format, isActive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActWebApiModelsGeographicsMask {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

