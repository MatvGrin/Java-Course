package com.info.base.data_types.practice;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int seconds = scanner.nextInt();
            int hour = seconds / 3600 % 24;
            int minute0 =  (seconds / 60 % 60) / 10;
            int minute1 = (seconds / 60 % 60) % 10;
            int second0 =  (seconds % 60) / 10;
            int second1 = (seconds % 60) % 10;
            System.out.println(hour+":"+minute0+minute1+":"+second0+second1);
    }
}
