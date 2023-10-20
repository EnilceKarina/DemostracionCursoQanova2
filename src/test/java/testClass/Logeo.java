package testClass;

import org.openqa.selenium.WebDriver;
import page.Cargainformacion;
import page.Login;

import java.text.ParseException;

public class Logeo {
    private Login login;
    private Cargainformacion cargaInformacion;WebDriver webDriver;
    public Logeo(){
    }
    //public Logeo(WebDriver webDriver){
    //    this.webDriver = webDriver;
    //}
    public void CasoLogin1(String usuario, String clave) throws ParseException {
        login = new Login();
        cargaInformacion = new Cargainformacion();
        login.ingresarUsuario(usuario,clave);
        login.ingresarClave(clave);
        login.clickBtnIngresar();
        cargaInformacion.recuperarTitulo();
        //Completa datos en los input
        cargaInformacion.rellenarCampoTexto("Testeo CAFB");
        cargaInformacion.rellenarCampoMail("prueba@testeo.cl");
        cargaInformacion.rellenarCampoAreaTexto("Prueba de testeo automatizacion Java con Selenium.");
        cargaInformacion.seleccionarFechaCalendario("2023-10-12");
        //cargaInformacion.rellenarCampoFecha("12/10/2023");
        // elije de una combo de datos
        cargaInformacion.rellenarCampoLista("valor 3");
        // elije de una de la seleccion multiple
        //cargaInformacion.seleccionMultiple(2);
        // elije de multiples seleccion
        cargaInformacion.seleccionMultiple2("2,3");
        // elije de  seleccion de radio buton
        cargaInformacion.comboRadio(1);
        // Hacer Click en boton enviar
        cargaInformacion.clickBtnEnviar();
    }
}
