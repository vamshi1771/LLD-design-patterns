package org.example.splitwise.service;

import org.example.splitwise.model.User;

import java.util.List;

public interface ExpensesMode {
    void splitAmount(Integer paidBy, Double paidAmount, String ExpenseMode, List<User> paidTo);
}
