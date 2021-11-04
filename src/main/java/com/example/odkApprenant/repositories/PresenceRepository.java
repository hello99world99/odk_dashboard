package com.example.odkApprenant.repositories;

import com.example.odkApprenant.model.PresenceList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PresenceRepository extends JpaRepository<PresenceList, Long> {
    public List<PresenceList> getPresenceListByDate(LocalDate localDate);
    public List<PresenceList> getPresenceListByDateContaining(LocalDate localDate);
    public List<PresenceList> getPresenceListByDateBetween(LocalDate min, LocalDate max);
}
