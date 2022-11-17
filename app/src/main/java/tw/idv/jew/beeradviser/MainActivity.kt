package tw.idv.jew.beeradviser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val findBeer = findViewById<Button>(R.id.find_beer)
        findBeer.setOnClickListener {

        }

        val brands = findViewById<TextView>(R.id.brands)
        brands.text = "Gottle of geer"
    }
}