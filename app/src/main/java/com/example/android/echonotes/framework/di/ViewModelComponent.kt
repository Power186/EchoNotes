package com.example.android.echonotes.framework.di

import com.example.android.echonotes.framework.ListViewModel
import com.example.android.echonotes.framework.NoteViewModel
import dagger.Component

@Component(modules = [ApplicationModule::class, RepositoryModule::class, UseCasesModule::class])
interface ViewModelComponent {
    fun inject(noteViewModel: NoteViewModel)
    fun inject(listViewModel: ListViewModel)
}