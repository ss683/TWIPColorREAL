package com.company;

/**
 * Created by Shane on 1/24/2017.
 */
public class TripletToHex {
    public TripletToHex (int num)
    {
        TripNum = num;
    }
    public String TripletToHex()
    {
        if(TripNum == 0) {
            HexStringFinal = "00";
            return HexStringFinal;
        }
        else if(TripNum == 64) {
            HexStringFinal = "40";
            return HexStringFinal;
        }
        else if(TripNum == 224) {
            HexStringFinal = "E0";
            return HexStringFinal;
        }
        else if(TripNum == 208) {
            HexStringFinal = "D0";
            return HexStringFinal;
        }
        else if(TripNum == 128) {
            HexStringFinal = "80";
            return HexStringFinal;
        }
        else{
            while(true)
            {
                HexNum = Integer.toString(TripNum%16);
                if(HexNum.equals("10"))
                    HexNum = "A";
                else if(HexNum.equals("11"))
                    HexNum = "B";
                else if(HexNum.equals("12"))
                    HexNum = "C";
                else if(HexNum.equals("13"))
                    HexNum = "D";
                else if(HexNum.equals("14"))
                    HexNum = "E";
                else if(HexNum.equals("15"))
                    HexNum = "F";
                TripNum = TripNum/16;
                HexString = HexString + HexNum;
                if(HexNum.equals("0"))
                    break;
            }
            HexStringFinal = new StringBuilder(HexString).reverse().deleteCharAt(0).toString();
            return HexStringFinal;
        }
    }
    public int TripNum;
    public String HexNum = " ";
    public String HexString = " ";
    public String HexStringFinal = " ";

}