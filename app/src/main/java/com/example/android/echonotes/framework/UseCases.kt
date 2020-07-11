package com.example.android.echonotes.framework

import com.example.android.core.usecase.AddNote
import com.example.android.core.usecase.GetAllNotes
import com.example.android.core.usecase.GetNote
import com.example.android.core.usecase.RemoveNote

data class UseCases(
    val addNote: AddNote,
    val getAllNotes: GetAllNotes,
    val getNote: GetNote,
    val removeNote: RemoveNote
)