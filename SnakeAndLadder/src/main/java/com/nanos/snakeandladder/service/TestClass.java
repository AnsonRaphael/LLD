package com.nanos.snakeandladder.service;

import com.nanos.snakeandladder.entity.game.*;
import com.nanos.snakeandladder.entity.user.Player;
import com.nanos.snakeandladder.entity.user.Computer;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        Game game = new Game(1,getPlayers(),getMovers(),getBoard(),getDice());
        game.startGame();
        System.out.println(game.getWinner());
    }

    public static Dice getDice(){
        Dice dice = new Dice(1,1,6);
        return dice;
    }
    public static Board getBoard(){
        Board board = new Board(1,100);
        return board;
    }
    public static List<Player> getPlayers(){
        Player player = new Player();
        player.setUserName("player1");
        Computer system = new Computer();
        system.setUserName("system");
        List<Player> players= new ArrayList<>();
        players.add(player);
        players.add(system);
        return players;
    }
    public static List<Movers> getMovers(){
        Snake snake = new Snake(1,1,44);
        Ladder ladder = new Ladder(2,33,3);
        Snake snake1 = new Snake(3,4,67);
        Ladder ladder1 = new Ladder(4,73,4);
        List<Movers> movers= new ArrayList<>();
        movers.add(snake);
        movers.add(ladder);
        movers.add(snake1);
        movers.add(ladder1);
        return movers;
    }
}
