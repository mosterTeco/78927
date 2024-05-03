package mx.uv.practica06;

import java.util.ArrayList;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.t4is.grados.CelsiusToFahrenheitResponse;
import mx.uv.t4is.grados.FahrenheitToCelsiusRequest;
import mx.uv.t4is.grados.FahrenheitToCelsiusResponse;
import mx.uv.t4is.grados.OperacionResponse;
import mx.uv.t4is.grados.OperacionResponse.History;
import mx.uv.t4is.grados.CelsiusToFahrenheitRequest;

@Endpoint
public class GradosEndPoint {

    ArrayList<OperacionResponse.History> resultados = new ArrayList<>();

    @PayloadRoot(localPart = "CelsiusToFahrenheitRequest", namespace = "t4is.uv.mx/grados")
    @ResponsePayload
    public CelsiusToFahrenheitResponse gradosCaF(@RequestPayload CelsiusToFahrenheitRequest  peticion){

        History historial = new History();
        CelsiusToFahrenheitResponse respuesta = new CelsiusToFahrenheitResponse();

        double celsius = peticion.getCelsius();
        double fahrenheit = convertirCelsiusToFahrenheit(celsius);

        respuesta.setFahrenheit(fahrenheit);

        historial.setId(String.valueOf(0));
        historial.setOperacion("Grados C° a Grados F°");
        historial.setResultado(Double.toString(fahrenheit));

        resultados.add(historial);

        return respuesta;
    }

    @PayloadRoot(localPart = "FahrenheitToCelsiusRequest", namespace = "t4is.uv.mx/grados")
    @ResponsePayload
    public FahrenheitToCelsiusResponse gradosFaC(@RequestPayload FahrenheitToCelsiusRequest peticion){

        History historial = new History();
        FahrenheitToCelsiusResponse respuesta = new FahrenheitToCelsiusResponse();

        double fahrenheit = peticion.getFahrenheit();

        double celsius = convertirFahrenheitToCelsius(fahrenheit);

        respuesta.setCelsius(celsius);

        historial.setId(String.valueOf(0));
        historial.setOperacion("Grados F° a Grados C°");
        historial.setResultado(Double.toString(celsius));

        resultados.add(historial);
        return respuesta;
    }

    @PayloadRoot(localPart = "OperacionRequest", namespace = "t4is.uv.mx/grados")
    @ResponsePayload 
    public OperacionResponse Historial (){
        OperacionResponse respuesta = new OperacionResponse();
        for(int i=0;i<resultados.size();i++){
            respuesta.getHistory().add(resultados.get(i));
        }
        return respuesta;
    }

    private double convertirCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private double convertirFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
