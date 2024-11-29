package org.example.splitwise.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class Expenses {
    private static volatile Expenses instance = null;
    private Double[][] dataSheet;


    void initializeDatasheet(int no_of_players){
        dataSheet = new Double[no_of_players][no_of_players];

        for(int i =0;i<no_of_players;i++){
            for(int j = 0;j<no_of_players;j++){
             dataSheet[i][j] = 0.0;
            }
        }
    }


    private Expenses(){
        if(instance == null) {
            System.out.println("Use getInstance method to get the instance of this singletonClass ");
        }
    }

    public static Expenses getInstance(){
        if(instance == null){
            synchronized (Expenses.class){
                if(instance == null){
                    return instance = new Expenses();
                }
            }
        }
        return instance;
    }

    public void updateDataSheet(int paidBy,int paidTo, Double amount){
        Double previousAmount = dataSheet[paidBy][paidTo];
        previousAmount+=amount;
        dataSheet[paidBy][paidTo] = previousAmount;
    }
    void Show(){
    }
    void show(int player_id){

    }
}
