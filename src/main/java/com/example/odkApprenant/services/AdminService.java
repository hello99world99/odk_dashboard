package com.example.odkApprenant.services;

import com.example.odkApprenant.model.Admin;

import java.util.List;

public interface AdminService {
    public void saveAdmin(Admin admin);
    public Admin authAdmin(String login, String password);
    public void deleteAnAdmin(Long id);
    public Admin getAnAdmin(Long id);

    public List<Admin> getAllAdmin();
}
