package com.bac.bai2;

public class ChuanHoa {
    private String s;

    public ChuanHoa(String s){
        this.s = s;
    }

    public String chuyenDoi(){
        String s1 = s.replace("-+","-");
        s1 = s1.replace("+-","-");
        s1 = s1.replace("--","-0-");
        s1 = s1.replace("++","+0+");
        return s1;
    }
    // 3+4-5-6+9+1-0-4-23-10
    public int tinhTong(){
        String s1 = this.chuyenDoi();
        System.out.println(s1);
        int index1 = s1.indexOf("-");
        int index2 = s1.indexOf("+");
        int index = 0, tong = 0;
        String tmp;
        char dau;
        if(index1!=-1&&index2!=-1)  {
            if(index1>index2) {
                index = index2;
                dau = '+';
            }
            else {
                index = index1;
                dau = '-';
            }
        }
        else {
            if(index1!=-1) dau = '-';
            else dau = '+';
        }

        if(dau=='+') {
            tmp = s1.substring(0,index);
            tong+=Integer.parseInt(tmp);
        }
        else {
            tmp = s1.substring(0,index);
            tong-=Integer.parseInt(tmp);
        }

        System.out.println("tong:"+tong);
        System.out.println("index :"+index);
        while (index!=-1) {
            System.out.println(index + "====================");
            index1 = s1.indexOf("-", index + 1);
            index2 = s1.indexOf("+", index + 1);

            if(index1!=-1&&index2!=-1)  {
                if(index1>index2) {
                    dau = '+';
                }
                else {
                    dau = '-';
                }
            }
            else if(index1!=-1||index2!=-1){
                if(index1!=-1) dau = '-';
                else dau = '+';
            }

            else index = -1;

            System.out.println(tmp+"==="+tong);

            if(dau=='+') {
                tmp = s1.substring(index+1,index2);
                tong+=Integer.parseInt(tmp);
                index = index2;
            }
            else {
                tmp = s1.substring(index+1,index1);
                tong-=Integer.parseInt(tmp);
                index = index1;
            }

        }
        return tong;
    }
}

