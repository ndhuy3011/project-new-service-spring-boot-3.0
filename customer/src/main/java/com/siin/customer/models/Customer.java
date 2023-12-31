package com.siin.customer.models;

import java.util.Date;
import java.util.UUID;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@DynamicUpdate
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long custNo;

    @Column(unique = true, nullable = false, updatable = false)
    private UUID uuid;

    @Column
    private String lastName;

    @Column
    private String fristName;

    @Column
    private Date birthday;

    @Column(nullable = false)
    private String numberPhone;

}
