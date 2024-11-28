package org.example.SnakeAndLAdderGame.models;

public class Dice {
    public static int rollDice(){
        return (int) (Math.random()*6+1);
    }
    public  static int rollDice(int sides){
        return (int) (Math.random()*sides + 1);
    }
}
