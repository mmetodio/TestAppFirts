package org.meto.appium.tests;

import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormPage;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFProspect extends TestBase {
	FormPage formPage;
	FormProspect formProspect;
	FormCustomer formCustomer;
	FormBusiness formBusiness;
//	FormRse formRse;
	
	@BeforeMethod
	public void beforeMethod(Method method) {

		formPage = new FormPage(driver);
		formProspect = new FormProspect(driver);
		formCustomer = new FormCustomer(driver);
		formBusiness = new FormBusiness(driver);
	//	formRse = new FormRse(driver);
		
	}
	
	@Test
	public void FillProspect() throws InterruptedException{
		//FormProspect formProspect = formPage.localButtom();
		FormProspect formProspect = new FormProspect(driver);
		formProspect.PropuestaButton();
		formProspect.ReturnButton();
		formProspect.PropuestaHome();
		formProspect.setNumDoc("48140310");
		formProspect.Verificando();
		formProspect.setFecCaducidad("01/01/2030");
		formProspect.setFirstName("TestFisrtname");
		formProspect.setSecondName("TestSecondName");
		formProspect.setSurName("Testlastname");
		formProspect.avance();
		formProspect.setSecondSureName("OtherLastName");
		formProspect.setFecNa("01/03/1991");
		formProspect.avance();
		formProspect.setnMobile("990493838");
		formProspect.setnMail("metodicosys@gmail.com");
		formProspect.continuarProspect();
		formProspect.scrollData();
		formProspect.continuarData();
		FormCustomer formCustomer = formProspect.bcontinuarValid();
		
	}


	
}
