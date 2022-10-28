package com.flickkkrr.gestionusuarios.feature_users.domain.use_cases

import com.flickkkrr.gestionusuarios.feature_users.data.repository.UserRepositoryImpl
import com.flickkkrr.gestionusuarios.feature_users.domain.model.User
import com.flickkkrr.gestionusuarios.feature_users.domain.repository.UserRepository
import javax.inject.Inject

class InsertUser @Inject constructor(
    private val repository: UserRepository
) {
    suspend operator fun invoke(user: User){
        repository.insertUser(user)
    }
}