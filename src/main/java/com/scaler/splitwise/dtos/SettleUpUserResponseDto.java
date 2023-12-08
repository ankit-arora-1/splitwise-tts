package com.scaler.splitwise.dtos;

import com.scaler.splitwise.services.Transaction;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SettleUpUserResponseDto {
    List<Transaction> transactions;
}
