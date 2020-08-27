/*
 * Shipping API
 * Shipping API Sample.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@pb.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.CrossBorderQuotesResponseLineRates;
import org.openapitools.client.model.CrossBorderQuotesResponseUnitRates;

/**
 * CrossBorderQuotesResponseQuoteLines
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T12:03:32.867+05:30[Asia/Calcutta]")
public class CrossBorderQuotesResponseQuoteLines {
  public static final String SERIALIZED_NAME_LINE_ID = "lineId";
  @SerializedName(SERIALIZED_NAME_LINE_ID)
  private String lineId;

  public static final String SERIALIZED_NAME_ITEM_ID = "itemId";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_QUOTE_LINE_ID = "quoteLineId";
  @SerializedName(SERIALIZED_NAME_QUOTE_LINE_ID)
  private String quoteLineId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_UNIT_RATES = "unitRates";
  @SerializedName(SERIALIZED_NAME_UNIT_RATES)
  private CrossBorderQuotesResponseUnitRates unitRates;

  public static final String SERIALIZED_NAME_LINE_RATES = "lineRates";
  @SerializedName(SERIALIZED_NAME_LINE_RATES)
  private CrossBorderQuotesResponseLineRates lineRates;


  public CrossBorderQuotesResponseQuoteLines lineId(String lineId) {
    
    this.lineId = lineId;
    return this;
  }

   /**
   * Get lineId
   * @return lineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLineId() {
    return lineId;
  }


  public void setLineId(String lineId) {
    this.lineId = lineId;
  }


  public CrossBorderQuotesResponseQuoteLines itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public CrossBorderQuotesResponseQuoteLines quoteLineId(String quoteLineId) {
    
    this.quoteLineId = quoteLineId;
    return this;
  }

   /**
   * Get quoteLineId
   * @return quoteLineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQuoteLineId() {
    return quoteLineId;
  }


  public void setQuoteLineId(String quoteLineId) {
    this.quoteLineId = quoteLineId;
  }


  public CrossBorderQuotesResponseQuoteLines quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public CrossBorderQuotesResponseQuoteLines unitRates(CrossBorderQuotesResponseUnitRates unitRates) {
    
    this.unitRates = unitRates;
    return this;
  }

   /**
   * Get unitRates
   * @return unitRates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CrossBorderQuotesResponseUnitRates getUnitRates() {
    return unitRates;
  }


  public void setUnitRates(CrossBorderQuotesResponseUnitRates unitRates) {
    this.unitRates = unitRates;
  }


  public CrossBorderQuotesResponseQuoteLines lineRates(CrossBorderQuotesResponseLineRates lineRates) {
    
    this.lineRates = lineRates;
    return this;
  }

   /**
   * Get lineRates
   * @return lineRates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CrossBorderQuotesResponseLineRates getLineRates() {
    return lineRates;
  }


  public void setLineRates(CrossBorderQuotesResponseLineRates lineRates) {
    this.lineRates = lineRates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrossBorderQuotesResponseQuoteLines crossBorderQuotesResponseQuoteLines = (CrossBorderQuotesResponseQuoteLines) o;
    return Objects.equals(this.lineId, crossBorderQuotesResponseQuoteLines.lineId) &&
        Objects.equals(this.itemId, crossBorderQuotesResponseQuoteLines.itemId) &&
        Objects.equals(this.quoteLineId, crossBorderQuotesResponseQuoteLines.quoteLineId) &&
        Objects.equals(this.quantity, crossBorderQuotesResponseQuoteLines.quantity) &&
        Objects.equals(this.unitRates, crossBorderQuotesResponseQuoteLines.unitRates) &&
        Objects.equals(this.lineRates, crossBorderQuotesResponseQuoteLines.lineRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineId, itemId, quoteLineId, quantity, unitRates, lineRates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossBorderQuotesResponseQuoteLines {\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    quoteLineId: ").append(toIndentedString(quoteLineId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitRates: ").append(toIndentedString(unitRates)).append("\n");
    sb.append("    lineRates: ").append(toIndentedString(lineRates)).append("\n");
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
