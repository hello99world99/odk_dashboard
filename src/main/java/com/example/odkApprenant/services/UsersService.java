package com.example.odkApprenant.services;

import com.example.odkApprenant.model.Profil;
import com.example.odkApprenant.model.Users;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UsersService {
    public void saveUsers(Users users);
    public void editUsers(Long id, Users users);
    public Optional<Users> getUsersById(Long id);
    public List<Users> getAllUsers();
    public List<Users> getAllUsersByProfil(Profil profil);
    public void deleteUsers(Long id);
    public Users getAuth(String login, String password);
}
