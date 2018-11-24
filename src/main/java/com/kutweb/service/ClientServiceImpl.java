package com.kutweb.service;

import com.kutweb.dao.ClientDao;
import com.kutweb.entities.ClientEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ClientServiceImpl implements ClientService {
    private ClientDao clientDao;

    public void setClientDao(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @Override
    @Transactional
    public void addClient(ClientEntity clientEntity) {
        this.clientDao.addClient(clientEntity);

    }

    @Override
    @Transactional
    public void updateClient(ClientEntity clientEntity) {
        this.clientDao.updateClient(clientEntity);
    }

    @Override
    @Transactional
    public void removeClient(int id) {
        this.clientDao.removeClient(id);
    }

    @Override
    @Transactional
    public ClientEntity getClientById(int id) {

        return this.clientDao.getClientById(id);
    }

    @Override
    @Transactional
    public List<ClientEntity> listClient() {
        return this.clientDao.listClient();
    }
}
