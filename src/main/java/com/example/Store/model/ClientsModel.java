package com.example.Store.model;

import com.example.Store.entity.Clients;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ClientsModel {
    private String name;

    public static ClientsModel toModel(Clients clients){
        ClientsModel clientsModel = new ClientsModel()
                .setName(clients.getName());
        return clientsModel;
    }
}
