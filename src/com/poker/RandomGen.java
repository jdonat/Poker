package com.poker;

import java.util.Random;

public class RandomGen {

    public static int randInt(int max){
        Random random = new Random();
        return random.nextInt(max);
    }
}
