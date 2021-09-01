//
//  Dynamic.Swift
//  AnimatedSplash
//
//  Created by Lucas Monteiro on 01/09/21.
//

import UIKit
import Foundation
import Lottie

@objc class Dynamic: NSObject {

  @objc func createAnimationView(rootView: UIView, lottieName: String) -> AnimationView {
    let animationView = AnimationView(name: lottieName)
    animationView.frame = rootView.frame
    animationView.center = rootView.center
    animationView.backgroundColor = UIColor.white;
//    animationView.contentMode = .scaleToFill;
    return animationView;
  }

  // @objc func play(animationView: AnimationView) {
  //   animationView.play(
  //     completion: { (success) in
  //       RNSplashScreen.setAnimationFinished(true)
  //     }
  //   );
  // }

  @objc func play(animationView: AnimationView) { 
    animationView.play(
      fromProgress: 0.0,
      toProgress: 1.0,
      loopMode: LottieLoopMode.playOnce,
      completion: { (success) in 
        RNSplashScreen.hide()
      } 
    ); 
  }
}
