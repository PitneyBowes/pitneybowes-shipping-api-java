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
import java.util.ArrayList;
import java.util.List;
import org.pitneybowes.shippingapi.model.Address;

/**
 * ParcelProtectionCreateRequestShipmentInfoConsigneeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-10T01:37:26.222+05:30[Asia/Calcutta]")
public class ParcelProtectionCreateRequestShipmentInfoConsigneeInfo {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_FAMILY_NAME = "familyName";
  @SerializedName(SERIALIZED_NAME_FAMILY_NAME)
  private String familyName;

  public static final String SERIALIZED_NAME_GIVEN_NAME = "givenName";
  @SerializedName(SERIALIZED_NAME_GIVEN_NAME)
  private String givenName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phoneNumbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  private List<Object> phoneNumbers = null;


  public ParcelProtectionCreateRequestShipmentInfoConsigneeInfo address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    this.address = address;
  }


  public ParcelProtectionCreateRequestShipmentInfoConsigneeInfo companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public ParcelProtectionCreateRequestShipmentInfoConsigneeInfo familyName(String familyName) {
    
    this.familyName = familyName;
    return this;
  }

   /**
   * Get familyName
   * @return familyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFamilyName() {
    return familyName;
  }


  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public ParcelProtectionCreateRequestShipmentInfoConsigneeInfo givenName(String givenName) {
    
    this.givenName = givenName;
    return this;
  }

   /**
   * Get givenName
   * @return givenName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGivenName() {
    return givenName;
  }


  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  public ParcelProtectionCreateRequestShipmentInfoConsigneeInfo middleName(String middleName) {
    
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public ParcelProtectionCreateRequestShipmentInfoConsigneeInfo email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public ParcelProtectionCreateRequestShipmentInfoConsigneeInfo phoneNumbers(List<Object> phoneNumbers) {
    
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public ParcelProtectionCreateRequestShipmentInfoConsigneeInfo addPhoneNumbersItem(Object phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<Object>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getPhoneNumbers() {
    return phoneNumbers;
  }


  public void setPhoneNumbers(List<Object> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelProtectionCreateRequestShipmentInfoConsigneeInfo parcelProtectionCreateRequestShipmentInfoConsigneeInfo = (ParcelProtectionCreateRequestShipmentInfoConsigneeInfo) o;
    return Objects.equals(this.address, parcelProtectionCreateRequestShipmentInfoConsigneeInfo.address) &&
        Objects.equals(this.companyName, parcelProtectionCreateRequestShipmentInfoConsigneeInfo.companyName) &&
        Objects.equals(this.familyName, parcelProtectionCreateRequestShipmentInfoConsigneeInfo.familyName) &&
        Objects.equals(this.givenName, parcelProtectionCreateRequestShipmentInfoConsigneeInfo.givenName) &&
        Objects.equals(this.middleName, parcelProtectionCreateRequestShipmentInfoConsigneeInfo.middleName) &&
        Objects.equals(this.email, parcelProtectionCreateRequestShipmentInfoConsigneeInfo.email) &&
        Objects.equals(this.phoneNumbers, parcelProtectionCreateRequestShipmentInfoConsigneeInfo.phoneNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, companyName, familyName, givenName, middleName, email, phoneNumbers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelProtectionCreateRequestShipmentInfoConsigneeInfo {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
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

