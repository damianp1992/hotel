package com.prukacz.damian.rest;

import com.prukacz.damian.entity.Client;
import com.prukacz.damian.entity.model.ClientId;
import com.prukacz.damian.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientCtrl {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientCtrl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
   }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public List<Client> saveClient(@RequestBody final Client client) {
        System.out.println(client);
        clientRepository.save(client);

        return null;
    }
    //przepychaj te id do backendu z frontendu
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteClient(@RequestBody final ClientId clientId) {
        clientRepository.delete(clientId.getId());

//        return clientRepository.findAll();
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Client> getAll() {

        return clientRepository.findAll();
    }

//    @RequestMapping(value = "/edit", method = RequestMethod.POST)
//    public List<Client> editClient(@RequestBody final Client client){
//
//        return clientRepository.edit(client);
//    }

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public List<Client> findByName(@PathVariable final String name) {

        return clientRepository.findByName(name);
    }

    @RequestMapping(value = "/surname", method = RequestMethod.GET)
    public List<Client> findBySurname(@PathVariable final String surname) {

        return clientRepository.findBySurname(surname);
    }

    @RequestMapping(value = "/city/{city}", method = RequestMethod.GET)
    public List<Client> finByCity(@PathVariable final String city) {

        return clientRepository.findByCity(city);
    }

    @RequestMapping(value = "/age/{age}", method = RequestMethod.GET)
    public List<Client> finByAge(@PathVariable final int age) {

        return clientRepository.findByAge(age);
    }

    @RequestMapping(value = "/gender/{gender}", method = RequestMethod.GET)
    public List<Client> finByGender(@PathVariable final String gender) {

        return clientRepository.findByGender(gender);
    }

    @RequestMapping(value = "/nationality/{nationality}", method = RequestMethod.GET)
    public List<Client> finByNationality(@PathVariable final String nationality) {

        return clientRepository.findByNationality(nationality);
    }

    @RequestMapping(value = "/identityCard/{identityCard}", method = RequestMethod.GET)
    public List<Client> finByIdentityCard(@PathVariable final String identityCard) {

        return clientRepository.findByIdentityCard(identityCard);
    }

    @RequestMapping(value = "/phone/{phone}", method = RequestMethod.GET)
    public List<Client> finByPhone(@PathVariable final int phone) {

        return clientRepository.findByPhone(phone);
    }

    @RequestMapping(value = "/email/{email}", method = RequestMethod.GET)
    public List<Client> finByEmail(@PathVariable final String email) {

        return clientRepository.findByEmail(email);
    }

    @RequestMapping(value = "/login/{login}", method = RequestMethod.GET)
    public List<Client> findByLogin(@PathVariable final String login) {

        return clientRepository.findByLogin(login);
    }
}
