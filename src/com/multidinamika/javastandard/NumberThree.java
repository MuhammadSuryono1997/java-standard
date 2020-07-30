package com.multidinamika.javastandard;

import com.multidinamika.javastandard.model.Model;
import com.multidinamika.javastandard.object.Soal;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.*;


public class NumberThree {
//    public static model = Model.instance();
    public static void main(String[] args) throws Exception {
        var soal = Soal.instance();
        var data = soal.NumberTiga();
        data.forEach(s -> parseObject( (JSONObject) s));
    }

    private static void parseObject(JSONObject s) {
        var model = Model.instance();
        String created = (String) s.get("created_at");
        String orderId = (String) s.get("order_id");
        JSONObject customer = (JSONObject) s.get("customer");
        JSONArray items = (JSONArray) s.get("items");
        Map newItems = new HashMap<String, Object>();
        for (Object ite:items){
            JSONObject data = (JSONObject) ite;
//            var newItems = new Model.ItemModel((int) data.get("id"), (
//                    String) data.get("name"),
////                    (int) data.get("qty"),
//                    (int) data.get("price"));
            newItems.put("id", data.get("id"));
            newItems.put("name", data.get("name"));
            newItems.put("qty",data.get("qty"));
            newItems.put("price", data.get("price"));
        }

//        System.out.println(customer.get("id"));
//        System.out.println(customer.get("id").getClass().getTypeName());
         new Model.PurchaseModel(orderId,created,
                 (Model.CustomerModel) new Model.CustomerModel((int) customer.get("id"), (String)customer.get("name")),
                 (List<Model.ItemModel>) new Model.ItemModel((int) newItems.get("id"), (String) newItems.get("name"), (int) newItems.get("qty"), (int) newItems.get("price"))
         );
    }
}
