package com.flickkkrr.gestionusuarios.feature_users.presentation.home

import com.flickkkrr.gestionusuarios.feature_users.domain.model.User

data class HomeState (
    val users: List<User> = emptyList()
    )