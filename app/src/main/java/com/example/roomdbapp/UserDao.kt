package com.example.roomdbapp
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Insert

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user:User)

    @Query("SELECT * FROM tblUser ORDER BY id ASC")
    fun readAllData(): LiveData<List<User>>
}