package com.example.bankingapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class select_Customer extends AppCompatActivity {
    EditText amount;
    Button c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_customer);
        amount=findViewById(R.id.amount);
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);
        c5=findViewById(R.id.c5);
        c6=findViewById(R.id.c6);
        c7=findViewById(R.id.c7);
        c8=findViewById(R.id.c8);
        c9=findViewById(R.id.c9);
        c10=findViewById(R.id.c10);
        db=openOrCreateDatabase("Bank Database",MODE_PRIVATE,null);
        Intent i4=getIntent();
        String accno=i4.getStringExtra("account_number");
        int bal=i4.getIntExtra("balance",0);
        amount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String amnt=amount.getText().toString().trim();
                c1.setEnabled(!amnt.isEmpty());
                c2.setEnabled(!amnt.isEmpty());
                c3.setEnabled(!amnt.isEmpty());
                c4.setEnabled(!amnt.isEmpty());
                c5.setEnabled(!amnt.isEmpty());
                c6.setEnabled(!amnt.isEmpty());
                c7.setEnabled(!amnt.isEmpty());
                c8.setEnabled(!amnt.isEmpty());
                c9.setEnabled(!amnt.isEmpty());
                c10.setEnabled(!amnt.isEmpty());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amnt=Integer.parseInt(amount.getText().toString().trim());
                if(amnt>bal){
                    alert_box1();
                }
                else{
                    alert("Akash Shetty","1234567890",amnt,bal,accno);
                    }
                }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amnt=Integer.parseInt(amount.getText().toString().trim());
                if(amnt>bal){
                    alert_box1();
                }
                else{
                    alert("Anusha Joshi","1212128989",amnt,bal,accno);
                }
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amnt=Integer.parseInt(amount.getText().toString().trim());
                if(amnt>bal){
                    alert_box1();
                }
                else{
                    alert("Nitin Jain","1298459269",amnt,bal,accno);
                }
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amnt=Integer.parseInt(amount.getText().toString().trim());
                if(amnt>bal){
                    alert_box1();
                }
                else{
                    alert("Avneet Roshan","1216472745",amnt,bal,accno);
                }
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amnt=Integer.parseInt(amount.getText().toString().trim());
                if(amnt>bal){
                    alert_box1();
                }
                else{
                    alert("Sashank Singh","1291635294",amnt,bal,accno);
                }
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amnt=Integer.parseInt(amount.getText().toString().trim());
                if(amnt>bal){
                    alert_box1();
                }
                else{
                    alert("Deepika Mohan","1209361372",amnt,bal,accno);
                }
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amnt=Integer.parseInt(amount.getText().toString().trim());
                if(amnt>bal){
                    alert_box1();
                }
                else{
                    alert("Vadika Sharma","1284624364",amnt,bal,accno);
                }
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amnt=Integer.parseInt(amount.getText().toString().trim());
                if(amnt>bal){
                    alert_box1();
                }
                else{
                    alert("Varn Verma","1274528362",amnt,bal,accno);
                }
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amnt=Integer.parseInt(amount.getText().toString().trim());
                if(amnt>bal){
                    alert_box1();
                }
                else{
                    alert("Sudeep Rathod","1285635283",amnt,bal,accno);
                }
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amnt=Integer.parseInt(amount.getText().toString().trim());
                if(amnt>bal){
                    alert_box1();
                }
                else{
                    alert("Anika Singh","1211338266",amnt,bal,accno);
                }
            }
        });
    }
    void alert_box1(){
        AlertDialog.Builder ad=new AlertDialog.Builder(select_Customer.this);
        ad.setTitle("Insufficent Balance");
        ad.setMessage("Want to Logout?");
        ad.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(select_Customer.this,customers.class));
            }
        });
        AlertDialog a=ad.create();
        a.show();
    }
    void alert_box2(){
        AlertDialog.Builder ps=new AlertDialog.Builder(select_Customer.this);
        ps.setMessage("Payment Successful");
        ps.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(select_Customer.this,MainActivity.class));
            }
        });
        AlertDialog ap=ps.create();
        ap.show();
    }
    void alert(String name,String acno,int amt,int bal,String accno){
        AlertDialog.Builder ad=new AlertDialog.Builder(select_Customer.this);
        ad.setTitle("Check");
        ad.setMessage("Transfer to "+name);
        ad.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Cursor c=db.rawQuery("select * from CUSTOMER_DETAILS where account_number='"+acno+"'",null);
                c.moveToFirst();
                int nbal;
                do{
                    nbal=c.getInt(7);
                }while (c.moveToNext());
                int newbalanceup=nbal+amt;
                int newbalance=bal-amt;
                db.execSQL("update CUSTOMER_DETAILS set balance="+newbalance+" where account_number='"+accno+"'");
                db.execSQL("update CUSTOMER_DETAILS set balance="+newbalanceup+" where account_number='"+acno+"'");
                db.execSQL("create table if not exists TRANSACTION_TABLE(transferAmount int,senderAccountNumber varchar(10),senderUpdatedBalance varchar(10),reciverAccountNumber varchar(10),reciverUpdatedBalance int)");
                db.execSQL("insert into TRANSACTION_TABLE values("+amt+",'"+accno+"',"+newbalance+",'"+acno+"',"+newbalanceup+")");
                alert_box2();
            }
        });
        AlertDialog a=ad.create();
        a.show();
    }


}