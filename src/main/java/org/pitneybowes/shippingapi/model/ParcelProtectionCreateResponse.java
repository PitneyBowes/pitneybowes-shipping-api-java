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
import java.math.BigDecimal;
import org.pitneybowes.shippingapi.model.ParcelProtectionCreateResponseParcelProtectionFeesBreakup;

/**
 * ParcelProtectionCreateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-10T01:37:26.222+05:30[Asia/Calcutta]")
public class ParcelProtectionCreateResponse {
  public static final String SERIALIZED_NAME_TRANSACTION_I_D = "transactionID";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_I_D)
  private String transactionID;

  public static final String SERIALIZED_NAME_PARCEL_PROTECTION_REFERENCE_I_D = "parcelProtectionReferenceID";
  @SerializedName(SERIALIZED_NAME_PARCEL_PROTECTION_REFERENCE_I_D)
  private String parcelProtectionReferenceID;

  public static final String SERIALIZED_NAME_PARCEL_PROTECTION_DATE = "parcelProtectionDate";
  @SerializedName(SERIALIZED_NAME_PARCEL_PROTECTION_DATE)
  private String parcelProtectionDate;

  public static final String SERIALIZED_NAME_PARCEL_PROTECTION_FEES = "parcelProtectionFees";
  @SerializedName(SERIALIZED_NAME_PARCEL_PROTECTION_FEES)
  private BigDecimal parcelProtectionFees;

  public static final String SERIALIZED_NAME_PARCEL_PROTECTION_FEES_CURRENCY_CODE = "parcelProtectionFeesCurrencyCode";
  @SerializedName(SERIALIZED_NAME_PARCEL_PROTECTION_FEES_CURRENCY_CODE)
  private String parcelProtectionFeesCurrencyCode;

  public static final String SERIALIZED_NAME_PARCEL_PROTECTION_FEES_BREAKUP = "parcelProtectionFeesBreakup";
  @SerializedName(SERIALIZED_NAME_PARCEL_PROTECTION_FEES_BREAKUP)
  private ParcelProtectionCreateResponseParcelProtectionFeesBreakup parcelProtectionFeesBreakup;


  public ParcelProtectionCreateResponse transactionID(String transactionID) {
    
    this.transactionID = transactionID;
    return this;
  }

   /**
   * Get transactionID
   * @return transactionID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTransactionID() {
    return transactionID;
  }


  public void setTransactionID(String transactionID) {
    this.transactionID = transactionID;
  }


  public ParcelProtectionCreateResponse parcelProtectionReferenceID(String parcelProtectionReferenceID) {
    
    this.parcelProtectionReferenceID = parcelProtectionReferenceID;
    return this;
  }

   /**
   * Get parcelProtectionReferenceID
   * @return parcelProtectionReferenceID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParcelProtectionReferenceID() {
    return parcelProtectionReferenceID;
  }


  public void setParcelProtectionReferenceID(String parcelProtectionReferenceID) {
    this.parcelProtectionReferenceID = parcelProtectionReferenceID;
  }


  public ParcelProtectionCreateResponse parcelProtectionDate(String parcelProtectionDate) {
    
    this.parcelProtectionDate = parcelProtectionDate;
    return this;
  }

   /**
   * Get parcelProtectionDate
   * @return parcelProtectionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParcelProtectionDate() {
    return parcelProtectionDate;
  }


  public void setParcelProtectionDate(String parcelProtectionDate) {
    this.parcelProtectionDate = parcelProtectionDate;
  }


  public ParcelProtectionCreateResponse parcelProtectionFees(BigDecimal parcelProtectionFees) {
    
    this.parcelProtectionFees = parcelProtectionFees;
    return this;
  }

   /**
   * Get parcelProtectionFees
   * @return parcelProtectionFees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getParcelProtectionFees() {
    return parcelProtectionFees;
  }


  public void setParcelProtectionFees(BigDecimal parcelProtectionFees) {
    this.parcelProtectionFees = parcelProtectionFees;
  }


  public ParcelProtectionCreateResponse parcelProtectionFeesCurrencyCode(String parcelProtectionFeesCurrencyCode) {
    
    this.parcelProtectionFeesCurrencyCode = parcelProtectionFeesCurrencyCode;
    return this;
  }

   /**
   * Get parcelProtectionFeesCurrencyCode
   * @return parcelProtectionFeesCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParcelProtectionFeesCurrencyCode() {
    return parcelProtectionFeesCurrencyCode;
  }


  public void setParcelProtectionFeesCurrencyCode(String parcelProtectionFeesCurrencyCode) {
    this.parcelProtectionFeesCurrencyCode = parcelProtectionFeesCurrencyCode;
  }


  public ParcelProtectionCreateResponse parcelProtectionFeesBreakup(ParcelProtectionCreateResponseParcelProtectionFeesBreakup parcelProtectionFeesBreakup) {
    
    this.parcelProtectionFeesBreakup = parcelProtectionFeesBreakup;
    return this;
  }

   /**
   * Get parcelProtectionFeesBreakup
   * @return parcelProtectionFeesBreakup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ParcelProtectionCreateResponseParcelProtectionFeesBreakup getParcelProtectionFeesBreakup() {
    return parcelProtectionFeesBreakup;
  }


  public void setParcelProtectionFeesBreakup(ParcelProtectionCreateResponseParcelProtectionFeesBreakup parcelProtectionFeesBreakup) {
    this.parcelProtectionFeesBreakup = parcelProtectionFeesBreakup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelProtectionCreateResponse parcelProtectionCreateResponse = (ParcelProtectionCreateResponse) o;
    return Objects.equals(this.transactionID, parcelProtectionCreateResponse.transactionID) &&
        Objects.equals(this.parcelProtectionReferenceID, parcelProtectionCreateResponse.parcelProtectionReferenceID) &&
        Objects.equals(this.parcelProtectionDate, parcelProtectionCreateResponse.parcelProtectionDate) &&
        Objects.equals(this.parcelProtectionFees, parcelProtectionCreateResponse.parcelProtectionFees) &&
        Objects.equals(this.parcelProtectionFeesCurrencyCode, parcelProtectionCreateResponse.parcelProtectionFeesCurrencyCode) &&
        Objects.equals(this.parcelProtectionFeesBreakup, parcelProtectionCreateResponse.parcelProtectionFeesBreakup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionID, parcelProtectionReferenceID, parcelProtectionDate, parcelProtectionFees, parcelProtectionFeesCurrencyCode, parcelProtectionFeesBreakup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelProtectionCreateResponse {\n");
    sb.append("    transactionID: ").append(toIndentedString(transactionID)).append("\n");
    sb.append("    parcelProtectionReferenceID: ").append(toIndentedString(parcelProtectionReferenceID)).append("\n");
    sb.append("    parcelProtectionDate: ").append(toIndentedString(parcelProtectionDate)).append("\n");
    sb.append("    parcelProtectionFees: ").append(toIndentedString(parcelProtectionFees)).append("\n");
    sb.append("    parcelProtectionFeesCurrencyCode: ").append(toIndentedString(parcelProtectionFeesCurrencyCode)).append("\n");
    sb.append("    parcelProtectionFeesBreakup: ").append(toIndentedString(parcelProtectionFeesBreakup)).append("\n");
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
