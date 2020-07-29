package com.multidinamika.javastandard.object;

import com.multidinamika.javastandard.NumberFive;
import com.multidinamika.javastandard.model.Model;
import netscape.javascript.JSObject;
import org.json.simple.JSONObject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Answer {
    private static Answer jawaban;

    public static Answer instance(){
        if (jawaban == null) jawaban = new Answer();

        return jawaban;
    }

    public boolean isPalindrom(String str){
        String start = str.replaceAll("\\W","").toLowerCase();
        String reverse = new StringBuffer(start.toLowerCase()).reverse().toString();
        if (start.equals(reverse)) return true;
        else return false;
    }

    public String countWords(String word,String sentence){

        Scanner scanner = new Scanner(sentence.replaceAll("\\n", " ").toLowerCase());
        int wordcount = 0;
        while (scanner.hasNext()){
            if (scanner.next().equals(word)) wordcount++;
        }
        return "Sum word "+word+" is "+wordcount;
    }

    public List<Object> convertCsv(String path) throws IOException {
        Stream<String> stream = Files.lines(Paths.get(path));

        try {
            List<Object> csv = stream
                    .skip(1) // skip headers
                    .map(line -> line.split(","))
                    .map(Answer::apply)
                    .collect(Collectors.toList());
            this.generateJsonFile(csv.toString());
            return csv;
        } finally {
            stream.close();
        }
    }

    private static Object apply(String[] data) {
        Model.ShopModel shopModel = new Model.ShopModel(data[0],
                data[1],
                data[2]);
        return shopModel.toString();
    }

    public void generateJsonFile(String data){
        try {
            var output = new FileOutputStream("file/products.json");
            output.write(data.getBytes());
            output.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
