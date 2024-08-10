package com.example.recycleview

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity

import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.databinding.ActivityMainBinding
import com.example.recycleview.ui.theme.RecycleViewTheme

class MainActivity : ComponentActivity() {
    var users : MutableList<User> = mutableListOf<User>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        val view : View = binding.root
        setContentView(view)

             users = mutableListOf<User>(
                User("Ahmed Mohamed", "ahmed@gmail.com"),
                User("Mahmoud Mohamed", "mahmoud@gmail.com"),
                User("Mona Ahmed", "mona@gmail.com"),
                 User("laila Ahmed", "laila@gmail.com"),
                User("Menna Ali", "menna@gmail.com"),
                 User("hager Ali", "hager@gmail.com"),
                 User("ahmed Ali", "ahmed@gmail.com"),
                 User("esraa Ali", "esraa@gmail.com"),
                User("Youssef Mohamed", "youssef@gmail.com"),
                User("Yassmin Ahmed", "yassmine@gmail.com"),
                User("Mohamed Ali", "mohamed@gmail.com"),
                User("Farida Mohamed", "youssef@gmail.com"),
                User("Asmaa Hamdy" , "asmaaeltalawy2004@gmail.com")
            )

            val userAdapter = UserAdapter(users)
            binding.rvStudents.adapter = userAdapter



}
}

