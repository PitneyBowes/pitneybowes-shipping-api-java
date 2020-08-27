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
import org.openapitools.client.model.SchedulePickupTotalWeight;

/**
 * SchedulePickupPickupSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T12:45:29.729+05:30[Asia/Calcutta]")
public class SchedulePickupPickupSummary {
  public static final String SERIALIZED_NAME_SERVICE_ID = "serviceId";
  @SerializedName(SERIALIZED_NAME_SERVICE_ID)
  private String serviceId;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_TOTAL_WEIGHT = "totalWeight";
  @SerializedName(SERIALIZED_NAME_TOTAL_WEIGHT)
  private SchedulePickupTotalWeight totalWeight;


  public SchedulePickupPickupSummary serviceId(String serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServiceId() {
    return serviceId;
  }


  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }


  public SchedulePickupPickupSummary count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public SchedulePickupPickupSummary totalWeight(SchedulePickupTotalWeight totalWeight) {
    
    this.totalWeight = totalWeight;
    return this;
  }

   /**
   * Get totalWeight
   * @return totalWeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SchedulePickupTotalWeight getTotalWeight() {
    return totalWeight;
  }


  public void setTotalWeight(SchedulePickupTotalWeight totalWeight) {
    this.totalWeight = totalWeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulePickupPickupSummary schedulePickupPickupSummary = (SchedulePickupPickupSummary) o;
    return Objects.equals(this.serviceId, schedulePickupPickupSummary.serviceId) &&
        Objects.equals(this.count, schedulePickupPickupSummary.count) &&
        Objects.equals(this.totalWeight, schedulePickupPickupSummary.totalWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, count, totalWeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulePickupPickupSummary {\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    totalWeight: ").append(toIndentedString(totalWeight)).append("\n");
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

