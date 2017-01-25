package com.company;

/**
 * Created by Shane on 1/25/2017.
 */
public class HexToTriplet {
    public HexToTriplet(String n) {
        num_let = n;
    }

    public int HextoTriplet() {
        if(num_let.equals("A")) {
            num = 10;
            return num;
        }
        else if(num_let.equals("B")) {
            num = 11;
            return num;
        }
        else if(num_let.equals("C")) {
            num = 12;
            return num;
        }
        else if(num_let.equals("D")) {
            num = 13;
            return num;
        }
        else if(num_let.equals("E")) {
            num = 14;
            return num;
        }
        else if(num_let.equals("F")) {
            num = 15;
            return num;
        }
        int number = Integer.parseInt(num_let);
        return number;
    }

    public String num_let;
    public int num;
}
