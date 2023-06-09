package org.meto.appium.pages;

import java.time.Duration;
import org.meto.appium.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.DefaultElementByBuilder;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;

public class FormProposal extends AndroidActions {
	AndroidDriver driver;
	private String dsegmento;
	
	public FormProposal(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

		
	}
	
	
	//MobileElement el3 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[1]");
	@AndroidFindBy(xpath="(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[1]")
	private WebElement mdesp;
	
	//Segmento  id  //  pe.com.surgir.surgirapp:id/tv_segment
	// xpath === 	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.TextView[2]
	//String segmento = driver.findElement(By.id("pe.com.surgir.surgirapp:id/tv_segment")).getText();
	//@AndroidFindBy(id="pe.com.surgir.surgirapp:id/tv_segment")
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.TextView[2]")
	private WebElement segmentx;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Destino del préstamo']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Destino del préstamo']")
	private WebElement destp;
	
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Presupuesto de obra']")).click();
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Presupuesto de obra']")
	private WebElement fotopresup;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Frecuencia de cuotas']")).click(); 
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Frecuencia de cuotas']")
	private WebElement fcuot;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Cantidad de cuotas']")).click();
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Cantidad de cuotas']")
	private WebElement  ccuot;
	
	//MobileElement elp3x = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/btnCalculateRate");
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnCalculateRate")
	private WebElement calctas;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnCalculateAmount")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnCalculateAmount")
	private WebElement calcmont;
	
	//MobileElement elp24x = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/btnCancel");
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnCancel")
	private WebElement botcanc;
	
	//MobileElement elp25 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/btnConfirm");
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnConfirm")
	private WebElement cerrRse;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Fecha del primer vencimiento']")).sendKeys("05/03/2023");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Fecha del primer vencimiento']")
	private WebElement fecven;
	
	//MobileElement elp3 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[3]");
	// /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText
