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


package org.pitneybowes.shippingapi.model;

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

/**
 * CrossBorderQuotesRequestPricingCodPrice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-10T01:37:26.222+05:30[Asia/Calcutta]")
public class CrossBorderQuotesRequestPricingCodPrice {
  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Integer price;

  public static final String SERIALIZED_NAME_COD = "cod";
  @SerializedName(SERIALIZED_NAME_COD)
  private String cod;

  public static final String SERIALIZED_NAME_INCLUDES_DUTY = "includesDuty";
  @SerializedName(SERIALIZED_NAME_INCLUDES_DUTY)
  private Boolean includesDuty;

  public static final String SERIALIZED_NAME_INCLUDES_TAXES = "includesTaxes";
  @SerializedName(SERIALIZED_NAME_INCLUDES_TAXES)
  private Boolean includesTaxes;


  public CrossBorderQuotesRequestPricingCodPrice price(Integer price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPrice() {
    return price;
  }


  public void setPrice(Integer price) {
    this.price = price;
  }


  public CrossBorderQuotesRequestPricingCodPrice cod(String cod) {
    
    this.cod = cod;
    return this;
  }

   /**
   * Get cod
   * @return cod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCod() {
    return cod;
  }


  public void setCod(String cod) {
    this.cod = cod;
  }


  public CrossBorderQuotesRequestPricingCodPrice includesDuty(Boolean includesDuty) {
    
    this.includesDuty = includesDuty;
    return this;
  }

   /**
   * Get includesDuty
   * @return includesDuty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludesDuty() {
    return includesDuty;
  }


  public void setIncludesDuty(Boolean includesDuty) {
    this.includesDuty = includesDuty;
  }


  public CrossBorderQuotesRequestPricingCodPrice includesTaxes(Boolean includesTaxes) {
    
    this.includesTaxes = includesTaxes;
    return this;
  }

   /**
   * Get includesTaxes
   * @return includesTaxes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludesTaxes() {
    return includesTaxes;
  }


  public void setIncludesTaxes(Boolean includesTaxes) {
    this.includesTaxes = includesTaxes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrossBorderQuotesRequestPricingCodPrice crossBorderQuotesRequestPricingCodPrice = (CrossBorderQuotesRequestPricingCodPrice) o;
    return Objects.equals(this.price, crossBorderQuotesRequestPricingCodPrice.price) &&
        Objects.equals(this.cod, crossBorderQuotesRequestPricingCodPrice.cod) &&
        Objects.equals(this.includesDuty, crossBorderQuotesRequestPricingCodPrice.includesDuty) &&
        Objects.equals(this.includesTaxes, crossBorderQuotesRequestPricingCodPrice.includesTaxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, cod, includesDuty, includesTaxes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossBorderQuotesRequestPricingCodPrice {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    cod: ").append(toIndentedString(cod)).append("\n");
    sb.append("    includesDuty: ").append(toIndentedString(includesDuty)).append("\n");
    sb.append("    includesTaxes: ").append(toIndentedString(includesTaxes)).append("\n");
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

