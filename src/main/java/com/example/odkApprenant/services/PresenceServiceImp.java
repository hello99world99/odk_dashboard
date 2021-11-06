package com.example.odkApprenant.services;

import com.example.odkApprenant.model.PresenceList;
import com.example.odkApprenant.repositories.PresenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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
    public List<PresenceList> getPresenceList(LocalDate localDate) {
        return this.presenceRepository.getPresenceListByDate(localDate);
    }

    @Override
    public List<PresenceList> getPresenceList(LocalDate localDate, int days) {
        return this.presenceRepository.getPresenceListByDateGreaterThanEqual(localDate.minusDays(days));
    }

    @Override
    public List<PresenceList> getPresenceList(int month) {
        LocalDate initial = LocalDate.of(LocalDate.now().getYear(), month, 1);
        LocalDate start = initial.withDayOfMonth(1);
        LocalDate end = initial.withDayOfMonth(initial.lengthOfMonth());
        return this.presenceRepository.getPresenceListByDateGreaterThanEqualAndDateLessThanEqual(start, end);
    }

    @Override
    public List<PresenceList> getPresenceList(LocalDate min, LocalDate max) {
        return this.presenceRepository.getPresenceListByDateGreaterThanEqualAndDateLessThanEqual(min, max);
    }

}
