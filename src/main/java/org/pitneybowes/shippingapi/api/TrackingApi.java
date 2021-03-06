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


import org.pitneybowes.shippingapi.model.AddTrackingEvents;
import org.pitneybowes.shippingapi.model.Errors;
import org.pitneybowes.shippingapi.model.InlineResponse2002;
import org.pitneybowes.shippingapi.model.TrackingResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrackingApi {
    private ApiClient localVarApiClient;

    public TrackingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TrackingApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for addTrackingEvents
     * @param addTrackingEvents add track event (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addTrackingEventsCall(AddTrackingEvents addTrackingEvents, Boolean xPBUnifiedErrorStructure, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = addTrackingEvents;

        // create path and map variables
        String localVarPath = "/v2/track/events";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xPBUnifiedErrorStructure != null) {
            localVarHeaderParams.put("X-PB-UnifiedErrorStructure", localVarApiClient.parameterToString(xPBUnifiedErrorStructure));
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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oAuth2ClientCredentials" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addTrackingEventsValidateBeforeCall(AddTrackingEvents addTrackingEvents, Boolean xPBUnifiedErrorStructure, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'addTrackingEvents' is set
        if (addTrackingEvents == null) {
            throw new ApiException("Missing the required parameter 'addTrackingEvents' when calling addTrackingEvents(Async)");
        }
        

        okhttp3.Call localVarCall = addTrackingEventsCall(addTrackingEvents, xPBUnifiedErrorStructure, _callback);
        return localVarCall;

    }

    /**
     * getTrackingDetails
     * 
     * @param addTrackingEvents add track event (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse2002 addTrackingEvents(AddTrackingEvents addTrackingEvents, Boolean xPBUnifiedErrorStructure) throws ApiException {
        ApiResponse<InlineResponse2002> localVarResp = addTrackingEventsWithHttpInfo(addTrackingEvents, xPBUnifiedErrorStructure);
        return localVarResp.getData();
    }

    /**
     * getTrackingDetails
     * 
     * @param addTrackingEvents add track event (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse2002> addTrackingEventsWithHttpInfo(AddTrackingEvents addTrackingEvents, Boolean xPBUnifiedErrorStructure) throws ApiException {
        okhttp3.Call localVarCall = addTrackingEventsValidateBeforeCall(addTrackingEvents, xPBUnifiedErrorStructure, null);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * getTrackingDetails (asynchronously)
     * 
     * @param addTrackingEvents add track event (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Error </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addTrackingEventsAsync(AddTrackingEvents addTrackingEvents, Boolean xPBUnifiedErrorStructure, final ApiCallback<InlineResponse2002> _callback) throws ApiException {

        okhttp3.Call localVarCall = addTrackingEventsValidateBeforeCall(addTrackingEvents, xPBUnifiedErrorStructure, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTrackingDetails
     * @param trackingNumber The tracking number for the shipment. (required)
     * @param packageIdentifierType packageIdentifierType (required)
     * @param carrier carrier (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
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
    public okhttp3.Call getTrackingDetailsCall(String trackingNumber, String packageIdentifierType, String carrier, Boolean xPBUnifiedErrorStructure, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/tracking/{trackingNumber}"
            .replaceAll("\\{" + "trackingNumber" + "\\}", localVarApiClient.escapeString(trackingNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (packageIdentifierType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("packageIdentifierType", packageIdentifierType));
        }

        if (carrier != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("carrier", carrier));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xPBUnifiedErrorStructure != null) {
            localVarHeaderParams.put("X-PB-UnifiedErrorStructure", localVarApiClient.parameterToString(xPBUnifiedErrorStructure));
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
    private okhttp3.Call getTrackingDetailsValidateBeforeCall(String trackingNumber, String packageIdentifierType, String carrier, Boolean xPBUnifiedErrorStructure, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'trackingNumber' is set
        if (trackingNumber == null) {
            throw new ApiException("Missing the required parameter 'trackingNumber' when calling getTrackingDetails(Async)");
        }
        
        // verify the required parameter 'packageIdentifierType' is set
        if (packageIdentifierType == null) {
            throw new ApiException("Missing the required parameter 'packageIdentifierType' when calling getTrackingDetails(Async)");
        }
        
        // verify the required parameter 'carrier' is set
        if (carrier == null) {
            throw new ApiException("Missing the required parameter 'carrier' when calling getTrackingDetails(Async)");
        }
        

        okhttp3.Call localVarCall = getTrackingDetailsCall(trackingNumber, packageIdentifierType, carrier, xPBUnifiedErrorStructure, _callback);
        return localVarCall;

    }

    /**
     * getTrackingDetails
     * 
     * @param trackingNumber The tracking number for the shipment. (required)
     * @param packageIdentifierType packageIdentifierType (required)
     * @param carrier carrier (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @return TrackingResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public TrackingResponse getTrackingDetails(String trackingNumber, String packageIdentifierType, String carrier, Boolean xPBUnifiedErrorStructure) throws ApiException {
        ApiResponse<TrackingResponse> localVarResp = getTrackingDetailsWithHttpInfo(trackingNumber, packageIdentifierType, carrier, xPBUnifiedErrorStructure);
        return localVarResp.getData();
    }

    /**
     * getTrackingDetails
     * 
     * @param trackingNumber The tracking number for the shipment. (required)
     * @param packageIdentifierType packageIdentifierType (required)
     * @param carrier carrier (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @return ApiResponse&lt;TrackingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TrackingResponse> getTrackingDetailsWithHttpInfo(String trackingNumber, String packageIdentifierType, String carrier, Boolean xPBUnifiedErrorStructure) throws ApiException {
        okhttp3.Call localVarCall = getTrackingDetailsValidateBeforeCall(trackingNumber, packageIdentifierType, carrier, xPBUnifiedErrorStructure, null);
        Type localVarReturnType = new TypeToken<TrackingResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * getTrackingDetails (asynchronously)
     * 
     * @param trackingNumber The tracking number for the shipment. (required)
     * @param packageIdentifierType packageIdentifierType (required)
     * @param carrier carrier (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
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
    public okhttp3.Call getTrackingDetailsAsync(String trackingNumber, String packageIdentifierType, String carrier, Boolean xPBUnifiedErrorStructure, final ApiCallback<TrackingResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTrackingDetailsValidateBeforeCall(trackingNumber, packageIdentifierType, carrier, xPBUnifiedErrorStructure, _callback);
        Type localVarReturnType = new TypeToken<TrackingResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
