package com.example.odkApprenant.services;

import com.example.odkApprenant.model.PresenceList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PresenceService {
    public void addPresence(PresenceList presenceList);

    List<PresenceList> getAllPresenceList();
}
