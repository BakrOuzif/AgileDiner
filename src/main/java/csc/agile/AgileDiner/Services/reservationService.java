package csc.agile.AgileDiner.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import csc.agile.AgileDiner.Class.Reservation;
import csc.agile.AgileDiner.Modals.resDTO;
import csc.agile.AgileDiner.Reposetories.reservationRepository;

@Service
public class reservationService {
    
    
         static reservationRepository resRep;
        @Autowired
        public reservationService(reservationRepository resRep){
            reservationService.resRep= resRep;
        }
        public List<Reservation> getRes(){
            return resRep.findAll();
        }
        
        public static  void saveRes(resDTO newest){
            resRep.save(newest.getRes());
        }
        public void deleteRes(resDTO newest){
            resRep.delete(newest.getRes());
        }
        
    
}
