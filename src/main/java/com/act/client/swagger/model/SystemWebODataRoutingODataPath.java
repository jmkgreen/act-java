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
import com.act.client.swagger.model.MicrosoftODataEdmIEdmNavigationSource;
import com.act.client.swagger.model.MicrosoftODataEdmIEdmType;
import com.act.client.swagger.model.SystemWebODataRoutingODataPathSegment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * SystemWebODataRoutingODataPath
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class SystemWebODataRoutingODataPath {
  @JsonProperty("edmType")
  private MicrosoftODataEdmIEdmType edmType = null;

  @JsonProperty("navigationSource")
  private MicrosoftODataEdmIEdmNavigationSource navigationSource = null;

  @JsonProperty("pathTemplate")
  private String pathTemplate = null;

  @JsonProperty("segments")
  private List<SystemWebODataRoutingODataPathSegment> segments = null;

  public SystemWebODataRoutingODataPath edmType(MicrosoftODataEdmIEdmType edmType) {
    this.edmType = edmType;
    return this;
  }

   /**
   * Get edmType
   * @return edmType
  **/
  @ApiModelProperty(value = "")
  public MicrosoftODataEdmIEdmType getEdmType() {
    return edmType;
  }

  public void setEdmType(MicrosoftODataEdmIEdmType edmType) {
    this.edmType = edmType;
  }

  public SystemWebODataRoutingODataPath navigationSource(MicrosoftODataEdmIEdmNavigationSource navigationSource) {
    this.navigationSource = navigationSource;
    return this;
  }

   /**
   * Get navigationSource
   * @return navigationSource
  **/
  @ApiModelProperty(value = "")
  public MicrosoftODataEdmIEdmNavigationSource getNavigationSource() {
    return navigationSource;
  }

  public void setNavigationSource(MicrosoftODataEdmIEdmNavigationSource navigationSource) {
    this.navigationSource = navigationSource;
  }

   /**
   * Get pathTemplate
   * @return pathTemplate
  **/
  @ApiModelProperty(value = "")
  public String getPathTemplate() {
    return pathTemplate;
  }

  public SystemWebODataRoutingODataPath segments(List<SystemWebODataRoutingODataPathSegment> segments) {
    this.segments = segments;
    return this;
  }

  public SystemWebODataRoutingODataPath addSegmentsItem(SystemWebODataRoutingODataPathSegment segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<SystemWebODataRoutingODataPathSegment>();
    }
    this.segments.add(segmentsItem);
    return this;
  }

   /**
   * Get segments
   * @return segments
  **/
  @ApiModelProperty(value = "")
  public List<SystemWebODataRoutingODataPathSegment> getSegments() {
    return segments;
  }

  public void setSegments(List<SystemWebODataRoutingODataPathSegment> segments) {
    this.segments = segments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemWebODataRoutingODataPath systemWebODataRoutingODataPath = (SystemWebODataRoutingODataPath) o;
    return Objects.equals(this.edmType, systemWebODataRoutingODataPath.edmType) &&
        Objects.equals(this.navigationSource, systemWebODataRoutingODataPath.navigationSource) &&
        Objects.equals(this.pathTemplate, systemWebODataRoutingODataPath.pathTemplate) &&
        Objects.equals(this.segments, systemWebODataRoutingODataPath.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edmType, navigationSource, pathTemplate, segments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemWebODataRoutingODataPath {\n");
    
    sb.append("    edmType: ").append(toIndentedString(edmType)).append("\n");
    sb.append("    navigationSource: ").append(toIndentedString(navigationSource)).append("\n");
    sb.append("    pathTemplate: ").append(toIndentedString(pathTemplate)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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

