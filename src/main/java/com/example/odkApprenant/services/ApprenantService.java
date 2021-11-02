package com.example.odkApprenant.services;

import com.example.odkApprenant.model.Apprenant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ApprenantService {
    public void saveApprenant(Apprenant apprenant);
    public void editApprenant(Apprenant apprenant);
    public Optional<Apprenant> getApprenantById(Long id);
    public List<Apprenant> getAllApprenant();
    public void deleteApprenant(Long id);
    public Apprenant getAuth(String login, String password);
}
