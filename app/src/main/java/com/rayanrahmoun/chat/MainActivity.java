package com.rayanrahmoun.chat;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends Activity {
    TextView chat;
    EditText input;
    @Override public void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        chat=findViewById(R.id.chatText);
        input=findViewById(R.id.messageInput);
        findViewById(R.id.sendButton).setOnClickListener(v -> {
            String m=input.getText().toString().trim();
            if(!m.isEmpty()){
                chat.append("\n\nأنت: "+m+"\nRayan Rahmoun: هذه نسخة تجريبية من التطبيق.");
                input.setText("");
            }
        });
    }
}
