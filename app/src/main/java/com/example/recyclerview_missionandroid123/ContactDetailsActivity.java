package com.example.recyclerview_missionandroid123;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.TextView;

public class ContactDetailsActivity extends AppCompatActivity {

    private TextView name;
    private TextView emailId;
    private TextView mobileNumber;
    private CardView cardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactdetails);

        name = findViewById(R.id.nameDetail_textView);
        emailId = findViewById(R.id.emailIdDetail_textView);
        mobileNumber = findViewById(R.id.mobileNumberDetail_textView);
        cardView = findViewById(R.id.cardViewDetails_cardView);
        cardView.setCardBackgroundColor(getResources().getColor(R.color.colorCard));
        Bundle bundle = getIntent().getExtras();

        if(bundle!=null) {
            name.setText(bundle.getString("name"));
            emailId.setText(bundle.getString("emailId"));
            mobileNumber.setText(bundle.getString("mobileNumber"));
        }
    }
}
