package com.scaler.splitwise.controllers;

import com.scaler.splitwise.dtos.SettleUpUserRequestDto;
import com.scaler.splitwise.dtos.SettleUpUserResponseDto;
import com.scaler.splitwise.services.SettleUpService;
import com.scaler.splitwise.services.Transaction;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SettleUpController {
    private SettleUpService settleUpService;
    public SettleUpUserResponseDto settleUpUser(SettleUpUserRequestDto request) {
        SettleUpUserResponseDto response = new SettleUpUserResponseDto();

        List<Transaction> transactionList = settleUpService.settleUpUser(request.getUserId());

        response.setTransactions(transactionList);
        return response;
    }

    public void settleUpGroup() {

    }
}
