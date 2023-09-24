package com.example.projecthello

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class UserModule {

    @Provides
    fun provideUserRepo(): UserRepo{

        return SQLRepo()
    }

}