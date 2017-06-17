package com.prukacz.damian.rest;

import com.prukacz.damian.entity.Room;
import com.prukacz.damian.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomCtrl {

    private final RoomRepository roomRepository;

    @Autowired
    public RoomCtrl(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public List<Room> saveRoom(@RequestBody @Validated final Room room){
        roomRepository.save(room);

        return roomRepository.findAll();
    }

    @RequestMapping(value = "/delete/{roomId}", method = RequestMethod.GET)
    public List<Room> deleteRoom(@PathVariable final long roomId){
        roomRepository.delete(roomId);

        return roomRepository.findAll();
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Room> findAllRoom() {

        return roomRepository.findAll();
    }

    @RequestMapping(value = "/place-filter/{numberOfPlace}", method = RequestMethod.GET)
    public List<Room> filterByNumberOfPlaceLessThan(@PathVariable final int numberOfPlace){

        return roomRepository.findByNumberOfPlaceLessThan(numberOfPlace);
    }

    @RequestMapping(value = "/beds-filter/{numberOfBeds}", method = RequestMethod.GET)
    public List<Room> filterByNumberOfBedsLessThan(@PathVariable final int numberOfBeds){

        return roomRepository.findByNumberOfBedsLessThan(numberOfBeds);
    }

    @RequestMapping(value = "/price-filter/{pricePerNight}", method = RequestMethod.GET)
    public List<Room> filterByPricePerNightLessThan(@PathVariable final int pricePerNight){

        return roomRepository.findByPricePerNightLessThan(pricePerNight);
    }


    @RequestMapping(value = "/room-number/{roomNumber}", method = RequestMethod.GET)
    public List<Room> findByRoomNumber(@PathVariable final int roomNumber){

        return roomRepository.findByRoomNumber(roomNumber);
    }

    @RequestMapping(value = "/place/{numberOfPlace}", method = RequestMethod.GET)
    public List<Room> findByNumberOfPlace(@PathVariable final int numberOfPlace){

        return roomRepository.findByNumberOfPlace(numberOfPlace);
    }

    @RequestMapping(value = "/beds/{numberOfBeds}", method = RequestMethod.GET)
    public List<Room> findByNumberOfBeds(@PathVariable final int numberOfBeds){

        return roomRepository.findByNumberOfBeds(numberOfBeds);
    }

    @RequestMapping(value = "/additional-bed/{possibilityOfAdditionalBed}", method = RequestMethod.GET)
    public List<Room> findByPossibilityOfAdditionalBed(@PathVariable final boolean possibilityOfAdditionalBed){

        return roomRepository.findByPossibilityOfAdditionalBed(possibilityOfAdditionalBed);
    }

    @RequestMapping(value = "/adaptation-for-disabled/{adaptationForDisabled}", method = RequestMethod.GET)
    public List<Room> findByAdaptationForDisabled(@PathVariable final boolean adaptationForDisabled){

        return roomRepository.findByAdaptationForDisabled(adaptationForDisabled);
    }

    @RequestMapping(value = "/price/{pricePerNight}", method = RequestMethod.GET)
    public List<Room> findByPricePerNight(@PathVariable final double pricePerNight){

        return roomRepository.findByPricePerNight(pricePerNight);
    }


}
