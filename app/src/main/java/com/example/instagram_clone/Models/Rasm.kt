package com.example.instagram_clone.Models

class Rasm {
    var rasmLink:String? =null
    var rasmText:String? =null

    constructor(rasmLink: String?, rasmText: String?) {
        this.rasmLink = rasmLink
        this.rasmText = rasmText
    }

    override fun toString(): String {
        return "Rasm(rasmLink=$rasmLink, rasmText=$rasmText)"
    }


}