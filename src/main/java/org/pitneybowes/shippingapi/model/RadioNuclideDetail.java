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

/**
 * RadioNuclideDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-10T01:37:26.222+05:30[Asia/Calcutta]")
public class RadioNuclideDetail {
  public static final String SERIALIZED_NAME_CHEMICAL_FORM = "chemicalForm";
  @SerializedName(SERIALIZED_NAME_CHEMICAL_FORM)
  private String chemicalForm;

  public static final String SERIALIZED_NAME_EXPECTED_PACKAGE_REPORTABLE_QUANTITY = "expectedPackageReportableQuantity";
  @SerializedName(SERIALIZED_NAME_EXPECTED_PACKAGE_REPORTABLE_QUANTITY)
  private Boolean expectedPackageReportableQuantity;

  public static final String SERIALIZED_NAME_PHYSICAL_FORM = "physicalForm";
  @SerializedName(SERIALIZED_NAME_PHYSICAL_FORM)
  private String physicalForm;

  public static final String SERIALIZED_NAME_RADIO_NUCLIDE = "radioNuclide";
  @SerializedName(SERIALIZED_NAME_RADIO_NUCLIDE)
  private String radioNuclide;

  public static final String SERIALIZED_NAME_RADIO_NUCLIDE_ACTIVITY_U_O_M = "radioNuclideActivityUOM";
  @SerializedName(SERIALIZED_NAME_RADIO_NUCLIDE_ACTIVITY_U_O_M)
  private String radioNuclideActivityUOM;

  public static final String SERIALIZED_NAME_RADIO_NUCLIDE_ACTIVITY_VALUE = "radioNuclideActivityValue";
  @SerializedName(SERIALIZED_NAME_RADIO_NUCLIDE_ACTIVITY_VALUE)
  private BigDecimal radioNuclideActivityValue;


  public RadioNuclideDetail chemicalForm(String chemicalForm) {
    
    this.chemicalForm = chemicalForm;
    return this;
  }

   /**
   * Get chemicalForm
   * @return chemicalForm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChemicalForm() {
    return chemicalForm;
  }


  public void setChemicalForm(String chemicalForm) {
    this.chemicalForm = chemicalForm;
  }


  public RadioNuclideDetail expectedPackageReportableQuantity(Boolean expectedPackageReportableQuantity) {
    
    this.expectedPackageReportableQuantity = expectedPackageReportableQuantity;
    return this;
  }

   /**
   * Get expectedPackageReportableQuantity
   * @return expectedPackageReportableQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getExpectedPackageReportableQuantity() {
    return expectedPackageReportableQuantity;
  }


  public void setExpectedPackageReportableQuantity(Boolean expectedPackageReportableQuantity) {
    this.expectedPackageReportableQuantity = expectedPackageReportableQuantity;
  }


  public RadioNuclideDetail physicalForm(String physicalForm) {
    
    this.physicalForm = physicalForm;
    return this;
  }

   /**
   * Get physicalForm
   * @return physicalForm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhysicalForm() {
    return physicalForm;
  }


  public void setPhysicalForm(String physicalForm) {
    this.physicalForm = physicalForm;
  }


  public RadioNuclideDetail radioNuclide(String radioNuclide) {
    
    this.radioNuclide = radioNuclide;
    return this;
  }

   /**
   * Get radioNuclide
   * @return radioNuclide
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRadioNuclide() {
    return radioNuclide;
  }


  public void setRadioNuclide(String radioNuclide) {
    this.radioNuclide = radioNuclide;
  }


  public RadioNuclideDetail radioNuclideActivityUOM(String radioNuclideActivityUOM) {
    
    this.radioNuclideActivityUOM = radioNuclideActivityUOM;
    return this;
  }

   /**
   * Get radioNuclideActivityUOM
   * @return radioNuclideActivityUOM
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRadioNuclideActivityUOM() {
    return radioNuclideActivityUOM;
  }


  public void setRadioNuclideActivityUOM(String radioNuclideActivityUOM) {
    this.radioNuclideActivityUOM = radioNuclideActivityUOM;
  }


  public RadioNuclideDetail radioNuclideActivityValue(BigDecimal radioNuclideActivityValue) {
    
    this.radioNuclideActivityValue = radioNuclideActivityValue;
    return this;
  }

   /**
   * Get radioNuclideActivityValue
   * @return radioNuclideActivityValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getRadioNuclideActivityValue() {
    return radioNuclideActivityValue;
  }


  public void setRadioNuclideActivityValue(BigDecimal radioNuclideActivityValue) {
    this.radioNuclideActivityValue = radioNuclideActivityValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadioNuclideDetail radioNuclideDetail = (RadioNuclideDetail) o;
    return Objects.equals(this.chemicalForm, radioNuclideDetail.chemicalForm) &&
        Objects.equals(this.expectedPackageReportableQuantity, radioNuclideDetail.expectedPackageReportableQuantity) &&
        Objects.equals(this.physicalForm, radioNuclideDetail.physicalForm) &&
        Objects.equals(this.radioNuclide, radioNuclideDetail.radioNuclide) &&
        Objects.equals(this.radioNuclideActivityUOM, radioNuclideDetail.radioNuclideActivityUOM) &&
        Objects.equals(this.radioNuclideActivityValue, radioNuclideDetail.radioNuclideActivityValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chemicalForm, expectedPackageReportableQuantity, physicalForm, radioNuclide, radioNuclideActivityUOM, radioNuclideActivityValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadioNuclideDetail {\n");
    sb.append("    chemicalForm: ").append(toIndentedString(chemicalForm)).append("\n");
    sb.append("    expectedPackageReportableQuantity: ").append(toIndentedString(expectedPackageReportableQuantity)).append("\n");
    sb.append("    physicalForm: ").append(toIndentedString(physicalForm)).append("\n");
    sb.append("    radioNuclide: ").append(toIndentedString(radioNuclide)).append("\n");
    sb.append("    radioNuclideActivityUOM: ").append(toIndentedString(radioNuclideActivityUOM)).append("\n");
    sb.append("    radioNuclideActivityValue: ").append(toIndentedString(radioNuclideActivityValue)).append("\n");
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

