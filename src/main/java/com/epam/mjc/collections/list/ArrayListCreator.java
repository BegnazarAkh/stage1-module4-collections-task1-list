package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> duplicatedWords = new ArrayList<>();
        for (int i = 1; i <= sourceList.size(); i++) {
            String currentWord = sourceList.get(i - 1); // Adjust index to 0-based
            if (i % 3 == 0) {
                duplicatedWords.add(currentWord);
            }
        }
        return duplicatedWords;
    }
}

