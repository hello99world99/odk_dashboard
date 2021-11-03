package com.example.odkApprenant.repositories;

import com.example.odkApprenant.model.PresenceList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresenceRepository extends JpaRepository<PresenceList, Long> {
}
