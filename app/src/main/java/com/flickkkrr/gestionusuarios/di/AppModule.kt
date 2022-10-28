package com.flickkkrr.gestionusuarios.di

import android.app.Application
import androidx.room.Room
import com.flickkkrr.gestionusuarios.feature_users.data.repository.UserRepositoryImpl
import com.flickkkrr.gestionusuarios.feature_users.data.source.local.UserDatabase
import com.flickkkrr.gestionusuarios.feature_users.domain.repository.UserRepository
import com.flickkkrr.gestionusuarios.utils.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideUserDataBase(app: Application) = Room.databaseBuilder(
        app,
        UserDatabase::class.java,
        DATABASE_NAME
    ).build()

    @Provides
    @Singleton
    fun providesRepository(db: UserDatabase): UserRepository {
        return UserRepositoryImpl(db.userDao)
    }
}