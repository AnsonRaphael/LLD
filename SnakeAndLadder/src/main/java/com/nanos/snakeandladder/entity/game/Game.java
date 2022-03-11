package com.nanos.snakeandladder.entity.game;

import com.nanos.snakeandladder.entity.user.Player;
import lombok.Data;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Data

public class Game {
    private int gameId;
    private List<Player> players;
    private List<Movers> movers;
    private Board board;
    private Dice dice;
    private boolean isGameOver;
    private Player winner;
    private HashMap<Integer,Integer> moverToMap = new HashMap<>();
    private Queue<Player> playersQueue= new LinkedList<>();

    public Game(int gameId, List<Player> players, List<Movers> movers, Board board, Dice dice) {
        this.gameId = gameId;
        this.players = players;
        this.movers = movers;
        this.board = board;
        this.dice = dice;
    }

    // using constructor we set all components and players in the game
    public void init(){
        for (int i = 0; i < movers.size(); i++) {
            moverToMap.put(movers.get(i).getStart(),movers.get(i).getEnd());
        }
        for (int i = 0; i < players.size(); i++) {
            playersQueue.offer(players.get(i));
        }
    }
    public void reset(){
        for (int i = 0; i < players.size(); i++) {
            players.get(i).setWinner(false);
            players.get(i).setCurrentPos(0);
        }
        this.winner=null;
        this.isGameOver=false;
    }

    public void startGame(){
        reset();
        init();
        while (!isGameOver&&!playersQueue.isEmpty()){
            Player player = playersQueue.poll();
            int rollValue=player.rollDice(dice);
            int curPos=player.getCurrentPos();
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println(player.getUserName()+" curr value "+curPos);
            System.out.println(player.getUserName()+" rolled value "+rollValue);
            if(curPos+rollValue==board.getSize()){
                player.setCurrentPos(rollValue+curPos);
                player.setWinner(true);
                this.isGameOver=true;
                this.winner=player;
            }
            if(curPos+rollValue>board.getSize()){
                playersQueue.offer(player);
                continue;
            }
            if(moverToMap.containsKey(curPos+rollValue)){
                System.out.println(player.getUserName()+" Mover found value "+moverToMap.get(curPos+rollValue));
                player.setCurrentPos(moverToMap.get(curPos+rollValue));

            }else {
                player.setCurrentPos(rollValue+curPos);
            }
            playersQueue.offer(player);
        }

    }

    public void display(){
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i).getUserName()+" pos "+players.get(i).getCurrentPos());
        }
        System.out.println("-----------------------------------------------------------------");
    }
}
