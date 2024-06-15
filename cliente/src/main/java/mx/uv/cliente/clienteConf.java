package mx.uv.cliente;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class clienteConf {

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("xx.mx.uv.consumo.wsdl");
        return marshaller;
    }

    @Bean
    public ClaseCliente cliente (Jaxb2Marshaller marshaller){
        ClaseCliente c = new ClaseCliente();
        c.setDefaultUri("https://compras-production-300d.up.railway.app/ws/compras.wsdl");
        c.setMarshaller(marshaller);
        c.setUnmarshaller(marshaller);
        return c;
    }
    
}
