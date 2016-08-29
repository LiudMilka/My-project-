package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
        char letter = 'H';
        int nomber = 7;

        int data1 = Character.getNumericValue(letter);
        int sum = data1 + nomber;

        if (sum % 2 == 1) {
            System.out.println("black");
        } else System.out.println("white");
    }
}
