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

/**
 * ParcelProtectionCreateResponseParcelProtectionFeesBreakup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T12:45:29.729+05:30[Asia/Calcutta]")
public class ParcelProtectionCreateResponseParcelProtectionFeesBreakup {
  public static final String SERIALIZED_NAME_BASE_PREMIUM = "basePremium";
  @SerializedName(SERIALIZED_NAME_BASE_PREMIUM)
  private BigDecimal basePremium;

  public static final String SERIALIZED_NAME_TECHNOLOGY_FEE = "technologyFee";
  @SerializedName(SERIALIZED_NAME_TECHNOLOGY_FEE)
  private BigDecimal technologyFee;


  public ParcelProtectionCreateResponseParcelProtectionFeesBreakup basePremium(BigDecimal basePremium) {
    
    this.basePremium = basePremium;
    return this;
  }

   /**
   * Get basePremium
   * @return basePremium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getBasePremium() {
    return basePremium;
  }


  public void setBasePremium(BigDecimal basePremium) {
    this.basePremium = basePremium;
  }


  public ParcelProtectionCreateResponseParcelProtectionFeesBreakup technologyFee(BigDecimal technologyFee) {
    
    this.technologyFee = technologyFee;
    return this;
  }

   /**
   * Get technologyFee
   * @return technologyFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTechnologyFee() {
    return technologyFee;
  }


  public void setTechnologyFee(BigDecimal technologyFee) {
    this.technologyFee = technologyFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelProtectionCreateResponseParcelProtectionFeesBreakup parcelProtectionCreateResponseParcelProtectionFeesBreakup = (ParcelProtectionCreateResponseParcelProtectionFeesBreakup) o;
    return Objects.equals(this.basePremium, parcelProtectionCreateResponseParcelProtectionFeesBreakup.basePremium) &&
        Objects.equals(this.technologyFee, parcelProtectionCreateResponseParcelProtectionFeesBreakup.technologyFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basePremium, technologyFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelProtectionCreateResponseParcelProtectionFeesBreakup {\n");
    sb.append("    basePremium: ").append(toIndentedString(basePremium)).append("\n");
    sb.append("    technologyFee: ").append(toIndentedString(technologyFee)).append("\n");
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