//	@AndroidFindBy(xpath="(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[3]")
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
	private WebElement seg;
	
	//driver.findElement(By.xpath("//*[@text='Agregar']")).click(); 
	@AndroidFindBy(xpath="//*[@text='Agregar']")
	private WebElement agregopt;
	
	//driver.findElement(By.xpath("//*[@text='Tipo de documento']")).click(); 
	@AndroidFindBy(xpath="//*[@text='Tipo de documento']")
	private WebElement tipodopt;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Número de documento']")).sendKeys("31323334");	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Número de documento']")
	private WebElement numdocc;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Primer nombre']")).sendKeys("TESTA");	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Primer nombre']")
	private WebElement primernom;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Segundo nombre']")).sendKeys("TESTB");	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Segundo nombre']")
	private WebElement segundonom;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Apellido paterno']")).sendKeys("TESTC");	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Apellido paterno']")
	private WebElement primerapell;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Apellido materno']")).sendKeys("TESTD");	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Apellido materno']")
	private WebElement segundoapell;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Fecha de Nacimiento']")).sendKeys("01/01/2000")
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Fecha de Nacimiento']")
	private WebElement fecnaopt;
	
	//MobileElement elp7 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[1]");
	@AndroidFindBy(xpath="(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[1]")
	private WebElement estciv;
	
	//	MobileElement elp7x = (MobileElement) driver.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[2]");
	@AndroidFindBy(xpath="(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[2]")
	private WebElement gend;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Celular']")).sendKeys("990194545");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Celular']")
	private WebElement celopt;
	
	//driver.findElement(By.xpath("//*[@text='Parentesco']")).click(); 
	// /hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText
	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
	//MobileElement el1 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/dialog_relationship");
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/dialog_relationship")
	private WebElement selectparent;
	
	//MobileElement elp9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageButton");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageButton")
	private WebElement segas;
	
	//MobileElement elp9x = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement porcopt;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/btn_submit_prospect")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btn_submit_prospect")
	private WebElement addben;
	
	//MobileElement elP1 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/btnFormBusinessSave");
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessSave")
	private WebElement saveprop;
	
	//MobileElement el2 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/btnFormBusinessNext");
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessNext")
	private WebElement nextprop;
	
	//Contrato
	//MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Contrato\"]/android.widget.TextView");
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Contrato\"]/android.widget.TextView")
	private WebElement ncontrato;
	
	//Propuesta
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Propuesta\"]/android.widget.TextView")
	private WebElement npropuesta;
	
	//Botón Listo de galeria
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/button_gallery_listo")
	private WebElement nListo;
	
	
	public FormProposal producto() throws InterruptedException {
		mdesp.click();
		product();
		Thread.sleep(15000);
		return this;
		
	}
	
	// aqui capturo el valos del segmento en propuesta
	public FormProposal segmentos() {
		//dsegmento
	//	 Contexto contexto = new Contexto();
		 
		String segmentis = segmentx.getText();
		segmentx.getText();
	//	this.segmentx = segmentis;
		System.out.println(segmentis);
		return this;
		
	}
	
	public FormProposal destinoPrest() throws InterruptedException {
	//	Thread.sleep(5000);
		destp.click();
		destinopr();
		Thread.sleep(5000);
		return this;
		
	}
	
	public FormProposal fotoPresupuesto() {
		fotopresup.click();
		fotopresup.click();
		fotoPres();
		nListo.click();
		return this;
		
	}
	
	public FormProposal frecuenciaCuota() {
		fcuot.click();
		freccuota();
		return this;
		
	}
	
	public FormProposal cantidadCuota() {
		ccuot.click();
		canticuota();
		return this;
		
	}
	
	public FormProposal calculaTasa() throws InterruptedException {
		calctas.click();
		Thread.sleep(9000);
		return this;
		
	}
	
	public FormProposal calculaMonto() throws InterruptedException {
		calcmont.click();
		Thread.sleep(2000);
		return this;
		
	}
	
	public FormProposal btnCancelMonto() throws InterruptedException {
		botcanc.click();
		Thread.sleep(2000);
		return this;
		
	}
	
	public FormProposal btnCerrarRse() {
		cerrRse.click();
		return null;
		
	}
	
	public FormProposal fecVencimiento(String fecv) {
		fecven.sendKeys(fecv);
		return this;
		
	}
	
	public FormProposal seguroBasico() {
		seg.click();
		segurob();
		return this;
		
	}
	
	public FormProposal addOptative() {
		agregopt.click();
		return this;
		
	}
	
	public FormProposal tipoDocOptative() {
		tipodopt.click();
		tipodocumentoptative();
		return this;
		
	}
	
	public FormProposal numberDoc(String dniopt) {
		numdocc.sendKeys(dniopt);
		return this;
		
	}
	
	public FormProposal firstName(String pname) {
		primernom.sendKeys(pname);
		return this;
		
	}
	
	public FormProposal otherName(String sname) {
		segundonom.sendKeys(sname);
		return this;
		
	}
	
	public FormProposal lastName(String apater) {
		primerapell.sendKeys(apater);
		return this;
		
	}
	
	public FormProposal surName(String amater) {
		segundoapell.sendKeys(amater);
		return this;
		
		
	}
	
	public FormProposal fecnaBeneficiaries(String fecnac) {
		fecnaopt.sendKeys(fecnac);
		return this;
		
	}
	
	public FormProposal eCivil() {
		estciv.click();
		sueCivil();
		return this;
		
	}
	
	public FormProposal gender() {
		gend.click();
		suGenero();
		return this;
		
	}
	
	public FormProposal telfBeneficiaries(String celul) {
		celopt.sendKeys(celul);
		return this;
	}
	
	public FormProposal relationship() {
		selectparent.click();
		scrollToTextRelation();
		//((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ESCAPE));
	//	driver.findElement(By.xpath("//*[@text='"+relship+"']")).click();
		//parentesc();
		return this;
		
	}
	
	public FormProposal seguroAsociado() {
		segas.click();
		seguroAsocia();
		return this;
		
	}
	
	public FormProposal percentage(String porcen) {
		porcopt.sendKeys(porcen);
		return this;
		
	}
	
	public FormProposal saveBeneficiaries() throws InterruptedException {
		addben.click();
		Thread.sleep(2000);
		return this;
		
	}
	
	public FormProposal swipeScreenOneProposal() {
		swipeScreen();
		return this;
		
	}
	
	public FormProposal nextOneProposal() {
		scrollToPageProposal();
		return this;
		
	}
	
	public FormProposal nexOneBeneficiaries() {
		scrollToPageBeneficiari();
		return this;
		
	}
	
	/*
	public FormProposal saveProposal() throws InterruptedException {
		saveprop.click();
		Thread.sleep(1000);
		return this;
		
	}*/
	
	public FormProposal passContract() {
		ncontrato.click();
	//	ncontrato.click();
		return this;
		
	}
	
	public FormProposal passPropuesta() {
		npropuesta.click();
	//	ncontrato.click();
		return this;
		
	}
	
	/*
	public FormContract nextProposal() {
		nextprop.click();
		return new FormContract(driver);
		
	}*/
	
	
	public FormContract saveProposal() throws InterruptedException  {
		nextprop.click();
		Thread.sleep(1000);
		return new FormContract(driver);
		
	}
	
	/*
	public FormContract passContract() {
		ncontrato.click();
		ncontrato.click();
		return new FormContract(driver);
		
	}*/
	
}
