package com.example.odkApprenant.services;

import com.example.odkApprenant.model.Admin;
import com.example.odkApprenant.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImp implements AdminService{

    @Autowired
    AdminRepository adminRepository;

    @Override
    public void saveAdmin(Admin admin) {
        this.adminRepository.save(admin);
    }

    @Override
    public Admin authAdmin(String login, String password) {
        return this.adminRepository.getAdminByLoginAndPassword(login, password);
    }

    @Override
    public void deleteAnAdmin(Long id) {
        this.adminRepository.deleteById(id);
    }

    public Admin getAnAdmin(Long id) {
        return this.adminRepository.findById(id).get();
    }

    @Override
    public List<Admin> getAllAdmin() {
        return this.adminRepository.findAll();
    }
}
