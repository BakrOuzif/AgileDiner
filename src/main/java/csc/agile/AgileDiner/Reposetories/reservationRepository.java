package csc.agile.AgileDiner.Reposetories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import csc.agile.AgileDiner.Class.Reservation;

@Repository
public interface reservationRepository extends 
    JpaRepository <Reservation, Long> {
    
}
