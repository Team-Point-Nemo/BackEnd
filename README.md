# WeatherApp 

We are building a weather app as part of the Software Project 2 course. The app allows users to view both current and future weather forecasts. Users can check real-time weather conditions with visualized view over map, detailed five day forecast and daily summaries for 16 days. Weather data is available for both user location and city search.

This is the backend for our weather application developed as part of the Software Project 2 course. It serves weather data fetched from the OpenWeather API, secured through our backend using Java and Spring Boot

## Features

- Secure handling of the OpenWeather API key
- Current weather by coordinates or city name
- 5-day weather forecast with 3-hour increments
- 16-day daily forecast
- Rain, cloud and temperature tiles for the map

## Technologies
### Backend
- **Java**: We used Java to hide the API key and to handle API requests to OpenWeather through our own backend, in order to prevent exposing the key in the frontend.
- **Spring Boot**: A framework for building the backend and managing HTTP requests to and from OpenWeather API.

### Cloud Deployment
- **Rahti**: We decided to use the Rahti service to deploy our backend, ensuring public access to our API while keeping the API key secure.

## Prerequisites

Before starting the application, make sure you have the following installed:

- **Java 17** or newer (required for Spring Boot)
- **Maven** (for building and running the application)
- **Spring Boot** (this should be automatically handled if you use the `mvnw` wrapper)
- **OpenWeather API KEY**
  
Get your own OpenWeather API key from
```bash
https://openweathermap.org/price
```

## How to use the API

### Endpoints
| **Method** | **Endpoint**     | **Parameters**    | **Description**                      |
|------------|------------------|-------------------|--------------------------------------|
| GET        | `/weather-now`   | `lat`, `lon`      | Get current weather by coordinates   |
| GET        | `/city`          | `city`            | Get current weather by city name     |
| GET        | `/forecast5`     | `lat`, `lon`      | Get 5-day forecast                    |
| GET        | `/forecast16`    | `lat`, `lon`      | Get 16-day daily summary             |
| GET        | `/tiles/{layer}/{z}/{x}/{y}.png`     | `layer`, `z`, `x`, `y`            | Get weather tile image from OpenWeather       |

### Example request

```bash
http://localhost:8080/weather-now?lat=60.1699&lon=24.9384
```

## How to get started

To use our application, this Backend repository is not necessary because you only need the Frontend side. However, if you want to include this repository in the application, you can follow the next steps:

Clone repository
```bash
git clone https://github.com/Team-Point-Nemo/BackEnd.git
```

Navigate to the WeatherApp directory:
```bash
 cd .\BackEnd\weatherapp\
```

Open the project in your code editor
```bash
code .
```

Create `resources` directory to \weatherapp\main\resources
```bash
cd .\src\ 
 cd .\main\
mkdir resources
cd resources
```

Create the `application.properties` file in the `resources` directory

Add your own OpenWeather API key to application.properties file
```bash
weather.api.key={YOUR_API_KEY}
```

Run the application in weatherapp directory using the Maven wrapper
```bash
./mvnw spring-boot:run
```

or Press PLAY in Spring boot Dashboard

Access the API at `http://localhost:8080`

Example request for the 5-day forecast with 3-hour increments
```bash
http://localhost:8080/forecast5?lat=60.1699&lon=24.9384
```

## Creators

Ahlgren Heidi - ihmismieli

Hintsala Netta - hinnet

Mattila Anna - anmattila

Virolainen Jukka - Jukalekvi

Wong Huang - Tiriele

#### Link to the project's frontend repository

https://github.com/Team-Point-Nemo/FrontEnd
