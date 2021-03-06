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
 * VoidParcelProtectionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-10T01:37:26.222+05:30[Asia/Calcutta]")
public class VoidParcelProtectionRequest {
  public static final String SERIALIZED_NAME_SHIPPER_I_D = "shipperID";
  @SerializedName(SERIALIZED_NAME_SHIPPER_I_D)
  private String shipperID;

  public static final String SERIALIZED_NAME_PARCEL_PROTECTION_ACCOUNT_I_D = "parcelProtectionAccountID";
  @SerializedName(SERIALIZED_NAME_PARCEL_PROTECTION_ACCOUNT_I_D)
  private String parcelProtectionAccountID;


  public VoidParcelProtectionRequest shipperID(String shipperID) {
    
    this.shipperID = shipperID;
    return this;
  }

   /**
   * Get shipperID
   * @return shipperID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getShipperID() {
    return shipperID;
  }


  public void setShipperID(String shipperID) {
    this.shipperID = shipperID;
  }


  public VoidParcelProtectionRequest parcelProtectionAccountID(String parcelProtectionAccountID) {
    
    this.parcelProtectionAccountID = parcelProtectionAccountID;
    return this;
  }

   /**
   * Parcel Protection account ID, if applicable.
   * @return parcelProtectionAccountID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parcel Protection account ID, if applicable.")

  public String getParcelProtectionAccountID() {
    return parcelProtectionAccountID;
  }


  public void setParcelProtectionAccountID(String parcelProtectionAccountID) {
    this.parcelProtectionAccountID = parcelProtectionAccountID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoidParcelProtectionRequest voidParcelProtectionRequest = (VoidParcelProtectionRequest) o;
    return Objects.equals(this.shipperID, voidParcelProtectionRequest.shipperID) &&
        Objects.equals(this.parcelProtectionAccountID, voidParcelProtectionRequest.parcelProtectionAccountID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipperID, parcelProtectionAccountID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoidParcelProtectionRequest {\n");
    sb.append("    shipperID: ").append(toIndentedString(shipperID)).append("\n");
    sb.append("    parcelProtectionAccountID: ").append(toIndentedString(parcelProtectionAccountID)).append("\n");
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

