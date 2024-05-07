package stringCollections;

import java.util.ArrayList;

public class StoreStrings {
    public static int count(ArrayList<String> words) { // corrected ArrayList type
        int lSize = 0; // initialized to 0
        for (String i : words) {
            lSize++;
        }
        return lSize;
    }

    public static boolean duplicateString(ArrayList<String> words) { // corrected ArrayList type
        boolean isDuplicateString = false; // corrected casing
        ArrayList<String> items = new ArrayList<>(); // corrected ArrayList declaration
        for (String word : words) {
            if (items.contains(word)) {
                isDuplicateString = true; // corrected to true
                break; // added break to exit loop once duplicate is found
            } else {
                items.add(word);
            }
        }
        return isDuplicateString;
    }
}
