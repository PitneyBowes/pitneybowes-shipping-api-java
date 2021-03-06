# CrossBorderQuotesApi

All URIs are relative to *https://api-sandbox.pitneybowes.com/shippingservices*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCrossBorderQuotes**](CrossBorderQuotesApi.md#getCrossBorderQuotes) | **POST** /v1/crossborder/checkout/quotes | Cross-Border Quotes
[**predictedHSCode**](CrossBorderQuotesApi.md#predictedHSCode) | **POST** /v1/crossborder/hs-classification/items | Predicts the HS Code for a parcel


<a name="getCrossBorderQuotes"></a>
# **getCrossBorderQuotes**
> CrossBorderQuotesResponse getCrossBorderQuotes(crossBorderQuotesRequest, xPBUnifiedErrorStructure)

Cross-Border Quotes

This operation provides an estimate of the duties, taxes, and transportation costs for the items in a buyer&#39;s online shopping basket. The API calculates how many separate parcels are required to ship the items and estimates costs. The API checks each item&#39;s eligibility to clear customs and returns the quote for eligible items. To look for futher info please look into [Cross-Border Quotes](https://shipping.pitneybowes.com/api/post-quotes.html#)

### Example
```java
// Import classes:
import org.pitneybowes.shippingapi.ApiClient;
import org.pitneybowes.shippingapi.ApiException;
import org.pitneybowes.shippingapi.Configuration;
import org.pitneybowes.shippingapi.auth.*;
import org.pitneybowes.shippingapi.models.*;
import org.pitneybowes.shippingapi.api.CrossBorderQuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    CrossBorderQuotesApi apiInstance = new CrossBorderQuotesApi(defaultClient);
    CrossBorderQuotesRequest crossBorderQuotesRequest = {"quoteCurrency":"USD","basketCurrency":"USD","fromAddress":{"name":"John Smith","residential":false,"company":"Supplies","addressLines":["545 Market St"],"cityTown":"San Francisco","stateProvince":"CA","postalCode":"94105","countryCode":"US","email":"john@example.com","phone":"415-555-0000"},"toAddress":{"name":"Jan Jones","residential":true,"addressLines":["2168 King St N"],"cityTown":"Waterloo","stateProvince":"ON","postalCode":"N2J 4G8","countryCode":"CA","email":"jan@example.com","phone":"519-555-0000"},"basketItems":[{"brand":"","categories":[{"categoryCode":"UNKNOWN","descriptions":[{"locale":"en","name":"Dress","parentsNames":["Clothing","Women"]}],"parentCategoryCode":"6543","url":"www.example.com"}],"description":"Red Embroidered","eccn":"EAR99","hazmats":["hazmat","ormd"],"hSTariffCode":"4203100001","hSTariffCodeCountry":"AU","identifiers":[{"number":"123456","source":"isbn"}],"imageUrls":["www.example.com"],"itemDimension":{"length":11,"height":8.5,"width":5,"unitOfMeasurement":"IN"},"itemId":"G_123456","manufacturer":"","originCountryCode":"CN","pricing":{"price":20,"codPrice":[{"price":20,"cod":"CA","includesDuty":false,"includesTaxes":false}],"dutiableValue":20},"quantity":2,"unitPrice":19.99,"unitWeight":{"weight":5,"unitOfMeasurement":"lb"},"url":"http://www.example.com/products/160921_030"}],"rates":[{"carrier":"PBI","serviceId":"PBXPS"}],"shipmentOptions":[{"name":"SHIPPER_ID","value":"9024324564"},{"name":"CLIENT_ID","value":"789123"},{"name":"CARRIER_FACILITY_ID","value":"US_ELOVATIONS_KY"}]}; // CrossBorderQuotesRequest | 
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    try {
      CrossBorderQuotesResponse result = apiInstance.getCrossBorderQuotes(crossBorderQuotesRequest, xPBUnifiedErrorStructure);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrossBorderQuotesApi#getCrossBorderQuotes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crossBorderQuotesRequest** | [**CrossBorderQuotesRequest**](CrossBorderQuotesRequest.md)|  |
 **xPBUnifiedErrorStructure** | **Boolean**| Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. | [optional] [default to true]

### Return type

[**CrossBorderQuotesResponse**](CrossBorderQuotesResponse.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Error |  -  |

<a name="predictedHSCode"></a>
# **predictedHSCode**
> ParcelProtectionPolicyResponse predictedHSCode(xPBTransactionId, manifest, xPBUnifiedErrorStructure)

Predicts the HS Code for a parcel

This operation predicts the HS Code for a parcel being shipped internationally and gives the level of confidence in the prediction.

### Example
```java
// Import classes:
import org.pitneybowes.shippingapi.ApiClient;
import org.pitneybowes.shippingapi.ApiException;
import org.pitneybowes.shippingapi.Configuration;
import org.pitneybowes.shippingapi.auth.*;
import org.pitneybowes.shippingapi.models.*;
import org.pitneybowes.shippingapi.api.CrossBorderQuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sandbox.pitneybowes.com/shippingservices");
    
    // Configure OAuth2 access token for authorization: oAuth2ClientCredentials
    OAuth oAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("oAuth2ClientCredentials");
    oAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    CrossBorderQuotesApi apiInstance = new CrossBorderQuotesApi(defaultClient);
    String xPBTransactionId = "xPBTransactionId_example"; // String | Required. A unique identifier for the transaction, up to 25 characters.
    Manifest manifest = {"carrier":"Newgistics","containerType":"Carton","parcelTrackingNumbers":["9205500000000000000000","9206600000000000000000"],"documents":[{"resolution":"DPI_203","size":"DOC_4X4","fileFormat":"PDF"}],"parameters":[{"name":"CLIENT_CONTAINER_ID","value":"AB12345678"},{"name":"SHIPMENT_REFERENCE_NUMBER","value":"CD12345678"},{"name":"CLIENT_FACILITY_ID","value":"7777"},{"name":"CARRIER_GATEWAY_FACILITY_ID","value":"1234"},{"name":"CARRIER_FACILITY_ID","value":"4321"},{"name":"PRINT_CUSTOM_MESSAGE_1","value":"Container: AB12345678, Shipment: CD12345678"},{"name":"current_container","value":"1"},{"name":"total_container_count","value":"2"},{"name":"client_Id","value":"NGST"}]}; // Manifest | manifest
    Boolean xPBUnifiedErrorStructure = true; // Boolean | Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs.
    try {
      ParcelProtectionPolicyResponse result = apiInstance.predictedHSCode(xPBTransactionId, manifest, xPBUnifiedErrorStructure);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrossBorderQuotesApi#predictedHSCode");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPBTransactionId** | **String**| Required. A unique identifier for the transaction, up to 25 characters. |
 **manifest** | [**Manifest**](Manifest.md)| manifest |
 **xPBUnifiedErrorStructure** | **Boolean**| Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. | [optional] [default to true]

### Return type

[**ParcelProtectionPolicyResponse**](ParcelProtectionPolicyResponse.md)

### Authorization

[oAuth2ClientCredentials](../README.md#oAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

