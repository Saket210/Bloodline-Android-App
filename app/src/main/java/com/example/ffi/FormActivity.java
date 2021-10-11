package com.example.ffi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FormActivity extends AppCompatActivity {
    EditText patName,relName,phno,volName,bldgrp,msg;
    Button sub;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        patName=findViewById(R.id.patName);
        relName=findViewById(R.id.relname);
        phno=findViewById(R.id.phno);
        volName=findViewById(R.id.volName);
        bldgrp=findViewById(R.id.bldgrp);
        msg=findViewById(R.id.msg);
        sub=findViewById(R.id.btnform);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode=FirebaseDatabase.getInstance();
                reference=rootNode.getReference("data");

                String patientName=patName.getEditableText().toString();
                String relativeName= relName.getEditableText().toString();
                String phoneno=phno.getEditableText().toString();
                String volunteerName=volName.getEditableText().toString();
                String bldgroup=bldgrp.getEditableText().toString();
                String message=msg.getEditableText().toString();
                FormHelperClass helper=new FormHelperClass(patientName,relativeName,phoneno,volunteerName,bldgroup,message);
                reference.child(patientName).setValue(helper);
                Toast.makeText(FormActivity.this, "Submitted Successfully", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(FormActivity.this,BloodlineActivity.class);
                startActivity(intent);
            }
        });

    }
}