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
import org.openapitools.client.model.SpecialServiceCodes;

/**
 * PrerequisiteRules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-17T23:33:31.071+05:30[Asia/Calcutta]")
public class PrerequisiteRules {
  public static final String SERIALIZED_NAME_SPECIAL_SERVICE_CODES = "specialServiceCodes";
  @SerializedName(SERIALIZED_NAME_SPECIAL_SERVICE_CODES)
  private SpecialServiceCodes specialServiceCodes;

  public static final String SERIALIZED_NAME_MIN_INPUT_VALUE = "minInputValue";
  @SerializedName(SERIALIZED_NAME_MIN_INPUT_VALUE)
  private BigDecimal minInputValue;


  public PrerequisiteRules specialServiceCodes(SpecialServiceCodes specialServiceCodes) {
    
    this.specialServiceCodes = specialServiceCodes;
    return this;
  }

   /**
   * Get specialServiceCodes
   * @return specialServiceCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpecialServiceCodes getSpecialServiceCodes() {
    return specialServiceCodes;
  }


  public void setSpecialServiceCodes(SpecialServiceCodes specialServiceCodes) {
    this.specialServiceCodes = specialServiceCodes;
  }


  public PrerequisiteRules minInputValue(BigDecimal minInputValue) {
    
    this.minInputValue = minInputValue;
    return this;
  }

   /**
   * Get minInputValue
   * @return minInputValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMinInputValue() {
    return minInputValue;
  }


  public void setMinInputValue(BigDecimal minInputValue) {
    this.minInputValue = minInputValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrerequisiteRules prerequisiteRules = (PrerequisiteRules) o;
    return Objects.equals(this.specialServiceCodes, prerequisiteRules.specialServiceCodes) &&
        Objects.equals(this.minInputValue, prerequisiteRules.minInputValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specialServiceCodes, minInputValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrerequisiteRules {\n");
    sb.append("    specialServiceCodes: ").append(toIndentedString(specialServiceCodes)).append("\n");
    sb.append("    minInputValue: ").append(toIndentedString(minInputValue)).append("\n");
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

