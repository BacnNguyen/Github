package com.bac.bai1;

import java.util.StringTokenizer;

public class MyString {
    private String stringValue;

    public MyString(String stringValue) {
        this.stringValue = stringValue;
    }

    public int tinhTong(){
        int tong = 0;
        for (int i = 0; i <stringValue.length() ; i++) {
            if(stringValue.charAt(i)>='0'&&stringValue.charAt(i)<='9') {
                tong+=stringValue.charAt(i)-48;
//                System.out.println(stringValue.charAt(i)-48);
            }
        }
        return tong;
    }

    public int tinhTong2(){
        int tong = 0;
        int from= 0,to=0;
        int dem = 0;
        for (int i = 0; i <stringValue.length() ; i++) {
            char c = stringValue.charAt(i);
//            System.out.println(c);
            if(c>='0'&&c<='9') {
                if(dem==0) from = i;
                dem++;
            }
            else {
                to = i;
                if(dem>0){
                    String s = stringValue.substring(from,to);
//                    System.out.println(s);
                    tong+=Integer.parseInt(s);
                    dem = 0;
                }
            }

        }
        return tong;
    }


    public boolean checkDoiXung(){
        StringBuilder stringBuilder = new StringBuilder(stringValue);
        String s = stringBuilder.reverse().toString();
        if(s.equals(stringValue)) return true;
        else return false;
    }

}
