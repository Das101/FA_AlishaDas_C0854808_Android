package com.example.fa_alishadas_c0854808_android.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.fa_alishadas_c0854808_android.model.Place;


@Database(entities = {Place.class}, version = 1, exportSchema = false)
public abstract class ApplicationDatabase extends RoomDatabase {
    public abstract PlaceDao placeDao();
}

