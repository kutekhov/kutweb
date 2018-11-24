package com.kutweb.dao;

import com.kutweb.entities.ClientEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientDaoImpl implements ClientDao {
    private static final Logger logger = LoggerFactory.getLogger(ClientDaoImpl.class);
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addClient(ClientEntity clientEntity) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(clientEntity);
        logger.info("Client success");
    }

    @Override
    public void updateClient(ClientEntity clientEntity) {
        Session session =this.sessionFactory.getCurrentSession();
        session.update(clientEntity);
        logger.info("Client successfully update" + clientEntity);
    }

    @Override
    public void removeClient(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        ClientEntity client = (ClientEntity) session.load(ClientEntity.class, new Integer(id));
        if (client != null){
            session.delete(client);
        }
        logger.info("Client successfully removed." + client);
    }


    @Override
    public ClientEntity getClientById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        ClientEntity client = (ClientEntity) session.load(ClientEntity.class, new Integer(id));
        logger.info("Client successfully loaded" + client);
        return client;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<ClientEntity> listClient() {
        Session session = this.sessionFactory.getCurrentSession();
        List<ClientEntity> clientEntityList = session.createQuery("from ClientEntity").list();
        for (ClientEntity client :
                clientEntityList) {
            logger.info("Client list" + client);
        }
        return clientEntityList;
    }
}
