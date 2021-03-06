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
 * A specific place where a person, business, or organization can be found and where physical mail can be received.
 */
@ApiModel(description = "A specific place where a person, business, or organization can be found and where physical mail can be received.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class ActWebApiModelsAddress {
  @JsonProperty("country")
  private String country = null;

  @JsonProperty("line2")
  private String line2 = null;

  @JsonProperty("line3")
  private String line3 = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("line1")
  private String line1 = null;

  public ActWebApiModelsAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * A nation with its own government, occupying a particular territory.
   * @return country
  **/
  @ApiModelProperty(value = "A nation with its own government, occupying a particular territory.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ActWebApiModelsAddress line2(String line2) {
    this.line2 = line2;
    return this;
  }

   /**
   * Secondary street address
   * @return line2
  **/
  @ApiModelProperty(value = "Secondary street address")
  public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public ActWebApiModelsAddress line3(String line3) {
    this.line3 = line3;
    return this;
  }

   /**
   * Miscellaneous street address
   * @return line3
  **/
  @ApiModelProperty(value = "Miscellaneous street address")
  public String getLine3() {
    return line3;
  }

  public void setLine3(String line3) {
    this.line3 = line3;
  }

  public ActWebApiModelsAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * A code of letters and digits added to a postal address to aid in the sorting of mail.
   * @return postalCode
  **/
  @ApiModelProperty(value = "A code of letters and digits added to a postal address to aid in the sorting of mail.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public ActWebApiModelsAddress state(String state) {
    this.state = state;
    return this;
  }

   /**
   * A nation or territory considered as an organized political community under one government.
   * @return state
  **/
  @ApiModelProperty(value = "A nation or territory considered as an organized political community under one government.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ActWebApiModelsAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * An inhabited place of greater size, population, or importance than a town or village.
   * @return city
  **/
  @ApiModelProperty(value = "An inhabited place of greater size, population, or importance than a town or village.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ActWebApiModelsAddress line1(String line1) {
    this.line1 = line1;
    return this;
  }

   /**
   * Primary street address
   * @return line1
  **/
  @ApiModelProperty(value = "Primary street address")
  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActWebApiModelsAddress actWebApiModelsAddress = (ActWebApiModelsAddress) o;
    return Objects.equals(this.country, actWebApiModelsAddress.country) &&
        Objects.equals(this.line2, actWebApiModelsAddress.line2) &&
        Objects.equals(this.line3, actWebApiModelsAddress.line3) &&
        Objects.equals(this.postalCode, actWebApiModelsAddress.postalCode) &&
        Objects.equals(this.state, actWebApiModelsAddress.state) &&
        Objects.equals(this.city, actWebApiModelsAddress.city) &&
        Objects.equals(this.line1, actWebApiModelsAddress.line1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, line2, line3, postalCode, state, city, line1);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActWebApiModelsAddress {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
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

