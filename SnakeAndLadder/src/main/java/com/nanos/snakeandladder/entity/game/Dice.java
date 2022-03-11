package com.nanos.snakeandladder.entity.game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dice {
    private int diceId;
    private int miniValue=1;
    private int maxValue=6;

    public int roll(){
        int rolledValue=miniValue-1+ (int) Math.ceil(Math.random()*(maxValue-miniValue+1));

        return rolledValue ;
    }


}
