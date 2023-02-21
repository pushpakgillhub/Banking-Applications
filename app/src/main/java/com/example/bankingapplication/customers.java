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

import org.w3c.dom.Text;

public class customers extends AppCompatActivity {
    Button customer1,customer2,customer3,customer4,customer5,customer6,customer7,customer8,customer9,customer10;
    SQLiteDatabase db;
    TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customers);
        customer1=findViewById(R.id.customer1);
        customer2=findViewById(R.id.customer2);
        customer3=findViewById(R.id.customer3);
        customer4=findViewById(R.id.customer4);
        customer5=findViewById(R.id.customer5);
        customer6=findViewById(R.id.customer6);
        customer7=findViewById(R.id.customer7);
        customer8=findViewById(R.id.customer8);
        customer9=findViewById(R.id.customer9);
        customer10=findViewById(R.id.customer10);
        tv3=findViewById(R.id.textView3);
        db=openOrCreateDatabase("Bank Database",MODE_PRIVATE,null);
        customer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(customers.this,Details.class);
                Cursor c=db.rawQuery("select * from CUSTOMER_DETAILS where account_number=1234567890 ",null);
                if(c.getCount()==0)
                    Toast.makeText(customers.this, "No data avilable", Toast.LENGTH_SHORT).show();
                else{
                    c.moveToFirst();
                    String accn, all="";
                    int amount;
                    do{
                        accn=c.getString(0);
                        String ifcs=c.getString(1);
                        String name=c.getString(2);
                        String gender=c.getString(3);
                        String date=c.getString(4);
                        String email=c.getString(5);
                        String phonenumber=c.getString(6);
                        amount=c.getInt(7);
                        all=all+"Account Number: "+accn+"\nIFSC Code:"+ifcs+"\nName:"+name+"\nGender :"+gender+"\nDate :"+date+"\nPhone Number:"+phonenumber+"\nBalance:"+amount+"\nEamil Id:"+email;

                    }while (c.moveToNext());
                    i1.putExtra("deta",all);
                    i1.putExtra("balance",amount);
                    i1.putExtra("accnoo",accn);
                    startActivityForResult(i1,1);
                }

            }
        });
        customer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(customers.this,Details.class);
                Cursor c=db.rawQuery("select * from CUSTOMER_DETAILS where account_number=1212128989",null);
                if(c.getCount()==0)
                    Toast.makeText(customers.this, "No data avilable", Toast.LENGTH_SHORT).show();
                else{
                    c.moveToFirst();
                    String accn,all="";
                    int amount;
                    do{
                        accn=c.getString(0);
                        String ifcs=c.getString(1);
                        String name=c.getString(2);
                        String gender=c.getString(3);
                        String date=c.getString(4);
                        String email=c.getString(5);
                        String phonenumber=c.getString(6);
                        amount=c.getInt(7);
                        all=all+"Account Number: "+accn+"\nIFSC Code:"+ifcs+"\nName:"+name+"\nGender :"+gender+"\nDate :"+date+"\nPhone Number:"+phonenumber+"\nBalance:"+amount+"\nEamil Id:"+email;
                    }while (c.moveToNext());
                    i1.putExtra("deta",all);
                    i1.putExtra("balance",amount);
                    i1.putExtra("accnoo",accn);
                    startActivityForResult(i1,1);
                }

            }
        });
        customer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(customers.this,Details.class);
                Cursor c=db.rawQuery("select * from CUSTOMER_DETAILS where account_number=1298459269",null);
                if(c.getCount()==0)
                    Toast.makeText(customers.this, "No data avilable", Toast.LENGTH_SHORT).show();
                else{
                    c.moveToFirst();
                    String accn,all="";
                    int amount;
                    do{
                        accn=c.getString(0);
                        String ifcs=c.getString(1);
                        String name=c.getString(2);
                        String gender=c.getString(3);
                        String date=c.getString(4);
                        String email=c.getString(5);
                        String phonenumber=c.getString(6);
                        amount=c.getInt(7);
                        all=all+"Account Number: "+accn+"\nIFSC Code:"+ifcs+"\nName:"+name+"\nGender :"+gender+"\nDate :"+date+"\nPhone Number:"+phonenumber+"\nBalance:"+amount+"\nEamil Id:"+email;
                    }while (c.moveToNext());
                    i1.putExtra("deta",all);
                    i1.putExtra("balance",amount);
                    i1.putExtra("accnoo",accn);
                    startActivityForResult(i1,1);
                }

            }
        });
        customer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(customers.this,Details.class);
                Cursor c=db.rawQuery("select * from CUSTOMER_DETAILS where account_number=1216472745",null);
                if(c.getCount()==0)
                    Toast.makeText(customers.this, "No data avilable", Toast.LENGTH_SHORT).show();
                else{
                    c.moveToFirst();
                    String accn,all="";
                    int amount;
                    do{
                        accn=c.getString(0);
                        String ifcs=c.getString(1);
                        String name=c.getString(2);
                        String gender=c.getString(3);
                        String date=c.getString(4);
                        String email=c.getString(5);
                        String phonenumber=c.getString(6);
                        amount=c.getInt(7);
                        all=all+"Account Number: "+accn+"\nIFSC Code:"+ifcs+"\nName:"+name+"\nGender :"+gender+"\nDate :"+date+"\nPhone Number:"+phonenumber+"\nBalance:"+amount+"\nEamil Id:"+email;
                    }while (c.moveToNext());
                    i1.putExtra("deta",all);
                    i1.putExtra("balance",amount);
                    i1.putExtra("accnoo",accn);
                    startActivityForResult(i1,1);
                }

            }
        });
        customer5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(customers.this,Details.class);
                Cursor c=db.rawQuery("select * from CUSTOMER_DETAILS where account_number=1291635294",null);
                if(c.getCount()==0)
                    Toast.makeText(customers.this, "No data avilable", Toast.LENGTH_SHORT).show();
                else{
                    c.moveToFirst();
                    String accn,all="";
                    int amount;
                    do{
                        accn=c.getString(0);
                        String ifcs=c.getString(1);
                        String name=c.getString(2);
                        String gender=c.getString(3);
                        String date=c.getString(4);
                        String email=c.getString(5);
                        String phonenumber=c.getString(6);
                        amount=c.getInt(7);
                        all=all+"Account Number: "+accn+"\nIFSC Code:"+ifcs+"\nName:"+name+"\nGender :"+gender+"\nDate :"+date+"\nPhone Number:"+phonenumber+"\nBalance:"+amount+"\nEamil Id:"+email;
                    }while (c.moveToNext());
                    i1.putExtra("deta",all);
                    i1.putExtra("balance",amount);
                    i1.putExtra("accnoo",accn);
                    startActivityForResult(i1,1);
                }

            }
        });
        customer6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(customers.this,Details.class);
                Cursor c=db.rawQuery("select * from CUSTOMER_DETAILS where account_number=1209361372",null);
                if(c.getCount()==0)
                    Toast.makeText(customers.this, "No data avilable", Toast.LENGTH_SHORT).show();
                else{
                    c.moveToFirst();
                    String accn,all="";
                    int amount;
                    do{
                        accn=c.getString(0);
                        String ifcs=c.getString(1);
                        String name=c.getString(2);
                        String gender=c.getString(3);
                        String date=c.getString(4);
                        String email=c.getString(5);
                        String phonenumber=c.getString(6);
                        amount=c.getInt(7);
                        all=all+"Account Number: "+accn+"\nIFSC Code:"+ifcs+"\nName:"+name+"\nGender :"+gender+"\nDate :"+date+"\nPhone Number:"+phonenumber+"\nBalance:"+amount+"\nEamil Id:"+email;
                    }while (c.moveToNext());
                    i1.putExtra("deta",all);
                    i1.putExtra("balance",amount);
                    i1.putExtra("accnoo",accn);
                    startActivityForResult(i1,1);
                }

            }
        });
        customer7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(customers.this,Details.class);
                Cursor c=db.rawQuery("select * from CUSTOMER_DETAILS where account_number=1284624364",null);
                if(c.getCount()==0)
                    Toast.makeText(customers.this, "No data avilable", Toast.LENGTH_SHORT).show();
                else{
                    c.moveToFirst();
                    String accn,all="";
                    int amount;
                    do{
                        accn=c.getString(0);
                        String ifcs=c.getString(1);
                        String name=c.getString(2);
                        String gender=c.getString(3);
                        String date=c.getString(4);
                        String email=c.getString(5);
                        String phonenumber=c.getString(6);
                        amount=c.getInt(7);
                        all=all+"Account Number: "+accn+"\nIFSC Code:"+ifcs+"\nName:"+name+"\nGender :"+gender+"\nDate :"+date+"\nPhone Number:"+phonenumber+"\nBalance:"+amount+"\nEamil Id:"+email;
                    }while (c.moveToNext());
                    i1.putExtra("deta",all);
                    i1.putExtra("balance",amount);
                    i1.putExtra("accnoo",accn);
                    startActivityForResult(i1,1);
                }

            }
        });
        customer8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(customers.this,Details.class);
                Cursor c=db.rawQuery("select * from CUSTOMER_DETAILS where account_number=1274528362",null);
                if(c.getCount()==0)
                    Toast.makeText(customers.this, "No data avilable", Toast.LENGTH_SHORT).show();
                else{
                    c.moveToFirst();
                    String accn,all="";
                    int amount;
                    do{
                        accn=c.getString(0);
                        String ifcs=c.getString(1);
                        String name=c.getString(2);
                        String gender=c.getString(3);
                        String date=c.getString(4);
                        String email=c.getString(5);
                        String phonenumber=c.getString(6);
                        amount=c.getInt(7);
                        all=all+"Account Number: "+accn+"\nIFSC Code:"+ifcs+"\nName:"+name+"\nGender :"+gender+"\nDate :"+date+"\nPhone Number:"+phonenumber+"\nBalance:"+amount+"\nEamil Id:"+email;
                    }while (c.moveToNext());
                    i1.putExtra("deta",all);
                    i1.putExtra("balance",amount);
                    i1.putExtra("accnoo",accn);
                    startActivityForResult(i1,1);
                }

            }
        });
        customer9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(customers.this,Details.class);
                Cursor c=db.rawQuery("select * from CUSTOMER_DETAILS where account_number=1285635283",null);
                if(c.getCount()==0)
                    Toast.makeText(customers.this, "No data avilable", Toast.LENGTH_SHORT).show();
                else{
                    c.moveToFirst();
                    String accn,all="";
                    int amount;
                    do{
                        accn=c.getString(0);
                        String ifcs=c.getString(1);
                        String name=c.getString(2);
                        String gender=c.getString(3);
                        String date=c.getString(4);
                        String email=c.getString(5);
                        String phonenumber=c.getString(6);
                        amount=c.getInt(7);
                        all=all+"Account Number: "+accn+"\nIFSC Code:"+ifcs+"\nName:"+name+"\nGender :"+gender+"\nDate :"+date+"\nPhone Number:"+phonenumber+"\nBalance:"+amount+"\nEamil Id:"+email;
                    }while (c.moveToNext());
                    i1.putExtra("deta",all);
                    i1.putExtra("balance",amount);
                    i1.putExtra("accnoo",accn);
                    startActivityForResult(i1,1);
                }

            }
        });
        customer10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(customers.this,Details.class);
                Cursor c=db.rawQuery("select * from CUSTOMER_DETAILS where account_number=1211338266",null);
                if(c.getCount()==0)
                    Toast.makeText(customers.this, "No data avilable", Toast.LENGTH_SHORT).show();
                else{
                    c.moveToFirst();
                    String accn,all="";
                    int amount;
                    do{
                        accn=c.getString(0);
                        String ifcs=c.getString(1);
                        String name=c.getString(2);
                        String gender=c.getString(3);
                        String date=c.getString(4);
                        String email=c.getString(5);
                        String phonenumber=c.getString(6);
                        amount=c.getInt(7);
                        all=all+"Account Number: "+accn+"\nIFSC Code:"+ifcs+"\nName:"+name+"\nGender :"+gender+"\nDate :"+date+"\nPhone Number:"+phonenumber+"\nBalance:"+amount+"\nEamil Id:"+email;
                    }while (c.moveToNext());
                    i1.putExtra("deta",all);
                    i1.putExtra("balance",amount);
                    i1.putExtra("accnoo",accn);
                    startActivityForResult(i1,1);
                }

            }
        });

    }
}