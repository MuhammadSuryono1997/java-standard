package com.multidinamika.javastandard.object;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.List;

public class Soal {
    private static Soal soal;

    public static Soal instance()
    {
        if (soal == null) soal = new Soal();
        return soal;
    }

    public List<String> NumberSatu()
    {
        List<String> listWord = List.of("ibu ratna antar ubi",
                "kasur ini rusak",
                "A nut for a jar of tuna.",
                "Borrow or rob?",
                "Was it a car or a cat I saw",
                "Yo, banana boy",
                "UFO tofu?");
        return listWord;
    }

    public String NumberDua()
    {
        var lyric = "Aku ingin begini\n" +
                "Aku ingin begitu\n" +
                "Ingin ini itu banyak sekali\n\n" +
                "Semua semua semua\n" +
                "Dapat dikabulkan\n" +
                "Dapat dikabulkan\n" +
                "Dengan kantong ajaib\n\n" +
                "Aku ingin terbang bebas\n" +
                "Di angkasa\n" +
                "Hei... baling baling bambu\n\n" +
                "La... la... la...\n" +
                "Aku sayang sekali Doraemon\n" +
                "La... la... la...\n" +
                "Aku sayang sekali";

        return lyric;
    }

    public JSONArray NumberTiga() throws Exception
    {
        Object obj = new JSONParser().parse(new FileReader("file/purchase.json"));
        JSONArray js = (JSONArray) obj;
        return js;
    }

    public JSONArray NumberEmpat() throws Exception
    {
        Object obj = new JSONParser().parse(new FileReader("file/items.json"));
        JSONArray js = (JSONArray) obj;
        return js;
    }

    public String NumberLima(){
        String path = "file/products.csv";
        return path;
    }
}
