package com.example.odkApprenant.services;

import com.example.odkApprenant.model.PresenceList;
import com.example.odkApprenant.repositories.PresenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

@Service
public class PresenceServiceImp implements PresenceService{

    @Autowired PresenceRepository presenceRepository;

    //Ajouter un utilisateur à la liste de présence
    @Override
    public void addPresence(PresenceList presenceList) {
        this.presenceRepository.save(presenceList);
    }

    //Récuperer tous les utilisateurs de la liste liste de présence
    @Override
    public List<PresenceList> getAllPresenceList() {
        return this.presenceRepository.findAll();
    }

    @Override
    public List<PresenceList> getPresenceList(LocalDate localDate) {
        return this.presenceRepository.getPresenceListByDate(localDate);
    }

    //Get all users by a week
    @Override
    public List<PresenceList> getPresenceList(LocalDate localDate, int days) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        for (int i = 0; i < 5; i++) {
            System.out.println(df.format(c.getTime()));
            c.add(Calendar.DATE, 1);
        }
        return this.presenceRepository.getPresenceListByDateGreaterThanEqual(localDate.minusDays(days));
    }

    //Get all users by a month
    @Override
    public List<PresenceList> getPresenceList(int year, int month) {
        LocalDate initial = LocalDate.of(year, month, 1);
        LocalDate start = initial.withDayOfMonth(1);
        LocalDate end = initial.withDayOfMonth(initial.lengthOfMonth());
        return this.presenceRepository.getPresenceListByDateGreaterThanEqualAndDateLessThanEqual(start, end);
    }

    //Get all users between two periode of time
    @Override
    public List<PresenceList> getPresenceList(LocalDate min, LocalDate max) {
        return this.presenceRepository.getPresenceListByDateGreaterThanEqualAndDateLessThanEqual(min, max);
    }

}
