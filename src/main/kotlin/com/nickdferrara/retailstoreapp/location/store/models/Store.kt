package com.nickdferrara.retailstoreapp.location.store.models

import jakarta.persistence.*
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
@Table(name = "Stores")
class Store(
    val storeNumber: Int,

    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    val storeHours: List<StoreHour> = emptyList(),

    @OneToOne(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    var address: StoreAddress,

    @Id @UuidGenerator
    var id: UUID? = null,
)
