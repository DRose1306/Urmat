package _2023_12_13;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        //- Написать функцию, которая проверяет, являются ли две строки анаграммами друг друга.
        System.out.println("Введите String1");
        String str1 = new Scanner(System.in).nextLine();
        System.out.println("Введите String2");
        String str2 = new Scanner(System.in).nextLine();
        if (areAnagrams(str1, str2)){
            System.out.println("Строки являются анаграммами");
        }else {
            System.out.println("Строки не являются анаграммами");

        }

    }
    public static boolean areAnagrams(String str1, String str2){
        byte[] arr1 = str1.getBytes(StandardCharsets.UTF_8);
        byte[] arr2 = str2.getBytes(StandardCharsets.UTF_8);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String a = new String(arr1);
        String b = new String(arr2);
        if (a.equals(b)){
            return true;
        }
        return false;
    }
}
