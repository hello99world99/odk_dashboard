package com.example.odkApprenant.services;

import com.example.odkApprenant.model.Users;
import com.example.odkApprenant.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImp implements UsersService{

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void saveUsers(Users users) {
        this.usersRepository.save(users);
    }

    @Override
    @Transactional
    public void editUsers(Long id, Users users) {
        Users current = this.usersRepository.getById(id);
        current.setNom(users.getNom());
        current.setPrenom(users.getPrenom());
        current.setAge(users.getTelephone());
        current.setTelephone(users.getTelephone());
        current.setEmail(users.getEmail());
        current.setLogin(users.getLogin());
        current.setPassword(users.getPassword());
        current.setUserStatus(users.getUserStatus());
        current.setDateCreation(users.getDateCreation());
        current.setDateModification(users.getDateModification());
    }

    @Override
    public Optional<Users> getUsersById(Long id) {
        return this.usersRepository.findById(id);
    }

    @Override
    public List<Users> getAllUsers() {
        return (List<Users>) this.usersRepository.findAll();
    }

    @Override
    public void deleteUsers(Long id) {
        this.usersRepository.deleteById(id);
    }

    @Override
    public Users getAuth(String login, String password) {
        return this.usersRepository.findByLoginAndPassword(login, password);
    }

    @Override
    public List<Users> getAllFrmt(String profil) {
        return this.usersRepository.getUsersByProfil(profil);
    }
}
