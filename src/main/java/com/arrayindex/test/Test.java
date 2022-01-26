package com.arrayindex.test;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Test code
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("Please enter string : ");
        Scanner in = new Scanner(System.in);
        System.out.println(revString(in.next()));
    }

    static String revString(String givenString) {
        String rev = IntStream.iterate(givenString.length() - 1, i -> i >= 0, i -> i - 1).
                mapToObj(i -> String.valueOf(givenString.charAt(i))).
                collect(Collectors.joining());
        return rev;
    }

}
