package jp.ac.it_college.std.s21014.Kadai

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import jp.ac.it_college.std.s21014.Kadai.databinding.ActivitySearchResultMapBinding

class SearchResultMapActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivitySearchResultMapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchResultMapBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        binding.btnBack.setOnClickListener {
            val intent = Intent(this, SearchResults2Activity::class.java)
            startActivity(intent)
        }

        binding.btnMap.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        // Add a marker in Sydney and move the camera
        val midorigaokaPark = LatLng(26.2171919, 127.68503093)
        mMap.addMarker(MarkerOptions().position(midorigaokaPark).title("Marker in midorigaokaPark"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(midorigaokaPark))
    }
}