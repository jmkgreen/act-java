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
import com.act.client.swagger.model.MicrosoftODataCoreUriParserSemanticSelectItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * MicrosoftODataCoreUriParserSemanticSelectExpandClause
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class MicrosoftODataCoreUriParserSemanticSelectExpandClause {
  @JsonProperty("selectedItems")
  private List<MicrosoftODataCoreUriParserSemanticSelectItem> selectedItems = null;

  @JsonProperty("allSelected")
  private Boolean allSelected = null;

  public MicrosoftODataCoreUriParserSemanticSelectExpandClause selectedItems(List<MicrosoftODataCoreUriParserSemanticSelectItem> selectedItems) {
    this.selectedItems = selectedItems;
    return this;
  }

  public MicrosoftODataCoreUriParserSemanticSelectExpandClause addSelectedItemsItem(MicrosoftODataCoreUriParserSemanticSelectItem selectedItemsItem) {
    if (this.selectedItems == null) {
      this.selectedItems = new ArrayList<MicrosoftODataCoreUriParserSemanticSelectItem>();
    }
    this.selectedItems.add(selectedItemsItem);
    return this;
  }

   /**
   * Get selectedItems
   * @return selectedItems
  **/
  @ApiModelProperty(value = "")
  public List<MicrosoftODataCoreUriParserSemanticSelectItem> getSelectedItems() {
    return selectedItems;
  }

  public void setSelectedItems(List<MicrosoftODataCoreUriParserSemanticSelectItem> selectedItems) {
    this.selectedItems = selectedItems;
  }

   /**
   * Get allSelected
   * @return allSelected
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllSelected() {
    return allSelected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicrosoftODataCoreUriParserSemanticSelectExpandClause microsoftODataCoreUriParserSemanticSelectExpandClause = (MicrosoftODataCoreUriParserSemanticSelectExpandClause) o;
    return Objects.equals(this.selectedItems, microsoftODataCoreUriParserSemanticSelectExpandClause.selectedItems) &&
        Objects.equals(this.allSelected, microsoftODataCoreUriParserSemanticSelectExpandClause.allSelected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectedItems, allSelected);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicrosoftODataCoreUriParserSemanticSelectExpandClause {\n");
    
    sb.append("    selectedItems: ").append(toIndentedString(selectedItems)).append("\n");
    sb.append("    allSelected: ").append(toIndentedString(allSelected)).append("\n");
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

