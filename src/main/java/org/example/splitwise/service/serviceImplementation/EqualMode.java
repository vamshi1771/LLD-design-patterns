package org.example.splitwise.service.serviceImplementation;

import org.example.splitwise.model.Expenses;
import org.example.splitwise.model.User;
import org.example.splitwise.service.ExpensesMode;

import java.util.List;

public class EqualMode implements ExpensesMode {
    private Expenses instance = Expenses.getInstance();


    @Override
    public void splitAmount(Integer paidBy, Double amount, String ExpenseMode, List<User> paidTo) {

        int no_of_players = paidTo.size();
        double splitAmount = Math.round((amount / paidTo.size()) * 100.0) / 100.0;
        double totalAssigned = splitAmount * paidTo.size();
        double remainder = Math.round((amount - totalAssigned) * 100.0) / 100.0;
        int i =0;
        for(User user : paidTo ){
            if(i ==0){
                instance.updateDataSheet(paidBy, user.getUserId(), splitAmount+remainder);
                i =1;
            }
            else instance.updateDataSheet(paidBy, user.getUserId(), splitAmount);
        }
    }
}
