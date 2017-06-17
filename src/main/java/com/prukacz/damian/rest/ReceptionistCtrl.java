package com.prukacz.damian.rest;

import com.prukacz.damian.entity.Receptionist;
import com.prukacz.damian.repository.ReceptionistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/receptionist")
public class ReceptionistCtrl {

    private final ReceptionistRepository receptionistRepository;

    @Autowired
    public ReceptionistCtrl(ReceptionistRepository receptionistRepository){
        this.receptionistRepository = receptionistRepository;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public List<Receptionist> saveReceptionist(@RequestBody final Receptionist receptionist){
        receptionistRepository.save(receptionist);

        return receptionistRepository.findAll();
    }

    @RequestMapping(value = "/delete/{receptionistId}", method = RequestMethod.GET)
    public List<Receptionist> deleteReceptionist(@PathVariable final long receptionistId){
        receptionistRepository.delete(receptionistId);

        return receptionistRepository.findAll();
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Receptionist> getAll(){

        return receptionistRepository.findAll();
    }

    @RequestMapping(value = "/find-name/{name}", method = RequestMethod.GET )
    public List<Receptionist> findByName(@PathVariable final String name){

        return receptionistRepository.findByName(name);
    }

    @RequestMapping(value = "/surname/{surname}", method = RequestMethod.GET)
    public List<Receptionist> findBySurname(@PathVariable final String surname){

        return receptionistRepository.findBySurname(surname);
    }

    @RequestMapping(value = "/identityCard/{identityCard}", method = RequestMethod.GET)
    public List<Receptionist> findByIdentityCard(@PathVariable final String identityCard){

        return receptionistRepository.findByIdentityCard(identityCard);
    }

    @RequestMapping(value = "/phone/{phone}", method = RequestMethod.GET)
    public List<Receptionist> findByPhone(@PathVariable final int phone){

        return receptionistRepository.findByPhone(phone);
    }

    @RequestMapping(value = "/email/{email}", method = RequestMethod.GET)
    public List<Receptionist> findByEmail(@PathVariable final String email){

        return receptionistRepository.findByEmail(email);
    }

    @RequestMapping(value = "/login/{login}", method = RequestMethod.GET)
    public List<Receptionist> findByLogin(@PathVariable final String login){

        return receptionistRepository.findByLogin(login);
    }
}
