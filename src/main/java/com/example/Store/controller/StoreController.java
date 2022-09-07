package com.example.Store.controller;

import com.example.Store.model.ClientsModel;
import com.example.Store.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
public class StoreController {

    private final StoreService service;

    @GetMapping("/buy")
    public ResponseEntity buy(@RequestBody ClientsModel model, @RequestBody Long numOfFlowers){
        try {
            service.buy(model,numOfFlowers);
            return ResponseEntity.ok("Покупка совершена!");
        }catch (Exception e){
            return ResponseEntity.ok("Покупка несовершена!");
        }

    }
}
