package com.example.android.core.usecase

import com.example.android.core.repository.NoteRepository

class GetAllNotes (private val noteRepository: NoteRepository){
    suspend operator fun invoke() = noteRepository.getAllNotes()
}