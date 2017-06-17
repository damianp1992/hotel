package com.prukacz.damian.repository;

import com.prukacz.damian.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    List<Room> findByNumberOfPlaceLessThan(int numberOfPlace);

    List<Room> findByNumberOfBedsLessThan(int numberOfBeds);

    List<Room> findByPricePerNightLessThan(double pricePerNight);

    List<Room> findByRoomNumber(int roomNumber);

    List<Room> findByNumberOfPlace(int numberOfPlace);

    List<Room> findByNumberOfBeds(int numberOfBeds);

    List<Room> findByPossibilityOfAdditionalBed(boolean possibilityOfAdditionalBed);

    List<Room> findByAdaptationForDisabled(boolean adaptationForDisabled);

    List<Room> findByPricePerNight(double pricePerNight);
}
