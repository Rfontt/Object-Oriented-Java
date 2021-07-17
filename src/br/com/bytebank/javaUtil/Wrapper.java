package br.com.bytebank.javaUtil;

import java.util.ArrayList;
import java.util.List;

public class Wrapper {
    public static void main(String[] args) {
        int[] ages = new int[9];
        var numberOne  = "1";

        Integer stringForNumber = Integer.valueOf(numberOne);

        System.out.println(stringForNumber);

        List<Integer> numbers = new ArrayList<Integer>();

        for (int i=0; i < ages.length; i++) {
            ages[i] = i;

            numbers.add(ages[i]);
        }

        System.out.println(numbers.get(ages[0]));

    }
}
