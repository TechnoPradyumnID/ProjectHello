package com.example.projecthello

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
class UserModule {

    @Provides
    @Named("sql") // By name
    fun provideSQLRepo(): UserRepo{

        return SQLRepo()
    }


    @Provides
    @FirebaseQualifire // By own Annotation
    fun provideFirebaseRepo(firebaseRepo: FirebaseRepo): UserRepo{
        return firebaseRepo
    }

//    @Binds
//    abstract fun bindsUserRepo(firebaseRepo: FirebaseRepo): UserRepo

}