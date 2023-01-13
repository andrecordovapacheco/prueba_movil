# Prueba Mobile
Se realizó la prueba de para el aplicativo  booking-com-32-9.apk
Para este proyecto se esta utilizando BDD, Java/Cucumber/Appium 

# Plan de prueba
* El plan de prueba esta relizado en un excel y esta en la carpeta pruebaMobile\planprueba

# Configuración de su maquina (Herramientas)
* Establecer `JAVA_HOME` como una variable de entorno
* Establecer `ANDROID_HOME` como una variable de entorno - apuntando al directorio donde se debe configurar el SDK de Android
* Instalar Eclipse IDE
* Instalar Appium Server y Appium Inspector
* Instalar Android Studio
* Crear una maquina virtual

# Arquitectura

* El proyecto esta creado 2 paquetes importantes:
* 1.- src/main/java: es donde se realiza la conexión al appiumserver mediante codigo(no se necesita inicializar el appium server)
* 2.- src/main/test: es donde se realiza la logica del proyecto 
 
* La arquitectura del paquete test esta diseñada en 3 capas:
* 1.- feature
* 2.- stepdefinition
* 3.- view


# Escenarios 
* Se crearon los siguientes escenarios:
* 1.- reservaCompleta
* 2.- busqueda
* 3.- reserva
* 4.- reservaUnHappyPaths


# Ejecutando las pruebas
* Inicie el servidor de appium manualmente (y actualice la url/puerto si no usa el valor predeterminado)
* Tener un emulador (configurar los capabilities en el archivo  "config.properties")
* Ir al package runner y abrir el archivo Runner.java
* Desde el mismo archivo RunnerLogin.java hacer click derecho/Run As/Junit Test
* Ejecutar el escenario que desee desde "src\test\java\com\pruebamobile\runner\RunnerLogin.java"
* Ejemplo 
* Deconementar "@CucumberOptions(features = { "src/test/resources/features" },tags = "@reserva" ,glue = { "com.pruebamobile.stepdef" })"

# Reporte
* Cuando se ejecute la prueba se creará un documento word para su reporte en la direccion pruebaMobile\reportes\word

# Bloqueante
* Se quiso realizar todo el flujo completo con sus respectivos escenarios, pero no se pudo finalizar el flujo por el motivo de privilegios. El app tiene seguridad al registrar los datos personales y la tarjeta. El mensaje que nos sale en el appium es el siguiente “Does the current view have 'secure' flag set”. Según la lectura se tiene que modificar la configuración de un smartphone flaseado, pero esta no seria una buena solución en la organización. Se recomienda que nos pase una apk sin seguridad para poder completar el flujo completo.
