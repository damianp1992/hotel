package com.prukacz.damian.rest;

import com.prukacz.damian.entity.Reservation;
import com.prukacz.damian.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationCtrl {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationCtrl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public List<Reservation> saveReservation(@RequestBody final Reservation reservation){
        reservationRepository.save(reservation);

        return reservationRepository.findAll();
    }

    @RequestMapping(value = "/delete/{reservationId}", method = RequestMethod.GET)
    public List<Reservation> deleteReservation(@PathVariable final long reservationId){
        reservationRepository.delete(reservationId);

        return reservationRepository.findAll();
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Reservation> findAllReservation() {

        return reservationRepository.findAll();
    }

    @RequestMapping(value = "/arrival-date/{arrivalDate}", method = RequestMethod.GET)
    public List<Reservation> findByArrivalDate(@PathVariable final String arrivalDate){

        return reservationRepository.findByArrivalDate(arrivalDate);
    }

    @RequestMapping(value = "/departure-date/{departureDate}", method = RequestMethod.GET)
    public List<Reservation> findByDepartureDate(@PathVariable final String departureDate){

        return reservationRepository.findByDepartureDate(departureDate);
    }

    @RequestMapping(value = "/room-number/{roomNumber}", method = RequestMethod.GET)
    public List<Reservation> findByRoomNumber(@PathVariable final int roomNumber){

        return reservationRepository.findByRoomNumber(roomNumber);
    }

    @RequestMapping(value = "/clientId/{clientId}", method = RequestMethod.GET)
    public List<Reservation> findByClientId(@PathVariable final int clientId){

        return reservationRepository.findByClientId(clientId);
    }

    @RequestMapping(value = "/extra-bed/{extraBed}", method = RequestMethod.GET)
    public List<Reservation> findByExtraBed(@PathVariable final boolean extraBed){

        return reservationRepository.findByExtraBed(extraBed);
    }

    @RequestMapping(value = "/for-disabled/{forDisabled}", method = RequestMethod.GET)
    public List<Reservation> findForDisabled(@PathVariable final boolean forDisabled){

        return reservationRepository.findByForDisabled(forDisabled);
    }

    @RequestMapping(value = "/parking/{parking}", method = RequestMethod.GET)
    public List<Reservation> findByParking(@PathVariable final boolean parking){

        return reservationRepository.findByParking(parking);
    }

    @RequestMapping(value = "/board/{fullBoard}", method = RequestMethod.GET)
    public List<Reservation> findByFullBoard(@PathVariable final boolean fullBoard){

        return reservationRepository.findByFullBoard(fullBoard);
    }

    @RequestMapping(value = "/room-service/{roomService}", method = RequestMethod.GET)
    public List<Reservation> findByRoomService(@PathVariable final boolean roomService){

        return reservationRepository.findByRoomService(roomService);
    }

    @RequestMapping(value = "/payment-method/{paymentMethod}", method = RequestMethod.GET)
    public List<Reservation> findByPaymentMethod(@PathVariable final String paymentMethod){

        return reservationRepository.findByPaymentMethod(paymentMethod);
    }
}
