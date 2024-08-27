package info.androidhive.lottieanimations

import android.animation.Animator
import android.animation.Animator.AnimatorListener
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import info.androidhive.lottieanimations.databinding.ActivityPaymentBinding

class PaymentActivity : AppCompatActivity() {
    private val binding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityPaymentBinding.inflate(layoutInflater)
    }

    private val animationDuration = 100L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        var animatedStarted = false
        binding.animationView.addAnimatorUpdateListener { animation ->
            if (animation.animatedFraction > 0.5 && !animatedStarted) {
                animatedStarted = true
                showMessage()
            }
        }

        binding.btnOkay.setOnClickListener { finish() }
    }

    private fun showMessage() {
        binding.message.animate().alpha(1f).setDuration(animationDuration)
        binding.transactionId.animate().alpha(1f).setDuration(animationDuration)
        binding.btnOkay.animate().alpha(1f).setDuration(animationDuration)
    }
}