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
import java.util.ArrayList;
import java.util.List;
import org.pitneybowes.shippingapi.model.CrossBorderQuotesResponseQuote;

/**
 * CrossBorderQuotesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-10T01:37:26.222+05:30[Asia/Calcutta]")
public class CrossBorderQuotesResponse {
  public static final String SERIALIZED_NAME_QUOTE = "quote";
  @SerializedName(SERIALIZED_NAME_QUOTE)
  private List<CrossBorderQuotesResponseQuote> quote = null;


  public CrossBorderQuotesResponse quote(List<CrossBorderQuotesResponseQuote> quote) {
    
    this.quote = quote;
    return this;
  }

  public CrossBorderQuotesResponse addQuoteItem(CrossBorderQuotesResponseQuote quoteItem) {
    if (this.quote == null) {
      this.quote = new ArrayList<CrossBorderQuotesResponseQuote>();
    }
    this.quote.add(quoteItem);
    return this;
  }

   /**
   * Get quote
   * @return quote
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CrossBorderQuotesResponseQuote> getQuote() {
    return quote;
  }


  public void setQuote(List<CrossBorderQuotesResponseQuote> quote) {
    this.quote = quote;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrossBorderQuotesResponse crossBorderQuotesResponse = (CrossBorderQuotesResponse) o;
    return Objects.equals(this.quote, crossBorderQuotesResponse.quote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quote);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossBorderQuotesResponse {\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
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

