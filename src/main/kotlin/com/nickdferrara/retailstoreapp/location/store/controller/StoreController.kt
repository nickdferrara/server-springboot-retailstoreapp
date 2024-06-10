package com.nickdferrara.retailstoreapp.location.store.controller

import com.nickdferrara.retailstoreapp.location.store.models.Store
import com.nickdferrara.retailstoreapp.location.store.service.StoreService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/stores")
class StoreController(
    val storeService: StoreService
) {

    @GetMapping("/{storeNumber}")
    fun findByStoreNumber(@PathVariable storeNumber: String): ResponseEntity<Store> {
        val store = storeService.findByStoreNumber(storeNumber.toInt())
        return store.let { ResponseEntity.ok(it) }
    }
}