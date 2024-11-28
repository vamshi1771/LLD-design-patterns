package org.example.SnakeAndLAdderGame.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class gameBoard {
    private static gameBoard instance;
    private int boardSize;
    private List<Snakes> snakes;
    private  List<Ladders> ladders;
    private Map<Integer,Integer> playerPositions;

    private gameBoard(int size){
        this.boardSize = size;
        this.ladders = new ArrayList<>();
        this.snakes = new ArrayList<>();
        this.playerPositions = new HashMap<>();
    }
    // singleton pattern
    public static gameBoard getInstance(int size){
        if(instance == null){
            synchronized (gameBoard.class){
                if(instance == null){
                    return new gameBoard(size);
                }
            }
        }
        return instance;
    }
}
