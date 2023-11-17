package org.example.services;

import org.example.entities.Note;
import org.example.exceptions.NotesExceptions;

import java.util.Map;

public interface INoteService {

    Map<Long, Note> listAll();
    Note add(Note note);
    void deleteById(Long id) throws NotesExceptions;
    void update(Long id, Note note) throws NotesExceptions;
    Note getById(Long id) throws NotesExceptions;
}
