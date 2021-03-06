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


package org.pitneybowes.shippingapi.api;

import org.pitneybowes.shippingapi.ApiCallback;
import org.pitneybowes.shippingapi.ApiClient;
import org.pitneybowes.shippingapi.ApiException;
import org.pitneybowes.shippingapi.ApiResponse;
import org.pitneybowes.shippingapi.Configuration;
import org.pitneybowes.shippingapi.Pair;
import org.pitneybowes.shippingapi.ProgressRequestBody;
import org.pitneybowes.shippingapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.pitneybowes.shippingapi.model.Errors;
import org.threeten.bp.OffsetDateTime;
import org.pitneybowes.shippingapi.model.PageRealTransactionDetailReport;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionReportsApi {
    private ApiClient localVarApiClient;

    public TransactionReportsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionReportsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getTransactionReport
     * @param developerId developerId (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @param fromDate fromDate (optional)
     * @param shipDetails  (optional, default to 0)
     * @param page  (optional)
     * @param size  (optional, default to 20)
     * @param printStatus printStatus (optional)
     * @param toDate toDate (optional)
     * @param transactionType transactionType (optional)
     * @param merchantId The value of the postalReportingNumber element in the [merchant object](https://shipping.pitneybowes.com/reference/resource-objects.html). This value is also the merchant&#39;s Shipper ID. (optional)
     * @param sort Defines a property to sort on and the sort order. Sort order can be ascending (asc) or descending (desc). Use the following form-  * **sort&#x3D;&lt;property_name&gt;,&lt;sort_direction&gt;** For example- **sort&#x3D;transactionId,desc**  (optional)
     * @param parcelTrackingNumber Parcel tracking number of the shipment. (optional)
     * @param transactionId The unique string that identifies all the transactions associated with a given shipment. The string comprises the developer ID and the shipment&#39;s X-PB-TransactionId, separated by an underscore (_). For example-  * **transactionId&#x3D;44397664_ad5aa07-ad7414-a78a-c22b3** (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionReportCall(String developerId, Boolean xPBUnifiedErrorStructure, OffsetDateTime fromDate, Integer shipDetails, Integer page, Integer size, String printStatus, OffsetDateTime toDate, String transactionType, String merchantId, String sort, String parcelTrackingNumber, String transactionId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v4/ledger/developers/{developerId}/transactions/reports"
            .replaceAll("\\{" + "developerId" + "\\}", localVarApiClient.escapeString(developerId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fromDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromDate", fromDate));
        }

        if (shipDetails != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("shipDetails", shipDetails));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (size != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("size", size));
        }

        if (printStatus != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("printStatus", printStatus));
        }

        if (toDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("toDate", toDate));
        }

        if (transactionType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("transactionType", transactionType));
        }

        if (merchantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("merchantId", merchantId));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        if (parcelTrackingNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("parcelTrackingNumber", parcelTrackingNumber));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xPBUnifiedErrorStructure != null) {
            localVarHeaderParams.put("X-PB-UnifiedErrorStructure", localVarApiClient.parameterToString(xPBUnifiedErrorStructure));
        }

        if (transactionId != null) {
            localVarHeaderParams.put("transactionId", localVarApiClient.parameterToString(transactionId));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oAuth2ClientCredentials" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTransactionReportValidateBeforeCall(String developerId, Boolean xPBUnifiedErrorStructure, OffsetDateTime fromDate, Integer shipDetails, Integer page, Integer size, String printStatus, OffsetDateTime toDate, String transactionType, String merchantId, String sort, String parcelTrackingNumber, String transactionId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'developerId' is set
        if (developerId == null) {
            throw new ApiException("Missing the required parameter 'developerId' when calling getTransactionReport(Async)");
        }
        

        okhttp3.Call localVarCall = getTransactionReportCall(developerId, xPBUnifiedErrorStructure, fromDate, shipDetails, page, size, printStatus, toDate, transactionType, merchantId, sort, parcelTrackingNumber, transactionId, _callback);
        return localVarCall;

    }

    /**
     * This operation retrieves all transactions for a specified period of time.
     * 
     * @param developerId developerId (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @param fromDate fromDate (optional)
     * @param shipDetails  (optional, default to 0)
     * @param page  (optional)
     * @param size  (optional, default to 20)
     * @param printStatus printStatus (optional)
     * @param toDate toDate (optional)
     * @param transactionType transactionType (optional)
     * @param merchantId The value of the postalReportingNumber element in the [merchant object](https://shipping.pitneybowes.com/reference/resource-objects.html). This value is also the merchant&#39;s Shipper ID. (optional)
     * @param sort Defines a property to sort on and the sort order. Sort order can be ascending (asc) or descending (desc). Use the following form-  * **sort&#x3D;&lt;property_name&gt;,&lt;sort_direction&gt;** For example- **sort&#x3D;transactionId,desc**  (optional)
     * @param parcelTrackingNumber Parcel tracking number of the shipment. (optional)
     * @param transactionId The unique string that identifies all the transactions associated with a given shipment. The string comprises the developer ID and the shipment&#39;s X-PB-TransactionId, separated by an underscore (_). For example-  * **transactionId&#x3D;44397664_ad5aa07-ad7414-a78a-c22b3** (optional)
     * @return PageRealTransactionDetailReport
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public PageRealTransactionDetailReport getTransactionReport(String developerId, Boolean xPBUnifiedErrorStructure, OffsetDateTime fromDate, Integer shipDetails, Integer page, Integer size, String printStatus, OffsetDateTime toDate, String transactionType, String merchantId, String sort, String parcelTrackingNumber, String transactionId) throws ApiException {
        ApiResponse<PageRealTransactionDetailReport> localVarResp = getTransactionReportWithHttpInfo(developerId, xPBUnifiedErrorStructure, fromDate, shipDetails, page, size, printStatus, toDate, transactionType, merchantId, sort, parcelTrackingNumber, transactionId);
        return localVarResp.getData();
    }

    /**
     * This operation retrieves all transactions for a specified period of time.
     * 
     * @param developerId developerId (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @param fromDate fromDate (optional)
     * @param shipDetails  (optional, default to 0)
     * @param page  (optional)
     * @param size  (optional, default to 20)
     * @param printStatus printStatus (optional)
     * @param toDate toDate (optional)
     * @param transactionType transactionType (optional)
     * @param merchantId The value of the postalReportingNumber element in the [merchant object](https://shipping.pitneybowes.com/reference/resource-objects.html). This value is also the merchant&#39;s Shipper ID. (optional)
     * @param sort Defines a property to sort on and the sort order. Sort order can be ascending (asc) or descending (desc). Use the following form-  * **sort&#x3D;&lt;property_name&gt;,&lt;sort_direction&gt;** For example- **sort&#x3D;transactionId,desc**  (optional)
     * @param parcelTrackingNumber Parcel tracking number of the shipment. (optional)
     * @param transactionId The unique string that identifies all the transactions associated with a given shipment. The string comprises the developer ID and the shipment&#39;s X-PB-TransactionId, separated by an underscore (_). For example-  * **transactionId&#x3D;44397664_ad5aa07-ad7414-a78a-c22b3** (optional)
     * @return ApiResponse&lt;PageRealTransactionDetailReport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PageRealTransactionDetailReport> getTransactionReportWithHttpInfo(String developerId, Boolean xPBUnifiedErrorStructure, OffsetDateTime fromDate, Integer shipDetails, Integer page, Integer size, String printStatus, OffsetDateTime toDate, String transactionType, String merchantId, String sort, String parcelTrackingNumber, String transactionId) throws ApiException {
        okhttp3.Call localVarCall = getTransactionReportValidateBeforeCall(developerId, xPBUnifiedErrorStructure, fromDate, shipDetails, page, size, printStatus, toDate, transactionType, merchantId, sort, parcelTrackingNumber, transactionId, null);
        Type localVarReturnType = new TypeToken<PageRealTransactionDetailReport>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * This operation retrieves all transactions for a specified period of time. (asynchronously)
     * 
     * @param developerId developerId (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @param fromDate fromDate (optional)
     * @param shipDetails  (optional, default to 0)
     * @param page  (optional)
     * @param size  (optional, default to 20)
     * @param printStatus printStatus (optional)
     * @param toDate toDate (optional)
     * @param transactionType transactionType (optional)
     * @param merchantId The value of the postalReportingNumber element in the [merchant object](https://shipping.pitneybowes.com/reference/resource-objects.html). This value is also the merchant&#39;s Shipper ID. (optional)
     * @param sort Defines a property to sort on and the sort order. Sort order can be ascending (asc) or descending (desc). Use the following form-  * **sort&#x3D;&lt;property_name&gt;,&lt;sort_direction&gt;** For example- **sort&#x3D;transactionId,desc**  (optional)
     * @param parcelTrackingNumber Parcel tracking number of the shipment. (optional)
     * @param transactionId The unique string that identifies all the transactions associated with a given shipment. The string comprises the developer ID and the shipment&#39;s X-PB-TransactionId, separated by an underscore (_). For example-  * **transactionId&#x3D;44397664_ad5aa07-ad7414-a78a-c22b3** (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionReportAsync(String developerId, Boolean xPBUnifiedErrorStructure, OffsetDateTime fromDate, Integer shipDetails, Integer page, Integer size, String printStatus, OffsetDateTime toDate, String transactionType, String merchantId, String sort, String parcelTrackingNumber, String transactionId, final ApiCallback<PageRealTransactionDetailReport> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTransactionReportValidateBeforeCall(developerId, xPBUnifiedErrorStructure, fromDate, shipDetails, page, size, printStatus, toDate, transactionType, merchantId, sort, parcelTrackingNumber, transactionId, _callback);
        Type localVarReturnType = new TypeToken<PageRealTransactionDetailReport>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
