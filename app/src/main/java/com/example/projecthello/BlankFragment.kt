package com.example.projecthello

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class BlankFragment : Fragment() {

    @Inject
    @Named("sql") // By Name
    lateinit var userRepo : UserRepo


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        userRepo.saveUser("hello@gmail.com","12345")

        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

}