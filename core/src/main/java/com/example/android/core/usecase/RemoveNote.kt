package com.example.android.core.usecase

import com.example.android.core.data.Note
import com.example.android.core.repository.NoteRepository

class RemoveNote (private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.removeNote(note)
}