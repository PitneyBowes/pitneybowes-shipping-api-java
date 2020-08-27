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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.CrossBorderQuotesResponseQuoteLines;
import org.openapitools.client.model.CrossBorderQuotesResponseTotalRates;

/**
 * CrossBorderQuotesResponseQuote
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T12:45:29.729+05:30[Asia/Calcutta]")
public class CrossBorderQuotesResponseQuote {
  public static final String SERIALIZED_NAME_QUOTE_CURRENCY = "quoteCurrency";
  @SerializedName(SERIALIZED_NAME_QUOTE_CURRENCY)
  private String quoteCurrency;

  public static final String SERIALIZED_NAME_QUOTE_LINES = "quoteLines";
  @SerializedName(SERIALIZED_NAME_QUOTE_LINES)
  private List<CrossBorderQuotesResponseQuoteLines> quoteLines = null;

  public static final String SERIALIZED_NAME_TOTAL_PRICE = "totalPrice";
  @SerializedName(SERIALIZED_NAME_TOTAL_PRICE)
  private BigDecimal totalPrice;

  public static final String SERIALIZED_NAME_TOTAL_RATES = "totalRates";
  @SerializedName(SERIALIZED_NAME_TOTAL_RATES)
  private CrossBorderQuotesResponseTotalRates totalRates;


  public CrossBorderQuotesResponseQuote quoteCurrency(String quoteCurrency) {
    
    this.quoteCurrency = quoteCurrency;
    return this;
  }

   /**
   * Get quoteCurrency
   * @return quoteCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQuoteCurrency() {
    return quoteCurrency;
  }


  public void setQuoteCurrency(String quoteCurrency) {
    this.quoteCurrency = quoteCurrency;
  }


  public CrossBorderQuotesResponseQuote quoteLines(List<CrossBorderQuotesResponseQuoteLines> quoteLines) {
    
    this.quoteLines = quoteLines;
    return this;
  }

  public CrossBorderQuotesResponseQuote addQuoteLinesItem(CrossBorderQuotesResponseQuoteLines quoteLinesItem) {
    if (this.quoteLines == null) {
      this.quoteLines = new ArrayList<CrossBorderQuotesResponseQuoteLines>();
    }
    this.quoteLines.add(quoteLinesItem);
    return this;
  }

   /**
   * Get quoteLines
   * @return quoteLines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CrossBorderQuotesResponseQuoteLines> getQuoteLines() {
    return quoteLines;
  }


  public void setQuoteLines(List<CrossBorderQuotesResponseQuoteLines> quoteLines) {
    this.quoteLines = quoteLines;
  }


  public CrossBorderQuotesResponseQuote totalPrice(BigDecimal totalPrice) {
    
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Get totalPrice
   * @return totalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalPrice() {
    return totalPrice;
  }


  public void setTotalPrice(BigDecimal totalPrice) {
    this.totalPrice = totalPrice;
  }


  public CrossBorderQuotesResponseQuote totalRates(CrossBorderQuotesResponseTotalRates totalRates) {
    
    this.totalRates = totalRates;
    return this;
  }

   /**
   * Get totalRates
   * @return totalRates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CrossBorderQuotesResponseTotalRates getTotalRates() {
    return totalRates;
  }


  public void setTotalRates(CrossBorderQuotesResponseTotalRates totalRates) {
    this.totalRates = totalRates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrossBorderQuotesResponseQuote crossBorderQuotesResponseQuote = (CrossBorderQuotesResponseQuote) o;
    return Objects.equals(this.quoteCurrency, crossBorderQuotesResponseQuote.quoteCurrency) &&
        Objects.equals(this.quoteLines, crossBorderQuotesResponseQuote.quoteLines) &&
        Objects.equals(this.totalPrice, crossBorderQuotesResponseQuote.totalPrice) &&
        Objects.equals(this.totalRates, crossBorderQuotesResponseQuote.totalRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteCurrency, quoteLines, totalPrice, totalRates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossBorderQuotesResponseQuote {\n");
    sb.append("    quoteCurrency: ").append(toIndentedString(quoteCurrency)).append("\n");
    sb.append("    quoteLines: ").append(toIndentedString(quoteLines)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    totalRates: ").append(toIndentedString(totalRates)).append("\n");
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

