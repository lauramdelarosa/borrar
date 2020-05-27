package com.delarosa.myapplication

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

fun Application.initDI() {
    startKoin {
        androidLogger()
        androidContext(this@initDI)
        modules(listOf(viewModels))
    }
}

val viewModels = module {
    viewModel { AuthViewModel(get()) }
    single { AuthRepositoryImpl() as AuthRepository }
}