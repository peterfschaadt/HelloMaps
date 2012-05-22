package edu.virginia.cs.cs2110.peter;

import android.os.Bundle;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

public class HelloMapsActivity extends MapActivity {
    
	// Override because we are not displaying route information
    @Override
    protected boolean isRouteDisplayed() {
        return false;
    }
	
    // Called when the activity is first created
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        MapView mapView = (MapView) findViewById(R.id.mapview);
        mapView.setBuiltInZoomControls(true);
    }
	
}