package com.example.kotlinbddcdalyon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = Database(this)

        //faker
        if(database.getUsersCount() == 0) {
            database.createUser(User("Boby", 23, "Other"))
            database.createUser(User("Hugo", 11, "M"))
            database.createUser(User("John", 44, "M"))
            database.createUser(User("Dadule", 55, "M"))
            database.createUser(User("Frodon", 32, "M"))
            database.createUser(User("Gandalf", 77, "M"))
        }
        val users = database.getAllUsers()
        for ( user in users){
            Log.i("MainActivity", "Database USER :" + user)
        }
    }
}