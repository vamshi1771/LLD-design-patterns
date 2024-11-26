package org.example.snakeAndLadder;

import lombok.Data;

import java.util.Map;
@Data
public class snakeBoard {
    private Map<Integer,Integer> snakes;
    private Map<Integer,Integer> ladders;

    snakeBoard(Map<Integer,Integer> snakes, Map<Integer,Integer> ladders){
        this.ladders = ladders;
        this.snakes = snakes;
    }
}
