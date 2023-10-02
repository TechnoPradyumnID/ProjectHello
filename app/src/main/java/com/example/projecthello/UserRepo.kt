package com.example.projecthello

import android.util.Log
import javax.inject.Inject

const val TAG = "HELLO"


interface UserRepo{
    fun saveUser(email: String,password: String)
}

//class FirebaseRepo @Inject constructor(private val loggerService: LoggerService): UserRepo {
//    override fun saveUser(email: String, password: String){
//        loggerService.log("User saves in firebase")
//    }
//}



class FirebaseRepo @Inject constructor(): UserRepo {
    override fun saveUser(email: String, password: String){
        Log.d(TAG,"User saves in firebase")
    }
}

class SQLRepo : UserRepo {
    override fun saveUser(email: String, password: String){
        Log.d(TAG,"User saves in DB")
    }
}