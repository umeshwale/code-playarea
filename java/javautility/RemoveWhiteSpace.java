package javautility;

import java.util.Arrays;

public class RemoveWhiteSpace {

    public static void main(String[] args) {
        String text = "I want to remove whitespace";
        String[] splitText = text.split(" ");
        String formatedText = "";
        for (String s : splitText) {
            formatedText = formatedText + s;
        }
        System.out.println("Text to format: "+text);
        System.out.println("Removed whitespace formated text: " + formatedText);
    }
}
