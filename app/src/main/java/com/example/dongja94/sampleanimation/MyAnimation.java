package com.example.dongja94.sampleanimation;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by dongja94 on 2016-01-25.
 */
public class MyAnimation extends Animation {
    int deltaX, deltaY;

    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
        deltaX = parentWidth - width;
        deltaY = parentHeight - height;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        float x = deltaX * interpolatedTime;
        float y = deltaY * interpolatedTime * interpolatedTime;
        t.getMatrix().setTranslate(x, y);
    }
}
