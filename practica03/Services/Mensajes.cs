using System;
using System.ServiceModel;

namespace WSDL.mensajes{
    [ServiceContract]
    public interface Mensajes{
        [OperationContract]
        double Sumar(double a, double b);

        [OperationContract]
        double Restar(double a, double b);

        [OperationContract]
        double Multiplicar(double a, double b);

        [OperationContract]
        double Dividir(double a, double b);

        [OperationContract]
        double RaizCuadrada(double a);

        [OperationContract]
        double Exponencial(double a, double b);
    }
}
