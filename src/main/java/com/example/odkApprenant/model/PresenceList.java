package com.example.odkApprenant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class PresenceList {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long Id;
    @ManyToOne (targetEntity = Users.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id") private List<Users> users;
    private LocalDate localDate;
}
