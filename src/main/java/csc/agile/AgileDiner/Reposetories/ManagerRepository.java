package csc.agile.AgileDiner.Reposetories;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import csc.agile.AgileDiner.Class.Manager;

@Repository
public interface ManagerRepository extends 
    JpaRepository <Manager, Long>{
    
}
