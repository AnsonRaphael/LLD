package com.nanos.snakeandladder.entity.game;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Snake extends Movers {

    public Snake(int moverId, int start, int end) {
        super(moverId, start, end);
    }
}
