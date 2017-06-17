package com.prukacz.damian.repository;

import com.prukacz.damian.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findByArrivalDate(String arrivalDate);

    List<Reservation> findByDepartureDate(String departureDate);

    List<Reservation> findByRoomNumber(int roomNumber);

    List<Reservation> findByClientId(int clientId);

    List<Reservation> findByExtraBed(boolean extraBed);

    List<Reservation> findByForDisabled(boolean forDisabled);

    List<Reservation> findByParking(boolean parking);

    List<Reservation> findByFullBoard(boolean fullboard);

    List<Reservation> findByRoomService(boolean roomService);

    List<Reservation> findByPaymentMethod(String paymentMethod);
}
