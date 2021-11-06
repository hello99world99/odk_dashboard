package com.example.odkApprenant.services;

import com.example.odkApprenant.model.PresenceList;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface PresenceService {
    public void addPresence(PresenceList presenceList);

    //Get all presence list
    public List<PresenceList> getAPresenceList();

    //Get presence list by date
    public List<PresenceList> getPresenceList(LocalDate localDate);

    //Get presence list by week
    public List<PresenceList> getPresenceList(int year, int month, int day);

    //Get presence list by month
    public List<PresenceList> getPresenceList(int year, int month);

    //Get presence list between two periodes of time
    public List<PresenceList> getPresenceList(LocalDate min, LocalDate max);
}
