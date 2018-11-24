package com.kutweb.service;

import com.kutweb.entities.ClientEntity;

import java.util.List;

public interface ClientService {
    public void addClient(ClientEntity clientEntity);
    public void updateClient(ClientEntity clientEntity);
    public void removeClient(int id);
    public ClientEntity getClientById(int id);
    public List<ClientEntity> listClient();
}
