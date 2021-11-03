package com.example.odkApprenant.controllers;

import com.example.odkApprenant.model.PresenceList;
import com.example.odkApprenant.services.PresenceServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PresenceController {

    @Autowired
    PresenceServiceImp presenceServiceImp;

    @PostMapping("/presence/add")
    public String addPrence(@RequestBody PresenceList presenceList){
        this.presenceServiceImp.addPresence(presenceList);
        return "Présence cohée avec succèss...";
    }
}
