package org.example.snakeAndLadder;

import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String args[]){

        int dice = 6; // Dice with 6 faces
        Map<Integer,Integer> snakes = null;
        snakes.put(11,8);
        snakes.put(22,5);
        snakes.put(45,20);
        snakes.put(69,59);
        snakes.put(80,29);
        snakes.put(97,83);

        Map<Integer,Integer> ladders = null;
        snakes.put(7,23);
        snakes.put(15,30);
        snakes.put(21,55);
        snakes.put(32,69);
        snakes.put(49,63);
        snakes.put(72,95);

        snakeBoard snakeBoard = new snakeBoard(snakes,ladders);
        List<Player> players = null;
        players.add(new Player("Alice",0));
        players.add(new Player("Bob",0));

            while(true){
                for(int  i=0 ;i<players.size();i++){
                    int currentScore = (int) (Math.random()*(dice+1));
                    Player p = players.get(i);
                    int val = p.play(p,currentScore);
                    if(val == 100){
                        System.out.println(p.getName() + "Reached the finish point and Won the Match");
                        break;
                    }
                    else {
                        System.out.println(p.getName() + " scored "+ currentScore + " and reached" + val);
                    }
                }
            }
    }
}
