package org.meto.appium.tests;

import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormPage;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFBusiness extends TestBase {
	FormPage formPage;
	FormProspect formProspect;
	FormCustomer formCustomer;
	FormBusiness formBusiness;
	FormRse formRse;
	FormProposal formProposal;
	
	
	@BeforeMethod
	public void beforeMethod(Method method) {

		formPage = new FormPage(driver);
		formProspect = new FormProspect(driver);
		formCustomer = new FormCustomer(driver);
		formBusiness = new FormBusiness(driver);
		formRse = new FormRse(driver);
		
	}
	
	
	@Test
	public void FillBusiness() throws InterruptedException{
		FormBusiness formBusiness = new FormBusiness(driver);
	//FormBusiness formBusiness = formCustomer.nextCustomer();
		
		formBusiness.photoSelfie();
		formBusiness.swipeScreenOneBusiness();
		formBusiness.timeAnios();
		formBusiness.experienciaAnios();
		formBusiness.inicioActividad("01/04/2020");
		formBusiness.tipoEstabelcimiento();
		formBusiness.numEmpleados("1");
		formBusiness.saveBusiness();
		//formBusiness.nextBusiness();
		FormRse formRse = formBusiness.nextBusiness();

		/*
		formRse.autoComplit();
		formRse.giro("VE");
		formRse.activeC1("10");
		formRse.activeC2("15");
		formRse.activeC3("20");
		formRse.activeC4("25");
		formRse.activeC5("30");
		formRse.activeC6("35");
		formRse.activeC7("40");
		formRse.swipeScreenOneRse();
		formRse.activeC8("45");
*/
	}


	
}
