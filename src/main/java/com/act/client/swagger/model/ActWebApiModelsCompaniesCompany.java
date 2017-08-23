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
import com.act.client.swagger.model.ActWebApiModelsAddress;
import com.act.client.swagger.model.SystemObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * A company is any entity that engages in business.
 */
@ApiModel(description = "A company is any entity that engages in business.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class ActWebApiModelsCompaniesCompany {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("address")
  private ActWebApiModelsAddress address = null;

  @JsonProperty("billingAddress")
  private ActWebApiModelsAddress billingAddress = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("division")
  private String division = null;

  @JsonProperty("fax")
  private String fax = null;

  @JsonProperty("faxExtension")
  private String faxExtension = null;

  @JsonProperty("idStatus")
  private String idStatus = null;

  @JsonProperty("industry")
  private String industry = null;

  @JsonProperty("numberOfEmployees")
  private Integer numberOfEmployees = null;

  @JsonProperty("parentID")
  private String parentID = null;

  @JsonProperty("hierarchyLevel")
  private Integer hierarchyLevel = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("phoneExtension")
  private String phoneExtension = null;

  @JsonProperty("referredBy")
  private String referredBy = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("revenue")
  private Double revenue = null;

  @JsonProperty("shippingAddress")
  private ActWebApiModelsAddress shippingAddress = null;

  @JsonProperty("sicCode")
  private String sicCode = null;

  @JsonProperty("territory")
  private String territory = null;

  @JsonProperty("tickerSymbol")
  private String tickerSymbol = null;

  @JsonProperty("tollFreePhone")
  private String tollFreePhone = null;

  @JsonProperty("website")
  private String website = null;

  @JsonProperty("customFields")
  private Map<String, SystemObject> customFields = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("edited")
  private OffsetDateTime edited = null;

  @JsonProperty("editedBy")
  private String editedBy = null;

  @JsonProperty("recordOwner")
  private String recordOwner = null;

  public ActWebApiModelsCompaniesCompany id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier (id) for this company.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier (id) for this company.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ActWebApiModelsCompaniesCompany name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The company&#39;s given name.
   * @return name
  **/
  @ApiModelProperty(value = "The company's given name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ActWebApiModelsCompaniesCompany address(ActWebApiModelsAddress address) {
    this.address = address;
    return this;
  }

   /**
   * The company&#39;s business address.
   * @return address
  **/
  @ApiModelProperty(value = "The company's business address.")
  public ActWebApiModelsAddress getAddress() {
    return address;
  }

  public void setAddress(ActWebApiModelsAddress address) {
    this.address = address;
  }

  public ActWebApiModelsCompaniesCompany billingAddress(ActWebApiModelsAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * The company&#39;s billing address.
   * @return billingAddress
  **/
  @ApiModelProperty(value = "The company's billing address.")
  public ActWebApiModelsAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(ActWebApiModelsAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  public ActWebApiModelsCompaniesCompany description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A brief written representation or account of this company.
   * @return description
  **/
  @ApiModelProperty(value = "A brief written representation or account of this company.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ActWebApiModelsCompaniesCompany division(String division) {
    this.division = division;
    return this;
  }

   /**
   * The name of a smaller part of a parent company tasked with overseeing different types of products or services than those offered by the parent company.
   * @return division
  **/
  @ApiModelProperty(value = "The name of a smaller part of a parent company tasked with overseeing different types of products or services than those offered by the parent company.")
  public String getDivision() {
    return division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  public ActWebApiModelsCompaniesCompany fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * The company&#39;s fax phone number.
   * @return fax
  **/
  @ApiModelProperty(value = "The company's fax phone number.")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public ActWebApiModelsCompaniesCompany faxExtension(String faxExtension) {
    this.faxExtension = faxExtension;
    return this;
  }

   /**
   * The company&#39;s fax phone number extension.
   * @return faxExtension
  **/
  @ApiModelProperty(value = "The company's fax phone number extension.")
  public String getFaxExtension() {
    return faxExtension;
  }

  public void setFaxExtension(String faxExtension) {
    this.faxExtension = faxExtension;
  }

  public ActWebApiModelsCompaniesCompany idStatus(String idStatus) {
    this.idStatus = idStatus;
    return this;
  }

   /**
   * The relative social or professional position of an individual within a group or organization.
   * @return idStatus
  **/
  @ApiModelProperty(value = "The relative social or professional position of an individual within a group or organization.")
  public String getIdStatus() {
    return idStatus;
  }

  public void setIdStatus(String idStatus) {
    this.idStatus = idStatus;
  }

  public ActWebApiModelsCompaniesCompany industry(String industry) {
    this.industry = industry;
    return this;
  }

   /**
   * Economic activity concerned with the processing of raw materials and manufacture of goods in factories.
   * @return industry
  **/
  @ApiModelProperty(value = "Economic activity concerned with the processing of raw materials and manufacture of goods in factories.")
  public String getIndustry() {
    return industry;
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }

  public ActWebApiModelsCompaniesCompany numberOfEmployees(Integer numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
    return this;
  }

   /**
   * The total number of employees that this company operates with.
   * @return numberOfEmployees
  **/
  @ApiModelProperty(value = "The total number of employees that this company operates with.")
  public Integer getNumberOfEmployees() {
    return numberOfEmployees;
  }

  public void setNumberOfEmployees(Integer numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }

  public ActWebApiModelsCompaniesCompany parentID(String parentID) {
    this.parentID = parentID;
    return this;
  }

   /**
   * The unique identifier (id) of the parent company.
   * @return parentID
  **/
  @ApiModelProperty(value = "The unique identifier (id) of the parent company.")
  public String getParentID() {
    return parentID;
  }

  public void setParentID(String parentID) {
    this.parentID = parentID;
  }

  public ActWebApiModelsCompaniesCompany hierarchyLevel(Integer hierarchyLevel) {
    this.hierarchyLevel = hierarchyLevel;
    return this;
  }

   /**
   * The positional level of where this company lays within a company hierarchy.
   * @return hierarchyLevel
  **/
  @ApiModelProperty(value = "The positional level of where this company lays within a company hierarchy.")
  public Integer getHierarchyLevel() {
    return hierarchyLevel;
  }

  public void setHierarchyLevel(Integer hierarchyLevel) {
    this.hierarchyLevel = hierarchyLevel;
  }

  public ActWebApiModelsCompaniesCompany phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * The company&#39;s phone number.
   * @return phone
  **/
  @ApiModelProperty(value = "The company's phone number.")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public ActWebApiModelsCompaniesCompany phoneExtension(String phoneExtension) {
    this.phoneExtension = phoneExtension;
    return this;
  }

   /**
   * The company&#39;s phone number extension.
   * @return phoneExtension
  **/
  @ApiModelProperty(value = "The company's phone number extension.")
  public String getPhoneExtension() {
    return phoneExtension;
  }

  public void setPhoneExtension(String phoneExtension) {
    this.phoneExtension = phoneExtension;
  }

  public ActWebApiModelsCompaniesCompany referredBy(String referredBy) {
    this.referredBy = referredBy;
    return this;
  }

   /**
   * Mention or allude to.
   * @return referredBy
  **/
  @ApiModelProperty(value = "Mention or allude to.")
  public String getReferredBy() {
    return referredBy;
  }

  public void setReferredBy(String referredBy) {
    this.referredBy = referredBy;
  }

  public ActWebApiModelsCompaniesCompany region(String region) {
    this.region = region;
    return this;
  }

   /**
   * A part of a country, of the world, etc., that is different or separate from other parts in some way.
   * @return region
  **/
  @ApiModelProperty(value = "A part of a country, of the world, etc., that is different or separate from other parts in some way.")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public ActWebApiModelsCompaniesCompany revenue(Double revenue) {
    this.revenue = revenue;
    return this;
  }

   /**
   * The amount of money that this company actually receives during a specific period, including discounts and deductions for returned merchandise.
   * @return revenue
  **/
  @ApiModelProperty(value = "The amount of money that this company actually receives during a specific period, including discounts and deductions for returned merchandise.")
  public Double getRevenue() {
    return revenue;
  }

  public void setRevenue(Double revenue) {
    this.revenue = revenue;
  }

  public ActWebApiModelsCompaniesCompany shippingAddress(ActWebApiModelsAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * The company&#39;s shipping address.
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "The company's shipping address.")
  public ActWebApiModelsAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(ActWebApiModelsAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public ActWebApiModelsCompaniesCompany sicCode(String sicCode) {
    this.sicCode = sicCode;
    return this;
  }

   /**
   * Standard Industrial Classification (SIC) codes are four-digit numerical codes assigned by the U.S. government to business establishments to identify the primary business of the establishment.
   * @return sicCode
  **/
  @ApiModelProperty(value = "Standard Industrial Classification (SIC) codes are four-digit numerical codes assigned by the U.S. government to business establishments to identify the primary business of the establishment.")
  public String getSicCode() {
    return sicCode;
  }

  public void setSicCode(String sicCode) {
    this.sicCode = sicCode;
  }

  public ActWebApiModelsCompaniesCompany territory(String territory) {
    this.territory = territory;
    return this;
  }

   /**
   * Geographical area.
   * @return territory
  **/
  @ApiModelProperty(value = "Geographical area.")
  public String getTerritory() {
    return territory;
  }

  public void setTerritory(String territory) {
    this.territory = territory;
  }

  public ActWebApiModelsCompaniesCompany tickerSymbol(String tickerSymbol) {
    this.tickerSymbol = tickerSymbol;
    return this;
  }

   /**
   * An arrangement of characters (usually letters) representing a particular security listed on an exchange or otherwise traded publicly.
   * @return tickerSymbol
  **/
  @ApiModelProperty(value = "An arrangement of characters (usually letters) representing a particular security listed on an exchange or otherwise traded publicly.")
  public String getTickerSymbol() {
    return tickerSymbol;
  }

  public void setTickerSymbol(String tickerSymbol) {
    this.tickerSymbol = tickerSymbol;
  }

  public ActWebApiModelsCompaniesCompany tollFreePhone(String tollFreePhone) {
    this.tollFreePhone = tollFreePhone;
    return this;
  }

   /**
   * The company&#39;s toll free phone number.
   * @return tollFreePhone
  **/
  @ApiModelProperty(value = "The company's toll free phone number.")
  public String getTollFreePhone() {
    return tollFreePhone;
  }

  public void setTollFreePhone(String tollFreePhone) {
    this.tollFreePhone = tollFreePhone;
  }

  public ActWebApiModelsCompaniesCompany website(String website) {
    this.website = website;
    return this;
  }

   /**
   * The company&#39;s website.
   * @return website
  **/
  @ApiModelProperty(value = "The company's website.")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public ActWebApiModelsCompaniesCompany customFields(Map<String, SystemObject> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ActWebApiModelsCompaniesCompany putCustomFieldsItem(String key, SystemObject customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<String, SystemObject>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(value = "")
  public Map<String, SystemObject> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(Map<String, SystemObject> customFields) {
    this.customFields = customFields;
  }

  public ActWebApiModelsCompaniesCompany created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public ActWebApiModelsCompaniesCompany edited(OffsetDateTime edited) {
    this.edited = edited;
    return this;
  }

   /**
   * Get edited
   * @return edited
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEdited() {
    return edited;
  }

  public void setEdited(OffsetDateTime edited) {
    this.edited = edited;
  }

  public ActWebApiModelsCompaniesCompany editedBy(String editedBy) {
    this.editedBy = editedBy;
    return this;
  }

   /**
   * Get editedBy
   * @return editedBy
  **/
  @ApiModelProperty(value = "")
  public String getEditedBy() {
    return editedBy;
  }

  public void setEditedBy(String editedBy) {
    this.editedBy = editedBy;
  }

  public ActWebApiModelsCompaniesCompany recordOwner(String recordOwner) {
    this.recordOwner = recordOwner;
    return this;
  }

   /**
   * Get recordOwner
   * @return recordOwner
  **/
  @ApiModelProperty(value = "")
  public String getRecordOwner() {
    return recordOwner;
  }

  public void setRecordOwner(String recordOwner) {
    this.recordOwner = recordOwner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActWebApiModelsCompaniesCompany actWebApiModelsCompaniesCompany = (ActWebApiModelsCompaniesCompany) o;
    return Objects.equals(this.id, actWebApiModelsCompaniesCompany.id) &&
        Objects.equals(this.name, actWebApiModelsCompaniesCompany.name) &&
        Objects.equals(this.address, actWebApiModelsCompaniesCompany.address) &&
        Objects.equals(this.billingAddress, actWebApiModelsCompaniesCompany.billingAddress) &&
        Objects.equals(this.description, actWebApiModelsCompaniesCompany.description) &&
        Objects.equals(this.division, actWebApiModelsCompaniesCompany.division) &&
        Objects.equals(this.fax, actWebApiModelsCompaniesCompany.fax) &&
        Objects.equals(this.faxExtension, actWebApiModelsCompaniesCompany.faxExtension) &&
        Objects.equals(this.idStatus, actWebApiModelsCompaniesCompany.idStatus) &&
        Objects.equals(this.industry, actWebApiModelsCompaniesCompany.industry) &&
        Objects.equals(this.numberOfEmployees, actWebApiModelsCompaniesCompany.numberOfEmployees) &&
        Objects.equals(this.parentID, actWebApiModelsCompaniesCompany.parentID) &&
        Objects.equals(this.hierarchyLevel, actWebApiModelsCompaniesCompany.hierarchyLevel) &&
        Objects.equals(this.phone, actWebApiModelsCompaniesCompany.phone) &&
        Objects.equals(this.phoneExtension, actWebApiModelsCompaniesCompany.phoneExtension) &&
        Objects.equals(this.referredBy, actWebApiModelsCompaniesCompany.referredBy) &&
        Objects.equals(this.region, actWebApiModelsCompaniesCompany.region) &&
        Objects.equals(this.revenue, actWebApiModelsCompaniesCompany.revenue) &&
        Objects.equals(this.shippingAddress, actWebApiModelsCompaniesCompany.shippingAddress) &&
        Objects.equals(this.sicCode, actWebApiModelsCompaniesCompany.sicCode) &&
        Objects.equals(this.territory, actWebApiModelsCompaniesCompany.territory) &&
        Objects.equals(this.tickerSymbol, actWebApiModelsCompaniesCompany.tickerSymbol) &&
        Objects.equals(this.tollFreePhone, actWebApiModelsCompaniesCompany.tollFreePhone) &&
        Objects.equals(this.website, actWebApiModelsCompaniesCompany.website) &&
        Objects.equals(this.customFields, actWebApiModelsCompaniesCompany.customFields) &&
        Objects.equals(this.created, actWebApiModelsCompaniesCompany.created) &&
        Objects.equals(this.edited, actWebApiModelsCompaniesCompany.edited) &&
        Objects.equals(this.editedBy, actWebApiModelsCompaniesCompany.editedBy) &&
        Objects.equals(this.recordOwner, actWebApiModelsCompaniesCompany.recordOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, billingAddress, description, division, fax, faxExtension, idStatus, industry, numberOfEmployees, parentID, hierarchyLevel, phone, phoneExtension, referredBy, region, revenue, shippingAddress, sicCode, territory, tickerSymbol, tollFreePhone, website, customFields, created, edited, editedBy, recordOwner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActWebApiModelsCompaniesCompany {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    faxExtension: ").append(toIndentedString(faxExtension)).append("\n");
    sb.append("    idStatus: ").append(toIndentedString(idStatus)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    numberOfEmployees: ").append(toIndentedString(numberOfEmployees)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    hierarchyLevel: ").append(toIndentedString(hierarchyLevel)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneExtension: ").append(toIndentedString(phoneExtension)).append("\n");
    sb.append("    referredBy: ").append(toIndentedString(referredBy)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    sicCode: ").append(toIndentedString(sicCode)).append("\n");
    sb.append("    territory: ").append(toIndentedString(territory)).append("\n");
    sb.append("    tickerSymbol: ").append(toIndentedString(tickerSymbol)).append("\n");
    sb.append("    tollFreePhone: ").append(toIndentedString(tollFreePhone)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    edited: ").append(toIndentedString(edited)).append("\n");
    sb.append("    editedBy: ").append(toIndentedString(editedBy)).append("\n");
    sb.append("    recordOwner: ").append(toIndentedString(recordOwner)).append("\n");
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

