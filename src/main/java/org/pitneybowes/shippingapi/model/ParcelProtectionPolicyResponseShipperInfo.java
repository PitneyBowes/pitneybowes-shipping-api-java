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
import org.pitneybowes.shippingapi.model.ParcelProtectionPolicyResponseShipperInfoAddress;

/**
 * ParcelProtectionPolicyResponseShipperInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-10T01:37:26.222+05:30[Asia/Calcutta]")
public class ParcelProtectionPolicyResponseShipperInfo {
  public static final String SERIALIZED_NAME_SHIPPER_I_D = "shipperID";
  @SerializedName(SERIALIZED_NAME_SHIPPER_I_D)
  private String shipperID;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE_NUMBER1 = "phoneNumber1";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER1)
  private String phoneNumber1;

  public static final String SERIALIZED_NAME_PHONE_NUMBER2 = "phoneNumber2";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER2)
  private String phoneNumber2;

  public static final String SERIALIZED_NAME_FAX_NUMBER = "faxNumber";
  @SerializedName(SERIALIZED_NAME_FAX_NUMBER)
  private String faxNumber;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private ParcelProtectionPolicyResponseShipperInfoAddress address;


  public ParcelProtectionPolicyResponseShipperInfo shipperID(String shipperID) {
    
    this.shipperID = shipperID;
    return this;
  }

   /**
   * Get shipperID
   * @return shipperID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getShipperID() {
    return shipperID;
  }


  public void setShipperID(String shipperID) {
    this.shipperID = shipperID;
  }


  public ParcelProtectionPolicyResponseShipperInfo firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public ParcelProtectionPolicyResponseShipperInfo middleName(String middleName) {
    
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


  public ParcelProtectionPolicyResponseShipperInfo lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public ParcelProtectionPolicyResponseShipperInfo company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    this.company = company;
  }


  public ParcelProtectionPolicyResponseShipperInfo email(String email) {
    
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


  public ParcelProtectionPolicyResponseShipperInfo phoneNumber1(String phoneNumber1) {
    
    this.phoneNumber1 = phoneNumber1;
    return this;
  }

   /**
   * Get phoneNumber1
   * @return phoneNumber1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneNumber1() {
    return phoneNumber1;
  }


  public void setPhoneNumber1(String phoneNumber1) {
    this.phoneNumber1 = phoneNumber1;
  }


  public ParcelProtectionPolicyResponseShipperInfo phoneNumber2(String phoneNumber2) {
    
    this.phoneNumber2 = phoneNumber2;
    return this;
  }

   /**
   * Get phoneNumber2
   * @return phoneNumber2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneNumber2() {
    return phoneNumber2;
  }


  public void setPhoneNumber2(String phoneNumber2) {
    this.phoneNumber2 = phoneNumber2;
  }


  public ParcelProtectionPolicyResponseShipperInfo faxNumber(String faxNumber) {
    
    this.faxNumber = faxNumber;
    return this;
  }

   /**
   * Get faxNumber
   * @return faxNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFaxNumber() {
    return faxNumber;
  }


  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }


  public ParcelProtectionPolicyResponseShipperInfo address(ParcelProtectionPolicyResponseShipperInfoAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ParcelProtectionPolicyResponseShipperInfoAddress getAddress() {
    return address;
  }


  public void setAddress(ParcelProtectionPolicyResponseShipperInfoAddress address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelProtectionPolicyResponseShipperInfo parcelProtectionPolicyResponseShipperInfo = (ParcelProtectionPolicyResponseShipperInfo) o;
    return Objects.equals(this.shipperID, parcelProtectionPolicyResponseShipperInfo.shipperID) &&
        Objects.equals(this.firstName, parcelProtectionPolicyResponseShipperInfo.firstName) &&
        Objects.equals(this.middleName, parcelProtectionPolicyResponseShipperInfo.middleName) &&
        Objects.equals(this.lastName, parcelProtectionPolicyResponseShipperInfo.lastName) &&
        Objects.equals(this.company, parcelProtectionPolicyResponseShipperInfo.company) &&
        Objects.equals(this.email, parcelProtectionPolicyResponseShipperInfo.email) &&
        Objects.equals(this.phoneNumber1, parcelProtectionPolicyResponseShipperInfo.phoneNumber1) &&
        Objects.equals(this.phoneNumber2, parcelProtectionPolicyResponseShipperInfo.phoneNumber2) &&
        Objects.equals(this.faxNumber, parcelProtectionPolicyResponseShipperInfo.faxNumber) &&
        Objects.equals(this.address, parcelProtectionPolicyResponseShipperInfo.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipperID, firstName, middleName, lastName, company, email, phoneNumber1, phoneNumber2, faxNumber, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelProtectionPolicyResponseShipperInfo {\n");
    sb.append("    shipperID: ").append(toIndentedString(shipperID)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber1: ").append(toIndentedString(phoneNumber1)).append("\n");
    sb.append("    phoneNumber2: ").append(toIndentedString(phoneNumber2)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
