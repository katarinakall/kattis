package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            numbers.add(scanner.nextInt());
        }

        int ageDifference = numbers.get(0);
        int ritaCandles = numbers.get(1);
        int timCandles = numbers.get(2);
        int totalCandles = ritaCandles + timCandles;
        int timSum = 0;
        int ritaSum = 0;

        for (int i = 4; ; i++) {
            ritaSum += i;

            if (i - ageDifference >= 3) {
                timSum += i - ageDifference;
            }

            if (ritaSum + timSum == totalCandles) {
                System.out.println(ritaCandles - ritaSum);
                break;
            }

        scanner.close();
        }
    }
}

