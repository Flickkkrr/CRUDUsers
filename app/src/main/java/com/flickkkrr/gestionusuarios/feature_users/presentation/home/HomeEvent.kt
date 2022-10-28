package com.flickkkrr.gestionusuarios.feature_users.presentation.home

import com.flickkkrr.gestionusuarios.feature_users.domain.model.User

sealed class HomeEvent {
    data class DeleteUser(val user: User): HomeEvent()
}