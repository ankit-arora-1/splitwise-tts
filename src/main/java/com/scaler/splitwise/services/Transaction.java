package com.scaler.splitwise.services;

import com.scaler.splitwise.models.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class Transaction {
    private int amount;
    private User from;
    private User to;
}
