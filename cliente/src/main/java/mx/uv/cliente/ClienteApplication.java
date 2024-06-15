package mx.uv.cliente;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import xx.mx.uv.consumo.wsdl.RegistroProductoResponse;
import xx.mx.uv.consumo.wsdl.SolicitarFacturaResponse;

@SpringBootApplication
public class ClienteApplication {

	String nombre = "laptop";
	String descripcion = "laptop HP";
	int cantidad = 1;
	double precio = 2000.50;

	public static void main(String[] args) {
		SpringApplication.run(ClienteApplication.class, args);
	}

	@Bean
	public CommandLineRunner ejecutar (ClaseCliente cliente){
		return x -> {
			//String nombre = "celular";
			//String descripcion = "este es un celular";
			//int cantidad = 7;
			//double precio = 9.90;

			if(x.length > 0){
				nombre = x[0];
				descripcion = x.length > 1 ? x[1] : descripcion;
                cantidad = x.length > 2 ? Integer.parseInt(x[2]) : cantidad;
                precio = x.length > 3 ? Double.parseDouble(x[3]) : precio;
			}

			RegistroProductoResponse sr = cliente.x(nombre, descripcion, cantidad, precio);
			System.out.println(sr.getRegistro());
		};
	}
	
	@Bean
	public CommandLineRunner ejecutarfact (ClaseCliente cliente){
		return y -> {
			float version = 3.14f;
			String serie = "SerieLaptopr";
			String folio = "d0e3be6e-a119-4bc5-9e0e";
			String fecha = "2024-05-08T11:18:11";
			String condicionesDePago = "CondicionesDePago";
			double subtotal = (precio * cantidad) - 0.16;
			float descuento = 1f;
			String moneda = "MXN";
			float tipoCambio = 1f;
			double total = precio * cantidad;
			String tipoCombrante = "I";
			String exportacion = "01";
			String metodoPago = "PPD";
			String formaDePago = "99";
			int lugarExpedicion = 20000;
			int noCertificado = 30001000;
			String certificado = "KJDVGJDFGKKJjjajsajk";
			String sello = "dISDDSDJSJghs";
			String rfcEmisor = "FTAGAGAHHAHA";
			String nombreEmisor = "Fernando Tarara Garrica";
			String regimenFiscal = "601";
			String rfcReceptor = "URE1804290";
			String nombreReceptor = "Universidad Real de España";
			String domicilioFiscalReceptor = "86991";
			String regimenFiscalReceptor = "601";
			String usoCFDI = "G01";
			String claveProdServ = "50211503";
			//int cantidad = 2;
			String claveUnidad = "H87";
			String unidad = "Pieza";
			//String descripcion = "Esta es una prueba";
			double valorUnitario = precio;
			double importe = precio * cantidad;
			String uuid = "";

			if(y.length > 0){
				version = y.length > 0 ? Float.parseFloat(y[0]) : version;
				serie = y.length > 1 ? y[1] : serie;
				folio = y.length > 2 ? y[2] : folio;
				fecha = y.length > 3 ? y[3] : fecha;
				condicionesDePago = y.length > 4 ? y[4] : condicionesDePago;
				subtotal = y.length > 5 ? Double.parseDouble(y[5]) : subtotal;
				descuento = y.length > 6 ? Float.parseFloat(y[6]) : descuento;
				moneda = y.length > 7 ? y[7] : moneda;
				tipoCambio = y.length > 8 ? Float.parseFloat(y[8]) : tipoCambio;
				total = y.length > 9 ? Double.parseDouble(y[9]) : total;
				tipoCombrante = y.length > 10 ? y[10] : tipoCombrante;
				exportacion = y.length > 11 ? y[11] : exportacion;
				metodoPago = y.length > 12 ? y[12] : metodoPago;
				formaDePago = y.length > 13 ? y[13] : formaDePago;
				lugarExpedicion = y.length > 14 ? Integer.parseInt(y[14]) : lugarExpedicion;
				noCertificado = y.length > 15 ? Integer.parseInt(y[15]) : noCertificado;
				certificado = y.length > 16 ? y[16] : certificado;
				sello = y.length > 17 ? y[17] : sello;
				rfcEmisor = y.length > 18 ? y[18] : rfcEmisor;
				nombreEmisor = y.length > 19 ? y[19] : nombreEmisor;
				regimenFiscal = y.length > 20 ? y[20] : regimenFiscal;
				rfcReceptor = y.length > 21 ? y[21] : rfcReceptor;
				nombreReceptor = y.length > 22 ? y[22] : nombreReceptor;
				domicilioFiscalReceptor = y.length > 23 ? y[23] : domicilioFiscalReceptor;
				regimenFiscalReceptor = y.length > 24 ? y[24] : regimenFiscalReceptor;
				usoCFDI = y.length > 25 ? y[25] : usoCFDI;
				claveProdServ = y.length > 26 ? y[26] : claveProdServ;
				cantidad = y.length > 27 ? Integer.parseInt(y[27]) : cantidad;
				claveUnidad = y.length > 28 ? y[28] : claveUnidad;
				unidad = y.length > 29 ? y[29] : unidad;
				descripcion = y.length > 30 ? y[30] : descripcion;
				valorUnitario = y.length > 31 ? Double.parseDouble(y[31]) : valorUnitario;
				importe = y.length > 32 ? Double.parseDouble(y[32]) : importe;
				uuid = y.length > 33 ? y[33] : uuid;
			}

			SolicitarFacturaResponse sr = cliente.y(version, serie, folio, fecha, condicionesDePago, subtotal, descuento, moneda, tipoCambio, total, tipoCombrante, exportacion, metodoPago, formaDePago, lugarExpedicion, noCertificado,
			certificado, sello, rfcEmisor, nombreEmisor, regimenFiscal, rfcReceptor, nombreReceptor, domicilioFiscalReceptor, regimenFiscalReceptor, usoCFDI, claveProdServ, cantidad, claveUnidad, unidad, descripcion, valorUnitario,
			importe, uuid);

			System.out.println(sr.getUuid());

		};
	}
}
