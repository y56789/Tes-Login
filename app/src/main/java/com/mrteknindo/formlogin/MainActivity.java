package com.mrteknindo.formlogin;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {
    EditText username, password;
    Button login, register, facebook, gmail, twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.EdUsername);
        password = (EditText) findViewById(R.id.EdPassword);
        login = (Button) findViewById(R.id.BtnLogin);
        register = (Button) findViewById(R.id.BtnRegister);
        facebook = (Button) findViewById(R.id.BtnFb);
        gmail = (Button) findViewById(R.id.BtnGmail);
        twitter = (Button) findViewById(R.id.BtnTwitter);


        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent pindah = new Intent(MainActivity.this, LoginBerhasil.class);
                startActivity(pindah);

            }
        });
        register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent pindah = new Intent(MainActivity.this, Register.class);
                startActivity(pindah);

            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Uri fb = Uri.parse("http://facebook.com");
                Intent intent3 = new Intent(Intent.ACTION_VIEW, fb);
                startActivity(intent3);

            }
        });

        gmail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Uri gmail = Uri.parse("http://gmail.com");
                Intent intent4 = new Intent(Intent.ACTION_VIEW, gmail);
                startActivity(intent4);

            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Uri twitter = Uri.parse("http://twitter.com");
                Intent intent5 = new Intent(Intent.ACTION_VIEW, twitter);
                startActivity(intent5);

            }
        });
    }

}

