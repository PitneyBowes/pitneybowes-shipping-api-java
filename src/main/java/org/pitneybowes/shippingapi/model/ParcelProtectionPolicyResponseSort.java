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
 * ParcelProtectionPolicyResponseSort
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-10T01:37:26.222+05:30[Asia/Calcutta]")
public class ParcelProtectionPolicyResponseSort {
  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private String direction;

  public static final String SERIALIZED_NAME_PROPERTY = "property";
  @SerializedName(SERIALIZED_NAME_PROPERTY)
  private String property;

  public static final String SERIALIZED_NAME_IGNORE_CASE = "ignoreCase";
  @SerializedName(SERIALIZED_NAME_IGNORE_CASE)
  private Boolean ignoreCase;

  public static final String SERIALIZED_NAME_NULL_HANDLING = "nullHandling";
  @SerializedName(SERIALIZED_NAME_NULL_HANDLING)
  private String nullHandling;

  public static final String SERIALIZED_NAME_DESCENDING = "descending";
  @SerializedName(SERIALIZED_NAME_DESCENDING)
  private Boolean descending;

  public static final String SERIALIZED_NAME_ASCENDING = "ascending";
  @SerializedName(SERIALIZED_NAME_ASCENDING)
  private Boolean ascending;


  public ParcelProtectionPolicyResponseSort direction(String direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDirection() {
    return direction;
  }


  public void setDirection(String direction) {
    this.direction = direction;
  }


  public ParcelProtectionPolicyResponseSort property(String property) {
    
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProperty() {
    return property;
  }


  public void setProperty(String property) {
    this.property = property;
  }


  public ParcelProtectionPolicyResponseSort ignoreCase(Boolean ignoreCase) {
    
    this.ignoreCase = ignoreCase;
    return this;
  }

   /**
   * Get ignoreCase
   * @return ignoreCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIgnoreCase() {
    return ignoreCase;
  }


  public void setIgnoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
  }


  public ParcelProtectionPolicyResponseSort nullHandling(String nullHandling) {
    
    this.nullHandling = nullHandling;
    return this;
  }

   /**
   * Get nullHandling
   * @return nullHandling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNullHandling() {
    return nullHandling;
  }


  public void setNullHandling(String nullHandling) {
    this.nullHandling = nullHandling;
  }


  public ParcelProtectionPolicyResponseSort descending(Boolean descending) {
    
    this.descending = descending;
    return this;
  }

   /**
   * Get descending
   * @return descending
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDescending() {
    return descending;
  }


  public void setDescending(Boolean descending) {
    this.descending = descending;
  }


  public ParcelProtectionPolicyResponseSort ascending(Boolean ascending) {
    
    this.ascending = ascending;
    return this;
  }

   /**
   * Get ascending
   * @return ascending
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAscending() {
    return ascending;
  }


  public void setAscending(Boolean ascending) {
    this.ascending = ascending;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelProtectionPolicyResponseSort parcelProtectionPolicyResponseSort = (ParcelProtectionPolicyResponseSort) o;
    return Objects.equals(this.direction, parcelProtectionPolicyResponseSort.direction) &&
        Objects.equals(this.property, parcelProtectionPolicyResponseSort.property) &&
        Objects.equals(this.ignoreCase, parcelProtectionPolicyResponseSort.ignoreCase) &&
        Objects.equals(this.nullHandling, parcelProtectionPolicyResponseSort.nullHandling) &&
        Objects.equals(this.descending, parcelProtectionPolicyResponseSort.descending) &&
        Objects.equals(this.ascending, parcelProtectionPolicyResponseSort.ascending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, property, ignoreCase, nullHandling, descending, ascending);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelProtectionPolicyResponseSort {\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    ignoreCase: ").append(toIndentedString(ignoreCase)).append("\n");
    sb.append("    nullHandling: ").append(toIndentedString(nullHandling)).append("\n");
    sb.append("    descending: ").append(toIndentedString(descending)).append("\n");
    sb.append("    ascending: ").append(toIndentedString(ascending)).append("\n");
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

