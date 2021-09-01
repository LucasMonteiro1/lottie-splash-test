package com.animatedsplash;

import android.os.Bundle;
import android.animation.Animator;
import com.facebook.react.ReactActivity;
import org.devio.rn.splashscreen.SplashScreen;
import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "AnimatedSplash";
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    SplashScreen.show(this, R.id.lottie);
    SplashScreen.setAnimationFinished(true);
    super.onCreate(savedInstanceState);

    // LottieAnimationView lottie = (LottieAnimationView) mSplashDialog.findViewById(R.id.lottie);
    // lottie.addAnimatorListener(new Animator.AnimatorListener() {
    //   @Override
    //   public void onAnimationEnd(Animator animation) {
    //     SplashScreen.hide(this);
    //   }
    // });
  }
}
