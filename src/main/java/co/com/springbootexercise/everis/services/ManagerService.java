package co.com.springbootexercise.everis.services;

import co.com.springbootexercise.everis.models.ManagerModel;
import co.com.springbootexercise.everis.repositories.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ManagerService {

    @Autowired
    ManagerRepository managerRepository;

    public ArrayList<ManagerModel> getManagers(){
        return (ArrayList<ManagerModel>) managerRepository.findAll();
    }
}
