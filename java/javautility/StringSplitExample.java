package javautility;

/*
    The string split() method breaks a given string around matches of the given regular expression.
        limit > 0 : If this is the case then the pattern will be
        applied at most limit-1 times, the resulting
        array’s length will not be more than n, and
        the resulting array’s last entry will contain
        all input beyond the last matched pattern.

        limit < 0 : In this case, the pattern will be applied as
        many times as possible, and the resulting
        array can be of any size.

        limit = 0 : In this case, the pattern will be applied as
        many times as possible, the resulting array can
        be of any size, and trailing empty strings will
        be discarded.

        Let the string to be splitted be : geekss@for@geekss

        Regex       Limit             Result
        @           2         {“geekss”, ”for@geekss”}
        @           5         {“geekss”, ”for”, ”geekss”}
        @           -2       {“geekss”, ”for”, ”geekss”}
 */

public class StringSplitExample {
    public static void main(String[] args) {
        String splitString = "employee@org@country@city";
        String[] strings = splitString.split("@");
        for (String a: strings) {
            System.out.println(a);   // employee   org    country   city
        }


        String[] anotherstrings = splitString.split("@", 2);
        for (String a: anotherstrings) {
            System.out.println(a); // employee   org@country@city
        }

        anotherstrings = splitString.split("@", 3);
        for (String a: anotherstrings) {
            System.out.println(a); // employee   org    country@city
        }

        anotherstrings = splitString.split("@", -1);
        for (String a: anotherstrings) {
            System.out.println(a); // employee   org    country  city
        }
    }
}
