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
import com.act.client.swagger.model.ActWebApiModelsMetaDataPicklistsColumnBindings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Represents a typed list of custom values in the application database.
 */
@ApiModel(description = "Represents a typed list of custom values in the application database.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class ActWebApiModelsMetaDataPicklistsPickList {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("recordType")
  private String recordType = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("edited")
  private OffsetDateTime edited = null;

  @JsonProperty("fields")
  private List<ActWebApiModelsMetaDataPicklistsColumnBindings> fields = null;

  public ActWebApiModelsMetaDataPicklistsPickList id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Gets the unique identifier of the PickList object.
   * @return id
  **/
  @ApiModelProperty(value = "Gets the unique identifier of the PickList object.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ActWebApiModelsMetaDataPicklistsPickList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets or sets the name of the PickList.
   * @return name
  **/
  @ApiModelProperty(value = "Gets or sets the name of the PickList.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ActWebApiModelsMetaDataPicklistsPickList recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * 
   * @return recordType
  **/
  @ApiModelProperty(value = "")
  public String getRecordType() {
    return recordType;
  }

  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }

  public ActWebApiModelsMetaDataPicklistsPickList description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Gets or sets the description of the PickList.
   * @return description
  **/
  @ApiModelProperty(value = "Gets or sets the description of the PickList.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ActWebApiModelsMetaDataPicklistsPickList created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Gets the creation date of the PickList object.
   * @return created
  **/
  @ApiModelProperty(value = "Gets the creation date of the PickList object.")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public ActWebApiModelsMetaDataPicklistsPickList edited(OffsetDateTime edited) {
    this.edited = edited;
    return this;
  }

   /**
   * Gets the edit date of the PickList object.
   * @return edited
  **/
  @ApiModelProperty(value = "Gets the edit date of the PickList object.")
  public OffsetDateTime getEdited() {
    return edited;
  }

  public void setEdited(OffsetDateTime edited) {
    this.edited = edited;
  }

  public ActWebApiModelsMetaDataPicklistsPickList fields(List<ActWebApiModelsMetaDataPicklistsColumnBindings> fields) {
    this.fields = fields;
    return this;
  }

  public ActWebApiModelsMetaDataPicklistsPickList addFieldsItem(ActWebApiModelsMetaDataPicklistsColumnBindings fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<ActWebApiModelsMetaDataPicklistsColumnBindings>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * 
   * @return fields
  **/
  @ApiModelProperty(value = "")
  public List<ActWebApiModelsMetaDataPicklistsColumnBindings> getFields() {
    return fields;
  }

  public void setFields(List<ActWebApiModelsMetaDataPicklistsColumnBindings> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActWebApiModelsMetaDataPicklistsPickList actWebApiModelsMetaDataPicklistsPickList = (ActWebApiModelsMetaDataPicklistsPickList) o;
    return Objects.equals(this.id, actWebApiModelsMetaDataPicklistsPickList.id) &&
        Objects.equals(this.name, actWebApiModelsMetaDataPicklistsPickList.name) &&
        Objects.equals(this.recordType, actWebApiModelsMetaDataPicklistsPickList.recordType) &&
        Objects.equals(this.description, actWebApiModelsMetaDataPicklistsPickList.description) &&
        Objects.equals(this.created, actWebApiModelsMetaDataPicklistsPickList.created) &&
        Objects.equals(this.edited, actWebApiModelsMetaDataPicklistsPickList.edited) &&
        Objects.equals(this.fields, actWebApiModelsMetaDataPicklistsPickList.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, recordType, description, created, edited, fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActWebApiModelsMetaDataPicklistsPickList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    edited: ").append(toIndentedString(edited)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

