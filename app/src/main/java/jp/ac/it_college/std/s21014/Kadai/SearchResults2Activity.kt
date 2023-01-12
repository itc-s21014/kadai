package jp.ac.it_college.std.s21014.Kadai

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.ac.it_college.std.s21014.Kadai.databinding.ActivitySearchResults2Binding

class SearchResults2Activity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchResults2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchResults2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.park.setOnClickListener {
            val intent = Intent(this, SearchResultMapActivity::class.java)
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            val intent = Intent(this, SearchResultsActivity::class.java)
            startActivity(intent)
        }
    }
}