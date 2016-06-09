package com.peininc.deshan.bluetoothapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button sendButton;
    ImageButton refreshButton;
    EditText pattern;
    TextView reconnectLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define elements
        sendButton = (Button) findViewById(R.id.sendButton);
        refreshButton = (ImageButton) findViewById(R.id.refreshbutton);
        pattern = (EditText) findViewById(R.id.pattern);
        reconnectLabel = (TextView) findViewById((R.id.reconnecttext));

        onSendButtonClick();
    }

    private void onSendButtonClick(){
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = pattern.getText().toString();
                Toast msg = Toast.makeText(getBaseContext(),text,Toast.LENGTH_LONG);
                pattern.setText("");
                msg.show();
            }
        });
    }
}
