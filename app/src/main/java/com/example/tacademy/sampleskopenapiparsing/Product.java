package com.example.tacademy.sampleskopenapiparsing;

import org.json.JSONObject;

/**
 * Created by Tacademy on 2016-04-28.
 */
public class Product {
    public int ProductCode;
    public String ProductName;
    public int ProductPrice;
    public String ProductImage;

    public Product(JSONObject jsonObject) {
        ProductCode = jsonObject.optInt("ProductCode");
        ProductName = jsonObject.optString("ProductName");
        ProductPrice = jsonObject.optInt("ProductPrice");
        ProductImage = jsonObject.optString("ProductImage");

    }

    @Override
    public String toString() {
        return ProductName;
    }
}
