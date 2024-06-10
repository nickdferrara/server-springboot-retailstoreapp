package com.nickdferrara.retailstoreapp.location.store.repository


import com.nickdferrara.retailstoreapp.location.store.models.Store
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface StoreRepository: JpaRepository<Store, String> {
    fun findByStoreNumber(storeNumber: Int): Store
}