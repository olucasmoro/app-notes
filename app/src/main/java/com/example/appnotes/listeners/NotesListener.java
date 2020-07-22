package com.example.appnotes.listeners;

import com.example.appnotes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
