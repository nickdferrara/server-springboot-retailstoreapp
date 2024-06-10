package com.nickdferrara.retailstoreapp.location.store.models

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
@Table(name = "Store_Address")
class StoreAddress(
    val street: String? = null,
    val city: String? = null,
    val state: String? = null,
    val zip: Int?  = null,

    @Id @UuidGenerator
    var id: UUID? = null,
)
