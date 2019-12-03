package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val zoo = LatLng(56.466778, 84.966077)
        mMap.addMarker(MarkerOptions().position(zoo).title("Планета Zoo"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(zoo))

        val zoo1 = LatLng(56.469584, 84.972487)
        mMap.addMarker(MarkerOptions().position(zoo1).title("Город Zoo"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(zoo1))

        val zoo2 = LatLng(56.456226, 84.973367)
        mMap.addMarker(MarkerOptions().position(zoo2).title("Плвнета Zoo"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(zoo2))

        val zoo3 = LatLng(56.478304, 84.964088)
        mMap.addMarker(MarkerOptions().position(zoo3).title("Зоомагазин Петбург"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(zoo3))

        val zoo4 = LatLng(56.480016, 84.947639)
        mMap.addMarker(MarkerOptions().position(zoo4).title("Лапусик"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(zoo4))

    }
}
