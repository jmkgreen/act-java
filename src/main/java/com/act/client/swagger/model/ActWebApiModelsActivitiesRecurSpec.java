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
import com.act.client.swagger.model.ActWebApiModelsActivitiesRecurDay;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class ActWebApiModelsActivitiesRecurSpec {
  @JsonProperty("seriesStart")
  private OffsetDateTime seriesStart = null;

  @JsonProperty("day")
  private ActWebApiModelsActivitiesRecurDay day = null;

  @JsonProperty("seriesEnd")
  private OffsetDateTime seriesEnd = null;

  @JsonProperty("isEndless")
  private Boolean isEndless = null;

  @JsonProperty("month")
  private Integer month = null;

  @JsonProperty("frequency")
  private Integer frequency = null;

  /**
   * Represents a unit of time used to separate recurences (i.e. Daily, Weekly, Monthly, Yearly).
   */
  public enum RecurTypeEnum {
    NONE("None"),
    
    DAILY("Daily"),
    
    WEEKLY("Weekly"),
    
    MONTHLY("Monthly"),
    
    YEARLY("Yearly");

    private String value;

    RecurTypeEnum(String value) {
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
    public static RecurTypeEnum fromValue(String text) {
      for (RecurTypeEnum b : RecurTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("recurType")
  private RecurTypeEnum recurType = null;

  public ActWebApiModelsActivitiesRecurSpec seriesStart(OffsetDateTime seriesStart) {
    this.seriesStart = seriesStart;
    return this;
  }

   /**
   * Specifiying the starting time for a given day.
   * @return seriesStart
  **/
  @ApiModelProperty(value = "Specifiying the starting time for a given day.")
  public OffsetDateTime getSeriesStart() {
    return seriesStart;
  }

  public void setSeriesStart(OffsetDateTime seriesStart) {
    this.seriesStart = seriesStart;
  }

  public ActWebApiModelsActivitiesRecurSpec day(ActWebApiModelsActivitiesRecurDay day) {
    this.day = day;
    return this;
  }

   /**
   * Specifiying the day of a recurrence.
   * @return day
  **/
  @ApiModelProperty(value = "Specifiying the day of a recurrence.")
  public ActWebApiModelsActivitiesRecurDay getDay() {
    return day;
  }

  public void setDay(ActWebApiModelsActivitiesRecurDay day) {
    this.day = day;
  }

  public ActWebApiModelsActivitiesRecurSpec seriesEnd(OffsetDateTime seriesEnd) {
    this.seriesEnd = seriesEnd;
    return this;
  }

   /**
   * Specifiying the ending time for a given day.
   * @return seriesEnd
  **/
  @ApiModelProperty(value = "Specifiying the ending time for a given day.")
  public OffsetDateTime getSeriesEnd() {
    return seriesEnd;
  }

  public void setSeriesEnd(OffsetDateTime seriesEnd) {
    this.seriesEnd = seriesEnd;
  }

  public ActWebApiModelsActivitiesRecurSpec isEndless(Boolean isEndless) {
    this.isEndless = isEndless;
    return this;
  }

   /**
   * Flag denoting whether an end date has been specified for the pattern. Note: If false, the following defaults are used: For Daily and Weekly: 2 years beyond the start date For Monthly and Yearly: June 6, 2073.
   * @return isEndless
  **/
  @ApiModelProperty(value = "Flag denoting whether an end date has been specified for the pattern. Note: If false, the following defaults are used: For Daily and Weekly: 2 years beyond the start date For Monthly and Yearly: June 6, 2073.")
  public Boolean isIsEndless() {
    return isEndless;
  }

  public void setIsEndless(Boolean isEndless) {
    this.isEndless = isEndless;
  }

  public ActWebApiModelsActivitiesRecurSpec month(Integer month) {
    this.month = month;
    return this;
  }

   /**
   * Represents the specific month for certain recurrence patterns
   * @return month
  **/
  @ApiModelProperty(value = "Represents the specific month for certain recurrence patterns")
  public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  public ActWebApiModelsActivitiesRecurSpec frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Represents how often for the recurrence patterns
   * @return frequency
  **/
  @ApiModelProperty(value = "Represents how often for the recurrence patterns")
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public ActWebApiModelsActivitiesRecurSpec recurType(RecurTypeEnum recurType) {
    this.recurType = recurType;
    return this;
  }

   /**
   * Represents a unit of time used to separate recurences (i.e. Daily, Weekly, Monthly, Yearly).
   * @return recurType
  **/
  @ApiModelProperty(value = "Represents a unit of time used to separate recurences (i.e. Daily, Weekly, Monthly, Yearly).")
  public RecurTypeEnum getRecurType() {
    return recurType;
  }

  public void setRecurType(RecurTypeEnum recurType) {
    this.recurType = recurType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActWebApiModelsActivitiesRecurSpec actWebApiModelsActivitiesRecurSpec = (ActWebApiModelsActivitiesRecurSpec) o;
    return Objects.equals(this.seriesStart, actWebApiModelsActivitiesRecurSpec.seriesStart) &&
        Objects.equals(this.day, actWebApiModelsActivitiesRecurSpec.day) &&
        Objects.equals(this.seriesEnd, actWebApiModelsActivitiesRecurSpec.seriesEnd) &&
        Objects.equals(this.isEndless, actWebApiModelsActivitiesRecurSpec.isEndless) &&
        Objects.equals(this.month, actWebApiModelsActivitiesRecurSpec.month) &&
        Objects.equals(this.frequency, actWebApiModelsActivitiesRecurSpec.frequency) &&
        Objects.equals(this.recurType, actWebApiModelsActivitiesRecurSpec.recurType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seriesStart, day, seriesEnd, isEndless, month, frequency, recurType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActWebApiModelsActivitiesRecurSpec {\n");
    
    sb.append("    seriesStart: ").append(toIndentedString(seriesStart)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    seriesEnd: ").append(toIndentedString(seriesEnd)).append("\n");
    sb.append("    isEndless: ").append(toIndentedString(isEndless)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    recurType: ").append(toIndentedString(recurType)).append("\n");
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

