package com.alinedev.application.system.repository

import com.alinedev.application.system.entity.Credit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository //Não precisa pois o extends já faz isso
interface CreditRepository: JpaRepository<Credit, Long>