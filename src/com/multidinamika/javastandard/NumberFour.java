package com.multidinamika.javastandard;

import com.multidinamika.javastandard.object.Soal;
import org.json.simple.JSONObject;

import java.util.*;

public class NumberFour {
    public static void main(String[] args) throws Exception {
        var soal = Soal.instance();
        System.out.println(soal.NumberEmpat().stream().map(NumberFour::parseToObject));

    }

    private static Object parseToObject(Object o) {
        JSONObject data = (JSONObject) o;
        Map newData = new HashMap<String, Object>();
        long harga = (long) data.get("price");
        if (harga == 180)
        {
            newData.put("harga",harga);
        }
        return newData;
    }
}
