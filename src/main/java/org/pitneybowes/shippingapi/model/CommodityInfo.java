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
import org.pitneybowes.shippingapi.model.InfectiousSubstanceContact;
import org.pitneybowes.shippingapi.model.RadioActivityDetail;
import org.pitneybowes.shippingapi.model.RadioNuclideDetail;

/**
 * CommodityInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-10T01:37:26.222+05:30[Asia/Calcutta]")
public class CommodityInfo {
  public static final String SERIALIZED_NAME_CARGO_AIR_CRAFT = "cargoAirCraft";
  @SerializedName(SERIALIZED_NAME_CARGO_AIR_CRAFT)
  private Boolean cargoAirCraft;

  public static final String SERIALIZED_NAME_HAZARD_CLASS = "hazardClass";
  @SerializedName(SERIALIZED_NAME_HAZARD_CLASS)
  private String hazardClass;

  public static final String SERIALIZED_NAME_INFECTIOUS_SUBSTANCE_CONTACT = "infectiousSubstanceContact";
  @SerializedName(SERIALIZED_NAME_INFECTIOUS_SUBSTANCE_CONTACT)
  private InfectiousSubstanceContact infectiousSubstanceContact;

  public static final String SERIALIZED_NAME_INNER_RECEPTACLES_QUANTITY = "innerReceptaclesQuantity";
  @SerializedName(SERIALIZED_NAME_INNER_RECEPTACLES_QUANTITY)
  private Integer innerReceptaclesQuantity;

  public static final String SERIALIZED_NAME_INNER_RECEPTACLES_QUANTITY_U_O_M = "innerReceptaclesQuantityUOM";
  @SerializedName(SERIALIZED_NAME_INNER_RECEPTACLES_QUANTITY_U_O_M)
  private String innerReceptaclesQuantityUOM;

  public static final String SERIALIZED_NAME_PACKAGING_GROUP = "packagingGroup";
  @SerializedName(SERIALIZED_NAME_PACKAGING_GROUP)
  private String packagingGroup;

  public static final String SERIALIZED_NAME_PACKAGING_INSTRUCTIONS = "packagingInstructions";
  @SerializedName(SERIALIZED_NAME_PACKAGING_INSTRUCTIONS)
  private String packagingInstructions;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private BigDecimal percentage;

  public static final String SERIALIZED_NAME_PROPER_SHIPPING_NAME = "properShippingName";
  @SerializedName(SERIALIZED_NAME_PROPER_SHIPPING_NAME)
  private String properShippingName;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_QUANTITY_U_O_M = "quantityUOM";
  @SerializedName(SERIALIZED_NAME_QUANTITY_U_O_M)
  private String quantityUOM;

  public static final String SERIALIZED_NAME_RADIO_ACTIVITY_DETAIL = "radioActivityDetail";
  @SerializedName(SERIALIZED_NAME_RADIO_ACTIVITY_DETAIL)
  private RadioActivityDetail radioActivityDetail;

  public static final String SERIALIZED_NAME_RADIO_NUCLIDE_DETAIL = "radioNuclideDetail";
  @SerializedName(SERIALIZED_NAME_RADIO_NUCLIDE_DETAIL)
  private RadioNuclideDetail radioNuclideDetail;

  public static final String SERIALIZED_NAME_REPORTABLE_QUANTITY = "reportableQuantity";
  @SerializedName(SERIALIZED_NAME_REPORTABLE_QUANTITY)
  private Boolean reportableQuantity;

  public static final String SERIALIZED_NAME_TECHNICAL_NAME = "technicalName";
  @SerializedName(SERIALIZED_NAME_TECHNICAL_NAME)
  private String technicalName;

  public static final String SERIALIZED_NAME_UN_ID = "unId";
  @SerializedName(SERIALIZED_NAME_UN_ID)
  private String unId;


  public CommodityInfo cargoAirCraft(Boolean cargoAirCraft) {
    
    this.cargoAirCraft = cargoAirCraft;
    return this;
  }

   /**
   * Get cargoAirCraft
   * @return cargoAirCraft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCargoAirCraft() {
    return cargoAirCraft;
  }


  public void setCargoAirCraft(Boolean cargoAirCraft) {
    this.cargoAirCraft = cargoAirCraft;
  }


  public CommodityInfo hazardClass(String hazardClass) {
    
    this.hazardClass = hazardClass;
    return this;
  }

   /**
   * Get hazardClass
   * @return hazardClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHazardClass() {
    return hazardClass;
  }


  public void setHazardClass(String hazardClass) {
    this.hazardClass = hazardClass;
  }


  public CommodityInfo infectiousSubstanceContact(InfectiousSubstanceContact infectiousSubstanceContact) {
    
    this.infectiousSubstanceContact = infectiousSubstanceContact;
    return this;
  }

   /**
   * Get infectiousSubstanceContact
   * @return infectiousSubstanceContact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InfectiousSubstanceContact getInfectiousSubstanceContact() {
    return infectiousSubstanceContact;
  }


  public void setInfectiousSubstanceContact(InfectiousSubstanceContact infectiousSubstanceContact) {
    this.infectiousSubstanceContact = infectiousSubstanceContact;
  }


  public CommodityInfo innerReceptaclesQuantity(Integer innerReceptaclesQuantity) {
    
    this.innerReceptaclesQuantity = innerReceptaclesQuantity;
    return this;
  }

   /**
   * Get innerReceptaclesQuantity
   * @return innerReceptaclesQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInnerReceptaclesQuantity() {
    return innerReceptaclesQuantity;
  }


  public void setInnerReceptaclesQuantity(Integer innerReceptaclesQuantity) {
    this.innerReceptaclesQuantity = innerReceptaclesQuantity;
  }


  public CommodityInfo innerReceptaclesQuantityUOM(String innerReceptaclesQuantityUOM) {
    
    this.innerReceptaclesQuantityUOM = innerReceptaclesQuantityUOM;
    return this;
  }

   /**
   * Get innerReceptaclesQuantityUOM
   * @return innerReceptaclesQuantityUOM
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInnerReceptaclesQuantityUOM() {
    return innerReceptaclesQuantityUOM;
  }


  public void setInnerReceptaclesQuantityUOM(String innerReceptaclesQuantityUOM) {
    this.innerReceptaclesQuantityUOM = innerReceptaclesQuantityUOM;
  }


  public CommodityInfo packagingGroup(String packagingGroup) {
    
    this.packagingGroup = packagingGroup;
    return this;
  }

   /**
   * Get packagingGroup
   * @return packagingGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPackagingGroup() {
    return packagingGroup;
  }


  public void setPackagingGroup(String packagingGroup) {
    this.packagingGroup = packagingGroup;
  }


  public CommodityInfo packagingInstructions(String packagingInstructions) {
    
    this.packagingInstructions = packagingInstructions;
    return this;
  }

   /**
   * Get packagingInstructions
   * @return packagingInstructions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPackagingInstructions() {
    return packagingInstructions;
  }


  public void setPackagingInstructions(String packagingInstructions) {
    this.packagingInstructions = packagingInstructions;
  }


  public CommodityInfo percentage(BigDecimal percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPercentage() {
    return percentage;
  }


  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }


  public CommodityInfo properShippingName(String properShippingName) {
    
    this.properShippingName = properShippingName;
    return this;
  }

   /**
   * Get properShippingName
   * @return properShippingName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProperShippingName() {
    return properShippingName;
  }


  public void setProperShippingName(String properShippingName) {
    this.properShippingName = properShippingName;
  }


  public CommodityInfo quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public CommodityInfo quantityUOM(String quantityUOM) {
    
    this.quantityUOM = quantityUOM;
    return this;
  }

   /**
   * Get quantityUOM
   * @return quantityUOM
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQuantityUOM() {
    return quantityUOM;
  }


  public void setQuantityUOM(String quantityUOM) {
    this.quantityUOM = quantityUOM;
  }


  public CommodityInfo radioActivityDetail(RadioActivityDetail radioActivityDetail) {
    
    this.radioActivityDetail = radioActivityDetail;
    return this;
  }

   /**
   * Get radioActivityDetail
   * @return radioActivityDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RadioActivityDetail getRadioActivityDetail() {
    return radioActivityDetail;
  }


  public void setRadioActivityDetail(RadioActivityDetail radioActivityDetail) {
    this.radioActivityDetail = radioActivityDetail;
  }


  public CommodityInfo radioNuclideDetail(RadioNuclideDetail radioNuclideDetail) {
    
    this.radioNuclideDetail = radioNuclideDetail;
    return this;
  }

   /**
   * Get radioNuclideDetail
   * @return radioNuclideDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RadioNuclideDetail getRadioNuclideDetail() {
    return radioNuclideDetail;
  }


  public void setRadioNuclideDetail(RadioNuclideDetail radioNuclideDetail) {
    this.radioNuclideDetail = radioNuclideDetail;
  }


  public CommodityInfo reportableQuantity(Boolean reportableQuantity) {
    
    this.reportableQuantity = reportableQuantity;
    return this;
  }

   /**
   * Get reportableQuantity
   * @return reportableQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReportableQuantity() {
    return reportableQuantity;
  }


  public void setReportableQuantity(Boolean reportableQuantity) {
    this.reportableQuantity = reportableQuantity;
  }


  public CommodityInfo technicalName(String technicalName) {
    
    this.technicalName = technicalName;
    return this;
  }

   /**
   * Get technicalName
   * @return technicalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTechnicalName() {
    return technicalName;
  }


  public void setTechnicalName(String technicalName) {
    this.technicalName = technicalName;
  }


  public CommodityInfo unId(String unId) {
    
    this.unId = unId;
    return this;
  }

   /**
   * Get unId
   * @return unId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnId() {
    return unId;
  }


  public void setUnId(String unId) {
    this.unId = unId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommodityInfo commodityInfo = (CommodityInfo) o;
    return Objects.equals(this.cargoAirCraft, commodityInfo.cargoAirCraft) &&
        Objects.equals(this.hazardClass, commodityInfo.hazardClass) &&
        Objects.equals(this.infectiousSubstanceContact, commodityInfo.infectiousSubstanceContact) &&
        Objects.equals(this.innerReceptaclesQuantity, commodityInfo.innerReceptaclesQuantity) &&
        Objects.equals(this.innerReceptaclesQuantityUOM, commodityInfo.innerReceptaclesQuantityUOM) &&
        Objects.equals(this.packagingGroup, commodityInfo.packagingGroup) &&
        Objects.equals(this.packagingInstructions, commodityInfo.packagingInstructions) &&
        Objects.equals(this.percentage, commodityInfo.percentage) &&
        Objects.equals(this.properShippingName, commodityInfo.properShippingName) &&
        Objects.equals(this.quantity, commodityInfo.quantity) &&
        Objects.equals(this.quantityUOM, commodityInfo.quantityUOM) &&
        Objects.equals(this.radioActivityDetail, commodityInfo.radioActivityDetail) &&
        Objects.equals(this.radioNuclideDetail, commodityInfo.radioNuclideDetail) &&
        Objects.equals(this.reportableQuantity, commodityInfo.reportableQuantity) &&
        Objects.equals(this.technicalName, commodityInfo.technicalName) &&
        Objects.equals(this.unId, commodityInfo.unId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cargoAirCraft, hazardClass, infectiousSubstanceContact, innerReceptaclesQuantity, innerReceptaclesQuantityUOM, packagingGroup, packagingInstructions, percentage, properShippingName, quantity, quantityUOM, radioActivityDetail, radioNuclideDetail, reportableQuantity, technicalName, unId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommodityInfo {\n");
    sb.append("    cargoAirCraft: ").append(toIndentedString(cargoAirCraft)).append("\n");
    sb.append("    hazardClass: ").append(toIndentedString(hazardClass)).append("\n");
    sb.append("    infectiousSubstanceContact: ").append(toIndentedString(infectiousSubstanceContact)).append("\n");
    sb.append("    innerReceptaclesQuantity: ").append(toIndentedString(innerReceptaclesQuantity)).append("\n");
    sb.append("    innerReceptaclesQuantityUOM: ").append(toIndentedString(innerReceptaclesQuantityUOM)).append("\n");
    sb.append("    packagingGroup: ").append(toIndentedString(packagingGroup)).append("\n");
    sb.append("    packagingInstructions: ").append(toIndentedString(packagingInstructions)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    properShippingName: ").append(toIndentedString(properShippingName)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quantityUOM: ").append(toIndentedString(quantityUOM)).append("\n");
    sb.append("    radioActivityDetail: ").append(toIndentedString(radioActivityDetail)).append("\n");
    sb.append("    radioNuclideDetail: ").append(toIndentedString(radioNuclideDetail)).append("\n");
    sb.append("    reportableQuantity: ").append(toIndentedString(reportableQuantity)).append("\n");
    sb.append("    technicalName: ").append(toIndentedString(technicalName)).append("\n");
    sb.append("    unId: ").append(toIndentedString(unId)).append("\n");
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
