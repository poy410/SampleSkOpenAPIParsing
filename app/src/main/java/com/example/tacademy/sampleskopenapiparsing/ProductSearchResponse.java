package com.example.tacademy.sampleskopenapiparsing;

import org.json.JSONObject;

/**
 * Created by Tacademy on 2016-04-28.
 */
public class ProductSearchResponse {
    public Request request;
    public Products products;

    public ProductSearchResponse(JSONObject jsonObject) {
        request =new Request(jsonObject.optJSONObject( "Request"));
        products=new Products(jsonObject.optJSONObject( "Products"));
    }
}
