package com.spring.starter.entity

import javax.persistence.*

@Entity
@Table(name = "user")
class User (
    @Column(name = "userId", unique = true)
    val userId: String,

    @Column(name = "password")
    val password: String

):BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
}

