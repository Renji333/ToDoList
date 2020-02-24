package com.example.todolist.tasklist

import org.json.JSONException

class Task @Throws(JSONException::class) constructor(id: String, title: String, description: String? = "") {

    var id: String? = null
    var title: String? = null
    var description: String? = null

    init {

        this.id = id
        this.title = title
        this.description = description

    }

}
