package com.example.odkApprenant.services;

import com.example.odkApprenant.model.PresenceList;
import org.springframework.stereotype.Service;

@Service
public interface PresenceService {
    public void addPresence(PresenceList presenceList);
}
