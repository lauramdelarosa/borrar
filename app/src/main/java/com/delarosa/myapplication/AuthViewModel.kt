package com.delarosa.myapplication

import androidx.lifecycle.ViewModel

class AuthViewModel(private val authRepository: AuthRepository) : ViewModel() {

    fun print() {
        val text = authRepository.print()
        print(text)
    }
}