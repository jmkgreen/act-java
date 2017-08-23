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
import com.act.client.swagger.model.ActWebApiModelsActivitiesEmbededActivityContact;
import com.act.client.swagger.model.ActWebApiModelsActivitiesRecurSpec;
import com.act.client.swagger.model.ActWebApiModelsAttachmentsAttachment;
import com.act.client.swagger.model.ActWebApiModelsCompaniesEmbeddedCompany;
import com.act.client.swagger.model.ActWebApiModelsGroupsEmbeddedGroup;
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
public class ActWebApiModelsActivitiesActivitySeries {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("duration")
  private String duration = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("isTimeless")
  private Boolean isTimeless = null;

  @JsonProperty("isPrivate")
  private Boolean isPrivate = null;

  @JsonProperty("activityPriorityName")
  private String activityPriorityName = null;

  @JsonProperty("activityTypeName")
  private String activityTypeName = null;

  @JsonProperty("attachment")
  private ActWebApiModelsAttachmentsAttachment attachment = null;

  @JsonProperty("details")
  private String details = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("recurSpec")
  private ActWebApiModelsActivitiesRecurSpec recurSpec = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("edited")
  private OffsetDateTime edited = null;

  @JsonProperty("scheduledBy")
  private String scheduledBy = null;

  @JsonProperty("scheduledFor")
  private String scheduledFor = null;

  @JsonProperty("companies")
  private List<ActWebApiModelsCompaniesEmbeddedCompany> companies = null;

  @JsonProperty("contacts")
  private List<ActWebApiModelsActivitiesEmbededActivityContact> contacts = null;

  @JsonProperty("groups")
  private List<ActWebApiModelsGroupsEmbeddedGroup> groups = null;

  @JsonProperty("opportunities")
  private List<ActWebApiModelsOpportunitiesEmbeddedOpportunity> opportunities = null;

  public ActWebApiModelsActivitiesActivitySeries id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier that represents the activity.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier that represents the activity.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ActWebApiModelsActivitiesActivitySeries duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Representing the difference between the start time and end time of the activity.
   * @return duration
  **/
  @ApiModelProperty(value = "Representing the difference between the start time and end time of the activity.")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public ActWebApiModelsActivitiesActivitySeries location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Describes the physical location that the activity is to take place.
   * @return location
  **/
  @ApiModelProperty(value = "Describes the physical location that the activity is to take place.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public ActWebApiModelsActivitiesActivitySeries isTimeless(Boolean isTimeless) {
    this.isTimeless = isTimeless;
    return this;
  }

   /**
   * Indicates whether a specifies action is to be completed at a specific time-of-day.
   * @return isTimeless
  **/
  @ApiModelProperty(value = "Indicates whether a specifies action is to be completed at a specific time-of-day.")
  public Boolean isIsTimeless() {
    return isTimeless;
  }

  public void setIsTimeless(Boolean isTimeless) {
    this.isTimeless = isTimeless;
  }

