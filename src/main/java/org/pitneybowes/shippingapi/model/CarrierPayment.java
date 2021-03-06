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

/**
 * CarrierPayment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-10T01:37:26.222+05:30[Asia/Calcutta]")
public class CarrierPayment {
  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  /**
   * Gets or Sets party
   */
  @JsonAdapter(PartyEnum.Adapter.class)
  public enum PartyEnum {
    RECEIVER("BILL_RECEIVER"),
    
    SENDER("BILL_SENDER"),
    
    THIRD_PARTY("BILL_THIRD_PARTY"),
    
    RECEIVER_CONTRACT("BILL_RECEIVER_CONTRACT");

    private String value;

    PartyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PartyEnum fromValue(String value) {
      for (PartyEnum b : PartyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PartyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PartyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PartyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PartyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PARTY = "party";
  @SerializedName(SERIALIZED_NAME_PARTY)
  private PartyEnum party;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  /**
   * Gets or Sets typeOfCharge
   */
  @JsonAdapter(TypeOfChargeEnum.Adapter.class)
  public enum TypeOfChargeEnum {
    TRANSPORTATION_CHARGES("TRANSPORTATION_CHARGES"),
    
    DUTIES_AND_TAXES("DUTIES_AND_TAXES"),
    
    ALL_CHARGES("ALL_CHARGES");

    private String value;

    TypeOfChargeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeOfChargeEnum fromValue(String value) {
      for (TypeOfChargeEnum b : TypeOfChargeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeOfChargeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeOfChargeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeOfChargeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeOfChargeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE_OF_CHARGE = "typeOfCharge";
  @SerializedName(SERIALIZED_NAME_TYPE_OF_CHARGE)
  private TypeOfChargeEnum typeOfCharge;


  public CarrierPayment accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public CarrierPayment countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public CarrierPayment party(PartyEnum party) {
    
    this.party = party;
    return this;
  }

   /**
   * Get party
   * @return party
  **/
  @ApiModelProperty(required = true, value = "")

  public PartyEnum getParty() {
    return party;
  }


  public void setParty(PartyEnum party) {
    this.party = party;
  }


  public CarrierPayment postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public CarrierPayment typeOfCharge(TypeOfChargeEnum typeOfCharge) {
    
    this.typeOfCharge = typeOfCharge;
    return this;
  }

   /**
   * Get typeOfCharge
   * @return typeOfCharge
  **/
  @ApiModelProperty(required = true, value = "")

  public TypeOfChargeEnum getTypeOfCharge() {
    return typeOfCharge;
  }


  public void setTypeOfCharge(TypeOfChargeEnum typeOfCharge) {
    this.typeOfCharge = typeOfCharge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarrierPayment carrierPayment = (CarrierPayment) o;
    return Objects.equals(this.accountNumber, carrierPayment.accountNumber) &&
        Objects.equals(this.countryCode, carrierPayment.countryCode) &&
        Objects.equals(this.party, carrierPayment.party) &&
        Objects.equals(this.postalCode, carrierPayment.postalCode) &&
        Objects.equals(this.typeOfCharge, carrierPayment.typeOfCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, countryCode, party, postalCode, typeOfCharge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarrierPayment {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    party: ").append(toIndentedString(party)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    typeOfCharge: ").append(toIndentedString(typeOfCharge)).append("\n");
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

