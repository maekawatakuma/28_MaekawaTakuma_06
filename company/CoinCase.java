package com.company;

public class CoinCase {

    public int yen;
    public int mount;

    public CoinCase(int input_yen, int input_mount) {
        yen = input_yen;
        mount = input_mount;
    }
    public void say(){
        System.out.print(yen +"円は" + mount +"枚"  );
    }
}


