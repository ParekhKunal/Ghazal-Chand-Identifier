package com.example.ghazal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    CardView btnLogOut;
    FirebaseAuth mAuth;
    int backpress = 0;
    private long pressedTime;
    CardView aboutt,Ghazalcard,help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView contributeCard = (CardView) findViewById(R.id.InputCard);

        contributeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this, InputGhazal.class);
                startActivity(i1);
            }
        });

        btnLogOut = findViewById(R.id.logoutCard);
        mAuth = FirebaseAuth.getInstance();

        btnLogOut.setOnClickListener(view -> {
            mAuth.signOut();
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
        });

        aboutt=(CardView) findViewById(R.id.AboutCard);
        aboutt.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,AboutActivity.class));
        });
        Ghazalcard=(CardView) findViewById(R.id.GhazalCard);
        Ghazalcard.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,GhazalCard.class));
        });
        help=(CardView) findViewById(R.id.helpcard);
        help.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,HelpCard.class));
        });

    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(false);
        if (pressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finish();
        } else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        pressedTime = System.currentTimeMillis();
    }

    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if (user == null) {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
        }
    }


}