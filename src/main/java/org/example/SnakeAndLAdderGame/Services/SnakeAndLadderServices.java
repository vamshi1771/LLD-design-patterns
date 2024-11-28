package org.example.SnakeAndLAdderGame.Services;

import org.example.SnakeAndLAdderGame.models.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class SnakeAndLadderServices {
    private gameBoard snakeAndLadderBoard;
    private Queue<Player> players;
    private boolean isGameCompleted = false;

    public SnakeAndLadderServices(int boardSize){
        this.snakeAndLadderBoard = gameBoard.getInstance(boardSize);
        this.players = new LinkedList<>();
    }
    public void setPlayers(List<Player> players){
        Map<Integer,Integer> playerPositions = snakeAndLadderBoard.getPlayerPositions();
        for(Player player : players){
            this.players.add(player);
            playerPositions.put(player.getId(),0);
        }
        snakeAndLadderBoard.setPlayerPositions(playerPositions);
    }

    public void setSnakes(List<Snakes> snakesList){
        snakeAndLadderBoard.setSnakes(snakesList);
    }

    public void setLadders(List<Ladders> ladders){
        snakeAndLadderBoard.setLadders(ladders);
    }

    public void startGame(){
        while(players.size() == 0){
            Player currentPlayer = players.poll();
            int score = Dice.rollDice();
            movePlayer(currentPlayer,score);

            if(hasCurrentPlayerWon(currentPlayer)){
                System.out.println(currentPlayer.getName() + "won the Match");
            }
            else {
                players.add(currentPlayer);
            }

        }
    }

    public void movePlayer(Player player,int score){
        int oldPosition = snakeAndLadderBoard.getPlayerPositions().get(player.getId());
        int newPosition = oldPosition + score;
        if(newPosition > snakeAndLadderBoard.getBoardSize()){
            newPosition = oldPosition;
        }
        else{
            newPosition = getNewPositionAfterMove(newPosition);
        }
        if(newPosition > 100) newPosition = oldPosition;
        snakeAndLadderBoard.getPlayerPositions().put(player.getId(),newPosition);
        System.out.println(player.getName() + "Moved from " + oldPosition + "to " + newPosition);
    }

    public int getNewPositionAfterMove(int newPosition){
        for(Snakes snake : snakeAndLadderBoard.getSnakes()){
            if(snake.getStart() == newPosition){
                newPosition = snake.getEnd();
            }
        }
        for(Ladders ladder : snakeAndLadderBoard.getLadders()){
            if(ladder.getStart() == newPosition){
                newPosition = ladder.getEnd();
            }
        }
        return newPosition;
    }

    boolean hasCurrentPlayerWon(Player player){
        return snakeAndLadderBoard.getPlayerPositions().get(player.getId()) == snakeAndLadderBoard.getBoardSize();
    }


}
