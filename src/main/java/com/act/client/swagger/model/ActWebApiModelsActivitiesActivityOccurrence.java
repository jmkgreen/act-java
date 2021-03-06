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
public class ActWebApiModelsActivitiesActivityOccurrence {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isCleared")
  private Boolean isCleared = null;

  @JsonProperty("seriesID")
  private String seriesID = null;

  @JsonProperty("startTime")
  private OffsetDateTime startTime = null;

  @JsonProperty("endTime")
  private OffsetDateTime endTime = null;

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

  public ActWebApiModelsActivitiesActivityOccurrence id(String id) {
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

   /**
   * Indicates that the activity has been cleared.
   * @return isCleared
  **/
  @ApiModelProperty(value = "Indicates that the activity has been cleared.")
  public Boolean isIsCleared() {
    return isCleared;
  }

   /**
   * A unique identifier that represents the activity.  The id that is returned is based on if it is a recurring or not.              Recurrent activity: RecurSourceActivityId or Single Occurence activity: ActivityID
   * @return seriesID
  **/
  @ApiModelProperty(value = "A unique identifier that represents the activity.  The id that is returned is based on if it is a recurring or not.              Recurrent activity: RecurSourceActivityId or Single Occurence activity: ActivityID")
  public String getSeriesID() {
    return seriesID;
  }

  public ActWebApiModelsActivitiesActivityOccurrence startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The time the activity is to begin
   * @return startTime
  **/
  @ApiModelProperty(value = "The time the activity is to begin")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public ActWebApiModelsActivitiesActivityOccurrence endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The time the activity is to end
   * @return endTime
  **/
  @ApiModelProperty(value = "The time the activity is to end")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public ActWebApiModelsActivitiesActivityOccurrence location(String location) {
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

  public ActWebApiModelsActivitiesActivityOccurrence isTimeless(Boolean isTimeless) {
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

  public ActWebApiModelsActivitiesActivityOccurrence isPrivate(Boolean isPrivate) {
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

  public ActWebApiModelsActivitiesActivityOccurrence activityPriorityName(String activityPriorityName) {
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

  public ActWebApiModelsActivitiesActivityOccurrence activityTypeName(String activityTypeName) {
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

  public ActWebApiModelsActivitiesActivityOccurrence attachment(ActWebApiModelsAttachmentsAttachment attachment) {
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

  public ActWebApiModelsActivitiesActivityOccurrence details(String details) {
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

  public ActWebApiModelsActivitiesActivityOccurrence subject(String subject) {
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

  public ActWebApiModelsActivitiesActivityOccurrence recurSpec(ActWebApiModelsActivitiesRecurSpec recurSpec) {
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

  public ActWebApiModelsActivitiesActivityOccurrence created(OffsetDateTime created) {
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

  public ActWebApiModelsActivitiesActivityOccurrence edited(OffsetDateTime edited) {
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

  public ActWebApiModelsActivitiesActivityOccurrence scheduledBy(String scheduledBy) {
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

  public ActWebApiModelsActivitiesActivityOccurrence scheduledFor(String scheduledFor) {
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

  public ActWebApiModelsActivitiesActivityOccurrence companies(List<ActWebApiModelsCompaniesEmbeddedCompany> companies) {
    this.companies = companies;
    return this;
  }

  public ActWebApiModelsActivitiesActivityOccurrence addCompaniesItem(ActWebApiModelsCompaniesEmbeddedCompany companiesItem) {
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

  public ActWebApiModelsActivitiesActivityOccurrence contacts(List<ActWebApiModelsActivitiesEmbededActivityContact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public ActWebApiModelsActivitiesActivityOccurrence addContactsItem(ActWebApiModelsActivitiesEmbededActivityContact contactsItem) {
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

  public ActWebApiModelsActivitiesActivityOccurrence groups(List<ActWebApiModelsGroupsEmbeddedGroup> groups) {
    this.groups = groups;
    return this;
  }

  public ActWebApiModelsActivitiesActivityOccurrence addGroupsItem(ActWebApiModelsGroupsEmbeddedGroup groupsItem) {
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

  public ActWebApiModelsActivitiesActivityOccurrence opportunities(List<ActWebApiModelsOpportunitiesEmbeddedOpportunity> opportunities) {
    this.opportunities = opportunities;
    return this;
  }

  public ActWebApiModelsActivitiesActivityOccurrence addOpportunitiesItem(ActWebApiModelsOpportunitiesEmbeddedOpportunity opportunitiesItem) {
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
    ActWebApiModelsActivitiesActivityOccurrence actWebApiModelsActivitiesActivityOccurrence = (ActWebApiModelsActivitiesActivityOccurrence) o;
    return Objects.equals(this.id, actWebApiModelsActivitiesActivityOccurrence.id) &&
        Objects.equals(this.isCleared, actWebApiModelsActivitiesActivityOccurrence.isCleared) &&
        Objects.equals(this.seriesID, actWebApiModelsActivitiesActivityOccurrence.seriesID) &&
        Objects.equals(this.startTime, actWebApiModelsActivitiesActivityOccurrence.startTime) &&
        Objects.equals(this.endTime, actWebApiModelsActivitiesActivityOccurrence.endTime) &&
        Objects.equals(this.location, actWebApiModelsActivitiesActivityOccurrence.location) &&
        Objects.equals(this.isTimeless, actWebApiModelsActivitiesActivityOccurrence.isTimeless) &&
        Objects.equals(this.isPrivate, actWebApiModelsActivitiesActivityOccurrence.isPrivate) &&
        Objects.equals(this.activityPriorityName, actWebApiModelsActivitiesActivityOccurrence.activityPriorityName) &&
        Objects.equals(this.activityTypeName, actWebApiModelsActivitiesActivityOccurrence.activityTypeName) &&
        Objects.equals(this.attachment, actWebApiModelsActivitiesActivityOccurrence.attachment) &&
        Objects.equals(this.details, actWebApiModelsActivitiesActivityOccurrence.details) &&
        Objects.equals(this.subject, actWebApiModelsActivitiesActivityOccurrence.subject) &&
        Objects.equals(this.recurSpec, actWebApiModelsActivitiesActivityOccurrence.recurSpec) &&
        Objects.equals(this.created, actWebApiModelsActivitiesActivityOccurrence.created) &&
        Objects.equals(this.edited, actWebApiModelsActivitiesActivityOccurrence.edited) &&
        Objects.equals(this.scheduledBy, actWebApiModelsActivitiesActivityOccurrence.scheduledBy) &&
        Objects.equals(this.scheduledFor, actWebApiModelsActivitiesActivityOccurrence.scheduledFor) &&
        Objects.equals(this.companies, actWebApiModelsActivitiesActivityOccurrence.companies) &&
        Objects.equals(this.contacts, actWebApiModelsActivitiesActivityOccurrence.contacts) &&
        Objects.equals(this.groups, actWebApiModelsActivitiesActivityOccurrence.groups) &&
        Objects.equals(this.opportunities, actWebApiModelsActivitiesActivityOccurrence.opportunities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isCleared, seriesID, startTime, endTime, location, isTimeless, isPrivate, activityPriorityName, activityTypeName, attachment, details, subject, recurSpec, created, edited, scheduledBy, scheduledFor, companies, contacts, groups, opportunities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActWebApiModelsActivitiesActivityOccurrence {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isCleared: ").append(toIndentedString(isCleared)).append("\n");
    sb.append("    seriesID: ").append(toIndentedString(seriesID)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

