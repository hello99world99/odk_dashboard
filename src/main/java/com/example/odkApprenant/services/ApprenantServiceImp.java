package com.example.odkApprenant.services;

import com.example.odkApprenant.model.Apprenant;
import com.example.odkApprenant.repositories.ApprenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ApprenantServiceImp implements ApprenantService{

    @Autowired
    private ApprenantRepository apprenantRepository;


    @Override
    public void saveApprenant(Apprenant apprenant) {
        this.apprenantRepository.save(apprenant);
    }

    @Override
    @Transactional
    public void editApprenant(Long id, Apprenant apprenant) {
        Apprenant current = this.apprenantRepository.getById(id);
        current.setNom(apprenant.getNom());
        current.setPrenom(apprenant.getPrenom());
        current.setAge(apprenant.getTelephone());
        current.setTelephone(apprenant.getTelephone());
        current.setEmail(apprenant.getEmail());
        current.setLogin(apprenant.getLogin());
        current.setPassword(apprenant.getPassword());
        current.setApprenantStatus(apprenant.getApprenantStatus());
        current.setDateCreation(apprenant.getDateCreation());
        current.setDateModification(apprenant.getDateModification());
        this.apprenantRepository.save(apprenant);
    }

    @Override
    public Optional<Apprenant> getApprenantById(Long id) {
        return this.apprenantRepository.findById(id);
    }

    @Override
    public List<Apprenant> getAllApprenant() {
        return (List<Apprenant>) this.apprenantRepository.findAll();
    }

    @Override
    public void deleteApprenant(Long id) {
        this.apprenantRepository.deleteById(id);
    }

    @Override
    public Apprenant getAuth(String login, String password) {
        return this.apprenantRepository.findByLoginAndPassword(login, password);
    }


}
