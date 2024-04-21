package raf.console.notes.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import raf.console.notes.dao.NoteDao;
import raf.console.notes.model.Note;

@Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();
}