package com.example.criminalintent

import java.util.*

data class Crime(var id: UUID = UUID.randomUUID()){
    var name: String = " ";  var date: Date = Date(); var status: Boolean = false
        constructor(name: String, id: UUID, date: Date,status: Boolean) : this(id){
            this.name = name
            this.date = date
            this.status = status
            this.id = id
        }
    }





