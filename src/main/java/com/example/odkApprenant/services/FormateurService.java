package com.example.odkApprenant.services;

import com.example.odkApprenant.model.Formateur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FormateurService {
    public void addFormateur(Formateur formateur);
    public void updateFormateur(Long id);
    public Formateur getAFormateur(Long id);
    public List<Formateur> getAllFormateur();
    public void deleteFormateur();

}
