package dev.tomco.a22a_11345_l10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private MaterialButton main_BTN_start;
    private LottieAnimationView lottie_ANIM_watermelon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_BTN_start = findViewById(R.id.main_BTN_start);
        lottie_ANIM_watermelon = findViewById(R.id.lottie_ANIM_watermelon);

        main_BTN_start.setOnClickListener(view -> toggleAnimation());
    }

    private void toggleAnimation() {
        if (lottie_ANIM_watermelon.isAnimating()) {
            lottie_ANIM_watermelon.pauseAnimation();
            main_BTN_start.setText(R.string.main_BTN_start);
        } else {
            lottie_ANIM_watermelon.resumeAnimation();
            main_BTN_start.setText(R.string.main_BTN_stop);
        }
    }
}