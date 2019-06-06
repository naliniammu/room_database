package net.simplifiedcoding.mytodo;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import net.simplifiedcoding.mytodo.entity.Task;

@Database(entities = {Task.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();
}
