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

/**
 * SearchCriteria
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T12:45:29.729+05:30[Asia/Calcutta]")
public class SearchCriteria {
  public static final String SERIALIZED_NAME_DEVELOPER_ID = "developerId";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_ID)
  private String developerId;

  public static final String SERIALIZED_NAME_FROM_DATE = "fromDate";
  @SerializedName(SERIALIZED_NAME_FROM_DATE)
  private String fromDate;

  public static final String SERIALIZED_NAME_TO_DATE = "toDate";
  @SerializedName(SERIALIZED_NAME_TO_DATE)
  private String toDate;


  public SearchCriteria developerId(String developerId) {
    
    this.developerId = developerId;
    return this;
  }

   /**
   * Get developerId
   * @return developerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeveloperId() {
    return developerId;
  }


  public void setDeveloperId(String developerId) {
    this.developerId = developerId;
  }


  public SearchCriteria fromDate(String fromDate) {
    
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Get fromDate
   * @return fromDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFromDate() {
    return fromDate;
  }


  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }


  public SearchCriteria toDate(String toDate) {
    
    this.toDate = toDate;
    return this;
  }

   /**
   * Get toDate
   * @return toDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getToDate() {
    return toDate;
  }


  public void setToDate(String toDate) {
    this.toDate = toDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCriteria searchCriteria = (SearchCriteria) o;
    return Objects.equals(this.developerId, searchCriteria.developerId) &&
        Objects.equals(this.fromDate, searchCriteria.fromDate) &&
        Objects.equals(this.toDate, searchCriteria.toDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(developerId, fromDate, toDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCriteria {\n");
    sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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

