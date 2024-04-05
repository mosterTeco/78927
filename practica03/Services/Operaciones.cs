using System;
using WSDL.mensajes;

namespace WSDL.operaciones{
    public class Operaciones : Mensajes{

        public double Sumar(double a, double b){
            return a + b;
        }

        public double Restar(double a, double b){
            return a - b;
        }

        public double Multiplicar(double a, double b){
            return a * b;
        }

        public double Dividir(double a, double b){
            if (b != 0)
                return a / b;
            else
                throw new DivideByZeroException("Imposible dividir entre 0");
        }

        public double RaizCuadrada(double a){
            if (a >= 0)
                return Math.Sqrt(a);
            else
                throw new ArgumentOutOfRangeException("a", "Un numero negativo no puede tener raiz cuadrada");
        }

        public double Exponencial(double a, double b){
            return Math.Pow(a, b);
        }   
    }
}