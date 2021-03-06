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
import org.threeten.bp.OffsetDateTime;

/**
 * This class describes a particular product that is associated with an opportunity.
 */
@ApiModel(description = "This class describes a particular product that is associated with an opportunity.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T12:00:13.972Z")
public class ActWebApiModelsOpportunitiesOpportunityProduct {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("cost")
  private Double cost = null;

  @JsonProperty("createDate")
  private OffsetDateTime createDate = null;

  @JsonProperty("discount")
  private Double discount = null;

  @JsonProperty("discountPrice")
  private Double discountPrice = null;

  @JsonProperty("editDate")
  private OffsetDateTime editDate = null;

  @JsonProperty("itemNumber")
  private String itemNumber = null;

  @JsonProperty("opportunityID")
  private String opportunityID = null;

  @JsonProperty("price")
  private Double price = null;

  @JsonProperty("productID")
  private String productID = null;

  @JsonProperty("quantity")
  private Double quantity = null;

  @JsonProperty("total")
  private Double total = null;

  public ActWebApiModelsOpportunitiesOpportunityProduct id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier (id) for a given opportunity product.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier (id) for a given opportunity product.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ActWebApiModelsOpportunitiesOpportunityProduct name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the opportunity product.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the opportunity product.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ActWebApiModelsOpportunitiesOpportunityProduct cost(Double cost) {
    this.cost = cost;
    return this;
  }

   /**
   * The cost of the opportunity product.
   * @return cost
  **/
  @ApiModelProperty(value = "The cost of the opportunity product.")
  public Double getCost() {
    return cost;
  }

  public void setCost(Double cost) {
    this.cost = cost;
  }

  public ActWebApiModelsOpportunitiesOpportunityProduct createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * The date that the opportunity product was created.
   * @return createDate
  **/
  @ApiModelProperty(value = "The date that the opportunity product was created.")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public ActWebApiModelsOpportunitiesOpportunityProduct discount(Double discount) {
    this.discount = discount;
    return this;
  }

   /**
   * The opportunity product&#39;s discounted percentage (ignore on updates).
   * @return discount
  **/
  @ApiModelProperty(value = "The opportunity product's discounted percentage (ignore on updates).")
  public Double getDiscount() {
    return discount;
  }

  public void setDiscount(Double discount) {
    this.discount = discount;
  }

  public ActWebApiModelsOpportunitiesOpportunityProduct discountPrice(Double discountPrice) {
    this.discountPrice = discountPrice;
    return this;
  }

   /**
   * The discounted price of the opportunity product.
   * @return discountPrice
  **/
  @ApiModelProperty(value = "The discounted price of the opportunity product.")
  public Double getDiscountPrice() {
    return discountPrice;
  }

  public void setDiscountPrice(Double discountPrice) {
    this.discountPrice = discountPrice;
  }

  public ActWebApiModelsOpportunitiesOpportunityProduct editDate(OffsetDateTime editDate) {
    this.editDate = editDate;
    return this;
  }

   /**
   * The date that the opportunity product was lasted modified.
   * @return editDate
  **/
  @ApiModelProperty(value = "The date that the opportunity product was lasted modified.")
  public OffsetDateTime getEditDate() {
    return editDate;
  }

  public void setEditDate(OffsetDateTime editDate) {
    this.editDate = editDate;
  }

  public ActWebApiModelsOpportunitiesOpportunityProduct itemNumber(String itemNumber) {
    this.itemNumber = itemNumber;
    return this;
  }

   /**
   * A item number assigned to this opportunity product.
   * @return itemNumber
  **/
  @ApiModelProperty(value = "A item number assigned to this opportunity product.")
  public String getItemNumber() {
    return itemNumber;
  }

  public void setItemNumber(String itemNumber) {
    this.itemNumber = itemNumber;
  }

  public ActWebApiModelsOpportunitiesOpportunityProduct opportunityID(String opportunityID) {
    this.opportunityID = opportunityID;
    return this;
  }

   /**
   * A unique identifier (id) for a given opportunity.
   * @return opportunityID
  **/
  @ApiModelProperty(value = "A unique identifier (id) for a given opportunity.")
  public String getOpportunityID() {
    return opportunityID;
  }

  public void setOpportunityID(String opportunityID) {
    this.opportunityID = opportunityID;
  }

  public ActWebApiModelsOpportunitiesOpportunityProduct price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * The price of the opportunity product.
   * @return price
  **/
  @ApiModelProperty(value = "The price of the opportunity product.")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public ActWebApiModelsOpportunitiesOpportunityProduct productID(String productID) {
    this.productID = productID;
    return this;
  }

   /**
   * A unique identifier (id) for a given product.
   * @return productID
  **/
  @ApiModelProperty(value = "A unique identifier (id) for a given product.")
  public String getProductID() {
    return productID;
  }

  public void setProductID(String productID) {
    this.productID = productID;
  }

  public ActWebApiModelsOpportunitiesOpportunityProduct quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of opportunity products.
   * @return quantity
  **/
  @ApiModelProperty(value = "The quantity of opportunity products.")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public ActWebApiModelsOpportunitiesOpportunityProduct total(Double total) {
    this.total = total;
    return this;
  }

   /**
   * The total pricie of the opportunity product (adjusted price * quantity).
   * @return total
  **/
  @ApiModelProperty(value = "The total pricie of the opportunity product (adjusted price * quantity).")
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActWebApiModelsOpportunitiesOpportunityProduct actWebApiModelsOpportunitiesOpportunityProduct = (ActWebApiModelsOpportunitiesOpportunityProduct) o;
    return Objects.equals(this.id, actWebApiModelsOpportunitiesOpportunityProduct.id) &&
        Objects.equals(this.name, actWebApiModelsOpportunitiesOpportunityProduct.name) &&
        Objects.equals(this.cost, actWebApiModelsOpportunitiesOpportunityProduct.cost) &&
        Objects.equals(this.createDate, actWebApiModelsOpportunitiesOpportunityProduct.createDate) &&
        Objects.equals(this.discount, actWebApiModelsOpportunitiesOpportunityProduct.discount) &&
        Objects.equals(this.discountPrice, actWebApiModelsOpportunitiesOpportunityProduct.discountPrice) &&
        Objects.equals(this.editDate, actWebApiModelsOpportunitiesOpportunityProduct.editDate) &&
        Objects.equals(this.itemNumber, actWebApiModelsOpportunitiesOpportunityProduct.itemNumber) &&
        Objects.equals(this.opportunityID, actWebApiModelsOpportunitiesOpportunityProduct.opportunityID) &&
        Objects.equals(this.price, actWebApiModelsOpportunitiesOpportunityProduct.price) &&
        Objects.equals(this.productID, actWebApiModelsOpportunitiesOpportunityProduct.productID) &&
        Objects.equals(this.quantity, actWebApiModelsOpportunitiesOpportunityProduct.quantity) &&
        Objects.equals(this.total, actWebApiModelsOpportunitiesOpportunityProduct.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, cost, createDate, discount, discountPrice, editDate, itemNumber, opportunityID, price, productID, quantity, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActWebApiModelsOpportunitiesOpportunityProduct {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    discountPrice: ").append(toIndentedString(discountPrice)).append("\n");
    sb.append("    editDate: ").append(toIndentedString(editDate)).append("\n");
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
    sb.append("    opportunityID: ").append(toIndentedString(opportunityID)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    productID: ").append(toIndentedString(productID)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

