package com.example.sportassistantapp.Utils;

import android.view.View;
import android.view.animation.AlphaAnimation;

public class AnimationUtils {

    public static void buttonClickAnimation(View view) {
        AlphaAnimation buttonClick = new AlphaAnimation(1f, 0.8f);
        view.startAnimation(buttonClick);
    }


}
