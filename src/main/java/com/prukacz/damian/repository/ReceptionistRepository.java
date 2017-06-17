package com.prukacz.damian.repository;

import com.prukacz.damian.entity.Receptionist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReceptionistRepository extends JpaRepository<Receptionist, Long> {

    List<Receptionist> findByName(String name);

    List<Receptionist> findBySurname(String surname);

    List<Receptionist> findByIdentityCard(String identityCard);

    List<Receptionist> findByPhone(int phone);

    List<Receptionist> findByEmail(String email);

    List<Receptionist> findByLogin(String login);
}
