package com.example.myapplication;

public class Algorithm {


    public Algorithm() {
    }


    public static boolean isHappyTicket(int x) {
        int s1 =0, s2 = 0;
        for(int i = 0; i < 3; i++) {
            s1 += x % 10;
            x = x / 10;
            s2 += x % 10;
            x = x / 10;
        }
        if (s1 == s2)
            return true;
        else
            return false;
    }


    public int nextHappyTicketV1(String input) {
        int inputInt = Integer.parseInt(input);

        if(!isHappyTicket(Integer.parseInt(Integer.toString(inputInt)))) {
            while (!isHappyTicket(Integer.parseInt(Integer.toString(inputInt)))) {
                inputInt = inputInt + 1;
            }
            return inputInt;
        } else {
            return inputInt;
        }
    }



}