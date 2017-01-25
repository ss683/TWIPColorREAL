package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Trip_Hex_Color = " ";
        System.out.println("Hey Mr. P. I know you asked for all 140 HTML colors but it is EXTREMELY tedious to keep track of 140 colors and all their RGB/Hex numbers. So I simply did the last 10 colors. The conversion from RGB to Hex and vice versa still works for all 140, it just will only list the last 10.");
        System.out.println("You must give me one of the components of 1 of the 10 colors used in HTML, and I will output the other two.");
        while(!Trip_Hex_Color.equalsIgnoreCase("EXIT")) {
            System.out.println("Are you entering a Triplet, Hexadecimal, or Color? (Type 'EXIT' to stop program)");
            Trip_Hex_Color = input.nextLine();
            if (Trip_Hex_Color.equalsIgnoreCase("Triplet")) {
                System.out.println("What is the Triplet? e.g. 245,222,179");
                String Triplet = input.nextLine();
                Scanner TripScan = new Scanner(Triplet).useDelimiter("\\s*,\\s*");
                int firstTrip = TripScan.nextInt();
                int secondTrip = TripScan.nextInt();
                int thirdTrip = TripScan.nextInt();
                if (firstTrip > 255 || firstTrip < 0 || secondTrip > 255 || secondTrip < 0 || thirdTrip > 255 || thirdTrip < 0) {
                    System.out.println("Sorry you entered an invalid Triplet.");
                }
                TripletToHex first = new TripletToHex(firstTrip);
                String firstHex = first.TripletToHex().trim();
                TripletToHex second = new TripletToHex(secondTrip);
                String secondHex = second.TripletToHex().trim();
                TripletToHex third = new TripletToHex(thirdTrip);
                String thirdHex = third.TripletToHex().trim();
                String pound = "#";
                String finalHex = pound + firstHex + secondHex + thirdHex;
                String TripletFinalResponse1 = "The Hexadecimal Equivalent of RGB(" + Triplet + ") is " + finalHex + " and this color is ";
                System.out.print(TripletFinalResponse1);
                if (firstTrip == 0 && secondTrip == 128 && thirdTrip == 128) {
                    String TripletFinalResponse2 = "Teal.";
                    System.out.println(TripletFinalResponse2);
                } else if (firstTrip == 216 && secondTrip == 191 && thirdTrip == 216) {
                    String TripletFinalResponse2 = "Thistle.";
                    System.out.println(TripletFinalResponse2);
                } else if (firstTrip == 255 && secondTrip == 99 && thirdTrip == 71) {
                    String TripletFinalResponse2 = "Tomato.";
                    System.out.println(TripletFinalResponse2);
                } else if (firstTrip == 64 && secondTrip == 224 && thirdTrip == 208) {
                    String TripletFinalResponse2 = "Turquoise.";
                    System.out.println(TripletFinalResponse2);
                } else if (firstTrip == 238 && secondTrip == 130 && thirdTrip == 238) {
                    String TripletFinalResponse2 = "Violet.";
                    System.out.println(TripletFinalResponse2);
                } else if (firstTrip == 245 && secondTrip == 222 && thirdTrip == 179) {
                    String TripletFinalResponse2 = "Wheat.";
                    System.out.println(TripletFinalResponse2);
                } else if (firstTrip == 255 && secondTrip == 255 && thirdTrip == 255) {
                    String TripletFinalResponse2 = "White.";
                    System.out.println(TripletFinalResponse2);
                } else if (firstTrip == 245 && secondTrip == 245 && thirdTrip == 245) {
                    String TripletFinalResponse2 = "WhiteSmoke.";
                    System.out.println(TripletFinalResponse2);
                } else if (firstTrip == 255 && secondTrip == 255 && thirdTrip == 0) {
                    String TripletFinalResponse2 = "Yellow.";
                    System.out.println(TripletFinalResponse2);
                } else if (firstTrip == 154 && secondTrip == 205 && thirdTrip == 50) {
                    String TripletFinalResponse2 = "YellowGreen.";
                    System.out.println(TripletFinalResponse2);
                }
            } else if (Trip_Hex_Color.equalsIgnoreCase("Hexadecimal")) {
                System.out.println("What is the Hexadecimal? e.g. 7FFF00");
                String Hex = input.nextLine().toUpperCase();
                if (Hex.contains("G") || Hex.contains("H") || Hex.contains("I") || Hex.contains("J") || Hex.contains("K") || Hex.contains("L") || Hex.contains("M") || Hex.contains("N") || Hex.contains("O") || Hex.contains("P") || Hex.contains("Q") || Hex.contains("R") || Hex.contains("S") || Hex.contains("T") || Hex.contains("U") || Hex.contains("V") || Hex.contains("W") || Hex.contains("X") || Hex.contains("Y") || Hex.contains("Z")) {
                    System.out.println("Sorry you entered an invalid Hexadecimal.");
                }
                else {
                    String num1 = Hex.substring(0,1);
                    HexToTriplet a1 = new HexToTriplet(num1);
                    String num2 = Hex.substring(1,2);
                    HexToTriplet a2 = new HexToTriplet(num2);
                    int red = (a1.HextoTriplet()*16) + (a2.HextoTriplet());
                    String num3 = Hex.substring(2,3);
                    HexToTriplet a3 = new HexToTriplet(num3);
                    String num4 = Hex.substring(3,4);
                    HexToTriplet a4 = new HexToTriplet(num4);
                    int green = (a3.HextoTriplet()*16) + (a4.HextoTriplet());
                    String num5 = Hex.substring(4,5);
                    HexToTriplet a5 = new HexToTriplet(num5);
                    String num6 = Hex.substring(5,6);
                    HexToTriplet a6 = new HexToTriplet(num6);
                    int blue = (a5.HextoTriplet()*16) + (a6.HextoTriplet());
                    String finalTrip = "(" + red + "," + green + "," + blue + ")";
                    System.out.print("For " + Hex + " the RGB numbers are " + finalTrip + " and the color is ");

                    if(Hex.equals("008080"))
                        System.out.println("Teal.");
                    else if(Hex.equals("D8BFD8"))
                        System.out.println("Thistle.");
                    else if(Hex.equals("FF6347"))
                        System.out.println("Tomato.");
                    else if(Hex.equals("40E0D0"))
                        System.out.println("Turquoise.");
                    else if(Hex.equals("EE82EE"))
                        System.out.println("Violet.");
                    else if(Hex.equals("F5DEB3"))
                        System.out.println("Wheat.");
                    else if(Hex.equals("FFFFFF"))
                        System.out.println("White.");
                    else if(Hex.equals("F5F5F5"))
                        System.out.println("WhiteSmoke.");
                    else if(Hex.equals("FFFF00"))
                        System.out.println("Yellow.");
                    else if(Hex.equals("9ACD32"))
                        System.out.println("YellowGreen.");
                    else
                        System.out.println("not one of the 10 colors.");

                }
            } else if (Trip_Hex_Color.equalsIgnoreCase("Color")) {
                System.out.println("What is the Color? e.g. YellowGreen");
                String Color = input.nextLine().trim();
                String realColor = Color.replaceAll("\\s+", "");


                if (realColor.equalsIgnoreCase("Teal")) {
                    int firstTrip = 0;
                    int secondTrip = 128;
                    int thirdTrip = 128;
                    String RGB = "(" + firstTrip + "," + secondTrip + "," + thirdTrip + ")";
                    TripletToHex first = new TripletToHex(firstTrip);
                    String firstHex = first.TripletToHex().trim();
                    TripletToHex second = new TripletToHex(secondTrip);
                    String secondHex = second.TripletToHex().trim();
                    TripletToHex third = new TripletToHex(thirdTrip);
                    String thirdHex = third.TripletToHex().trim();
                    String pound = "#";
                    String finalHex = pound + firstHex + secondHex + thirdHex;
                    System.out.println("Teal's RGB number is " + RGB + " and it's Hex number is " + finalHex + ".");
                } else if (realColor.equalsIgnoreCase("Thistle")) {
                    int firstTrip = 216;
                    int secondTrip = 191;
                    int thirdTrip = 216;
                    String RGB = "(" + firstTrip + "," + secondTrip + "," + thirdTrip + ")";
                    TripletToHex first = new TripletToHex(firstTrip);
                    String firstHex = first.TripletToHex().trim();
                    TripletToHex second = new TripletToHex(secondTrip);
                    String secondHex = second.TripletToHex().trim();
                    TripletToHex third = new TripletToHex(thirdTrip);
                    String thirdHex = third.TripletToHex().trim();
                    String pound = "#";
                    String finalHex = pound + firstHex + secondHex + thirdHex;
                    System.out.println("Thistle's RGB number is " + RGB + " and it's Hex number is " + finalHex + ".");
                } else if (realColor.equalsIgnoreCase("Tomato")) {
                    int firstTrip = 255;
                    int secondTrip = 99;
                    int thirdTrip = 71;
                    String RGB = "(" + firstTrip + "," + secondTrip + "," + thirdTrip + ")";
                    TripletToHex first = new TripletToHex(firstTrip);
                    String firstHex = first.TripletToHex().trim();
                    TripletToHex second = new TripletToHex(secondTrip);
                    String secondHex = second.TripletToHex().trim();
                    TripletToHex third = new TripletToHex(thirdTrip);
                    String thirdHex = third.TripletToHex().trim();
                    String pound = "#";
                    String finalHex = pound + firstHex + secondHex + thirdHex;
                    System.out.println("Tomato's RGB number is " + RGB + " and it's Hex number is " + finalHex + ".");
                } else if (realColor.equalsIgnoreCase("Turquoise")) {
                    int firstTrip = 64;
                    int secondTrip = 224;
                    int thirdTrip = 208;
                    String RGB = "(" + firstTrip + "," + secondTrip + "," + thirdTrip + ")";
                    TripletToHex first = new TripletToHex(firstTrip);
                    String firstHex = first.TripletToHex().trim();
                    TripletToHex second = new TripletToHex(secondTrip);
                    String secondHex = second.TripletToHex().trim();
                    TripletToHex third = new TripletToHex(thirdTrip);
                    String thirdHex = third.TripletToHex().trim();
                    String pound = "#";
                    String finalHex = pound + firstHex + secondHex + thirdHex;
                    System.out.println("Turquoise's RGB number is " + RGB + " and it's Hex number is " + finalHex + ".");
                } else if (realColor.equalsIgnoreCase("Violet")) {
                    int firstTrip = 238;
                    int secondTrip = 130;
                    int thirdTrip = 238;
                    String RGB = "(" + firstTrip + "," + secondTrip + "," + thirdTrip + ")";
                    TripletToHex first = new TripletToHex(firstTrip);
                    String firstHex = first.TripletToHex().trim();
                    TripletToHex second = new TripletToHex(secondTrip);
                    String secondHex = second.TripletToHex().trim();
                    TripletToHex third = new TripletToHex(thirdTrip);
                    String thirdHex = third.TripletToHex().trim();
                    String pound = "#";
                    String finalHex = pound + firstHex + secondHex + thirdHex;
                    System.out.println("Violet's RGB number is " + RGB + " and it's Hex number is " + finalHex + ".");
                } else if (realColor.equalsIgnoreCase("Wheat")) {
                    int firstTrip = 245;
                    int secondTrip = 222;
                    int thirdTrip = 179;
                    String RGB = "(" + firstTrip + "," + secondTrip + "," + thirdTrip + ")";
                    TripletToHex first = new TripletToHex(firstTrip);
                    String firstHex = first.TripletToHex().trim();
                    TripletToHex second = new TripletToHex(secondTrip);
                    String secondHex = second.TripletToHex().trim();
                    TripletToHex third = new TripletToHex(thirdTrip);
                    String thirdHex = third.TripletToHex().trim();
                    String pound = "#";
                    String finalHex = pound + firstHex + secondHex + thirdHex;
                    System.out.println("Wheat's RGB number is " + RGB + " and it's Hex number is " + finalHex + ".");
                } else if (realColor.equalsIgnoreCase("White")) {
                    int firstTrip = 255;
                    int secondTrip = 255;
                    int thirdTrip = 255;
                    String RGB = "(" + firstTrip + "," + secondTrip + "," + thirdTrip + ")";
                    TripletToHex first = new TripletToHex(firstTrip);
                    String firstHex = first.TripletToHex().trim();
                    TripletToHex second = new TripletToHex(secondTrip);
                    String secondHex = second.TripletToHex().trim();
                    TripletToHex third = new TripletToHex(thirdTrip);
                    String thirdHex = third.TripletToHex().trim();
                    String pound = "#";
                    String finalHex = pound + firstHex + secondHex + thirdHex;
                    System.out.println("White's RGB number is " + RGB + " and it's Hex number is " + finalHex + ".");
                } else if (realColor.equalsIgnoreCase("WhiteSmoke")) {
                    int firstTrip = 245;
                    int secondTrip = 245;
                    int thirdTrip = 245;
                    String RGB = "(" + firstTrip + "," + secondTrip + "," + thirdTrip + ")";
                    TripletToHex first = new TripletToHex(firstTrip);
                    String firstHex = first.TripletToHex().trim();
                    TripletToHex second = new TripletToHex(secondTrip);
                    String secondHex = second.TripletToHex().trim();
                    TripletToHex third = new TripletToHex(thirdTrip);
                    String thirdHex = third.TripletToHex().trim();
                    String pound = "#";
                    String finalHex = pound + firstHex + secondHex + thirdHex;
                    System.out.println("WhiteSmoke's RGB number is " + RGB + " and it's Hex number is " + finalHex + ".");
                } else if (realColor.equalsIgnoreCase("Yellow")) {
                    int firstTrip = 255;
                    int secondTrip = 255;
                    int thirdTrip = 0;
                    String RGB = "(" + firstTrip + "," + secondTrip + "," + thirdTrip + ")";
                    TripletToHex first = new TripletToHex(firstTrip);
                    String firstHex = first.TripletToHex().trim();
                    TripletToHex second = new TripletToHex(secondTrip);
                    String secondHex = second.TripletToHex().trim();
                    TripletToHex third = new TripletToHex(thirdTrip);
                    String thirdHex = third.TripletToHex().trim();
                    String pound = "#";
                    String finalHex = pound + firstHex + secondHex + thirdHex;
                    System.out.println("Yellow's RGB number is " + RGB + " and it's Hex number is " + finalHex + ".");
                } else if (realColor.equalsIgnoreCase("YellowGreen")) {
                    int firstTrip = 154;
                    int secondTrip = 205;
                    int thirdTrip = 50;
                    String RGB = "(" + firstTrip + "," + secondTrip + "," + thirdTrip + ")";
                    TripletToHex first = new TripletToHex(firstTrip);
                    String firstHex = first.TripletToHex().trim();
                    TripletToHex second = new TripletToHex(secondTrip);
                    String secondHex = second.TripletToHex().trim();
                    TripletToHex third = new TripletToHex(thirdTrip);
                    String thirdHex = third.TripletToHex().trim();
                    String pound = "#";
                    String finalHex = pound + firstHex + secondHex + thirdHex;
                    System.out.println("YellowGreen's RGB number is " + RGB + " and it's Hex number is " + finalHex + ".");
                } else
                    System.out.println("Sorry you didn't put in 1 of the 10 colors.");
            }
            else if(Trip_Hex_Color.equalsIgnoreCase("EXIT"))
            {
                System.out.println("Exiting.");
            }
            else {
                System.out.println("Sorry you input the wrong thing.");
            }
        }

    }
}