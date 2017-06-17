package com.prukacz.damian.repository;

import com.prukacz.damian.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    List<Client> findByName(String name);

    List<Client> findBySurname(String surname);

    List<Client> findByCity(String city);

    List<Client> findByAge(int age);

    List<Client> findByGender(String gender);

    List<Client> findByNationality(String nationality);

    List<Client> findByIdentityCard(String identityCard);

    List<Client> findByPhone(int phone);

    List<Client> findByEmail(String email);

    List<Client> findByLogin(String login);
}
