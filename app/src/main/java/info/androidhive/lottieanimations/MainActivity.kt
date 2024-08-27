package info.androidhive.lottieanimations

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import info.androidhive.lottieanimations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        binding.content.btnSplash.setOnClickListener {
            startActivity(Intent(this, SplashActivity::class.java))
        }

        binding.content.btnPayment.setOnClickListener {
            startActivity(Intent(this, PaymentActivity::class.java))
        }
    }
}