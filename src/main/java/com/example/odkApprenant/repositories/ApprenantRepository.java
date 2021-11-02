package com.example.odkApprenant.repositories;

import com.example.odkApprenant.model.Apprenant;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface ApprenantRepository extends JpaRepository<Apprenant, Long> {
    public Apprenant findByLoginAndPassword(String login, String password);
}
