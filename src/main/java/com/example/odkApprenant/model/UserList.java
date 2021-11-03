package com.example.odkApprenant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class UserList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    private Long id_user;
    private String profil;
}
