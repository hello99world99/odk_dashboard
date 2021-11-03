package com.example.odkApprenant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;
    private String nom;
    private String prenom;
    private Integer age;
    private Integer telephone;
    private String email;
    private String login;
    private String password;
    private UserStatus userStatus;
    private Date dateCreation;
    private Date dateModification;
    private Profil profil;
}
