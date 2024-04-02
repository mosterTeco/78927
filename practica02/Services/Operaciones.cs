using System;
using WSDL.mensajes;

namespace WSDL.operaciones{
    public class Operaciones : Mensajes{

        public string[] nombres = new string[100]; 
        public int indice = 0; 

        public string Saludar(string nombre){
            nombres[indice] = nombre;
            indice++; 
            string msj = "Hola " + nombre;
            return msj;
        }

        public string Mostrar(int id){
            if (id >= 0 && id < indice){
                return nombres[id];
            }
            else{
                return "Indice incorrecto";
            }
        }
    }
}


