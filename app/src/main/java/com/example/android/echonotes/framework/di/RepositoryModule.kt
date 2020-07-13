package com.example.android.echonotes.framework.di

import android.app.Application
import com.example.android.core.repository.NoteRepository
import com.example.android.echonotes.framework.RoomNoteDataSource
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun provideRepository(app: Application) = NoteRepository(RoomNoteDataSource(app))
}