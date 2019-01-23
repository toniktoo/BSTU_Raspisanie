package com.example.paparimskiy.bstu.menu_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.paparimskiy.bstu.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Support extends AppCompatActivity {

    private DatabaseReference myDatabase;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.support);

        myDatabase = FirebaseDatabase.getInstance().getReference("Massage");

        final TextView myText = findViewById(R.id.textbox);

        myDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String[] Massage = dataSnapshot.getValue().toString().split(",");
                myText.setText("");

                for(int i=0; i<Massage.length;i++){

                    String[] finalMag = Massage[i].split("=");
                    myText.append(finalMag[1]+ '\n');
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                myText.setText(R.string.support_text);
            }
        });
    }

    public void sendMassage (View view){
        EditText myEditText = findViewById(R.id.editText1);
        myDatabase.child(Long.toString(System.currentTimeMillis())).setValue(myEditText.getText().toString());
        myEditText.setText("");
    }
}