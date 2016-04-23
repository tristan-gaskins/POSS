package com.poss.poss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

public class MainActivity extends Activity {

    private MapView m_mapView;
    private int MAP_DEFAULT_ZOOM = 15;
    private double MAP_DEFAULT_LATITUDE = 14.157882;
    private double MAP_DEFAULT_LONGITUDE = 121.025391;

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_mapView = (MapView) findViewById(R.id.map);
        m_mapView.setBuiltInZoomControls(true);
        m_mapView.setMultiTouchControls(true);
        m_mapView.setClickable(true);
        m_mapView.setUseDataConnection(false);
        m_mapView.getController().setZoom(MAP_DEFAULT_ZOOM);
        m_mapView.getController().setCenter(
                new GeoPoint(MAP_DEFAULT_LATITUDE, MAP_DEFAULT_LONGITUDE));
        m_mapView.setTileSource(new CustomMapTile(getApplicationContext()));
    }
}