package co.com.springbootexercise.everis.controllers;

import co.com.springbootexercise.everis.models.ManagerModel;
import co.com.springbootexercise.everis.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    ManagerService managerService;

    @GetMapping()
    public ArrayList<ManagerModel> getManagers(){
        return managerService.getManagers();
    }

}
