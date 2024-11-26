package org.example.snakeAndLadder;

import java.util.Map;

public class snakeAndLadder implements Games {

    private snakeBoard snakeBoard;

    snakeAndLadder(snakeBoard board){
        this.snakeBoard = board;
    }

    @Override
    public int startGame(Player player,int score) {
        int val = player.getCurrentPosition();
        val+=score;
        Map<Integer,Integer> snakes = snakeBoard.getSnakes();
        Map<Integer,Integer> ladders = snakeBoard.getLadders();
        int newPosition = val;
        if(snakes.containsKey(val)){
             newPosition = snakes.get(val);
        }
        else if (ladders.containsKey(val)){
            newPosition = ladders.get(val);
        }
        if(val > 100)  return player.getCurrentPosition();
        player.setCurrentPosition(newPosition);
        return newPosition;
    }
}
