package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.TreeMap;

public class CountingCharacters2 {

    public static void main(String[] args) {
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has" +
                " to be zero to start with. So if you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done " +
                "that, it’s pretty straightforward from there.";

        char[] charactersInString = myString.toCharArray();

        HashMap<Character, Integer> charCountTreeMap = new HashMap<>();

        for (char character : charactersInString)

        {
         charCountTreeMap.merge(character, 1, Integer::sum);
        }
    charCountTreeMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
