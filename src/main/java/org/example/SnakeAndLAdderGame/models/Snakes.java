package org.example.SnakeAndLAdderGame.models;

import lombok.Data;

@Data
public class Snakes {
    private int start;
    private int end;

    public Snakes(int start, int end){
        this.start = start;
        this.end = end;
    }

}
