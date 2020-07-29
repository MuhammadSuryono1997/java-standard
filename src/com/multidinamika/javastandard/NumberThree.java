package com.multidinamika.javastandard;

import com.multidinamika.javastandard.model.Model;
import com.multidinamika.javastandard.object.Soal;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


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
        JSONObject jb= (JSONObject) items.get(0);


//         new Model.PurchaseModel(orderId,created,
//                new Model.CustomerModel((int)customer.get("id"), (String)customer.get("name")),
//            new Model.ItemModel((int) jb.get("id"), (String) jb.get("name"), (int) jb.get("qty"), (int) jb.get("price"))
//        );
    }
}
