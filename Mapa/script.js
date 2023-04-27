   let coord = {lat:0,lng:0};
   let map;
   let marker;
   options={
      enableHighAccuracy: true,
      timeout: 5000,
      maximumAge: 0
   }
   const error = (err) => {
      alert("No se puede acceder a la geolocalización");
   }
 function start(){
   if(navigator.geolocation){
      navigator.geolocation.getCurrentPosition(initGeolocation,error,options);
    }
    else{
        alert("No se puede usar la geolocalización");
    }
}  
 function initMap(){
    map = new google.maps.Map(document.getElementById("map"),{zoom: 10,center:coord});
    marker = new google.maps.Marker({position: coord, map: map});
    initAutoComplete()
 }

 function initAutoComplete(){
   let autocomplete = new google.maps.places.Autocomplete(document.getElementById("place"));
   autocomplete.addListener('place_changed', function(){
      let place = autocomplete.getPlace(); 
      map.setCenter(place.geometry.location);
      map.setZoom(14);  
      marker.setPosition(place.geometry.location); 
   });
 }

 function initGeolocation(position){
   console.log(position);
   coord = {lat:position.coords.latitude,lng:position.coords.longitude};
   console.log(coord);
   initMap();
 }

