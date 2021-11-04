package com.example.odkApprenant.services;

import com.example.odkApprenant.model.PresenceList;
import com.example.odkApprenant.repositories.PresenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PresenceServiceImp implements PresenceService{
    @Autowired PresenceRepository presenceRepository;

    @Transactional
    @Override
    public void addPresence(PresenceList presenceList) {
        System.out.println(presenceList);
        this.presenceRepository.save(presenceList);
    }

    @Override
    public List<PresenceList> getAllPresenceList() {
        return this.presenceRepository.findAll();
    }

    //Recuperer la liste de présence
    @GetMapping("/presence/list")
    public PresenceList getPresenceList(){
        return null;
    }
}
