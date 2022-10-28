package com.flickkkrr.gestionusuarios.feature_users.domain.use_cases

import com.flickkkrr.gestionusuarios.feature_users.domain.model.User
import com.flickkkrr.gestionusuarios.feature_users.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetUser @Inject constructor(
    private val repository: UserRepository
){
    suspend operator fun invoke(id: Int): User? {
        return repository.getUserById(id)
    }
}