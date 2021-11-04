package com.example.odkApprenant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private Integer age;
    private Integer telephone;
    private String email;
    private String login;
    private String password;
    private UserStatus userStatus;
    private LocalDateTime dateCreation = LocalDateTime.now();
    private LocalDateTime dateModification = LocalDateTime.now();
    private Profil profil;
}
