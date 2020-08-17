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
import org.openapitools.client.model.ParcelProtectionQuoteRequestShipmentInfoShipperInfoAddress;

/**
 * ParcelProtectionQuoteRequestShipmentInfoConsigneeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-17T23:33:31.071+05:30[Asia/Calcutta]")
public class ParcelProtectionQuoteRequestShipmentInfoConsigneeInfo {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private ParcelProtectionQuoteRequestShipmentInfoShipperInfoAddress address;


  public ParcelProtectionQuoteRequestShipmentInfoConsigneeInfo address(ParcelProtectionQuoteRequestShipmentInfoShipperInfoAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")

  public ParcelProtectionQuoteRequestShipmentInfoShipperInfoAddress getAddress() {
    return address;
  }


  public void setAddress(ParcelProtectionQuoteRequestShipmentInfoShipperInfoAddress address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelProtectionQuoteRequestShipmentInfoConsigneeInfo parcelProtectionQuoteRequestShipmentInfoConsigneeInfo = (ParcelProtectionQuoteRequestShipmentInfoConsigneeInfo) o;
    return Objects.equals(this.address, parcelProtectionQuoteRequestShipmentInfoConsigneeInfo.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelProtectionQuoteRequestShipmentInfoConsigneeInfo {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
