package com.example.odkApprenant.services;

import com.example.odkApprenant.model.PresenceList;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface PresenceService {
    public void addPresence(PresenceList presenceList);
    public List<PresenceList> getAllPresenceList();
    public List<PresenceList> getTodayPresenceList(LocalDate localDate);
    public List<PresenceList> getMonthPresenceList(LocalDate localDate);
    public List<PresenceList> getDateBetween(LocalDate min, LocalDate max);
}
