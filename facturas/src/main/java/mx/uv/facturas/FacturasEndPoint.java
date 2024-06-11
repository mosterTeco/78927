package mx.uv.facturas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.t4is.facturas.GenerarFacturaRequest;
import mx.uv.t4is.facturas.GenerarFacturaResponse;
import mx.uv.t4is.facturas.HistorialFacturasResponse;

import java.util.ArrayList;
import java.util.UUID;

@Endpoint
public class FacturasEndPoint {

    @Autowired
    private IFacturas ifacturas;

    ArrayList<GenerarFacturaRequest> facturasArray = new ArrayList<>();
    ArrayList<HistorialFacturasResponse.Factura> facturasH = new ArrayList<>();

    @PayloadRoot (localPart = "GenerarFacturaRequest", namespace = "t4is.uv.mx/facturas")
    @ResponsePayload
    public GenerarFacturaResponse generarFactura(@RequestPayload GenerarFacturaRequest peticion){
        GenerarFacturaResponse respuesta = new GenerarFacturaResponse();
        GenerarFacturaRequest factura = new GenerarFacturaRequest();
        Facturas facturas =new Facturas();
        HistorialFacturasResponse.Factura factur = new HistorialFacturasResponse.Factura();
        UUID uuid = UUID.randomUUID();

        facturas.setVersion(peticion.getVersion());
        facturas.setSerie(peticion.getSerie());
        facturas.setFolio(peticion.getFolio());
        facturas.setFecha(peticion.getFecha());
        facturas.setCondicionesDePago(peticion.getCondicionesDePago());
        facturas.setSubtotal(peticion.getSubtotal());
        facturas.setDescuento(peticion.getDescuento());
        facturas.setMoneda(peticion.getMoneda());
        facturas.setTipoCambio(peticion.getTipoCambio());
        facturas.setTotal(peticion.getTotal());
        facturas.setTipoCambio(peticion.getTipoCambio());
        facturas.setExportacion(peticion.getExportacion());
        facturas.setMetodoPago(peticion.getMetodoPago());
        facturas.setNoCertificado(peticion.getNoCertificado());
        facturas.setFormaPago(peticion.getFormaPago());
        facturas.setLugarExpedicion(peticion.getLugarExpedicion());
        facturas.setNoCertificado(peticion.getNoCertificado());
        facturas.setCertificado(peticion.getCertificado());
        facturas.setSello(peticion.getSello());
        facturas.setRfcEmisor(peticion.getRfcEmisor());
        facturas.setNombreEmisor(peticion.getNombreEmisor());
        facturas.setRegimenFiscal(peticion.getRegimenFiscal());
        facturas.setRfcReceptor(peticion.getRfcReceptor());
        facturas.setNombreReceptor(peticion.getNombreReceptor());
        facturas.setDomicilioFiscalReceptor(peticion.getDomicilioFiscalReceptor());
        facturas.setRegimenFiscalReceptor(peticion.getRegimenFiscalReceptor());
        facturas.setUsoCFDI(peticion.getUsoCFDI());
        facturas.setClaveProdServ(peticion.getClaveProdServ());
        facturas.setCantidad(peticion.getCantidad());
        facturas.setClaveUnidad(peticion.getClaveUnidad());
        facturas.setUnidad(peticion.getUnidad());
        facturas.setValorUnitario(peticion.getValorUnitario());
        facturas.setDescripcion(peticion.getDescripcion());
        facturas.setImporte(peticion.getImporte());
        facturas.setUuid(uuid.toString());

        ifacturas.save(facturas);

        factura.setVersion(peticion.getVersion());
        factura.setSerie(peticion.getSerie());
        factura.setFolio(peticion.getFolio());
        factura.setFecha(peticion.getFecha());
        factura.setCondicionesDePago(peticion.getCondicionesDePago());
        factura.setSubtotal(peticion.getSubtotal());
        factura.setDescuento(peticion.getDescuento());
        factura.setMoneda(peticion.getMoneda());
        factura.setTipoCambio(peticion.getTipoCambio());
        factura.setTotal(peticion.getTotal());
        factura.setTipoCambio(peticion.getTipoCambio());
        factura.setExportacion(peticion.getExportacion());
        factura.setMetodoPago(peticion.getMetodoPago());
        factura.setNoCertificado(peticion.getNoCertificado());
        factura.setFormaPago(peticion.getFormaPago());
        factura.setLugarExpedicion(peticion.getLugarExpedicion());
        factura.setNoCertificado(peticion.getNoCertificado());
        factura.setCertificado(peticion.getCertificado());
        factura.setSello(peticion.getSello());
        factura.setRfcEmisor(peticion.getRfcEmisor());
        factura.setNombreEmisor(peticion.getNombreEmisor());
        factura.setRegimenFiscal(peticion.getRegimenFiscal());
        factura.setRfcReceptor(peticion.getRfcReceptor());
        factura.setNombreReceptor(peticion.getNombreReceptor());
        factura.setDomicilioFiscalReceptor(peticion.getDomicilioFiscalReceptor());
        factura.setRegimenFiscalReceptor(peticion.getRegimenFiscalReceptor());
        factura.setUsoCFDI(peticion.getUsoCFDI());
        factura.setClaveProdServ(peticion.getClaveProdServ());
        factura.setCantidad(peticion.getCantidad());
        factura.setClaveUnidad(peticion.getClaveUnidad());
        factura.setUnidad(peticion.getUnidad());
        factura.setValorUnitario(peticion.getValorUnitario());
        factura.setDescripcion(peticion.getDescripcion());
        factura.setImporte(peticion.getImporte());
        factura.setUuid(uuid.toString());

        facturasArray.add(factura);

        factur.setVersion(peticion.getVersion());
        factur.setSerie(peticion.getSerie());
        factur.setFolio(peticion.getFolio());
        factur.setFecha(peticion.getFecha());
        factur.setCondicionesDePago(peticion.getCondicionesDePago());
        factur.setSubtotal(peticion.getSubtotal());
        factur.setDescuento(peticion.getDescuento());
        factur.setMoneda(peticion.getMoneda());
        factur.setTipoCambio(peticion.getTipoCambio());
        factur.setTotal(peticion.getTotal());
        factur.setTipoCambio(peticion.getTipoCambio());
        factur.setExportacion(peticion.getExportacion());
        factur.setMetodoPago(peticion.getMetodoPago());
        factur.setNoCertificado(peticion.getNoCertificado());
        factur.setFormaPago(peticion.getFormaPago());
        factur.setLugarExpedicion(peticion.getLugarExpedicion());
        factur.setNoCertificado(peticion.getNoCertificado());
        factur.setCertificado(peticion.getCertificado());
        factur.setSello(peticion.getSello());
        factur.setRfcEmisor(peticion.getRfcEmisor());
        factur.setNombreEmisor(peticion.getNombreEmisor());
        factur.setRegimenFiscal(peticion.getRegimenFiscal());
        factur.setRfcReceptor(peticion.getRfcReceptor());
        factur.setNombreReceptor(peticion.getNombreReceptor());
        factur.setDomicilioFiscalReceptor(peticion.getDomicilioFiscalReceptor());
        factur.setRegimenFiscalReceptor(peticion.getRegimenFiscalReceptor());
        factur.setUsoCFDI(peticion.getUsoCFDI());
        factur.setClaveProdServ(peticion.getClaveProdServ());
        factur.setCantidad(peticion.getCantidad());
        factur.setClaveUnidad(peticion.getClaveUnidad());
        factur.setUnidad(peticion.getUnidad());
        factur.setValorUnitario(peticion.getValorUnitario());
        factur.setDescripcion(peticion.getDescripcion());
        factur.setImporte(peticion.getImporte());
        factur.setUuid(uuid.toString());

        facturasH.add(factur);

        respuesta.setUuid(uuid.toString());
        return respuesta;
    }

    @PayloadRoot(localPart = "HistorialFacturasRequest", namespace = "t4is.uv.mx/facturas")
    @ResponsePayload
    public HistorialFacturasResponse historialFacturas(){
        HistorialFacturasResponse respuesta = new HistorialFacturasResponse();
        for(int i = 0; i<facturasArray.size();i++){
            respuesta.getFactura().add(facturasH.get(i));
        }
        return respuesta;
    }
}
