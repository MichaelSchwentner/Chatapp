package com.example.chatapp.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.chatapp.MainViewModel
import com.example.chatapp.adapter.CommentAdapter
import com.example.chatapp.databinding.FragmnentDetailBinding


class DetailFragmnent : Fragment() {

    private lateinit var binding: FragmnentDetailBinding
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmnentDetailBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val contactsIndex = requireArguments().getInt("position")

        binding.detailToolbar.title = viewModel.contacts.value!![contactsIndex].name


        viewModel.loadComments(contactsIndex)

        val commentAdapter = CommentAdapter()
        binding.detailCommentRecycler.adapter = commentAdapter

        viewModel.commentList.observe(viewLifecycleOwner) {
            commentAdapter.submitList(it)


            binding.detailCommentSendButton.setOnClickListener {
                val newComment = binding.detailCommentEdit.text.toString()
                viewModel.addComment(newComment)
                binding.detailCommentEdit.setText("")
            }

        }

    }
}