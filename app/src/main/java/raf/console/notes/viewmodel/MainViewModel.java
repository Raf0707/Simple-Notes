package raf.console.notes.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import raf.console.notes.App;
import raf.console.notes.model.Note;

public class MainViewModel extends ViewModel {
    private LiveData<List<Note>> noteLiveData = App.getInstance().getNoteDao().getAllNotes();

    public LiveData<List<Note>> getNoteLiveData() {
        return noteLiveData;
    }
}
