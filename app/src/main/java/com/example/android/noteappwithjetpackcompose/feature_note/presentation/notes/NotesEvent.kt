package com.example.android.noteappwithjetpackcompose.feature_note.presentation.notes

import com.example.android.noteappwithjetpackcompose.feature_note.domain.model.Note
import com.example.android.noteappwithjetpackcompose.feature_note.domain.util.NoteOrder
//Events that users can able to do on the screen
sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()
}
