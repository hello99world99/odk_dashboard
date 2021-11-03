package com.example.odkApprenant.services;

import com.example.odkApprenant.model.PresenceList;
import com.example.odkApprenant.repositories.PresenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PresenceServiceImp implements PresenceService{
    @Autowired PresenceRepository presenceRepository;

    @Override
    public void addPresence(PresenceList presenceList) {
        this.presenceRepository.save(presenceList);
    }
}
