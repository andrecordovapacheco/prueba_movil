package com.pruebamobile.view;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;

import com.igs.utils.MobileDriverDOM;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BusquedaView extends MobileDriverDOM {

	// ==================================== Elementos ====================================

	@AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_destination")
	private MobileElement btnCiudad;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	private MobileElement btnClose;

	@AndroidFindBy(id = "com.booking:id/genius_onbaording_bottomsheet_cta")
	private MobileElement idSaveMoney;

	@AndroidFindBy(id = "com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content")
	private MobileElement txtCiudad;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
	private MobileElement selCusco;

	@AndroidFindBy(id = "com.booking:id/facet_date_picker_confirm")
	private MobileElement selDate;

	@AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_occupancy")
	private MobileElement btnHabitacion;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.TextView")
	private MobileElement comprobacionAdultos;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.Button[2]")
	private MobileElement adultosMas;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.Button[1]")
	private MobileElement adultosMenos;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView")
	private MobileElement comprobacionHabitaciones;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.Button[2]")
	private MobileElement habitacionMas;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.Button[1]")
	private MobileElement habitacionMenos;    

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.TextView")
	private MobileElement comprobacionNinios;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.Button[2]")
	private MobileElement niniosMas;

	@AndroidFindBy(id = "android:id/numberpicker_input")
	private MobileElement selAniosNinio;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.Button[1]")
	private MobileElement niniosMenos;

	@AndroidFindBy(id = "com.booking:id/group_config_apply_button")
	private MobileElement btnAplicar;

	@AndroidFindBy(id = "android:id/button1")
	private MobileElement btnOk;

	@AndroidFindBy(id = "com.booking:id/facet_search_box_cta")
	private MobileElement btnBuscar;

	// ==================================== Métodos ====================================

	public void btnSaveMoney() {
		idSaveMoney.click();
		sleep(1);
    	btnClose.click();
	}
	
	public void close() {
		sleep(10);
		btnClose.click();
		sleep(14);
	}
	
	public void money() {
		idSaveMoney.click();
		sleep(1);
	}
	
	public void buscarCiudad() {
		btnClose.click();
		sleep(12);
		idSaveMoney.click();
		sleep(1);
    	btnCiudad.click();
		sleep(1);
	}

	public void ingresarCiudad(String ciudad) {
		txtCiudad.sendKeys(ciudad);
		sleep(1);
	}

	public void seleccionarCiudad() {
		selCusco.click();
		sleep(1);
	}

	public void seleccionarFecIni(String fecha) {
		String [] dia= fecha.split("-");
		
		MobileElement fechas= (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.View"));
		
		Point x=fechas.getLocation();
		System.out.println(x.getX());
		System.out.println(x.getY());
		TouchAction t = new TouchAction(driver);
	        t.press(point(x.getX(), x.getY())).waitAction(waitOptions(ofMillis(1000))).moveTo(point(x.getX(), x.getY()-400)).release()
	                .perform();
		
		MobileElement btnfechaini= (MobileElement) driver.findElement(By.xpath("//android.view.View[@content-desc=\"14 February 2023\"]"));
		MobileElement btnfechafin= (MobileElement) driver.findElement(By.xpath("//android.view.View[@content-desc=\"28 February 2023\"]"));
		sleep(1);
		try {
			scrollToElement(btnfechaini, "up");
			btnfechaini.click();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			scrollToElement(btnfechafin, "up");
			btnfechafin.click();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void seleccionarFecha() {
		selDate.click();
	}

	public void seleccionarHabitacion() {
		btnHabitacion.click();
		sleep(3);
	}

	public String comprobarAdutos() {
		return comprobacionAdultos.getText();
	}

	public void adultoMas(int adulto) {
		String txtAdulto=comprobarAdutos();
		sleep(3);
		int res=(adulto-Integer.parseInt(txtAdulto));
		for(int i=0;i<res;i++) {
			adultosMas.click();
		}
	}

	public void adultoMenos(int adulto) {
		String txtAdulto=comprobarAdutos();
		int res=(adulto-Integer.parseInt(txtAdulto));
		sleep(3);
		for(int i=0;i<res;i++) {
			adultosMenos.click();
		}
	}

	public String comprobarHabitaciones() {
		return comprobacionHabitaciones.getText();
	}

	public void habitacionMas(int habitacion) {
		String txthabitacion=comprobarHabitaciones();
		int res=(habitacion-Integer.parseInt(txthabitacion));
		sleep(3);
		for(int i=0;i<res;i++) {
			habitacionMas.click();
		}
	}

	public void habitacionMenos(int habitacion) {
		String txthabitacion=comprobarAdutos();
		int res=(habitacion-Integer.parseInt(txthabitacion));
		sleep(3);
		for(int i=0;i<res;i++) {
			habitacionMenos.click();
		}
	}

	public String comprobarNinios() {
		return comprobacionNinios.getText();
	}

	public void niniosMas(int edad) {
		Actions action = new Actions(driver);
		String txtninios=comprobarNinios();
		int res=(edad-Integer.parseInt(txtninios));
		sleep(3);
		niniosMas.click();
		MobileElement fechas= (MobileElement) driver.findElement(By.id("android:id/numberpicker_input"));
		
		Point x=fechas.getLocation();
		System.out.println(x.getX());
		System.out.println(x.getY());
		
	        
		for(int i=1;i<res;i++) {
			TouchAction t = new TouchAction(driver);
	        t.press(point(x.getX(), x.getY())).waitAction(waitOptions(ofMillis(1000))).moveTo(point(x.getX(), x.getY()-240)).release()
	                .perform();
		}
	}

	public void niniosMenos(int edad) {
		Actions action = new Actions(driver);
		String txtninios=comprobarNinios();
		int res=(edad-Integer.parseInt(txtninios));

		for(int i=0;i<res;i++) {
			action.sendKeys(Keys.DOWN);	
		}
	}

	public void okNinios() {
		btnOk.click();
	}

	public void btnAplicar() {
		btnAplicar.click();
	}

	public void btnBuscar() {
		btnBuscar.click();
	}
	
	public boolean msnError() {
		if(driver.switchTo().alert().getText().contains("destination")) {
			return true;
		}
		return false;
	}

}
