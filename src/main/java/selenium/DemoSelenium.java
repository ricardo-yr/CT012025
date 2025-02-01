package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSelenium {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	
	
	// Obteniendo objetos o web elements de la pagina web
	WebElement userName = driver.findElement(By.id("user-name"));
	WebElement password = driver.findElement(By.name("password"));
	WebElement loginBtn = driver.findElement(By.id("login-button"));
	
	userName.sendKeys("standard_user");
	Thread.sleep(2000); //espera 2 segundos antes de seguir
	password.sendKeys("secret_sauce");
	Thread.sleep(2000); //espera 2 segundos antes de seguir
	loginBtn.click();
	
	//MEtodos del explorador
	//Obtiene titulo
	String title = driver.getTitle();
	System.out.println(title);
	//obtiene URL
	String actualUrl = driver.getCurrentUrl();
	System.out.println(actualUrl);
	
	//Metodosdenavegacion
	//driver.navigate().back();
	//driver.navigate().forward();
	//driver.navigate().refresh();
	
	//Verificar elemento desplegado en pantalla
	boolean itemDisplayed = driver.findElement(By.className("inventory_item_name")).isDisplayed();
	
	if(itemDisplayed) {
		System.out.println("El articulo esta desplegado");
	}
	//Obtener texto de un webelement
	String prodName = driver.findElement(By.className("inventory_item_name")).getText();
	
	boolean prod = prodName.contains("Sauce Labs Backpack");//equals para que sea igual
	
	if (prod) {
		System.out.println("El nombre del producto es correcto");
	} else {
		System.out.println("El nombre del producto es incorrecto");
	}
	
	//Dropdowns siempre se identifica con select
	Select dropdownFilter = new Select(driver.findElement(By.className("product_sort_container")));
	dropdownFilter.selectByVisibleText("Price (high to low)");
	
	//Cerrar el navegador
	//driver.close(); //cierra ventana actual del navegador
	//driver.quit(); //cierra todas las ventanas con las q selenium interactuo
	}
	

	

}
