package com.example.odkApprenant.repositories;

import com.example.odkApprenant.model.Profil;
import com.example.odkApprenant.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    public Users findByLoginAndPassword(String login, String password);

    public List<Users> getUsersByProfil(Profil profil);
}
