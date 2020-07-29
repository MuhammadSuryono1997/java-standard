package com.multidinamika.javastandard;

import com.multidinamika.javastandard.model.Model;
import com.multidinamika.javastandard.object.Answer;
import com.multidinamika.javastandard.object.Soal;

import java.io.IOException;

public class NumberFive {
    public static void main(String[] args) throws IOException {
        var soal = Soal.instance();
        var answer = Answer.instance();
        var model = Model.instance();
        answer.convertCsv(soal.NumberLima());
    }

}