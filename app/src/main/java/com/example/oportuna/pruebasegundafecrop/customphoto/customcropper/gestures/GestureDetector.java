package com.example.oportuna.pruebasegundafecrop.customphoto.customcropper.gestures;

import android.view.MotionEvent;

public interface GestureDetector {

    boolean onTouchEvent(MotionEvent ev);

    boolean isScaling();

    void setOnGestureListener(OnGestureListener listener);

}
