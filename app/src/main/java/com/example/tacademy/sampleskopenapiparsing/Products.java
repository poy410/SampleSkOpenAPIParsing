package com.example.tacademy.sampleskopenapiparsing;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Tacademy on 2016-04-28.
 */
public class Products {
    int TotalCount;
    public ArrayList<Product> product=new ArrayList<>();
    public Products(JSONObject jsonObject){
        TotalCount=jsonObject.optInt("TotalCount");
        JSONArray jsonArray = jsonObject.optJSONArray("Product");
        for(int i=0; i<jsonArray.length(); i++)
        {
            JSONObject jsonObject1=jsonArray.optJSONObject(i);
            product.add(new Product(jsonObject1));
        }
    }

}
