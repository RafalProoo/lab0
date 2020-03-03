package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i <= value.length(); i++) {
            words.add(value.substring(i));
        }

        //return new ArrayList<>(value.length());

        return words;
    }

}
