package com.example.mvvmapp.data

import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.example.mvvmapp.models.User
import com.example.mvvmapp.navigation.ROUTE_HOME
import com.example.mvvmapp.navigation.ROUTE_LOGIN
import com.example.mvvmapp.navigation.ROUTE_REGISTER
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class AuthViewModel(var navController: NavHostController,
    var context:Context)
{
    var mAuth:FirebaseAuth

    init {
        mAuth= FirebaseAuth.getInstance()
    }

    fun signup(username:String, email:String, pass:String, confpass:String){
        if (username.isBlank() || email.isBlank() || pass.isBlank() || confpass.isBlank()){
            Toast.makeText(context, " Please fill in all details", Toast.LENGTH_LONG).show()
        } else
            if (pass != confpass){
                Toast.makeText(context, "Password do not match", Toast.LENGTH_LONG).show()
            } else{
                mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener {

                    if (it.isSuccessful){
                        val userData = User(username,email,pass,confpass, mAuth.currentUser!!.uid)
                        val regRef = FirebaseDatabase.getInstance().getReference()
                            .child("Users/"+ mAuth.currentUser!!.uid)
                        regRef.setValue(userData).addOnCompleteListener {
                            if (it.isSuccessful){
                                Toast.makeText(context,"User created successfully", Toast.LENGTH_LONG).show()
                                navController.navigate(ROUTE_LOGIN)
                            }else{
                                Toast.makeText(context,"${it.exception!!.message}", Toast.LENGTH_LONG).show()
                                navController.navigate(ROUTE_REGISTER)
                            }
                        }}
                        else{
                            navController.navigate(ROUTE_REGISTER)
                        }
                    }
                }
            }
    fun login(email:String, pass:String){
        mAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener {

            if (it.isSuccessful){
                Toast.makeText(context, "Successfully logged In", Toast.LENGTH_LONG).show()
                    navController.navigate(ROUTE_HOME)
                }
            else{
                Toast.makeText(context,"${it.exception!!.message}", Toast.LENGTH_LONG).show()
                navController.navigate(ROUTE_LOGIN)
            }
        }
    }
    fun logout(){
        mAuth.signOut()
        navController.navigate(ROUTE_LOGIN)


    }
    fun isloggedin():Boolean{
        return mAuth.currentUser !=null
    }
    }