  public ActWebApiModelsActivitiesActivitySeries isPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
    return this;
  }

   /**
   * Indicates elevated security that only the creator/owner has access to this activity.
   * @return isPrivate
  **/
  @ApiModelProperty(value = "Indicates elevated security that only the creator/owner has access to this activity.")
  public Boolean isIsPrivate() {
    return isPrivate;
  }

  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }

  public ActWebApiModelsActivitiesActivitySeries activityPriorityName(String activityPriorityName) {
    this.activityPriorityName = activityPriorityName;
    return this;
  }

   /**
   * Displays the priority of the activity.
   * @return activityPriorityName
  **/
  @ApiModelProperty(value = "Displays the priority of the activity.")
  public String getActivityPriorityName() {
    return activityPriorityName;
  }

  public void setActivityPriorityName(String activityPriorityName) {
    this.activityPriorityName = activityPriorityName;
  }

  public ActWebApiModelsActivitiesActivitySeries activityTypeName(String activityTypeName) {
    this.activityTypeName = activityTypeName;
    return this;
  }

   /**
   * Displays the type of the activity.
   * @return activityTypeName
  **/
  @ApiModelProperty(value = "Displays the type of the activity.")
  public String getActivityTypeName() {
    return activityTypeName;
  }

  public void setActivityTypeName(String activityTypeName) {
    this.activityTypeName = activityTypeName;
  }

  public ActWebApiModelsActivitiesActivitySeries attachment(ActWebApiModelsAttachmentsAttachment attachment) {
    this.attachment = attachment;
    return this;
  }

   /**
   * Gets the attachment referenced by this note.
   * @return attachment
  **/
  @ApiModelProperty(value = "Gets the attachment referenced by this note.")
  public ActWebApiModelsAttachmentsAttachment getAttachment() {
    return attachment;
  }

  public void setAttachment(ActWebApiModelsAttachmentsAttachment attachment) {
    this.attachment = attachment;
  }

  public ActWebApiModelsActivitiesActivitySeries details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Additional detailed information about the activity.
   * @return details
  **/
  @ApiModelProperty(value = "Additional detailed information about the activity.")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public ActWebApiModelsActivitiesActivitySeries subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * A description of the action to be completed.
   * @return subject
  **/
  @ApiModelProperty(value = "A description of the action to be completed.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public ActWebApiModelsActivitiesActivitySeries recurSpec(ActWebApiModelsActivitiesRecurSpec recurSpec) {
    this.recurSpec = recurSpec;
    return this;
  }

   /**
   * The recurrence pattern for the activity.
   * @return recurSpec
  **/
  @ApiModelProperty(value = "The recurrence pattern for the activity.")
  public ActWebApiModelsActivitiesRecurSpec getRecurSpec() {
    return recurSpec;
  }

  public void setRecurSpec(ActWebApiModelsActivitiesRecurSpec recurSpec) {
    this.recurSpec = recurSpec;
  }

  public ActWebApiModelsActivitiesActivitySeries created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * The date and time the activity was created.
   * @return created
  **/
  @ApiModelProperty(value = "The date and time the activity was created.")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public ActWebApiModelsActivitiesActivitySeries edited(OffsetDateTime edited) {
    this.edited = edited;
    return this;
  }

   /**
   * The date and time the activity was last updated.
   * @return edited
  **/
  @ApiModelProperty(value = "The date and time the activity was last updated.")
  public OffsetDateTime getEdited() {
    return edited;
  }

  public void setEdited(OffsetDateTime edited) {
    this.edited = edited;
  }

  public ActWebApiModelsActivitiesActivitySeries scheduledBy(String scheduledBy) {
    this.scheduledBy = scheduledBy;
    return this;
  }

   /**
   * The contact who created this activity.
   * @return scheduledBy
  **/
  @ApiModelProperty(value = "The contact who created this activity.")
  public String getScheduledBy() {
    return scheduledBy;
  }

  public void setScheduledBy(String scheduledBy) {
    this.scheduledBy = scheduledBy;
  }

  public ActWebApiModelsActivitiesActivitySeries scheduledFor(String scheduledFor) {
    this.scheduledFor = scheduledFor;
    return this;
  }

   /**
   * The name of the activity&#39;s organizer.
   * @return scheduledFor
  **/
  @ApiModelProperty(value = "The name of the activity's organizer.")
  public String getScheduledFor() {
    return scheduledFor;
  }

  public void setScheduledFor(String scheduledFor) {
    this.scheduledFor = scheduledFor;
  }

  public ActWebApiModelsActivitiesActivitySeries companies(List<ActWebApiModelsCompaniesEmbeddedCompany> companies) {
    this.companies = companies;
    return this;
  }

  public ActWebApiModelsActivitiesActivitySeries addCompaniesItem(ActWebApiModelsCompaniesEmbeddedCompany companiesItem) {
    if (this.companies == null) {
      this.companies = new ArrayList<ActWebApiModelsCompaniesEmbeddedCompany>();
    }
    this.companies.add(companiesItem);
    return this;
  }

   /**
   * List of companies that are associated to this activity.
   * @return companies
  **/
  @ApiModelProperty(value = "List of companies that are associated to this activity.")
  public List<ActWebApiModelsCompaniesEmbeddedCompany> getCompanies() {
    return companies;
  }

  public void setCompanies(List<ActWebApiModelsCompaniesEmbeddedCompany> companies) {
    this.companies = companies;
  }

  public ActWebApiModelsActivitiesActivitySeries contacts(List<ActWebApiModelsActivitiesEmbededActivityContact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public ActWebApiModelsActivitiesActivitySeries addContactsItem(ActWebApiModelsActivitiesEmbededActivityContact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<ActWebApiModelsActivitiesEmbededActivityContact>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * The attendees scheduled for the activity.  Note: at least one contact is required.
   * @return contacts
  **/
  @ApiModelProperty(value = "The attendees scheduled for the activity.  Note: at least one contact is required.")
  public List<ActWebApiModelsActivitiesEmbededActivityContact> getContacts() {
    return contacts;
  }

  public void setContacts(List<ActWebApiModelsActivitiesEmbededActivityContact> contacts) {
    this.contacts = contacts;
  }

  public ActWebApiModelsActivitiesActivitySeries groups(List<ActWebApiModelsGroupsEmbeddedGroup> groups) {
    this.groups = groups;
    return this;
  }

  public ActWebApiModelsActivitiesActivitySeries addGroupsItem(ActWebApiModelsGroupsEmbeddedGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<ActWebApiModelsGroupsEmbeddedGroup>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * List a groups that are associated to this activity.
   * @return groups
  **/
  @ApiModelProperty(value = "List a groups that are associated to this activity.")
  public List<ActWebApiModelsGroupsEmbeddedGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<ActWebApiModelsGroupsEmbeddedGroup> groups) {
    this.groups = groups;
  }

  public ActWebApiModelsActivitiesActivitySeries opportunities(List<ActWebApiModelsOpportunitiesEmbeddedOpportunity> opportunities) {
    this.opportunities = opportunities;
    return this;
  }

  public ActWebApiModelsActivitiesActivitySeries addOpportunitiesItem(ActWebApiModelsOpportunitiesEmbeddedOpportunity opportunitiesItem) {
    if (this.opportunities == null) {
      this.opportunities = new ArrayList<ActWebApiModelsOpportunitiesEmbeddedOpportunity>();
    }
    this.opportunities.add(opportunitiesItem);
    return this;
  }

   /**
   * List a opportunities that are associated to this activity.
   * @return opportunities
  **/
  @ApiModelProperty(value = "List a opportunities that are associated to this activity.")
  public List<ActWebApiModelsOpportunitiesEmbeddedOpportunity> getOpportunities() {
    return opportunities;
  }

  public void setOpportunities(List<ActWebApiModelsOpportunitiesEmbeddedOpportunity> opportunities) {
    this.opportunities = opportunities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActWebApiModelsActivitiesActivitySeries actWebApiModelsActivitiesActivitySeries = (ActWebApiModelsActivitiesActivitySeries) o;
    return Objects.equals(this.id, actWebApiModelsActivitiesActivitySeries.id) &&
        Objects.equals(this.duration, actWebApiModelsActivitiesActivitySeries.duration) &&
        Objects.equals(this.location, actWebApiModelsActivitiesActivitySeries.location) &&
        Objects.equals(this.isTimeless, actWebApiModelsActivitiesActivitySeries.isTimeless) &&
        Objects.equals(this.isPrivate, actWebApiModelsActivitiesActivitySeries.isPrivate) &&
        Objects.equals(this.activityPriorityName, actWebApiModelsActivitiesActivitySeries.activityPriorityName) &&
        Objects.equals(this.activityTypeName, actWebApiModelsActivitiesActivitySeries.activityTypeName) &&
        Objects.equals(this.attachment, actWebApiModelsActivitiesActivitySeries.attachment) &&
        Objects.equals(this.details, actWebApiModelsActivitiesActivitySeries.details) &&
        Objects.equals(this.subject, actWebApiModelsActivitiesActivitySeries.subject) &&
        Objects.equals(this.recurSpec, actWebApiModelsActivitiesActivitySeries.recurSpec) &&
        Objects.equals(this.created, actWebApiModelsActivitiesActivitySeries.created) &&
        Objects.equals(this.edited, actWebApiModelsActivitiesActivitySeries.edited) &&
        Objects.equals(this.scheduledBy, actWebApiModelsActivitiesActivitySeries.scheduledBy) &&
        Objects.equals(this.scheduledFor, actWebApiModelsActivitiesActivitySeries.scheduledFor) &&
        Objects.equals(this.companies, actWebApiModelsActivitiesActivitySeries.companies) &&
        Objects.equals(this.contacts, actWebApiModelsActivitiesActivitySeries.contacts) &&
        Objects.equals(this.groups, actWebApiModelsActivitiesActivitySeries.groups) &&
        Objects.equals(this.opportunities, actWebApiModelsActivitiesActivitySeries.opportunities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, duration, location, isTimeless, isPrivate, activityPriorityName, activityTypeName, attachment, details, subject, recurSpec, created, edited, scheduledBy, scheduledFor, companies, contacts, groups, opportunities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActWebApiModelsActivitiesActivitySeries {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    isTimeless: ").append(toIndentedString(isTimeless)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    activityPriorityName: ").append(toIndentedString(activityPriorityName)).append("\n");
    sb.append("    activityTypeName: ").append(toIndentedString(activityTypeName)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    recurSpec: ").append(toIndentedString(recurSpec)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    edited: ").append(toIndentedString(edited)).append("\n");
    sb.append("    scheduledBy: ").append(toIndentedString(scheduledBy)).append("\n");
    sb.append("    scheduledFor: ").append(toIndentedString(scheduledFor)).append("\n");
    sb.append("    companies: ").append(toIndentedString(companies)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    opportunities: ").append(toIndentedString(opportunities)).append("\n");
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

