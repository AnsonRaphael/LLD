package com.nanos.snakeandladder.entity.user;

import com.nanos.snakeandladder.entity.game.Dice;

public class Computer extends Player{
    public int rollDice(Dice dice) {
        //Thread.sleep(100);
        return dice.roll();
    }
}
