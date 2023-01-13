@regresion
Feature: reservar alojamiento en la ciudad de cusco con un niño de 5 años

  @reservaCompleta
  Scenario Outline: reserva de alojamiento en la ciudad de cusco en el hotel JW Marriott
    Given ingreso a la aplicacion booking
    When ingreso al modulo de busqueda e ingreso la ciudad "<ciudad>"
    And ingreso la fecha inicio "<fecInicio>", la fecha fin "<fecFin>"
    And ingreso "<habitacion>" habitacion, "<nroadultos>" adultos ,"<nroninio>" niño de "<anio>" años
    And realizamos la busqueda
    Then comprobamos la lista de hoteles mayor a uno y que este el hotel JW Marriott
    And seleccionamos el hotel JW Marriot
    And seleccionamos la habitacion y reservamos la primera opcion
    And ingresamos nuestros datos como nombre "<nombre>",apellido "<apellido>", correo"<correo>", direccion "<direccion>",codigo "<codigo>",ciudad "<ciudad>", pais "<pais>", movil "<movil>"
    And ingresamos el motivo del viaje ocio
    And hacemos click en el boton siguiente paso
    Then verificamos los datos del checkin "<fecInicio>" y checkout "<fecFin>" y el numero de habitacion "<habitacion>"
    And elegimos la forma de pago
    And ingresamos el numero de tarjeta "<tarjeta>", nombre "<nombre>", fecha expiracion "<fecexp>"
    Then validamos los costos de las reservas en todos los pasos

    Examples: 
      | ciudad | fecInicio  | fecFin     | habitacion | nroadultos | nroninio | anio | tarjeta          | fecexp | nombre | apellido | correo                | direccion | codigo | ciudad | pais | movil     |
      | cusco  | 14/02/2023 | 28/02/2023 |          1 |          2 |        1 |    5 | 4555788765443333 |   0225 | jose   | hurtado  | andrepacord@gmail.com | mi casa   |    054 | cusco  | Peru | 965291085 |

	@busqueda
  Scenario Outline: busqueda de alojamiento
    Given ingreso a la aplicacion booking
    When ingreso al modulo de busqueda e ingreso la ciudad "<ciudad>"
    And ingreso la fecha inicio "<fecInicio>", la fecha fin "<fecFin>"
    And ingreso "<habitacion>" habitacion, "<nroadultos>" adultos ,"<nroninio>" niño de "<anio>" años
    And realizamos la busqueda
    Then comprobamos la lista de hoteles mayor a uno y que este el hotel JW Marriott
   
    Examples: 
      | ciudad | fecInicio  | fecFin     | habitacion | nroadultos | nroninio | anio | 
      | cusco  | 14/02/2023 | 28/02/2023 |          1 |          2 |        1 |    5 | 

	@reserva
  Scenario Outline: reserva de alojamiento en la ciudad de cusco en el hotel JW Marriott
    Given ingreso a la aplicacion booking
    When ingreso al modulo de busqueda e ingreso la ciudad "<ciudad>"
    And ingreso la fecha inicio "<fecInicio>", la fecha fin "<fecFin>"
    And ingreso "<habitacion>" habitacion, "<nroadultos>" adultos ,"<nroninio>" niño de "<anio>" años
    And realizamos la busqueda
    And comprobamos la lista de hoteles mayor a uno y que este el hotel JW Marriott
    And seleccionamos el hotel JW Marriot
    Then validamos si se encuentra el saldo total
   	
    Examples: 
      | ciudad | fecInicio  | fecFin     | habitacion | nroadultos | nroninio | anio | tarjeta          | fecexp | nombre | apellido | correo                | direccion | codigo | ciudad | pais | movil     |
      | cusco  | 14/02/2023 | 28/02/2023 |          1 |          2 |        1 |    5 | 4555788765443333 |   0225 | jose   | hurtado  | andrepacord@gmail.com | mi casa   |    054 | cusco  | Peru | 965291085 |


      
       @reservaUnHappyPaths
  Scenario: reserva de alojamiento en ninguna ciudad
    Given ingreso a la aplicacion booking
    When realizo la busqueda sin ingresar datos
    Then verificamos mensaje de error
