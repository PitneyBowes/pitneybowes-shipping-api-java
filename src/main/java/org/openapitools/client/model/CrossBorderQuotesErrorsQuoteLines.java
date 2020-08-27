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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.CrossBorderQuotesErrorsUnitErrors;

/**
 * CrossBorderQuotesErrorsQuoteLines
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T12:03:32.867+05:30[Asia/Calcutta]")
public class CrossBorderQuotesErrorsQuoteLines {
  public static final String SERIALIZED_NAME_LINE_ID = "lineId";
  @SerializedName(SERIALIZED_NAME_LINE_ID)
  private String lineId;

  public static final String SERIALIZED_NAME_MERCHANT_COM_REF_ID = "merchantComRefId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_COM_REF_ID)
  private String merchantComRefId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_UNIT_ERRORS = "unitErrors";
  @SerializedName(SERIALIZED_NAME_UNIT_ERRORS)
  private List<CrossBorderQuotesErrorsUnitErrors> unitErrors = null;


  public CrossBorderQuotesErrorsQuoteLines lineId(String lineId) {
    
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


  public CrossBorderQuotesErrorsQuoteLines merchantComRefId(String merchantComRefId) {
    
    this.merchantComRefId = merchantComRefId;
    return this;
  }

   /**
   * Get merchantComRefId
   * @return merchantComRefId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMerchantComRefId() {
    return merchantComRefId;
  }


  public void setMerchantComRefId(String merchantComRefId) {
    this.merchantComRefId = merchantComRefId;
  }


  public CrossBorderQuotesErrorsQuoteLines quantity(Integer quantity) {
    
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


  public CrossBorderQuotesErrorsQuoteLines unitErrors(List<CrossBorderQuotesErrorsUnitErrors> unitErrors) {
    
    this.unitErrors = unitErrors;
    return this;
  }

  public CrossBorderQuotesErrorsQuoteLines addUnitErrorsItem(CrossBorderQuotesErrorsUnitErrors unitErrorsItem) {
    if (this.unitErrors == null) {
      this.unitErrors = new ArrayList<CrossBorderQuotesErrorsUnitErrors>();
    }
    this.unitErrors.add(unitErrorsItem);
    return this;
  }

   /**
   * Get unitErrors
   * @return unitErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CrossBorderQuotesErrorsUnitErrors> getUnitErrors() {
    return unitErrors;
  }


  public void setUnitErrors(List<CrossBorderQuotesErrorsUnitErrors> unitErrors) {
    this.unitErrors = unitErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrossBorderQuotesErrorsQuoteLines crossBorderQuotesErrorsQuoteLines = (CrossBorderQuotesErrorsQuoteLines) o;
    return Objects.equals(this.lineId, crossBorderQuotesErrorsQuoteLines.lineId) &&
        Objects.equals(this.merchantComRefId, crossBorderQuotesErrorsQuoteLines.merchantComRefId) &&
        Objects.equals(this.quantity, crossBorderQuotesErrorsQuoteLines.quantity) &&
        Objects.equals(this.unitErrors, crossBorderQuotesErrorsQuoteLines.unitErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineId, merchantComRefId, quantity, unitErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossBorderQuotesErrorsQuoteLines {\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
    sb.append("    merchantComRefId: ").append(toIndentedString(merchantComRefId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitErrors: ").append(toIndentedString(unitErrors)).append("\n");
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
