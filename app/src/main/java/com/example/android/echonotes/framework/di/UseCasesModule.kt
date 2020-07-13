package com.example.android.echonotes.framework.di

import com.example.android.core.repository.NoteRepository
import com.example.android.core.usecase.*
import com.example.android.echonotes.framework.UseCases
import dagger.Module
import dagger.Provides

@Module
class UseCasesModule {
    @Provides
    fun getUsesCases(repository: NoteRepository) = UseCases(
        AddNote(repository),
        GetAllNotes(repository),
        GetNote(repository),
        RemoveNote(repository),
        GetWordCount()
    )
}