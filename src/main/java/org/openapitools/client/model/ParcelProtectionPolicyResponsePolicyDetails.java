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
 * ParcelProtectionPolicyResponsePolicyDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-17T23:33:31.071+05:30[Asia/Calcutta]")
public class ParcelProtectionPolicyResponsePolicyDetails {
  public static final String SERIALIZED_NAME_POLICY_ID = "policyId";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  private String policyId;

  public static final String SERIALIZED_NAME_POLICY_DATE = "policyDate";
  @SerializedName(SERIALIZED_NAME_POLICY_DATE)
  private String policyDate;

  public static final String SERIALIZED_NAME_POLICY_STATUS = "policyStatus";
  @SerializedName(SERIALIZED_NAME_POLICY_STATUS)
  private String policyStatus;

  public static final String SERIALIZED_NAME_CLAIM_STATUS = "claimStatus";
  @SerializedName(SERIALIZED_NAME_CLAIM_STATUS)
  private String claimStatus;

  public static final String SERIALIZED_NAME_CLAIM_STATUS_UPDATE_DATE = "claimStatusUpdateDate";
  @SerializedName(SERIALIZED_NAME_CLAIM_STATUS_UPDATE_DATE)
  private String claimStatusUpdateDate;

  public static final String SERIALIZED_NAME_VALUE_OF_GOODS = "valueOfGoods";
  @SerializedName(SERIALIZED_NAME_VALUE_OF_GOODS)
  private BigDecimal valueOfGoods;

  public static final String SERIALIZED_NAME_INSURANCE_VALUE = "insuranceValue";
  @SerializedName(SERIALIZED_NAME_INSURANCE_VALUE)
  private BigDecimal insuranceValue;

  public static final String SERIALIZED_NAME_PREMIUM_VALUE = "premiumValue";
  @SerializedName(SERIALIZED_NAME_PREMIUM_VALUE)
  private BigDecimal premiumValue;

  public static final String SERIALIZED_NAME_BASE_PREMIUM = "basePremium";
  @SerializedName(SERIALIZED_NAME_BASE_PREMIUM)
  private BigDecimal basePremium;

  public static final String SERIALIZED_NAME_TECHNOLOGY_FEE = "technologyFee";
  @SerializedName(SERIALIZED_NAME_TECHNOLOGY_FEE)
  private BigDecimal technologyFee;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_MAIL_CLASS = "mailClass";
  @SerializedName(SERIALIZED_NAME_MAIL_CLASS)
  private String mailClass;

  public static final String SERIALIZED_NAME_MAIL_CLASS_OPTION = "mailClassOption";
  @SerializedName(SERIALIZED_NAME_MAIL_CLASS_OPTION)
  private String mailClassOption;


  public ParcelProtectionPolicyResponsePolicyDetails policyId(String policyId) {
    
    this.policyId = policyId;
    return this;
  }

