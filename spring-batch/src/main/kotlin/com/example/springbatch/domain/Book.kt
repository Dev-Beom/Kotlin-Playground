package com.example.springbatch.domain

import java.io.Serializable
import javax.persistence.*

@Entity
@Table
class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var bookId: Long? = null,
    var name: String? = null,
    var author: String? = null,
    var bookStoreId: Long? = null
) : BaseTimeEntity(), Serializable {}