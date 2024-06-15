package mx.uv.cliente;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import xx.mx.uv.consumo.wsdl.RegistroProductoRequest;
import xx.mx.uv.consumo.wsdl.RegistroProductoResponse;
import xx.mx.uv.consumo.wsdl.SolicitarFacturaRequest;
import xx.mx.uv.consumo.wsdl.SolicitarFacturaResponse;

public class ClaseCliente extends WebServiceGatewaySupport{

    public RegistroProductoResponse x (String nombre, String descripcion, int cantidad, double precio){
        RegistroProductoRequest producto = new RegistroProductoRequest();
        producto.setNombre(nombre);
        producto.setDescripcion(descripcion);
        producto.setCantidad(cantidad);
        producto.setPrecio(precio);
        RegistroProductoResponse respuesta = (RegistroProductoResponse)
        getWebServiceTemplate().marshalSendAndReceive("https://compras-production-300d.up.railway.app/ws/compras.wsdl",producto, new SoapActionCallback(""));
        return respuesta;
    }

    public SolicitarFacturaResponse y (float version, String serie, String folio, String fecha, String condicionesDePago, double subtotal, float descuento, String moneda, float tipoCambio, double total, String tipodeComprobante,
    String exportacion, String metodoPago, String formaPago, int lugarExpedicion, int noCertificado, String certificado, String sello, String rfcEmisor, String nombreEmisor, String regimenFiscal, String rfcReceptor, String nombreReceptor, 
    String domicilioFiscalReceptor, String regimenFiscalReceptor, String usoCFDI, String claveProdServ, int cantidad, String claveUnidad, String unidad, String descripcion, double valorUnitario, double importe, String uuid){
        SolicitarFacturaRequest factura = new SolicitarFacturaRequest();
        factura.setVersion(version);
        factura.setSerie(serie);
        factura.setFolio(folio);
        factura.setFecha(fecha);
        factura.setCondicionesDePago(condicionesDePago);
        factura.setSubtotal(subtotal);
        factura.setDescuento(descuento);
        factura.setMoneda(moneda);
        factura.setTipoCambio(tipoCambio);
        factura.setTotal(total);
        factura.setTipoDeComprobante(tipodeComprobante);
        factura.setExportacion(exportacion);
        factura.setMetodoPago(metodoPago);
        factura.setFormaPago(formaPago);
        factura.setLugarExpedicion(lugarExpedicion);
        factura.setNoCertificado(noCertificado);
        factura.setCertificado(certificado);
        factura.setSello(sello);
        factura.setRfcEmisor(rfcEmisor);
        factura.setNombreEmisor(nombreEmisor);
        factura.setRegimenFiscal(regimenFiscal);
        factura.setRfcReceptor(rfcReceptor);
        factura.setNombreReceptor(nombreReceptor);
        factura.setDomicilioFiscalReceptor(domicilioFiscalReceptor);
        factura.setRegimenFiscalReceptor(regimenFiscalReceptor);
        factura.setUsoCFDI(usoCFDI);
        factura.setClaveProdServ(claveProdServ);
        factura.setCantidad(cantidad);
        factura.setClaveUnidad(claveUnidad);
        factura.setUnidad(unidad);
        factura.setDescripcion(descripcion);
        factura.setValorUnitario(valorUnitario);
        factura.setImporte(importe);
        factura.setUuid(uuid);

        SolicitarFacturaResponse respuesta = (SolicitarFacturaResponse)
        getWebServiceTemplate().marshalSendAndReceive("https://compras-production-300d.up.railway.app/ws/compras.wsdl", factura, new SoapActionCallback(""));
        return respuesta;
    }
    
}
