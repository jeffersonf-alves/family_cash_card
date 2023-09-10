package com.cashcard.cashcard.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CashCard {

    @GetMapping("cashcard/{requestId}")
    public ResponseEntity<String> findById(@PathVariable Long requestId, Long requestedId) {
        return ResponseEntity.ok("Ok");
    }

}
