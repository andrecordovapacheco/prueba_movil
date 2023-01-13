package com.pruebamobile.stepdef;

import static org.junit.Assert.assertTrue;

import com.pruebamobile.view.BusquedaView;
import com.pruebamobile.view.ReservarView;
import com.pruebamobile.view.SeleccionarAlojamientoView;

import io.cucumber.java.en.*;

public class ReservaStepDef {

	BusquedaView busqueda=new BusquedaView();
	SeleccionarAlojamientoView alojamiento=new SeleccionarAlojamientoView();
	ReservarView reserva=new ReservarView();

	@Given("ingreso a la aplicacion booking")
	public void ingreso_a_la_aplicacion_booking() {

	}

	@When("ingreso al modulo de busqueda e ingreso la ciudad {string}")
	public void ingreso_al_modulo_de_busqueda_e_ingreso_la_ciudad(String ciudad) {
		busqueda.buscarCiudad();
		busqueda.ingresarCiudad(ciudad);
		busqueda.seleccionarCiudad();
	}

	@When("ingreso la fecha inicio {string}, la fecha fin {string}")
	public void ingreso_la_fecha_inicio_la_fecha_fin(String fecini, String fecfin) {
		busqueda.seleccionarFecIni(fecini);
		busqueda.seleccionarFecha();
	}

	@When("ingreso {string} habitacion, {string} adultos ,{string} niño de {string} años")
	public void ingreso_habitacion_adultos_niño_de_años(String habitacion, String adulto, String ninio, String anios) {
		busqueda.seleccionarHabitacion();
		busqueda.adultoMas(Integer.parseInt(adulto));
		busqueda.habitacionMas(Integer.parseInt(habitacion));
		busqueda.niniosMas(Integer.parseInt(anios));
		busqueda.okNinios();
		busqueda.btnAplicar();


	}

	@When("realizamos la busqueda")
	public void realizamos_la_busqueda() {
		busqueda.btnBuscar();
	}

	@Then("comprobamos la lista de hoteles mayor a uno y que este el hotel JW Marriott")
	public void comprobamos_la_lista_de_hoteles_mayor_a_uno_y_que_este_el_hotel_jw_marriott() {
		assertTrue(Integer.parseInt(alojamiento.obtenerCantidadBusqueda())>0);
		//assertTrue(alojamiento.obtenerHotelMarriott().contains("Marriott"));
	}

	@Then("seleccionamos el hotel JW Marriot")
	public void seleccionamos_el_hotel_jw_marriot() {
		alojamiento.btnSeleccionarHabitacion();
	}

	@Then("seleccionamos la habitacion y reservamos la primera opcion")
	public void seleccionamos_la_habitacion_y_reservamos_la_primera_opcion() {
		reserva.btnReserva();
	}

	@Then("ingresamos nuestros datos como nombre {string},apellido {string}, correo\"andrepacord@gmail.com\", direccion {string},codigo {string},ciudad {string}, pais {string}, movil {string}")
	public void ingresamos_nuestros_datos_como_nombre_apellido_correo_andrepacord_gmail_com_direccion_codigo_ciudad_pais_movil(String string, String string2, String string3, String string4, String string5, String string6, String string7) {

	}

	@Then("ingresamos el motivo del viaje ocio")
	public void ingresamos_el_motivo_del_viaje_ocio() {
	}

	@Then("hacemos click en el boton siguiente paso")
	public void hacemos_click_en_el_boton_siguiente_paso() {
	}

	@Then("verificamos los datos del checkin {string} y checkout {string} y el numero de habitacion {string}")
	public void verificamos_los_datos_del_checkin_y_checkout_y_el_numero_de_habitacion(String string, String string2, String string3) {
	}

	@Then("elegimos la forma de pago")
	public void elegimos_la_forma_de_pago() {
	}

	@Then("ingresamos el numero de tarjeta {string}, nombre {string}, fecha expiracion {string}")
	public void ingresamos_el_numero_de_tarjeta_nombre_fecha_expiracion(String string, String string2, String string3) {
	}

	@Then("validamos los costos de las reservas en todos los pasos")
	public void validamos_los_costos_de_las_reservas_en_todos_los_pasos() {
	}

	@When("realizo la busqueda sin ingresar datos")
	public void realizo_la_busqueda_sin_ingresar_datos() {
		busqueda.close();
		busqueda.money();
		busqueda.btnBuscar();
	}
	@Then("verificamos mensaje de error")
	public void verificamos_mensaje_de_error() {
		busqueda.msnError();
	}

	@Then("validamos si se encuentra el saldo total")
	public void validamos_si_se_encuentra_el_saldo_total() {
		assertTrue(reserva.isTotal());
	}

}
