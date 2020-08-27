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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.CommodityInfo;

/**
 * ContainerDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T12:45:29.729+05:30[Asia/Calcutta]")
public class ContainerDetails {
  public static final String SERIALIZED_NAME_COMMODITY_INFO = "commodityInfo";
  @SerializedName(SERIALIZED_NAME_COMMODITY_INFO)
  private List<CommodityInfo> commodityInfo = null;

  public static final String SERIALIZED_NAME_CONTAINER_TYPE = "containerType";
  @SerializedName(SERIALIZED_NAME_CONTAINER_TYPE)
  private String containerType;

  public static final String SERIALIZED_NAME_PACKAGING_TYPE = "packagingType";
  @SerializedName(SERIALIZED_NAME_PACKAGING_TYPE)
  private String packagingType;


  public ContainerDetails commodityInfo(List<CommodityInfo> commodityInfo) {
    
    this.commodityInfo = commodityInfo;
    return this;
  }

  public ContainerDetails addCommodityInfoItem(CommodityInfo commodityInfoItem) {
    if (this.commodityInfo == null) {
      this.commodityInfo = new ArrayList<CommodityInfo>();
    }
    this.commodityInfo.add(commodityInfoItem);
    return this;
  }

   /**
   * Get commodityInfo
   * @return commodityInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CommodityInfo> getCommodityInfo() {
    return commodityInfo;
  }


  public void setCommodityInfo(List<CommodityInfo> commodityInfo) {
    this.commodityInfo = commodityInfo;
  }


  public ContainerDetails containerType(String containerType) {
    
    this.containerType = containerType;
    return this;
  }

   /**
   * Get containerType
   * @return containerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContainerType() {
    return containerType;
  }


  public void setContainerType(String containerType) {
    this.containerType = containerType;
  }


  public ContainerDetails packagingType(String packagingType) {
    
    this.packagingType = packagingType;
    return this;
  }

   /**
   * Get packagingType
   * @return packagingType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPackagingType() {
    return packagingType;
  }


  public void setPackagingType(String packagingType) {
    this.packagingType = packagingType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerDetails containerDetails = (ContainerDetails) o;
    return Objects.equals(this.commodityInfo, containerDetails.commodityInfo) &&
        Objects.equals(this.containerType, containerDetails.containerType) &&
        Objects.equals(this.packagingType, containerDetails.packagingType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commodityInfo, containerType, packagingType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerDetails {\n");
    sb.append("    commodityInfo: ").append(toIndentedString(commodityInfo)).append("\n");
    sb.append("    containerType: ").append(toIndentedString(containerType)).append("\n");
    sb.append("    packagingType: ").append(toIndentedString(packagingType)).append("\n");
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
