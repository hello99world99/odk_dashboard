package com.example.odkApprenant.controllers;

import com.example.odkApprenant.model.PresenceList;
import com.example.odkApprenant.services.PresenceServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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
        return this.presenceServiceImp.getPresenceList(LocalDate.now());
    }

    @GetMapping("/presence/month/{year}-{month}")
    public List<PresenceList> getMonthPresenceList(
            @PathVariable("year") int year,
            @PathVariable("month") int month)
    {
        return this.presenceServiceImp.getPresenceList(year, month);
    }

    @GetMapping("/presence/entre/{start}&{end}")
    public List<PresenceList> getPresenceListBetween(
            @PathVariable("start") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate start,
            @PathVariable("end") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate end){
        return this.presenceServiceImp.getPresenceList(start, end);
    }

    @GetMapping("/presence/semaine")
    public List<PresenceList> getListByWeek(){
        return this.presenceServiceImp.getPresenceList(LocalDate.now(), 7);
    }
}
