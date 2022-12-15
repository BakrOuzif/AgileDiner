package csc.agile.AgileDiner.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import csc.agile.AgileDiner.Class.Manager;
import csc.agile.AgileDiner.Modals.ManDTO;
import csc.agile.AgileDiner.Reposetories.ManagerRepository;

@Service
public class ManagerService {
    
    ManagerRepository managerRepository;

    public ManagerService(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    public List<Manager> getMan(){
        return managerRepository.findAll();
    }

    public void saveMan(ManDTO newest){
        managerRepository.save(newest.getMan());
    }

    public void deleteMan(ManDTO newest){
        managerRepository.delete(newest.getMan());
    }
    
    
    
}
