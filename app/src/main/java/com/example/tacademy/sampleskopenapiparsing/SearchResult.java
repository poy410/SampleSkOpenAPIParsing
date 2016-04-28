package com.example.tacademy.sampleskopenapiparsing;

import org.json.JSONObject;

/**
 * Created by Tacademy on 2016-04-28.
 */
public class SearchResult {
    public ProductSearchResponse productSearchResponse;
    public SearchResult(JSONObject jsonObject)
    {
        productSearchResponse=new ProductSearchResponse(jsonObject.optJSONObject("ProductSearchResponse"));
    }
}
