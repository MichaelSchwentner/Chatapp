package com.example.chatapp

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.chatapp.data.Repository
import com.example.chatapp.data.model.Contacts
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val repository = Repository()

    private val _contacts = MutableLiveData<List<Contacts>>()
    val contacts: LiveData<List<Contacts>>
        get() = _contacts

    init {
        loadContacts()
        Log.d("MainViewModel","loading contactslist")
    }


    private fun loadContacts() {
        viewModelScope.launch {
            delay(2000)
            _contacts.value = repository.loadContacts()
        }
    }
}