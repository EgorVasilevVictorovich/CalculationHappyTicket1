package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {


    private EditText ticketNumberIn;
    private Button button;
    private TextView ticketInfoOut;


    private String ticketNumber = "";


    Algorithm algorithm = new Algorithm();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ticketNumberIn = findViewById(R.id.ticketNumberIn);
        button = findViewById(R.id.button);
        ticketInfoOut = findViewById(R.id.ticketInfoOut);


        button.setOnClickListener(listener);
    }


    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            ticketNumber = ticketNumberIn.getText().toString();


            if(algorithm.isHappyTicket(Integer.parseInt(ticketNumber))) {
                ticketInfoOut.setText("Данный номер билета счастливый " + algorithm.nextHappyTicketV1(ticketNumber));
            } else {
                ticketInfoOut.setText("Данный номер билета не счастливый, следующим счатливым номером является "
                        + algorithm.nextHappyTicketV1(ticketNumber));
            }
        }
    };
}