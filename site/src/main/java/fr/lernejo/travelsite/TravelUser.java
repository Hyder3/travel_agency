package fr.lernejo.travelsite;


public record TravelUser(String userEmail, String userName, String userCountry, String weatherExpectation, double minimumTemperatureDistance) {
}