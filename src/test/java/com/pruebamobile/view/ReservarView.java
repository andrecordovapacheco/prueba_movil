package com.pruebamobile.view;

import com.igs.utils.MobileDriverDOM;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ReservarView extends MobileDriverDOM {

	// ==================================== Elementos ====================================

	@AndroidFindBy(id = "com.booking:id/recommended_block_subtotal_price_view")
	private MobileElement txtTotal;

	@AndroidFindBy(id = "com.booking:id/recommended_block_subtotal_taxes_charges_view")
	private MobileElement txtImpuesto;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.Button")
	private MobileElement btnReserva;

	// ==================================== Métodos ====================================

	public String getTotal() {
		return txtTotal.getText();
	}
	
	public String getImpuesto() {
		return txtImpuesto.getText();
	}
	
	public void btnReserva() {
		btnReserva.click();
	}
	
	public boolean isTotal() {
		return txtTotal.isDisplayed();
	}
}
