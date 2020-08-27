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
import org.openapitools.client.model.Address;
import org.openapitools.client.model.CarrierFacilityResponseCarrierFacilityOptions;
import org.openapitools.client.model.CarrierFacilityResponseFacilityHours;

/**
 * CarrierFacilityResponseCarrierFacilitySuggestions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T12:45:29.729+05:30[Asia/Calcutta]")
public class CarrierFacilityResponseCarrierFacilitySuggestions {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_CARRIER_FACILITY_ATTRIBUTES = "carrierFacilityAttributes";
  @SerializedName(SERIALIZED_NAME_CARRIER_FACILITY_ATTRIBUTES)
  private List<CarrierFacilityResponseCarrierFacilityOptions> carrierFacilityAttributes = null;

  public static final String SERIALIZED_NAME_FACILITY_HOURS = "facilityHours";
  @SerializedName(SERIALIZED_NAME_FACILITY_HOURS)
  private List<CarrierFacilityResponseFacilityHours> facilityHours = null;

  public static final String SERIALIZED_NAME_FACILITY_PARKING = "facilityParking";
  @SerializedName(SERIALIZED_NAME_FACILITY_PARKING)
  private String facilityParking;


  public CarrierFacilityResponseCarrierFacilitySuggestions address(Address address) {
    
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


  public CarrierFacilityResponseCarrierFacilitySuggestions carrierFacilityAttributes(List<CarrierFacilityResponseCarrierFacilityOptions> carrierFacilityAttributes) {
    
    this.carrierFacilityAttributes = carrierFacilityAttributes;
    return this;
  }

  public CarrierFacilityResponseCarrierFacilitySuggestions addCarrierFacilityAttributesItem(CarrierFacilityResponseCarrierFacilityOptions carrierFacilityAttributesItem) {
    if (this.carrierFacilityAttributes == null) {
      this.carrierFacilityAttributes = new ArrayList<CarrierFacilityResponseCarrierFacilityOptions>();
    }
    this.carrierFacilityAttributes.add(carrierFacilityAttributesItem);
    return this;
  }

   /**
   * Get carrierFacilityAttributes
   * @return carrierFacilityAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CarrierFacilityResponseCarrierFacilityOptions> getCarrierFacilityAttributes() {
    return carrierFacilityAttributes;
  }


  public void setCarrierFacilityAttributes(List<CarrierFacilityResponseCarrierFacilityOptions> carrierFacilityAttributes) {
    this.carrierFacilityAttributes = carrierFacilityAttributes;
  }


  public CarrierFacilityResponseCarrierFacilitySuggestions facilityHours(List<CarrierFacilityResponseFacilityHours> facilityHours) {
    
    this.facilityHours = facilityHours;
    return this;
  }

  public CarrierFacilityResponseCarrierFacilitySuggestions addFacilityHoursItem(CarrierFacilityResponseFacilityHours facilityHoursItem) {
    if (this.facilityHours == null) {
      this.facilityHours = new ArrayList<CarrierFacilityResponseFacilityHours>();
    }
    this.facilityHours.add(facilityHoursItem);
    return this;
  }

   /**
   * Get facilityHours
   * @return facilityHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CarrierFacilityResponseFacilityHours> getFacilityHours() {
    return facilityHours;
  }


  public void setFacilityHours(List<CarrierFacilityResponseFacilityHours> facilityHours) {
    this.facilityHours = facilityHours;
  }


  public CarrierFacilityResponseCarrierFacilitySuggestions facilityParking(String facilityParking) {
    
    this.facilityParking = facilityParking;
    return this;
  }

   /**
   * Get facilityParking
   * @return facilityParking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFacilityParking() {
    return facilityParking;
  }


  public void setFacilityParking(String facilityParking) {
    this.facilityParking = facilityParking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarrierFacilityResponseCarrierFacilitySuggestions carrierFacilityResponseCarrierFacilitySuggestions = (CarrierFacilityResponseCarrierFacilitySuggestions) o;
    return Objects.equals(this.address, carrierFacilityResponseCarrierFacilitySuggestions.address) &&
        Objects.equals(this.carrierFacilityAttributes, carrierFacilityResponseCarrierFacilitySuggestions.carrierFacilityAttributes) &&
        Objects.equals(this.facilityHours, carrierFacilityResponseCarrierFacilitySuggestions.facilityHours) &&
        Objects.equals(this.facilityParking, carrierFacilityResponseCarrierFacilitySuggestions.facilityParking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, carrierFacilityAttributes, facilityHours, facilityParking);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarrierFacilityResponseCarrierFacilitySuggestions {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    carrierFacilityAttributes: ").append(toIndentedString(carrierFacilityAttributes)).append("\n");
    sb.append("    facilityHours: ").append(toIndentedString(facilityHours)).append("\n");
    sb.append("    facilityParking: ").append(toIndentedString(facilityParking)).append("\n");
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

