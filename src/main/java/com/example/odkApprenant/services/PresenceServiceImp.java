package com.example.odkApprenant.services;

import com.example.odkApprenant.model.PresenceList;
import com.example.odkApprenant.repositories.PresenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PresenceServiceImp implements PresenceService{
    @Autowired PresenceRepository presenceRepository;

    @Override
    public void addPresence(PresenceList presenceList) {
        this.presenceRepository.save(presenceList);
    }

    @Override
    public List<PresenceList> getAllPresenceList() {
        return this.presenceRepository.findAll();
    }

    @Override
    public List<PresenceList> getTodayPresenceList(LocalDate localDate) {
        return this.presenceRepository.getPresenceListByDate(localDate);
    }

    @Override
    public List<PresenceList> getMonthPresenceList(LocalDate localDate) {
        return this.presenceRepository.getPresenceListByDateContaining(localDate);
    }

    @Override
    public List<PresenceList> getDateBetween(LocalDate min, LocalDate max) {
        System.out.println(min);
        System.out.println(max);
        return this.presenceRepository.getPresenceListByDateGreaterThanEqualAndDateLessThanEqual(min, max);
    }

}
