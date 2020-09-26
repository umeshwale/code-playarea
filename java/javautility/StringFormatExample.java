package javautility;

public class StringFormatExample {

    /*
    The java string format() method returns a formatted string using the given locale, specified format string and arguments.
    We can concatenate the strings using this method and at the same time,
    we can format the output concatenated string.
     */

    public static void main(String[] args) {
        String str1 = "India";
        String str2 = "Bangalore";
        String strFormat = String.format("My country is %s and %s is city.", str1, str2);
        System.out.println(strFormat);
    }
}
