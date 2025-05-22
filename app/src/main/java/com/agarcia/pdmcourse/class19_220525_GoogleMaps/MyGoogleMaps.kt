package com.agarcia.pdmcourse.class19_220525_GoogleMaps

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapType
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

data class Place(
  val name: String,
  val remark: String,
  val latLng: LatLng,
)

@Composable
fun MyGoogleMaps(modifier: Modifier) {

  val places = listOf(
    Place(
      name = "UCA",
      remark = "Marker in UCA",
      latLng = LatLng(13.681338636741119, -89.23576570904778)
    ),
    Place(
      name = "Centro Monseñor Romero",
      remark = "Marker in Centro Monseñor Romero",
      latLng = LatLng(13.679024407659101, -89.23578718993471)
    )
  )

  val cameraPositionState = rememberCameraPositionState {
    position = CameraPosition.fromLatLngZoom(places[0].latLng, 15f)
  }

  var uiSettings by remember {
    mutableStateOf(MapUiSettings(zoomControlsEnabled = true))
  }
  var properties by remember {
    mutableStateOf(MapProperties(mapType = MapType.HYBRID))
  }

  GoogleMap(
    modifier = modifier.fillMaxSize(),
    cameraPositionState = cameraPositionState,
    properties = properties,
    uiSettings = uiSettings
  ) {
    places.forEach { place ->
      Marker(
        state = MarkerState(position = place.latLng),
        title = place.name,
        snippet = place.remark
      )
    }
  }
}
