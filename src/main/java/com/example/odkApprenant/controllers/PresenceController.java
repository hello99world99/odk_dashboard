package com.example.odkApprenant.controllers;

import com.example.odkApprenant.model.PresenceList;
import com.example.odkApprenant.services.PresenceServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class PresenceController {

    @Autowired
    PresenceServiceImp presenceServiceImp;

    @PostMapping("/presence/add")
    public String addPrence(@RequestBody PresenceList presenceList){
        this.presenceServiceImp.addPresence(presenceList);
        return "Présence cohée avec succèss...";
    }

    @GetMapping("/presence/all")
    public List<PresenceList> getAllPresenceList(){
        return this.presenceServiceImp.getAllPresenceList();
    }

    @GetMapping("/presence/today")
    public List<PresenceList> getTodayPresenceList(){
        return this.presenceServiceImp.getTodayPresenceList(LocalDate.now());
    }
}
