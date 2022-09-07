package com.example.Store.repository;

import com.example.Store.entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepo extends JpaRepository<Clients,Long> {
}
