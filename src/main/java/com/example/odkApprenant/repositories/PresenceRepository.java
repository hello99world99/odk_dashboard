package com.example.odkApprenant.repositories;

import com.example.odkApprenant.model.PresenceList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PresenceRepository extends JpaRepository<PresenceList, Long> {
    public List<PresenceList> getPresenceListByDate(LocalDate localDate);
    public List<PresenceList> getPresenceListByDateGreaterThanEqualAndDateLessThanEqual(LocalDate min, LocalDate max);
    public List<PresenceList> getPresenceListByDateContaining(LocalDate localDate);
    public List<PresenceList> getPresenceListByDateGreaterThanEqual(LocalDate localDate);
}