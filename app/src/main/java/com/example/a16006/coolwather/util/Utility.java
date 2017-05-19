package com.example.a16006.coolwather.util;

import android.text.TextUtils;

import com.example.a16006.coolwather.db.City;
import com.example.a16006.coolwather.db.County;
import com.example.a16006.coolwather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by 16006 on 2017/5/8.
 */

public class Utility {
    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){

            try {
                JSONArray allProvince = null;
                allProvince = new JSONArray(response);
                for(int i=0;i<allProvince.length();i++){
                    JSONObject provinceObject=allProvince.getJSONObject(i);
                    Province province=new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
            }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    public static boolean handleCityResponse(String response,int provinceId){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allCities=new JSONArray(response);
                for(int i=0;i<allCities.length();i++){
                    JSONObject cityobject=allCities.getJSONObject(i);
                    City city=new City();
                    city.setCityName(cityobject.getString("name"));
                    city.setCityCode(cityobject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    public static boolean handleCountyResponse(String response,int cityId){
        if(!TextUtils.isEmpty(response)) try {
            JSONArray allCounties = new JSONArray(response);
            for(int i=0;i<allCounties.length();i++){
                JSONObject countObject=allCounties.getJSONObject(i);
                County county=new County();
                county.setCountyName(countObject.getString("name"));
                county.setWeatherId(countObject.getString("weather_id"));
                county.setCityId(cityId);
                county.save();
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }
}
