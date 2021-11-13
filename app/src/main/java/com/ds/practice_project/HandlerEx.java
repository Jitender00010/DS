package com.ds.practice_project;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.practice.R;

class HandlerEx extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler_thread);


        txt = findViewById(R.id.txt_val);
        //ThreadEx();
    }

    private void ThreadEx() {

        final HandlerThread handlerThread = new HandlerThread("MyHandlerThread");

        Handler.Callback UICallback = new Handler.Callback() {
            @Override
            public boolean handleMessage(@NonNull Message msg) {
                System.out.println(msg.obj);
                txt.setText(""+msg);
                return true;
            }


        };

        new Thread(new Runnable() {
            @Override
            public void run() {
                Looper workerThreadLooper = handlerThread.getLooper(); // --> Looper of the Worker Handler thread

                Handler mainThreadHandler = new Handler(workerThreadLooper, UICallback); // --> Get handler to Worker Handler thread
                Message messageToSendToMainThread = Message.obtain(); // --> Create a message to send to Worker Handler thread


                for (int i=0 ; i < 10; i++){
                    messageToSendToMainThread.obj = i; // 123 -> actual msg value
                    messageToSendToMainThread.setTarget(mainThreadHandler);
                    mainThreadHandler.sendMessage(messageToSendToMainThread);
                }
            }
        }).start();
    }
}
