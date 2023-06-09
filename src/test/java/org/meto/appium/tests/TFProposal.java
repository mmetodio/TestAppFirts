package org.meto.appium.tests;

import java.lang.reflect.Method;

import org.meto.appium.base.TestBase;
import org.meto.appium.pages.FormBusiness;
import org.meto.appium.pages.FormContract;
import org.meto.appium.pages.FormCustomer;
import org.meto.appium.pages.FormPage;
import org.meto.appium.pages.FormProposal;
import org.meto.appium.pages.FormProspect;
import org.meto.appium.pages.FormRse;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TFProposal extends TestBase {
	FormPage formPage;
	FormProspect formProspect;
	FormCustomer formCustomer;
	FormBusiness formBusiness;
	FormRse formRse;
	FormProposal formProposal;
	FormContract formContract;
	
	@BeforeMethod
	public void beforeMethod(Method method) {

		formPage = new FormPage(driver);
		formProspect = new FormProspect(driver);
		formCustomer = new FormCustomer(driver);
		formBusiness = new FormBusiness(driver);
		formRse = new FormRse(driver);
		formProposal = new FormProposal(driver);
		formContract = new FormContract(driver);
		
	}
	
	@Test
	public void FillProposal() throws InterruptedException{
		//FormProspect formProspect = formPage.localButtom();
		FormProposal formProposal = new FormProposal(driver);
		formProposal.producto();
		formProposal.segmentos(); // de Segmentos
	//	formProposal.saveProposal();
		formProposal.destinoPrest();
		formProposal.fotoPresupuesto();
		formProposal.frecuenciaCuota();
		formProposal.cantidadCuota();
		formProposal.calculaTasa();
		formProposal.calculaMonto();
	//	formProposal.btnCancelMonto();
	//	formProposal.calculaMonto();
		formProposal.btnCerrarRse();
		//formProposal.calculaTasa();
		formProposal.nextOneProposal();
		formProposal.fecVencimiento("23/05/2023");
	//	formProposal.swipeScreenOneProposal();
		formProposal.seguroBasico();
		formProposal.addOptative();
		formProposal.tipoDocOptative();
		formProposal.numberDoc("31323334");
		formProposal.firstName("TESTA");
		formProposal.otherName("TESTB");
		formProposal.lastName("TESTC");
		formProposal.surName("TESTD");
		formProposal.avance1();
	//	formProposal.nexOneBeneficiaries();
		formProposal.fecnaBeneficiaries("01/05/2000");
		formProposal.eCivil();
		formProposal.gender();
		formProposal.telfBeneficiaries("990194545");
		formProposal.relationship();  // Parentesco
		formProposal.avance1();
		formProposal.seguroAsociado();
		formProposal.avance1();
		//formProposal.nexOneBeneficiaries(); // test
		formProposal.percentage("100");
		formProposal.saveBeneficiaries();
	//	formProposal.saveProposal();
	//	formProposal.nextProposal();
	//	formProposal.passContract();
	//	formProposal.passPropuesta();
	//	FormBusiness formBusiness = formCustomer.nextCustomer();
	//	FormContract formContract = formProposal.nextProposal();
		FormContract formContract = formProposal.saveProposal();
		
	}


	
}
