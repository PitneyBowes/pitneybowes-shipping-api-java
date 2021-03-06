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
import org.pitneybowes.shippingapi.model.Address;
import org.pitneybowes.shippingapi.model.AddressSuggestionResponseSuggestions;

/**
 * AddressSuggestionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-10T01:37:26.222+05:30[Asia/Calcutta]")
public class AddressSuggestionResponse {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_SUGGESTIONS = "suggestions";
  @SerializedName(SERIALIZED_NAME_SUGGESTIONS)
  private AddressSuggestionResponseSuggestions suggestions;


  public AddressSuggestionResponse address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    this.address = address;
  }


  public AddressSuggestionResponse suggestions(AddressSuggestionResponseSuggestions suggestions) {
    
    this.suggestions = suggestions;
    return this;
  }

   /**
   * Get suggestions
   * @return suggestions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddressSuggestionResponseSuggestions getSuggestions() {
    return suggestions;
  }


  public void setSuggestions(AddressSuggestionResponseSuggestions suggestions) {
    this.suggestions = suggestions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressSuggestionResponse addressSuggestionResponse = (AddressSuggestionResponse) o;
    return Objects.equals(this.address, addressSuggestionResponse.address) &&
        Objects.equals(this.suggestions, addressSuggestionResponse.suggestions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, suggestions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressSuggestionResponse {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
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

