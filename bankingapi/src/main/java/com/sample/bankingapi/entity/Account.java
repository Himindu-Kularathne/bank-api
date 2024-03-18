package com.sample.bankingapi.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Table(name = "accounts")
@Entity
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name ="account_holder_name")
    private String accountHolderName;

    @Column(name = "balance")
    private Double balance;



}
