package com.nickdferrara.retailstoreapp.location.store.models

import jakarta.persistence.*
import org.hibernate.annotations.UuidGenerator
import java.time.DayOfWeek
import java.time.LocalTime
import java.util.*

@Entity
@Table(name = "Store_Hours")
class StoreHour(
    val dayOfWeek: DayOfWeek,
    val openingTime: LocalTime,
    val closingTime: LocalTime,

    @Id @UuidGenerator
    var id: UUID? = null,
)