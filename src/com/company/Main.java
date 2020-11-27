package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"I", "want", "sleeeep", "heh"};
        Integer[] integers = {1, 2, 3, 4};

        Array<String> stringMyArray = new Array<>(strings);
        Array<Integer> integerMyArray = new Array<>(integers);

        System.out.println(Arrays.toString(stringMyArray.getArray()));
        System.out.println(Arrays.toString(integerMyArray.getArray()));

        int ind = 1;
        try {
            System.out.println("Элемент массива по индексу " + ind + ": " + stringMyArray.at(ind));
        }
        catch (MassByIndex e) {
            System.out.println(e.getMessage());
        }

        ind = -1;
        try {
            System.out.println("Элемент массива по индексу " + ind + ": " + stringMyArray.at(ind));
        }
        catch (MassByIndex e) {
            System.out.println(e.getMessage());
        }

        ind = 10;
        try {
            System.out.println("Элемент массива по индексу " + ind + ": " + stringMyArray.at(ind));
        }
        catch (MassByIndex e) {
            System.out.println(e.getMessage());
        }
    }
}

