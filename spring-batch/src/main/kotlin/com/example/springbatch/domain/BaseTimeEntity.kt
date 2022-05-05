package com.example.springbatch.domain

import java.sql.Timestamp
import javax.persistence.Column
import javax.persistence.MappedSuperclass
import javax.persistence.PrePersist
import javax.persistence.PreUpdate

@MappedSuperclass
abstract class BaseTimeEntity {
    @Column(updatable = false)
    lateinit var createdAt: Timestamp
    lateinit var updatedAt: Timestamp

    @PrePersist
    fun onCreate() {
        this.createdAt = Timestamp(System.currentTimeMillis())
    }

    @PreUpdate
    fun onUpdate() {
        this.updatedAt = Timestamp(System.currentTimeMillis())
    }
}