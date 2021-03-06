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
import org.pitneybowes.shippingapi.model.ParcelProtectionPolicyResponseContent;
import org.pitneybowes.shippingapi.model.ParcelProtectionPolicyResponseSort;

/**
 * ParcelProtectionPolicyResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-10T01:37:26.222+05:30[Asia/Calcutta]")
public class ParcelProtectionPolicyResponse {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private List<ParcelProtectionPolicyResponseContent> content = null;

  public static final String SERIALIZED_NAME_LAST = "last";
  @SerializedName(SERIALIZED_NAME_LAST)
  private Boolean last;

  public static final String SERIALIZED_NAME_TOTAL_ELEMENTS = "totalElements";
  @SerializedName(SERIALIZED_NAME_TOTAL_ELEMENTS)
  private Integer totalElements;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "totalPages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;

  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  private Boolean first;

  public static final String SERIALIZED_NAME_NUMBER_OF_ELEMENTS = "numberOfElements";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_ELEMENTS)
  private Integer numberOfElements;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private List<ParcelProtectionPolicyResponseSort> sort = null;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;


  public ParcelProtectionPolicyResponse content(List<ParcelProtectionPolicyResponseContent> content) {
    
    this.content = content;
    return this;
  }

  public ParcelProtectionPolicyResponse addContentItem(ParcelProtectionPolicyResponseContent contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<ParcelProtectionPolicyResponseContent>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ParcelProtectionPolicyResponseContent> getContent() {
    return content;
  }


  public void setContent(List<ParcelProtectionPolicyResponseContent> content) {
    this.content = content;
  }


  public ParcelProtectionPolicyResponse last(Boolean last) {
    
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLast() {
    return last;
  }


  public void setLast(Boolean last) {
    this.last = last;
  }


  public ParcelProtectionPolicyResponse totalElements(Integer totalElements) {
    
    this.totalElements = totalElements;
    return this;
  }

   /**
   * Get totalElements
   * @return totalElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalElements() {
    return totalElements;
  }


  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }


  public ParcelProtectionPolicyResponse totalPages(Integer totalPages) {
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalPages() {
    return totalPages;
  }


  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  public ParcelProtectionPolicyResponse first(Boolean first) {
    
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFirst() {
    return first;
  }


  public void setFirst(Boolean first) {
    this.first = first;
  }


  public ParcelProtectionPolicyResponse numberOfElements(Integer numberOfElements) {
    
    this.numberOfElements = numberOfElements;
    return this;
  }

   /**
   * Get numberOfElements
   * @return numberOfElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumberOfElements() {
    return numberOfElements;
  }


  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }


  public ParcelProtectionPolicyResponse sort(List<ParcelProtectionPolicyResponseSort> sort) {
    
    this.sort = sort;
    return this;
  }

  public ParcelProtectionPolicyResponse addSortItem(ParcelProtectionPolicyResponseSort sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<ParcelProtectionPolicyResponseSort>();
    }
    this.sort.add(sortItem);
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ParcelProtectionPolicyResponseSort> getSort() {
    return sort;
  }


  public void setSort(List<ParcelProtectionPolicyResponseSort> sort) {
    this.sort = sort;
  }


  public ParcelProtectionPolicyResponse size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public ParcelProtectionPolicyResponse number(Integer number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumber() {
    return number;
  }


  public void setNumber(Integer number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelProtectionPolicyResponse parcelProtectionPolicyResponse = (ParcelProtectionPolicyResponse) o;
    return Objects.equals(this.content, parcelProtectionPolicyResponse.content) &&
        Objects.equals(this.last, parcelProtectionPolicyResponse.last) &&
        Objects.equals(this.totalElements, parcelProtectionPolicyResponse.totalElements) &&
        Objects.equals(this.totalPages, parcelProtectionPolicyResponse.totalPages) &&
        Objects.equals(this.first, parcelProtectionPolicyResponse.first) &&
        Objects.equals(this.numberOfElements, parcelProtectionPolicyResponse.numberOfElements) &&
        Objects.equals(this.sort, parcelProtectionPolicyResponse.sort) &&
        Objects.equals(this.size, parcelProtectionPolicyResponse.size) &&
        Objects.equals(this.number, parcelProtectionPolicyResponse.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, last, totalElements, totalPages, first, numberOfElements, sort, size, number);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelProtectionPolicyResponse {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

