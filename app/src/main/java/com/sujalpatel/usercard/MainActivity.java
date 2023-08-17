package com.sujalpatel.usercard;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    TextView profileName, profileEmail, profileUsername, profilePosition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profileName = findViewById(R.id.username);
        profileEmail=findViewById(R.id.email);
        profileUsername = findViewById(R.id.fullname);
        profilePosition = findViewById(R.id.position);

        showUserData();


    }

    public void showUserData(){

        Intent intent = getIntent();

        String nameUser = intent.getStringExtra("name");
        String positionUser = intent.getStringExtra("position");
        String usernameUser = intent.getStringExtra("username");
        String emailUser = intent.getStringExtra("email");



        profileName.setText(nameUser);
        profileEmail.setText(emailUser);
        profileUsername.setText(usernameUser);
        profilePosition.setText(positionUser);
    }

}