package com.company;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Collections.sort(intList);
        for (int e: intList){
            if (e>0 && e%2==0){
                System.out.println(e);
            }
        }
    }
}
