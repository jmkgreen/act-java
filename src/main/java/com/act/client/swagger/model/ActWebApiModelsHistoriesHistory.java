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
import com.act.client.swagger.model.ActWebApiModelsAttachmentsAttachment;
import com.act.client.swagger.model.ActWebApiModelsCompaniesEmbeddedCompany;
import com.act.client.swagger.model.ActWebApiModelsContactsEmbeddedContact;
import com.act.client.swagger.model.ActWebApiModelsGroupsEmbeddedGroup;
import com.act.client.swagger.model.ActWebApiModelsHistoriesHistoryType;
import com.act.client.swagger.model.ActWebApiModelsOpportunitiesEmbeddedOpportunity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class ActWebApiModelsHistoriesHistory {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("manageUserID")
  private String manageUserID = null;

  @JsonProperty("createUserID")
  private String createUserID = null;

  @JsonProperty("isPrivate")
  private Boolean isPrivate = null;

  @JsonProperty("details")
  private String details = null;

  @JsonProperty("regarding")
  private String regarding = null;

  @JsonProperty("duration")
  private String duration = null;

  @JsonProperty("startTime")
  private OffsetDateTime startTime = null;

  @JsonProperty("endTime")
  private OffsetDateTime endTime = null;

  @JsonProperty("historyTypeID")
  private Integer historyTypeID = null;

  @JsonProperty("historyType")
  private ActWebApiModelsHistoriesHistoryType historyType = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("edited")
  private OffsetDateTime edited = null;

  @JsonProperty("companies")
  private List<ActWebApiModelsCompaniesEmbeddedCompany> companies = null;

  @JsonProperty("contacts")
  private List<ActWebApiModelsContactsEmbeddedContact> contacts = null;

  @JsonProperty("groups")
  private List<ActWebApiModelsGroupsEmbeddedGroup> groups = null;

  @JsonProperty("opportunities")
  private List<ActWebApiModelsOpportunitiesEmbeddedOpportunity> opportunities = null;

  @JsonProperty("attachment")
  private ActWebApiModelsAttachmentsAttachment attachment = null;

  public ActWebApiModelsHistoriesHistory id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ActWebApiModelsHistoriesHistory manageUserID(String manageUserID) {
    this.manageUserID = manageUserID;
    return this;
  }

   /**
   * 
   * @return manageUserID
  **/
  @ApiModelProperty(value = "")
  public String getManageUserID() {
    return manageUserID;
  }

  public void setManageUserID(String manageUserID) {
    this.manageUserID = manageUserID;
  }

  public ActWebApiModelsHistoriesHistory createUserID(String createUserID) {
    this.createUserID = createUserID;
    return this;
  }

   /**
   * 
   * @return createUserID
  **/
  @ApiModelProperty(value = "")
  public String getCreateUserID() {
    return createUserID;
  }

  public void setCreateUserID(String createUserID) {
    this.createUserID = createUserID;
  }

  public ActWebApiModelsHistoriesHistory isPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
    return this;
  }

   /**
   * 
   * @return isPrivate
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsPrivate() {
    return isPrivate;
  }

  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }

  public ActWebApiModelsHistoriesHistory details(String details) {
    this.details = details;
    return this;
  }

   /**
   * 
   * @return details
  **/
  @ApiModelProperty(value = "")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public ActWebApiModelsHistoriesHistory regarding(String regarding) {
    this.regarding = regarding;
    return this;
  }

   /**
   * 
   * @return regarding
  **/
  @ApiModelProperty(value = "")
  public String getRegarding() {
    return regarding;
  }

  public void setRegarding(String regarding) {
    this.regarding = regarding;
  }

  public ActWebApiModelsHistoriesHistory duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * 
   * @return duration
  **/
  @ApiModelProperty(value = "")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public ActWebApiModelsHistoriesHistory startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * 
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public ActWebApiModelsHistoriesHistory endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public ActWebApiModelsHistoriesHistory historyTypeID(Integer historyTypeID) {
    this.historyTypeID = historyTypeID;
    return this;
  }

   /**
   * 
   * @return historyTypeID
  **/
  @ApiModelProperty(value = "")
  public Integer getHistoryTypeID() {
    return historyTypeID;
  }

  public void setHistoryTypeID(Integer historyTypeID) {
    this.historyTypeID = historyTypeID;
  }

  public ActWebApiModelsHistoriesHistory historyType(ActWebApiModelsHistoriesHistoryType historyType) {
    this.historyType = historyType;
    return this;
  }

   /**
   * 
   * @return historyType
  **/
  @ApiModelProperty(value = "")
  public ActWebApiModelsHistoriesHistoryType getHistoryType() {
    return historyType;
  }

  public void setHistoryType(ActWebApiModelsHistoriesHistoryType historyType) {
    this.historyType = historyType;
  }

  public ActWebApiModelsHistoriesHistory created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * 
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public ActWebApiModelsHistoriesHistory edited(OffsetDateTime edited) {
    this.edited = edited;
    return this;
  }

   /**
   * 
   * @return edited
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEdited() {
    return edited;
  }

  public void setEdited(OffsetDateTime edited) {
    this.edited = edited;
  }

  public ActWebApiModelsHistoriesHistory companies(List<ActWebApiModelsCompaniesEmbeddedCompany> companies) {
    this.companies = companies;
    return this;
  }

  public ActWebApiModelsHistoriesHistory addCompaniesItem(ActWebApiModelsCompaniesEmbeddedCompany companiesItem) {
    if (this.companies == null) {
      this.companies = new ArrayList<ActWebApiModelsCompaniesEmbeddedCompany>();
    }
    this.companies.add(companiesItem);
    return this;
  }

   /**
   * List of companies that are associated to this history entity.
   * @return companies
  **/
  @ApiModelProperty(value = "List of companies that are associated to this history entity.")
  public List<ActWebApiModelsCompaniesEmbeddedCompany> getCompanies() {
    return companies;
  }

  public void setCompanies(List<ActWebApiModelsCompaniesEmbeddedCompany> companies) {
    this.companies = companies;
  }

  public ActWebApiModelsHistoriesHistory contacts(List<ActWebApiModelsContactsEmbeddedContact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public ActWebApiModelsHistoriesHistory addContactsItem(ActWebApiModelsContactsEmbeddedContact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<ActWebApiModelsContactsEmbeddedContact>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * List of contacts that are associated to this history entity.
   * @return contacts
  **/
  @ApiModelProperty(value = "List of contacts that are associated to this history entity.")
  public List<ActWebApiModelsContactsEmbeddedContact> getContacts() {
    return contacts;
  }

  public void setContacts(List<ActWebApiModelsContactsEmbeddedContact> contacts) {
    this.contacts = contacts;
  }

  public ActWebApiModelsHistoriesHistory groups(List<ActWebApiModelsGroupsEmbeddedGroup> groups) {
    this.groups = groups;
    return this;
  }

  public ActWebApiModelsHistoriesHistory addGroupsItem(ActWebApiModelsGroupsEmbeddedGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<ActWebApiModelsGroupsEmbeddedGroup>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * List a groups that are associated to this history entity.
   * @return groups
  **/
  @ApiModelProperty(value = "List a groups that are associated to this history entity.")
  public List<ActWebApiModelsGroupsEmbeddedGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<ActWebApiModelsGroupsEmbeddedGroup> groups) {
    this.groups = groups;
  }

  public ActWebApiModelsHistoriesHistory opportunities(List<ActWebApiModelsOpportunitiesEmbeddedOpportunity> opportunities) {
    this.opportunities = opportunities;
    return this;
  }

  public ActWebApiModelsHistoriesHistory addOpportunitiesItem(ActWebApiModelsOpportunitiesEmbeddedOpportunity opportunitiesItem) {
    if (this.opportunities == null) {
      this.opportunities = new ArrayList<ActWebApiModelsOpportunitiesEmbeddedOpportunity>();
    }
    this.opportunities.add(opportunitiesItem);
    return this;
  }

   /**
   * List a opportunities that are associated to this history entity.
   * @return opportunities
  **/
  @ApiModelProperty(value = "List a opportunities that are associated to this history entity.")
  public List<ActWebApiModelsOpportunitiesEmbeddedOpportunity> getOpportunities() {
    return opportunities;
  }

  public void setOpportunities(List<ActWebApiModelsOpportunitiesEmbeddedOpportunity> opportunities) {
    this.opportunities = opportunities;
  }

  public ActWebApiModelsHistoriesHistory attachment(ActWebApiModelsAttachmentsAttachment attachment) {
    this.attachment = attachment;
    return this;
  }

   /**
   * Gets the attachment referenced by this history item.
   * @return attachment
  **/
  @ApiModelProperty(value = "Gets the attachment referenced by this history item.")
  public ActWebApiModelsAttachmentsAttachment getAttachment() {
    return attachment;
  }

  public void setAttachment(ActWebApiModelsAttachmentsAttachment attachment) {
    this.attachment = attachment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActWebApiModelsHistoriesHistory actWebApiModelsHistoriesHistory = (ActWebApiModelsHistoriesHistory) o;
    return Objects.equals(this.id, actWebApiModelsHistoriesHistory.id) &&
        Objects.equals(this.manageUserID, actWebApiModelsHistoriesHistory.manageUserID) &&
        Objects.equals(this.createUserID, actWebApiModelsHistoriesHistory.createUserID) &&
        Objects.equals(this.isPrivate, actWebApiModelsHistoriesHistory.isPrivate) &&
        Objects.equals(this.details, actWebApiModelsHistoriesHistory.details) &&
        Objects.equals(this.regarding, actWebApiModelsHistoriesHistory.regarding) &&
        Objects.equals(this.duration, actWebApiModelsHistoriesHistory.duration) &&
        Objects.equals(this.startTime, actWebApiModelsHistoriesHistory.startTime) &&
        Objects.equals(this.endTime, actWebApiModelsHistoriesHistory.endTime) &&
        Objects.equals(this.historyTypeID, actWebApiModelsHistoriesHistory.historyTypeID) &&
        Objects.equals(this.historyType, actWebApiModelsHistoriesHistory.historyType) &&
        Objects.equals(this.created, actWebApiModelsHistoriesHistory.created) &&
        Objects.equals(this.edited, actWebApiModelsHistoriesHistory.edited) &&
        Objects.equals(this.companies, actWebApiModelsHistoriesHistory.companies) &&
        Objects.equals(this.contacts, actWebApiModelsHistoriesHistory.contacts) &&
        Objects.equals(this.groups, actWebApiModelsHistoriesHistory.groups) &&
        Objects.equals(this.opportunities, actWebApiModelsHistoriesHistory.opportunities) &&
        Objects.equals(this.attachment, actWebApiModelsHistoriesHistory.attachment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, manageUserID, createUserID, isPrivate, details, regarding, duration, startTime, endTime, historyTypeID, historyType, created, edited, companies, contacts, groups, opportunities, attachment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActWebApiModelsHistoriesHistory {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    manageUserID: ").append(toIndentedString(manageUserID)).append("\n");
    sb.append("    createUserID: ").append(toIndentedString(createUserID)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    regarding: ").append(toIndentedString(regarding)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    historyTypeID: ").append(toIndentedString(historyTypeID)).append("\n");
    sb.append("    historyType: ").append(toIndentedString(historyType)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    edited: ").append(toIndentedString(edited)).append("\n");
    sb.append("    companies: ").append(toIndentedString(companies)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    opportunities: ").append(toIndentedString(opportunities)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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

