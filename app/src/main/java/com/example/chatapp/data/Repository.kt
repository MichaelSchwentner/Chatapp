package com.example.chatapp.data

import com.example.chatapp.R
import com.example.chatapp.data.model.Contacts

class Repository {

    fun loadContacts(): List<Contacts> {
        return listOf(
            Contacts(
                1,
                "Brat Pit",
                R.drawable.brad

            ),
            Contacts(
                2,
                "Emma",
                R.drawable.emma

            ),
            Contacts(
                3,
                "Jennifer",
                R.drawable.jennifer

            ),
            Contacts(
                4,
                "Johny",
                R.drawable.johnny

            ),
            Contacts(
                5,
                "Keanu",
                R.drawable.keanu

            ),
            Contacts(
                6,
                "Leo",
                R.drawable.leo

            ),
            Contacts(
                7,
                "Margot",
                R.drawable.margot

            ),
            Contacts(
                8,
                "Reese",
                R.drawable.reese

            ),
            Contacts(
                9,
                "Sandra",
                R.drawable.sandra

            ),
            Contacts(
                10,
                "Scarlet",
                R.drawable.scarlett

            ),
            Contacts(
                11,
                "Tom",
                R.drawable.tom

            ),
            Contacts(
                12,
                "Will",
                R.drawable.will

            ),
        )
    }
}