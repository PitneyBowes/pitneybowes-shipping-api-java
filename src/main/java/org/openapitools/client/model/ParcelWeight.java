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
import org.openapitools.client.model.UnitOfWeight;

/**
 * ParcelWeight
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-17T23:33:31.071+05:30[Asia/Calcutta]")
public class ParcelWeight {
  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private BigDecimal weight;

  public static final String SERIALIZED_NAME_UNIT_OF_MEASUREMENT = "unitOfMeasurement";
  @SerializedName(SERIALIZED_NAME_UNIT_OF_MEASUREMENT)
  private UnitOfWeight unitOfMeasurement;


  public ParcelWeight weight(BigDecimal weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getWeight() {
    return weight;
  }


  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }


  public ParcelWeight unitOfMeasurement(UnitOfWeight unitOfMeasurement) {
    
    this.unitOfMeasurement = unitOfMeasurement;
    return this;
  }

   /**
   * Get unitOfMeasurement
   * @return unitOfMeasurement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UnitOfWeight getUnitOfMeasurement() {
    return unitOfMeasurement;
  }


  public void setUnitOfMeasurement(UnitOfWeight unitOfMeasurement) {
    this.unitOfMeasurement = unitOfMeasurement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelWeight parcelWeight = (ParcelWeight) o;
    return Objects.equals(this.weight, parcelWeight.weight) &&
        Objects.equals(this.unitOfMeasurement, parcelWeight.unitOfMeasurement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight, unitOfMeasurement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelWeight {\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    unitOfMeasurement: ").append(toIndentedString(unitOfMeasurement)).append("\n");
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

