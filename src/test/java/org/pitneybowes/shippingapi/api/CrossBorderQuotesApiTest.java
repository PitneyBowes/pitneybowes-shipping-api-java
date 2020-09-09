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

import org.pitneybowes.shippingapi.ApiException;
import org.pitneybowes.shippingapi.model.CrossBorderQuotesErrors;
import org.pitneybowes.shippingapi.model.CrossBorderQuotesRequest;
import org.pitneybowes.shippingapi.model.CrossBorderQuotesResponse;
import org.pitneybowes.shippingapi.model.Manifest;
import org.pitneybowes.shippingapi.model.ParcelProtectionPolicyResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CrossBorderQuotesApi
 */
@Ignore
public class CrossBorderQuotesApiTest {

    private final CrossBorderQuotesApi api = new CrossBorderQuotesApi();

    
    /**
     * Cross-Border Quotes
     *
     * This operation provides an estimate of the duties, taxes, and transportation costs for the items in a buyer&#39;s online shopping basket. The API calculates how many separate parcels are required to ship the items and estimates costs. The API checks each item&#39;s eligibility to clear customs and returns the quote for eligible items. To look for futher info please look into [Cross-Border Quotes](https://shipping.pitneybowes.com/api/post-quotes.html#)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCrossBorderQuotesTest() throws ApiException {
        CrossBorderQuotesRequest crossBorderQuotesRequest = null;
        Boolean xPBUnifiedErrorStructure = null;
        CrossBorderQuotesResponse response = api.getCrossBorderQuotes(crossBorderQuotesRequest, xPBUnifiedErrorStructure);

        // TODO: test validations
    }
    
    /**
     * Predicts the HS Code for a parcel
     *
     * This operation predicts the HS Code for a parcel being shipped internationally and gives the level of confidence in the prediction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void predictedHSCodeTest() throws ApiException {
        String xPBTransactionId = null;
        Manifest manifest = null;
        Boolean xPBUnifiedErrorStructure = null;
        ParcelProtectionPolicyResponse response = api.predictedHSCode(xPBTransactionId, manifest, xPBUnifiedErrorStructure);

        // TODO: test validations
    }
    
}