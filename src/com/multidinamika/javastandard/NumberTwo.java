package com.multidinamika.javastandard;

import com.multidinamika.javastandard.object.Answer;
import com.multidinamika.javastandard.object.Soal;

import java.util.List;

public class NumberTwo {

    public static void main(String[] args) {
        var words = List.of("aku","ingin","la...");
        words.stream().map(NumberTwo::get).forEach(System.out::println);
    }

    public static String get(String s)
    {
        var answer = Answer.instance();
        var soal = Soal.instance();

        return answer.countWords(s, soal.NumberDua());
    }
}
