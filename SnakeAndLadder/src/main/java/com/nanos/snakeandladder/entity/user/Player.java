package com.nanos.snakeandladder.entity.user;

import com.nanos.snakeandladder.entity.game.Dice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.InputStream;
import java.util.Scanner;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Player extends User{
    private boolean isWinner;
    private int currentPos;

    public int rollDice(Dice dice) {
        Scanner sc = new Scanner(java.lang.System.in);
//        while (!sc.nextLine().equals("y")){
//
//        }
        return dice.roll();
    }
    // add associated functionalities of player

}
