package com.multidinamika.javastandard;

import com.multidinamika.javastandard.object.Answer;
import com.multidinamika.javastandard.object.Soal;

public class NumberOne {
    public static void main(String[] args) {
        var soal = Soal.instance();
        System.out.println("---PALINDROME---\n");
        soal.NumberSatu().stream().map(NumberOne::get).forEach(System.out::println);
    }

    public static String get(String s){
        var palindrome = Answer.instance();
        return "'"+s+"' is Palindrom? "+palindrome.isPalindrom(s);
    }
}
