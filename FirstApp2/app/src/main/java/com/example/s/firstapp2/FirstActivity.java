package com.example.s.firstapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    private Button RememberButton, ForgotButton;
    private EditText NameText, EmailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        RememberButton = (Button) findViewById(R.id.first_button);
        ForgotButton = (Button) findViewById(R.id.button_2);
        NameText = (EditText) findViewById(R.id.editText_name);
        EmailText = (EditText) findViewById(R.id.editText3);
    }

    public void onGetNameInput(View view) {
        String usersName = String.valueOf(NameText.getText());
        String usersEmail = String.valueOf(EmailText.getText());
        String message = "Hello "+usersName+" , your email is "+usersEmail+".";

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    public void onForgotButton(View view) {
        String badResponse = "Dummy!";
        Toast.makeText(this, badResponse, Toast.LENGTH_SHORT).show();
    }

}
