package com.yoel.composeroomapp

import androidx.room.Entity import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class Task( @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val isCompleted: Boolean = false
)
