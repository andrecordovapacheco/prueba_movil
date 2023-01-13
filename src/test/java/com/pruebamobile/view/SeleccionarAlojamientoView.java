package com.pruebamobile.view;

import com.igs.utils.MobileDriverDOM;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SeleccionarAlojamientoView extends MobileDriverDOM {

	// ==================================== Elementos ====================================

	@AndroidFindBy(xpath  = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.TextView")
	private MobileElement numCantidadBusqueda;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	private MobileElement txtNombreMarriott;

	@AndroidFindBy(id = "com.booking:id/property_name")
	private MobileElement txtNombreMarriottHotel;

	@AndroidFindBy(id = "com.booking:id/select_room_cta")
	private MobileElement btnSeleccionarHabitacion;

	// ==================================== Métodos ====================================

	public String obtenerCantidadBusqueda() {
		sleep(9);
		return numCantidadBusqueda.getText().split(" ")[0];
	}
	
	public String obtenerHotelMarriott() {
		sleep(4);
		String res=txtNombreMarriottHotel.getText();
		sleep(4);
		return res;
	}

	public String obtenerHotelMarriottSelect() {
		sleep(4);
		String res=txtNombreMarriottHotel.getText();
		sleep(4);
		return res;
	}
	
	public void btnSeleccionarHabitacion() {
		sleep(10);
		txtNombreMarriott.click();
		sleep(6);
		btnSeleccionarHabitacion.click();
		sleep(6);
	}
}
