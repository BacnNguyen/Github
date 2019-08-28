package com.bac.bai2;

public class Main {
    public static void main(String[] args) {
        ChuanHoa chuanHoa = new ChuanHoa("3+4-5-6+9+1--+4-+23-10");
        chuanHoa.chuyenDoi();
        System.out.println(chuanHoa.tinhTong());
    }
}
