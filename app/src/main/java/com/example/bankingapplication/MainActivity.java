package com.example.bankingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button viewcustomers,d;
    SQLiteDatabase db;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewcustomers=findViewById(R.id.bank);
        d=findViewById(R.id.c);
        db=openOrCreateDatabase("Bank Database",MODE_PRIVATE,null);
        db.execSQL("CREATE TABLE if not exists CUSTOMER_DETAILS(account_number bigint primary key,IFSC varchar(10),Name varchar(50),Gender char(1),dob date,email varchar(20),phonenumber bigint,balance money) ");
        viewcustomers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor c=db.rawQuery("select * from CUSTOMER_DETAILS ",null);
                if(c.getCount()==0){
                    db.execSQL("insert into CUSTOMER_DETAILS values(1234567890,'SBIN500234','Akash Shetty','M','10-10-2002','akashshetty12@gmail.com',9812981212,10000) ");
                    db.execSQL("insert into CUSTOMER_DETAILS values(1212128989,'SBIN500234','Anusha Joshi','F','08-06-1999','anjoshi32@gmail.com',9835472534,10000)");
                    db.execSQL("insert into CUSTOMER_DETAILS values(1298459269,'SBIN500234','Nitin Jain','M','22-12-1998','nitinjain98@gmail.com',8973543473,10000)");
                    db.execSQL("insert into CUSTOMER_DETAILS values(1216472745,'SBIN500234','Avneet Roshan','M','20-05-1999','avneetroshan89@gmail.com',9167362736,10000)");
                    db.execSQL("insert into CUSTOMER_DETAILS values(1291635294,'SBIN500234','Sashank Singh','M','31-01-2000','sashanksingh11@gmail.com',7492733483,10000)");
                    db.execSQL("insert into CUSTOMER_DETAILS values(1209361372,'SBIN500234','Deepika Mohan','F','26-02-2001','deepikamohan68@gmail.com',9273528475,10000)");
                    db.execSQL("insert into CUSTOMER_DETAILS values(1284624364,'SBIN500234','Vadika Sharma','F','02-09-1999','vadikasharma37@gmail.com',9173847392,10000)");
                    db.execSQL("insert into CUSTOMER_DETAILS values(1274528362,'SBIN500234','Varn Verma','M','18-08-1998','varunverma88@gmail.com',9192392934,10000)");
                    db.execSQL("insert into CUSTOMER_DETAILS values(1285635283,'SBIN500234','Sudeep Rathod','M','11-12-2000','rathodsudeep01@gmail.com',8823847293,10000)");
                    db.execSQL("insert into CUSTOMER_DETAILS values(1211338266,'SBIN500234','Anika Singh','F','04-04-2001','anikasingh42@gmail.com',8292472938,10000)");

                    startActivity(new Intent(MainActivity.this,customers.class));
                }
                else{
                    startActivity(new Intent(MainActivity.this,customers.class));
                }
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,TransactionHistory.class ));
            }
        });
    }
}