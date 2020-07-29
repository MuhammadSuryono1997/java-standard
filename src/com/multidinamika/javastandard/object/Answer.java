package com.multidinamika.javastandard.object;

import java.util.Scanner;

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
}
