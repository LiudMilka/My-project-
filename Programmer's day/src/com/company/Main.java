package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
        String data = "A1";
        char letter = 'A';

        try {
            Integer data2 = Integer.valueOf(data);
            System.out.println(data2);
        } catch (NumberFormatException e) {
            System.err.println("Error");
        }

        char [] myCharArray = data.toCharArray();
        System.out.println(myCharArray);

        int data1 = Character.getNumericValue(letter);
        System.out.println(data1);
    }
}