   /**
   * Get policyId
   * @return policyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPolicyId() {
    return policyId;
  }


  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }


  public ParcelProtectionPolicyResponsePolicyDetails policyDate(String policyDate) {
    
    this.policyDate = policyDate;
    return this;
  }

   /**
   * Get policyDate
   * @return policyDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPolicyDate() {
    return policyDate;
  }


  public void setPolicyDate(String policyDate) {
    this.policyDate = policyDate;
  }


  public ParcelProtectionPolicyResponsePolicyDetails policyStatus(String policyStatus) {
    
    this.policyStatus = policyStatus;
    return this;
  }

   /**
   * Get policyStatus
   * @return policyStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPolicyStatus() {
    return policyStatus;
  }


  public void setPolicyStatus(String policyStatus) {
    this.policyStatus = policyStatus;
  }


  public ParcelProtectionPolicyResponsePolicyDetails claimStatus(String claimStatus) {
    
    this.claimStatus = claimStatus;
    return this;
  }

   /**
   * Get claimStatus
   * @return claimStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClaimStatus() {
    return claimStatus;
  }


  public void setClaimStatus(String claimStatus) {
    this.claimStatus = claimStatus;
  }


  public ParcelProtectionPolicyResponsePolicyDetails claimStatusUpdateDate(String claimStatusUpdateDate) {
    
    this.claimStatusUpdateDate = claimStatusUpdateDate;
    return this;
  }

   /**
   * Get claimStatusUpdateDate
   * @return claimStatusUpdateDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClaimStatusUpdateDate() {
    return claimStatusUpdateDate;
  }


  public void setClaimStatusUpdateDate(String claimStatusUpdateDate) {
    this.claimStatusUpdateDate = claimStatusUpdateDate;
  }


  public ParcelProtectionPolicyResponsePolicyDetails valueOfGoods(BigDecimal valueOfGoods) {
    
    this.valueOfGoods = valueOfGoods;
    return this;
  }

   /**
   * Get valueOfGoods
   * @return valueOfGoods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getValueOfGoods() {
    return valueOfGoods;
  }


  public void setValueOfGoods(BigDecimal valueOfGoods) {
    this.valueOfGoods = valueOfGoods;
  }


  public ParcelProtectionPolicyResponsePolicyDetails insuranceValue(BigDecimal insuranceValue) {
    
    this.insuranceValue = insuranceValue;
    return this;
  }

   /**
   * Get insuranceValue
   * @return insuranceValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getInsuranceValue() {
    return insuranceValue;
  }


  public void setInsuranceValue(BigDecimal insuranceValue) {
    this.insuranceValue = insuranceValue;
  }


  public ParcelProtectionPolicyResponsePolicyDetails premiumValue(BigDecimal premiumValue) {
    
    this.premiumValue = premiumValue;
    return this;
  }

   /**
   * Get premiumValue
   * @return premiumValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPremiumValue() {
    return premiumValue;
  }


  public void setPremiumValue(BigDecimal premiumValue) {
    this.premiumValue = premiumValue;
  }


  public ParcelProtectionPolicyResponsePolicyDetails basePremium(BigDecimal basePremium) {
    
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


  public ParcelProtectionPolicyResponsePolicyDetails technologyFee(BigDecimal technologyFee) {
    
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


  public ParcelProtectionPolicyResponsePolicyDetails currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public ParcelProtectionPolicyResponsePolicyDetails mailClass(String mailClass) {
    
    this.mailClass = mailClass;
    return this;
  }

   /**
   * Get mailClass
   * @return mailClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMailClass() {
    return mailClass;
  }


  public void setMailClass(String mailClass) {
    this.mailClass = mailClass;
  }


  public ParcelProtectionPolicyResponsePolicyDetails mailClassOption(String mailClassOption) {
    
    this.mailClassOption = mailClassOption;
    return this;
  }

   /**
   * Get mailClassOption
   * @return mailClassOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMailClassOption() {
    return mailClassOption;
  }


  public void setMailClassOption(String mailClassOption) {
    this.mailClassOption = mailClassOption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelProtectionPolicyResponsePolicyDetails parcelProtectionPolicyResponsePolicyDetails = (ParcelProtectionPolicyResponsePolicyDetails) o;
    return Objects.equals(this.policyId, parcelProtectionPolicyResponsePolicyDetails.policyId) &&
        Objects.equals(this.policyDate, parcelProtectionPolicyResponsePolicyDetails.policyDate) &&
        Objects.equals(this.policyStatus, parcelProtectionPolicyResponsePolicyDetails.policyStatus) &&
        Objects.equals(this.claimStatus, parcelProtectionPolicyResponsePolicyDetails.claimStatus) &&
        Objects.equals(this.claimStatusUpdateDate, parcelProtectionPolicyResponsePolicyDetails.claimStatusUpdateDate) &&
        Objects.equals(this.valueOfGoods, parcelProtectionPolicyResponsePolicyDetails.valueOfGoods) &&
        Objects.equals(this.insuranceValue, parcelProtectionPolicyResponsePolicyDetails.insuranceValue) &&
        Objects.equals(this.premiumValue, parcelProtectionPolicyResponsePolicyDetails.premiumValue) &&
        Objects.equals(this.basePremium, parcelProtectionPolicyResponsePolicyDetails.basePremium) &&
        Objects.equals(this.technologyFee, parcelProtectionPolicyResponsePolicyDetails.technologyFee) &&
        Objects.equals(this.currencyCode, parcelProtectionPolicyResponsePolicyDetails.currencyCode) &&
        Objects.equals(this.mailClass, parcelProtectionPolicyResponsePolicyDetails.mailClass) &&
        Objects.equals(this.mailClassOption, parcelProtectionPolicyResponsePolicyDetails.mailClassOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId, policyDate, policyStatus, claimStatus, claimStatusUpdateDate, valueOfGoods, insuranceValue, premiumValue, basePremium, technologyFee, currencyCode, mailClass, mailClassOption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelProtectionPolicyResponsePolicyDetails {\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyDate: ").append(toIndentedString(policyDate)).append("\n");
    sb.append("    policyStatus: ").append(toIndentedString(policyStatus)).append("\n");
    sb.append("    claimStatus: ").append(toIndentedString(claimStatus)).append("\n");
    sb.append("    claimStatusUpdateDate: ").append(toIndentedString(claimStatusUpdateDate)).append("\n");
    sb.append("    valueOfGoods: ").append(toIndentedString(valueOfGoods)).append("\n");
    sb.append("    insuranceValue: ").append(toIndentedString(insuranceValue)).append("\n");
    sb.append("    premiumValue: ").append(toIndentedString(premiumValue)).append("\n");
    sb.append("    basePremium: ").append(toIndentedString(basePremium)).append("\n");
    sb.append("    technologyFee: ").append(toIndentedString(technologyFee)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    mailClass: ").append(toIndentedString(mailClass)).append("\n");
    sb.append("    mailClassOption: ").append(toIndentedString(mailClassOption)).append("\n");
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

