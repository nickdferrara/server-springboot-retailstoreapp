package com.nickdferrara.retailstoreapp.location.store.service

import com.nickdferrara.retailstoreapp.location.store.repository.StoreRepository
import org.springframework.stereotype.Service

@Service
class StoreService(
    val storeRepository: StoreRepository
) {
    fun findByStoreNumber(storeNumber: Int) = storeRepository.findByStoreNumber(storeNumber)
}