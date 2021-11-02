package com.example.odkApprenant.services;

import com.example.odkApprenant.model.Formateur;
import com.example.odkApprenant.repositories.FormateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormateurServiceImp implements FormateurService {

    @Autowired
    private FormateurRepository formateurRepository;

    @Override
    public void addFormateur(Formateur formateur) {
        this.formateurRepository.save(formateur);
    }

    @Override
    public void updateFormateur(Long id) {

    }

    @Override
    public Formateur getAFormateur(Long id) {
        return (Formateur) this.formateurRepository.findById(id).get();
    }

    @Override
    public List<Formateur> getAllFormateur() {
        return this.formateurRepository.findAll();
    }

    @Override
    public void deleteFormateur() {

    }
}
