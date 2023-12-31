package com.miempresa.lab09_2.model

import android.icu.text.CaseMap.Title
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "stopwach")
data class Stopwatch(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = "time")
    val time : Long
)
