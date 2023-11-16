package com.example.mvvmapp.models

class User{
    var username: String=""
    var email: String =""
    var pass: String=""
    var confpass: String =""
    var userid:String=""

    constructor(username:String, email:String, pass:String, confpass:String,
        userid:String){
        this.username= username
        this.email=email
        this.pass= pass
        this.confpass=confpass
        this.userid=userid
    }
    constructor()
}