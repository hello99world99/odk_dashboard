package com.example.odkApprenant.services;

import com.example.odkApprenant.model.Apprenant;
import com.example.odkApprenant.repositories.ApprenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void editApprenant(Apprenant apprenant) {
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
