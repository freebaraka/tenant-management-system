package com.example.tmsas.data.repository

import androidx.lifecycle.LiveData
import com.example.tmsas.data.local.TenantDao
import com.example.tmsas.data.model.Tenant

class TenantRepository(private val tenantDao: TenantDao) {

    val tenants: LiveData<List<Tenant>> = tenantDao.getAllTenants()

    suspend fun addTenant(tenant: Tenant) {
        tenantDao.insertTenant(tenant)
    }
}