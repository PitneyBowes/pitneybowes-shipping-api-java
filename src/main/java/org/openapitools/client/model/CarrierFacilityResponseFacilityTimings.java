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

/**
 * CarrierFacilityResponseFacilityTimings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T12:45:29.729+05:30[Asia/Calcutta]")
public class CarrierFacilityResponseFacilityTimings {
  public static final String SERIALIZED_NAME_CLOSES_AT = "closesAt";
  @SerializedName(SERIALIZED_NAME_CLOSES_AT)
  private String closesAt;

  public static final String SERIALIZED_NAME_OPENS_AT = "opensAt";
  @SerializedName(SERIALIZED_NAME_OPENS_AT)
  private String opensAt;


  public CarrierFacilityResponseFacilityTimings closesAt(String closesAt) {
    
    this.closesAt = closesAt;
    return this;
  }

   /**
   * Get closesAt
   * @return closesAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClosesAt() {
    return closesAt;
  }


  public void setClosesAt(String closesAt) {
    this.closesAt = closesAt;
  }


  public CarrierFacilityResponseFacilityTimings opensAt(String opensAt) {
    
    this.opensAt = opensAt;
    return this;
  }

   /**
   * Get opensAt
   * @return opensAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOpensAt() {
    return opensAt;
  }


  public void setOpensAt(String opensAt) {
    this.opensAt = opensAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarrierFacilityResponseFacilityTimings carrierFacilityResponseFacilityTimings = (CarrierFacilityResponseFacilityTimings) o;
    return Objects.equals(this.closesAt, carrierFacilityResponseFacilityTimings.closesAt) &&
        Objects.equals(this.opensAt, carrierFacilityResponseFacilityTimings.opensAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closesAt, opensAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarrierFacilityResponseFacilityTimings {\n");
    sb.append("    closesAt: ").append(toIndentedString(closesAt)).append("\n");
    sb.append("    opensAt: ").append(toIndentedString(opensAt)).append("\n");
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

