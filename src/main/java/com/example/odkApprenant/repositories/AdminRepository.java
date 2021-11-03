package com.example.odkApprenant.repositories;

import com.example.odkApprenant.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    public Admin getAdminByLoginAndPassword(String login, String password);
}
