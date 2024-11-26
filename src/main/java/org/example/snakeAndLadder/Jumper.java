package org.example.snakeAndLadder;

import lombok.Data;

import java.util.Map;
@Data
public class Jumper {
    private Map<Integer,Integer> snakes;
    private Map<Integer,Integer> ladders;
}
