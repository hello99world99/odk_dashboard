package com.example.odkApprenant.model;

import javax.persistence.*;

@Entity
public class Presence {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
    @OneToOne(mappedBy = "presence", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Apprenant apprenant_id;
}
