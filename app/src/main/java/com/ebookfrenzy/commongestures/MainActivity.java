package com.ebookfrenzy.commongestures;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;
import android.view.MotionEvent;
import androidx.core.view.GestureDetectorCompat;


public class MainActivity extends AppCompatActivity
    implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener
    {
        private TextView gestureText;
        private GestureDetector gDetector;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gestureText = findViewById(R.id.gestureStatusText);

        this.gDetector = new GestureDetector(this,this);

        gDetector.setOnDoubleTapListener(this);

    }



        @Override
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            gestureText.setText("onSingleTapConfirmed");
            return true;
        }

        @Override
        public boolean onDoubleTap(MotionEvent motionEvent) {
            gestureText.setText("onDoubleTap");
            return false;
        }

        @Override
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            gestureText.setText("onDoubleTapEvent");
            return true;
        }

        @Override
        public boolean onDown(MotionEvent motionEvent) {
            gestureText.setText("onDown");
            return true;
        }

        @Override
        public boolean onFling(MotionEvent event1 ,MotionEvent event2,float velocityX, float velocityY){
            gestureText.setText("onFling");
            return true;
        }

        @Override
        public void onShowPress(MotionEvent motionEvent) {
            gestureText.setText("onShowPress");

        }

        @Override
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            gestureText.setText("onSingleTapUp");
            return true;
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            gestureText.setText("onScroll");
            return true;
        }

        @Override
        public void onLongPress(MotionEvent motionEvent) {
            gestureText.setText("onLongPress");
        }

        @Override
        public boolean onTouchEvent(MotionEvent event){
            this.gDetector.onTouchEvent(event);
            // be sure to call the superclass implementation
            return super.onTouchEvent(event);

        }




    }