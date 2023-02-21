package com.example.bankingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class TransactionHistory extends AppCompatActivity {
    SQLiteDatabase db;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_history);
        db=openOrCreateDatabase("Bank Database",MODE_PRIVATE,null);
        tv=findViewById(R.id.th);
        Cursor c=db.rawQuery("select * from TRANSACTION_TABLE",null);
        if(c.getCount()==0){
            tv.setText("No Transaction Done Yet");
        }
        else{
            c.moveToLast();
            String all="";
            do{
                int amount=c.getInt(0);
                String senacc=c.getString(1);
                int senbalance=c.getInt(2);
                String recacc=c.getString(3);
                int recbalance=c.getInt(4);
                all=all+"\nAmount:"+amount+"\nSender Account Number:"+senacc+"\t\tSender Balance:"+senbalance+"\nReciever Account Number:"+recacc+"\t\tReciever Balance:"+recbalance+"\n";
            }while (c.moveToPrevious());
            tv.setText(all);
        }

    }
}