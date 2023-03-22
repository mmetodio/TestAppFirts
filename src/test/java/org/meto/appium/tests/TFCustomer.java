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

public class TFCustomer extends TestBase {
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
	public void FillCustomer() throws InterruptedException{
	//	formCustomer = formProspect.bcontinuarValid();
		FormCustomer formCustomer = new FormCustomer(driver);
		formCustomer.CustomerP();
		formCustomer.fotoExperian();
		formCustomer.fotofrenteDni();
		formCustomer.fotoreversoDni();
		formCustomer.fotoCliente();
		//	formCustomer.nextone(); avance con scroll
		formCustomer.swipeScreenOneCustomer();
		formCustomer.gradoInstruccion();
		formCustomer.profesionN();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.prePago();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.codigoArea();
		//	formCustomer.telefonoFijo("3827271");
		formCustomer.operadorTelef();
		formCustomer.swipeScreenOneCustomer();
	//	formCustomer.nexttwoCustomer();
		formCustomer.tipodeComprobante();
		formCustomer.fotoComprobanteDomicilio();
		formCustomer.casaqueHabita();
		formCustomer.otrotipoDomicilio("choza");
		formCustomer.personaenDomicilio();
		formCustomer.swipeScreenOneCustomer();
		formCustomer.departamentos();
		formCustomer.provincias();
		formCustomer.distritos();
		formCustomer.urbanizacion("mi urbanizacion test");
		formCustomer.tipoVia();
		formCustomer.nomDireccion("mi direccionx");
		formCustomer.swipeScreenOneCustomer();
		formCustomer.numExterior("432");
		formCustomer.numInterior("6");
		formCustomer.permanenciaAnios();
		formCustomer.referenciaUbic("mi referencia ubic");
		formCustomer.swipeScreenOneCustomer();
	//	formCustomer.numeroDependient("1");
		formCustomer.swipeScreenOneCustomer();
		formCustomer.tipoReferencia();
		formCustomer.nameReferenc("Test");
		formCustomer.swipeScreenOneCustomer();
		formCustomer.lastNameRef("Test");
		formCustomer.cellReferenc("964636765");
		formCustomer.saveCustomer();
	//	formCustomer.nextCustomer();
		FormBusiness formBusiness = formCustomer.nextCustomer();
		
	}


	
}
