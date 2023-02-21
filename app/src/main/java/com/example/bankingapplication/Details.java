package com.example.bankingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Details extends AppCompatActivity {
    TextView tv;
    Button sendmoney;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        tv=findViewById(R.id.textView);
        sendmoney=findViewById(R.id.sendmoney);
        db=openOrCreateDatabase("Bank Database",MODE_PRIVATE,null);
        Intent i2=getIntent();
        String al=i2.getStringExtra("deta");
        int bal=i2.getIntExtra("balance",0);
        String acc=i2.getStringExtra("accnoo");
        tv.setText(al);
        sendmoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(Details.this,select_Customer.class);
                i3.putExtra("balance",bal);
                i3.putExtra("account_number",acc);
                startActivityForResult(i3,1);
            }
        });

    }
}