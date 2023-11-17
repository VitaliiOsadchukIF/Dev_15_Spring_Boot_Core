package org.example.exceptions;

public class NotesExceptions extends Exception {

    public NotesExceptions(Long id) {
    super("Note not found with id " + id);
    }
}