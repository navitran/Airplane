# Airplane
WAA project

A.How to run Web Rest Services
Base URL :http://localhost:8080/airlinesWebApp/rs/

I implemented 4 rest services: AirplaneRest, AirportRest, AirlineRest and FlightRest
In each service, there are CRUD and find by parameter services such as findbyname, findbyid,...

1.The services of AirplaneRest:
//create airplane
http://localhost:8080/airlinesWebApp/rs/airplane/create

//delete airplane has id 1
http://localhost:8080/airlinesWebApp/rs/airplane/delete/1

//update airplane has id 1
http://localhost:8080/airlinesWebApp/rs/airplane/update/1

//find airplane has id 1
http://localhost:8080/airlinesWebApp/rs/airplane/find/1 

//find all airplane
http://localhost:8080/airlinesWebApp/rs/airplane/findall

//find airplane has flight id 1
http://localhost:8080/airlinesWebApp/rs/airplane/findbyflight/1 

//find airplane has model = 999
http://localhost:8080/airlinesWebApp/rs/airplane/findbymodel/999


2.The services of AirportRest:
1.The services of AirplaneRest:
//create airplane
http://localhost:8080/airlinesWebApp/rs/airplane/create

//delete airplane has id 1
http://localhost:8080/airlinesWebApp/rs/airplane/delete/1

//update airplane has id 1
http://localhost:8080/airlinesWebApp/rs/airplane/update/1

//find airplane has id 1
http://localhost:8080/airlinesWebApp/rs/airplane/find/1 

//find all airplane
http://localhost:8080/airlinesWebApp/rs/airplane/findall

//find airplane has flight id 1
http://localhost:8080/airlinesWebApp/rs/airplane/findbyflight/1 

//find airplane has model = 999
http://localhost:8080/airlinesWebApp/rs/airplane/findbymodel/999

3.The services of AirportRest:
//create airport
http://localhost:8080/airlinesWebApp/rs/airport/create

//delete airport has id 1
http://localhost:8080/airlinesWebApp/rs/airport/delete/1

//update airport has id 1
http://localhost:8080/airlinesWebApp/rs/airport/update/1

//find airport has id 1
http://localhost:8080/airlinesWebApp/rs/airport/find/1 

//find all airports
http://localhost:8080/airlinesWebApp/rs/airport/findall


//find airport has Flight Arrival ID 1
http://localhost:8080/airlinesWebApp/rs/airport/findbyarrival/1 


//find airport has airport code id AMS
http://localhost:8080/airlinesWebApp/rs/airport/findbycode/AMS 

//find airport has country USA
http://localhost:8080/airlinesWebApp/rs/airport/findbycountry/USA 

//find airport has Flight Departure ID 1
http://localhost:8080/airlinesWebApp/rs/airport/findbydeparture/1 

//find airport has city  = London
http://localhost:8080/airlinesWebApp/rs/airport/findbycity/London


4.The services of FlightRest:
//find flight has Flight ID 1
http://localhost:8080/airlinesWebApp/rs/flight/find/1 

//find all flights
http://localhost:8080/airlinesWebApp/rs/flight/findall

//find flights of airline id 1
http://localhost:8080/airlinesWebApp/rs/flight/findbyairline/1

//find flights of airplane id 1
http://localhost:8080/airlinesWebApp/rs/flight/findbyairplane/1

//find flights have destination airport id 1
http://localhost:8080/airlinesWebApp/rs/flight/findbydestination/1

//find flights have flight number =NW 1689
http://localhost:8080/airlinesWebApp/rs/flight/findbynumber/NW 1689

//find flights have origin airport id 1
http://localhost:8080/airlinesWebApp/rs/flight/findbyorigin/1

B. How to run JSF Web  Services
http://localhost:8080/airlinesWebApp/

-Flights: List all fights
-Airline: Create/ update/Delete and view all Airline


Some features have not completed:
Rest service for findflight by date, datebetween since there is difficulty in convert date to string
