package com.nanos.snakeandladder.entity.game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Movers {
    private int moverId;
    private int start;
    private int end;

}
