# WeatherApp_JetpackCompose
Clean Architecture Based Weather App using Jetpack Compose, Dagger-Hilt, Retrofit and Open Meteo (OpenSource Weather API).

The app architecture has three layers:
- presentation : contains all the UI components.
- domain : Isolated business logic , rules and unaware of the data/presentation.
- data : Interacts with data sources like api, databases etc.

Challenges Faced :
- 

Dagger-Hilt setup for Apple Silicon Macs:
'kapt "org.xerial:sqlite-jdbc:3.36.0" ' - ( add this to gradle build file.)