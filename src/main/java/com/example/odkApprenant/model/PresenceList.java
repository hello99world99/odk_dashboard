package com.example.odkApprenant.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class PresenceList {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;
    private LocalDate date = LocalDate.now();
    private LocalTime heure_arrive = LocalTime.now();
    private LocalTime heure_depart;
}
