package org.example.splitwise.service.serviceImplementation;

import org.example.splitwise.model.User;
import org.example.splitwise.service.ExpensesMode;

import java.util.List;

public class ExactMode implements ExpensesMode {
    @Override
    public void splitAmount(Integer paidBy, Double paidAmount, String ExpenseMode, List<User> paidTo) {
    }
}
