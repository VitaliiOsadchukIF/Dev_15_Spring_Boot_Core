package org.example.services;

import org.example.entities.Note;
import org.example.exceptions.NotesExceptions;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class NoteService implements INoteService {

    private final Map<Long, Note> notes = new ConcurrentHashMap<>();
    private final Random random = new Random();

    @Override
    public Map<Long, Note> listAll() {
        return notes;
    }

    private Long generateId() {
        return Math.abs(random.nextLong() * 10);
    }

    @Override
    public Note add(Note note) {
        Long id = generateId();
        notes.put(id, note);
        return note;
    }

    @Override
    public void deleteById(Long id) throws NotesExceptions {
        if (notes.containsKey(id)) {
            notes.remove(id);
        } else {
            throw new NotesExceptions(id);
        }
    }

    @Override
    public void update(Long id, Note note) throws NotesExceptions {
if (notes.containsKey(id)) {
    Note isNote = notes.get(id);
    isNote.setTitle(note.get);
}
    }

    @Override
    public Note getById(Long id) throws NotesExceptions {
        return null;
    }
}
