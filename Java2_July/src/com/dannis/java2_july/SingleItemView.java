package com.dannis.java2_july;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
 
public class SingleItemView extends Activity {
    // Declare Variables
    TextView txtteamMembers;
    TextView txtName;
    TextView txtEmail;
    String teamMembers;
    String Name;
    String Email;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singleitemview);
        // Retrieve data from MainActivity on item click event
        Intent i = getIntent();
        // Get the results of teamMembers
        teamMembers = i.getStringExtra("teamMembers");
        // Get the results of Name
        Name = i.getStringExtra("Name");
        // Get the results of Email
        Email = i.getStringExtra("Email");
 
        // Locate the TextViews in singleitemview.xml
        txtteamMembers = (TextView) findViewById(R.id.teamMembers);
        txtName = (TextView) findViewById(R.id.Name);
        txtEmail = (TextView) findViewById(R.id.Email);
 
        // Load the results into the TextViews
        txtteamMembers.setText(teamMembers);
        txtName.setText(Name);
        txtEmail.setText(Email);
    }
}