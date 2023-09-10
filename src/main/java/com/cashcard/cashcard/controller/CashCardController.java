package com.cashcard.cashcard.controller;


import com.cashcard.cashcard.entity.CashCardEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class CashCardController {

    @GetMapping("cashcard/{requestId}")
    public ResponseEntity<CashCardEntity> findById(@PathVariable Long requestId, Long requestedId) {
        Date data = new Date();
        CashCardEntity cashCard = new CashCardEntity("Sara", 200.00, data, "OK");
        return ResponseEntity.ok(cashCard);
    }

}
