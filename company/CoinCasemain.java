package com.company;

public class CoinCasemain {

    public static void main(String[] args){
        CoinCase coincase = new CoinCase(
                500,
                2
        );
        CoinCase coincase1 = new CoinCase(
                100,
                4
        );
        CoinCase coincase2 = new CoinCase(
                50,
                1
        );
        CoinCase coincase3 = new CoinCase(
                10,
                4
        );
        CoinCase coincase4 = new CoinCase(
                5,
                1
        );

        coincase.say();
        coincase1.say();
        coincase2.say();
        coincase3.say();
        coincase4.say();

    }
}
