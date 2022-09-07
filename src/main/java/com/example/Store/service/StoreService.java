package com.example.Store.service;

import com.example.Store.entity.Clients;
import com.example.Store.model.ClientsModel;
import com.example.Store.repository.ClientsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class StoreService {

    private final ClientsRepo clientsRepo;

    public void buy(ClientsModel model, Long numOfFlowers){
        Clients client = new Clients()
                .setName(model.getName())
                .setNumOfFlowers(numOfFlowers)
                .setEntranceTime(LocalDateTime.now());
        clientsRepo.save(client);
    }

}
