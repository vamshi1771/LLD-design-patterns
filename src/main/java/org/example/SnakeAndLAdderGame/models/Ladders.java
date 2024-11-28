package org.example.SnakeAndLAdderGame.models;

import lombok.Data;

@Data
public class Ladders {
    private int start;
    private int end;

    public Ladders(int start, int end){
        this.start = start;
        this.end = end;
    }


}
