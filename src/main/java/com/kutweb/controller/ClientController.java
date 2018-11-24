package com.kutweb.controller;

import com.kutweb.entities.ClientEntity;
import com.kutweb.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SuppressWarnings("ALL")
@Controller
public class ClientController {
    private ClientService clientService;


    @Autowired (required = true)
    @Qualifier(value = "clientService")
    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping(value = "clients", method = RequestMethod.GET)
    public String listClient(Model model){
        model.addAttribute("client", new ClientEntity());
        model.addAttribute("listClient", this.clientService.listClient());
        return "clients";

    }

    @RequestMapping(value = "/clients/add", method = RequestMethod.POST)
    public String addClient(@ModelAttribute("client")ClientEntity clientEntity){
        if (clientEntity.getIdClient() == 0) {
            this.clientService.addClient(clientEntity);

        }else {
            this.clientService.updateClient(clientEntity);

        }return "redirect:/clients";
    }


    @RequestMapping("/remove/{id}")
    public String removeClient(@PathVariable("id")int id ){
        this.clientService.removeClient(id);
    return "redirect:/clients";
    }

    @RequestMapping("edit/{id)")
    public String editClient(@PathVariable("id")int id,Model model){
        model.addAttribute("client", this.clientService.getClientById(id));
        model.addAttribute("listClients", this.clientService.listClient());
        return "clients";
    }

    @RequestMapping("clientdata/{id}")
    public String clientData(@PathVariable("id")int id, Model model){
        model.addAttribute("client", this.clientService.getClientById(id));
        return "clientData";
    }



}
