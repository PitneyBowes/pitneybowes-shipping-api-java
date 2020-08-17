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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Parameter;

/**
 * SpecialService
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-17T23:33:31.071+05:30[Asia/Calcutta]")
public class SpecialService {
  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private BigDecimal fee;

  public static final String SERIALIZED_NAME_INPUT_PARAMETERS = "inputParameters";
  @SerializedName(SERIALIZED_NAME_INPUT_PARAMETERS)
  private List<Parameter> inputParameters = null;

  public static final String SERIALIZED_NAME_SPECIAL_SERVICE_ID = "specialServiceId";
  @SerializedName(SERIALIZED_NAME_SPECIAL_SERVICE_ID)
  private String specialServiceId;


  public SpecialService fee(BigDecimal fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getFee() {
    return fee;
  }


  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }


  public SpecialService inputParameters(List<Parameter> inputParameters) {
    
    this.inputParameters = inputParameters;
    return this;
  }

  public SpecialService addInputParametersItem(Parameter inputParametersItem) {
    if (this.inputParameters == null) {
      this.inputParameters = new ArrayList<Parameter>();
    }
    this.inputParameters.add(inputParametersItem);
    return this;
  }

   /**
   * Get inputParameters
   * @return inputParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Parameter> getInputParameters() {
    return inputParameters;
  }


  public void setInputParameters(List<Parameter> inputParameters) {
    this.inputParameters = inputParameters;
  }


  public SpecialService specialServiceId(String specialServiceId) {
    
    this.specialServiceId = specialServiceId;
    return this;
  }

   /**
   * Get specialServiceId
   * @return specialServiceId
  **/
  @ApiModelProperty(required = true, value = "")

  public String getSpecialServiceId() {
    return specialServiceId;
  }


  public void setSpecialServiceId(String specialServiceId) {
    this.specialServiceId = specialServiceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialService specialService = (SpecialService) o;
    return Objects.equals(this.fee, specialService.fee) &&
        Objects.equals(this.inputParameters, specialService.inputParameters) &&
        Objects.equals(this.specialServiceId, specialService.specialServiceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, inputParameters, specialServiceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialService {\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    inputParameters: ").append(toIndentedString(inputParameters)).append("\n");
    sb.append("    specialServiceId: ").append(toIndentedString(specialServiceId)).append("\n");
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

