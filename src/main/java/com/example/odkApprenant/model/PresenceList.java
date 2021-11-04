package com.example.odkApprenant.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class PresenceList {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @OneToMany (targetEntity = Users.class, mappedBy = "users", cascade = CascadeType.ALL)
    @Column(name = "user_id")
    private List<Users> users;

    private LocalDateTime localDateTime = LocalDateTime.now();
}
