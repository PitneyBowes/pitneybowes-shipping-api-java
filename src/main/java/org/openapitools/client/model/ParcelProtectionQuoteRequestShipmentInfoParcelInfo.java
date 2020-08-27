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
import org.openapitools.client.model.ParcelProtectionQuoteRequestShipmentInfoParcelInfoCommodityList;

/**
 * ParcelProtectionQuoteRequestShipmentInfoParcelInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-27T12:45:29.729+05:30[Asia/Calcutta]")
public class ParcelProtectionQuoteRequestShipmentInfoParcelInfo {
  public static final String SERIALIZED_NAME_COMMODITY_LIST = "commodityList";
  @SerializedName(SERIALIZED_NAME_COMMODITY_LIST)
  private List<ParcelProtectionQuoteRequestShipmentInfoParcelInfoCommodityList> commodityList = new ArrayList<ParcelProtectionQuoteRequestShipmentInfoParcelInfoCommodityList>();


  public ParcelProtectionQuoteRequestShipmentInfoParcelInfo commodityList(List<ParcelProtectionQuoteRequestShipmentInfoParcelInfoCommodityList> commodityList) {
    
    this.commodityList = commodityList;
    return this;
  }

  public ParcelProtectionQuoteRequestShipmentInfoParcelInfo addCommodityListItem(ParcelProtectionQuoteRequestShipmentInfoParcelInfoCommodityList commodityListItem) {
    this.commodityList.add(commodityListItem);
    return this;
  }

   /**
   * Get commodityList
   * @return commodityList
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ParcelProtectionQuoteRequestShipmentInfoParcelInfoCommodityList> getCommodityList() {
    return commodityList;
  }


  public void setCommodityList(List<ParcelProtectionQuoteRequestShipmentInfoParcelInfoCommodityList> commodityList) {
    this.commodityList = commodityList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelProtectionQuoteRequestShipmentInfoParcelInfo parcelProtectionQuoteRequestShipmentInfoParcelInfo = (ParcelProtectionQuoteRequestShipmentInfoParcelInfo) o;
    return Objects.equals(this.commodityList, parcelProtectionQuoteRequestShipmentInfoParcelInfo.commodityList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commodityList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelProtectionQuoteRequestShipmentInfoParcelInfo {\n");
    sb.append("    commodityList: ").append(toIndentedString(commodityList)).append("\n");
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

