package andrei.teplyh.lab3

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class SecondWorkshop : AppCompatActivity() {

    var fragmentNumber: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_workshop)

        val addRedFragmentButton: Button = findViewById(R.id.addRedFragment)
        val addBlueFragmentButton: Button = findViewById(R.id.addBlueFragment)
        val removeLastFragmentButton: Button = findViewById(R.id.removeLastFragment)
        val replaceByGreenButton: Button = findViewById(R.id.replaceByGreen)

        addRedFragmentButton.setOnClickListener {
            fragmentNumber++
            supportFragmentManager.beginTransaction().add(R.id.second_container, SecondWorkshopSquare(
                Color.RED, fragmentNumber), "square_${fragmentNumber}").commit()
        }

        addBlueFragmentButton.setOnClickListener {
            fragmentNumber++
            supportFragmentManager.beginTransaction().add(R.id.second_container, SecondWorkshopSquare(
                Color.BLUE, fragmentNumber), "square_${fragmentNumber}").commit()
        }

        removeLastFragmentButton.setOnClickListener {
            val lastFragment: Fragment? = supportFragmentManager.findFragmentByTag("square_${fragmentNumber}")
            if (lastFragment != null) {
                supportFragmentManager.beginTransaction().remove(lastFragment).commit()
                fragmentNumber--
            }
        }

        replaceByGreenButton.setOnClickListener {
            val lastFragment: Fragment? = supportFragmentManager.findFragmentByTag("square_${fragmentNumber}")
            if (lastFragment != null) {
                supportFragmentManager.beginTransaction().remove(lastFragment).add(R.id.second_container, SecondWorkshopSquare(Color.GREEN, fragmentNumber), "square_${fragmentNumber}")
                    .commit()
            }
        }
    }
}