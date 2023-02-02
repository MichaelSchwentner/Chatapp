package com.example.chatapp.adapter
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.chatapp.R
import com.example.chatapp.data.model.Contacts
import com.example.chatapp.ui.HomeFragmentDirections

class ContactsAdapter() : RecyclerView.Adapter<ContactsAdapter.ItemViewHolder>() {

    private var dataset = listOf<Contacts>()

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.contacts_name_text)
        val image: ImageView = view.findViewById(R.id.contacts_image)
        val card: CardView = view.findViewById(R.id.contacts_card)
    }

    fun submitList(list: List<Contacts>){
        dataset = list
        notifyDataSetChanged()
        Log.d("ContactsAdapter", "contactslist submitted")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.contacts_item, parent, false)

        return ItemViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val contact = dataset[position]

        holder.name.text = contact.name
        holder.image.setImageResource(contact.imageResourceId)



        holder.card.setOnClickListener {
           holder.itemView.findNavController()
                .navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment(contact.id))
       }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}