package org.example.SnakeAndLAdderGame.models;

import lombok.Data;

@Data
public class Player {
    private  static int idCounter =1;
    private String Name;
    private  int Id;

    public Player(String Name){
        this.Id = idCounter++;
        this.Name = Name;
    }

}
