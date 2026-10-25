package com.example.roomdbapp
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName ="tblUser")
data class User(
    val firstName:String,
    val lastName:String,
    val email:String,
    @PrimaryKey(autoGenerate=true)
    val id:Int = 0
)
