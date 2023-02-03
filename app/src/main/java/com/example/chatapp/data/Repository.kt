package com.example.chatapp.data

import com.example.chatapp.R
import com.example.chatapp.data.model.Contacts

class Repository {

    fun loadContacts(): List<Contacts> {

        return listOf(
            Contacts(
                1,
                "Brat Pit",
                R.drawable.brad,
                mutableListOf()

            ),
            Contacts(
                2,
                "Emma",
                R.drawable.emma,
                mutableListOf("top", "flop", "Erster")

            ),
            Contacts(
                3,
                "Jennifer",
                R.drawable.jennifer,
                mutableListOf()

            ),
            Contacts(
                4,
                "Johny",
                R.drawable.johnny,
                mutableListOf()

            ),
            Contacts(
                5,
                "Keanu",
                R.drawable.keanu,
                mutableListOf()

            ),
            Contacts(
                6,
                "Leo",
                R.drawable.leo,
                mutableListOf()

            ),
            Contacts(
                7,
                "Margot",
                R.drawable.margot,
                mutableListOf()

            ),
            Contacts(
                8,
                "Reese",
                R.drawable.reese,
                mutableListOf()

            ),
            Contacts(
                9,
                "Sandra",
                R.drawable.sandra,
                mutableListOf()

            ),
            Contacts(
                10,
                "Scarlet",
                R.drawable.scarlett,
                mutableListOf()

            ),
            Contacts(
                11,
                "Tom",
                R.drawable.tom,
                mutableListOf()

            ),
            Contacts(
                12,
                "Will",
                R.drawable.will,
                mutableListOf()

            ),
        )
    }
}