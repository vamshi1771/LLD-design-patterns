package org.example.SnakeAndLAdderGame;

import org.example.SnakeAndLAdderGame.Services.SnakeAndLadderServices;
import org.example.SnakeAndLAdderGame.models.Ladders;
import org.example.SnakeAndLAdderGame.models.Player;
import org.example.SnakeAndLAdderGame.models.Snakes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int boardSize = 100;
        SnakeAndLadderServices service = new SnakeAndLadderServices(boardSize);

        // Initialize Snakes
        System.out.println("No of snakes => start point => end point");
        int noOfSnakes = scanner.nextInt();
        List<Snakes> snakes = new ArrayList<>();
        for (int i = 0; i < noOfSnakes; i++) {
            snakes.add(new Snakes(scanner.nextInt(), scanner.nextInt()));
        }

        // Initialize Ladders
        System.out.println("No of Ladders");
        int noOfLadders = scanner.nextInt();
        List<Ladders> ladders = new ArrayList<>();
        for (int i = 0; i < noOfLadders; i++) {
            ladders.add(new Ladders(scanner.nextInt(), scanner.nextInt()));
        }

        // Initialize Players
        System.out.println("No of Players");
        int noOfPlayers = scanner.nextInt();
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < noOfPlayers; i++) {
            players.add(new Player(scanner.next()));
        }
        scanner.close();

        // Set up the game
        service.setSnakes(snakes);
        service.setLadders(ladders);
        service.setPlayers(players);

        // Start the game
        service.startGame();
    }
}
