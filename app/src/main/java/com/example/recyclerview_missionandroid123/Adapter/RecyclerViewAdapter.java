package com.example.recyclerview_missionandroid123.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_missionandroid123.Model.Contact;
import com.example.recyclerview_missionandroid123.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context context;
    private List<Contact> contactList;

    public RecyclerViewAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //binding views and data
        Contact contact = contactList.get(position);
        holder.userName.setText(contact.getName());
        holder.emailId.setText(contact.getEmailId());
        holder.mobileNumber.setText(contact.getMobileNumber());
        holder.cardView.setCardBackgroundColor(context.getResources().getColor(R.color.colorCard));
    }


    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView userName;
        public TextView emailId;
        public TextView mobileNumber;
        public CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userName = itemView.findViewById(R.id.name_textView);
            emailId = itemView.findViewById(R.id.emailId_textView);
            mobileNumber = itemView.findViewById(R.id.mobileNumber_textView);
            cardView = itemView.findViewById(R.id.cardView_cardView);
        }
    }
}
