package org.example.snakeAndLadder;

import lombok.Data;

@Data
public class Player {
    private String Name;
    private int currentPosition;

    private  snakeAndLadder snakeAndLadder;

    Player(String name, int currentPosition){
        this.currentPosition = currentPosition;
        this.Name = name;
    }
    int play(Player player, int score){
       return snakeAndLadder.startGame(player,score);
    }

}
