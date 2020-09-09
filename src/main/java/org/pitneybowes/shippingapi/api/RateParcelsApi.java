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
import org.pitneybowes.shippingapi.model.Shipment;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RateParcelsApi {
    private ApiClient localVarApiClient;

    public RateParcelsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RateParcelsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for rateParcel
     * @param shipment Shipment request for Rates (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @param xPBShipperRatePlan USPS Only. Shipper rate plan, if applicable. For more information, see [this FAQ](https://shipping.pitneybowes.com/faqs/rates.html#rate-plans-faq) (optional)
     * @param xPBIntegratorCarrierId USPS Only. Negotiated services rate, if applicable. (optional)
     * @param xPBShipperCarrierAccountId UPS (United Parcel Service) Only. The unique identifier returned in the shipperCarrierAccountId field by the [Register an Existing Carrier Account](https://shipping.pitneybowes.com/api/post-carrier-accounts-register.html) API. (optional)
     * @param includeDeliveryCommitment When set to true, returns estimated transit time in days. (optional)
     * @param carrier Cross-Border only. Required for PB Cross-Border. Set this to PBI. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call rateParcelCall(Shipment shipment, Boolean xPBUnifiedErrorStructure, String xPBShipperRatePlan, String xPBIntegratorCarrierId, String xPBShipperCarrierAccountId, Boolean includeDeliveryCommitment, String carrier, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = shipment;

        // create path and map variables
        String localVarPath = "/v1/rates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (includeDeliveryCommitment != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeDeliveryCommitment", includeDeliveryCommitment));
        }

        if (carrier != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("carrier", carrier));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xPBUnifiedErrorStructure != null) {
            localVarHeaderParams.put("X-PB-UnifiedErrorStructure", localVarApiClient.parameterToString(xPBUnifiedErrorStructure));
        }

        if (xPBShipperRatePlan != null) {
            localVarHeaderParams.put("X-PB-Shipper-Rate-Plan", localVarApiClient.parameterToString(xPBShipperRatePlan));
        }

        if (xPBIntegratorCarrierId != null) {
            localVarHeaderParams.put("X-PB-Integrator-CarrierId", localVarApiClient.parameterToString(xPBIntegratorCarrierId));
        }

        if (xPBShipperCarrierAccountId != null) {
            localVarHeaderParams.put("X-PB-Shipper-Carrier-AccountId", localVarApiClient.parameterToString(xPBShipperCarrierAccountId));
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
    private okhttp3.Call rateParcelValidateBeforeCall(Shipment shipment, Boolean xPBUnifiedErrorStructure, String xPBShipperRatePlan, String xPBIntegratorCarrierId, String xPBShipperCarrierAccountId, Boolean includeDeliveryCommitment, String carrier, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'shipment' is set
        if (shipment == null) {
            throw new ApiException("Missing the required parameter 'shipment' when calling rateParcel(Async)");
        }
        

        okhttp3.Call localVarCall = rateParcelCall(shipment, xPBUnifiedErrorStructure, xPBShipperRatePlan, xPBIntegratorCarrierId, xPBShipperCarrierAccountId, includeDeliveryCommitment, carrier, _callback);
        return localVarCall;

    }

    /**
     * Use this operation to rate a parcel before you print and purchase a shipment label. You can rate a parcel for multiple services and multiple parcel types with a single API request.
     * 
     * @param shipment Shipment request for Rates (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @param xPBShipperRatePlan USPS Only. Shipper rate plan, if applicable. For more information, see [this FAQ](https://shipping.pitneybowes.com/faqs/rates.html#rate-plans-faq) (optional)
     * @param xPBIntegratorCarrierId USPS Only. Negotiated services rate, if applicable. (optional)
     * @param xPBShipperCarrierAccountId UPS (United Parcel Service) Only. The unique identifier returned in the shipperCarrierAccountId field by the [Register an Existing Carrier Account](https://shipping.pitneybowes.com/api/post-carrier-accounts-register.html) API. (optional)
     * @param includeDeliveryCommitment When set to true, returns estimated transit time in days. (optional)
     * @param carrier Cross-Border only. Required for PB Cross-Border. Set this to PBI. (optional)
     * @return Shipment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public Shipment rateParcel(Shipment shipment, Boolean xPBUnifiedErrorStructure, String xPBShipperRatePlan, String xPBIntegratorCarrierId, String xPBShipperCarrierAccountId, Boolean includeDeliveryCommitment, String carrier) throws ApiException {
        ApiResponse<Shipment> localVarResp = rateParcelWithHttpInfo(shipment, xPBUnifiedErrorStructure, xPBShipperRatePlan, xPBIntegratorCarrierId, xPBShipperCarrierAccountId, includeDeliveryCommitment, carrier);
        return localVarResp.getData();
    }

    /**
     * Use this operation to rate a parcel before you print and purchase a shipment label. You can rate a parcel for multiple services and multiple parcel types with a single API request.
     * 
     * @param shipment Shipment request for Rates (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @param xPBShipperRatePlan USPS Only. Shipper rate plan, if applicable. For more information, see [this FAQ](https://shipping.pitneybowes.com/faqs/rates.html#rate-plans-faq) (optional)
     * @param xPBIntegratorCarrierId USPS Only. Negotiated services rate, if applicable. (optional)
     * @param xPBShipperCarrierAccountId UPS (United Parcel Service) Only. The unique identifier returned in the shipperCarrierAccountId field by the [Register an Existing Carrier Account](https://shipping.pitneybowes.com/api/post-carrier-accounts-register.html) API. (optional)
     * @param includeDeliveryCommitment When set to true, returns estimated transit time in days. (optional)
     * @param carrier Cross-Border only. Required for PB Cross-Border. Set this to PBI. (optional)
     * @return ApiResponse&lt;Shipment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Shipment> rateParcelWithHttpInfo(Shipment shipment, Boolean xPBUnifiedErrorStructure, String xPBShipperRatePlan, String xPBIntegratorCarrierId, String xPBShipperCarrierAccountId, Boolean includeDeliveryCommitment, String carrier) throws ApiException {
        okhttp3.Call localVarCall = rateParcelValidateBeforeCall(shipment, xPBUnifiedErrorStructure, xPBShipperRatePlan, xPBIntegratorCarrierId, xPBShipperCarrierAccountId, includeDeliveryCommitment, carrier, null);
        Type localVarReturnType = new TypeToken<Shipment>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Use this operation to rate a parcel before you print and purchase a shipment label. You can rate a parcel for multiple services and multiple parcel types with a single API request. (asynchronously)
     * 
     * @param shipment Shipment request for Rates (required)
     * @param xPBUnifiedErrorStructure Set this to true to use the standard [error object](https://shipping.pitneybowes.com/reference/error-object.html#standard-error-object) if an error occurs. (optional, default to true)
     * @param xPBShipperRatePlan USPS Only. Shipper rate plan, if applicable. For more information, see [this FAQ](https://shipping.pitneybowes.com/faqs/rates.html#rate-plans-faq) (optional)
     * @param xPBIntegratorCarrierId USPS Only. Negotiated services rate, if applicable. (optional)
     * @param xPBShipperCarrierAccountId UPS (United Parcel Service) Only. The unique identifier returned in the shipperCarrierAccountId field by the [Register an Existing Carrier Account](https://shipping.pitneybowes.com/api/post-carrier-accounts-register.html) API. (optional)
     * @param includeDeliveryCommitment When set to true, returns estimated transit time in days. (optional)
     * @param carrier Cross-Border only. Required for PB Cross-Border. Set this to PBI. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call rateParcelAsync(Shipment shipment, Boolean xPBUnifiedErrorStructure, String xPBShipperRatePlan, String xPBIntegratorCarrierId, String xPBShipperCarrierAccountId, Boolean includeDeliveryCommitment, String carrier, final ApiCallback<Shipment> _callback) throws ApiException {

        okhttp3.Call localVarCall = rateParcelValidateBeforeCall(shipment, xPBUnifiedErrorStructure, xPBShipperRatePlan, xPBIntegratorCarrierId, xPBShipperCarrierAccountId, includeDeliveryCommitment, carrier, _callback);
        Type localVarReturnType = new TypeToken<Shipment>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}