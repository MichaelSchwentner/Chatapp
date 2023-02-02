package com.example.chatapp.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.chatapp.MainViewModel
import com.example.chatapp.adapter.ContactsAdapter
import com.example.chatapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val contactsAdapter = ContactsAdapter()
        binding.contactsRecycler.adapter = contactsAdapter

        viewModel.contacts.observe(viewLifecycleOwner, Observer {
            Log.d("HomeFragment", "contactList livedata received")
            contactsAdapter.submitList(it)
        })

        }
    }


