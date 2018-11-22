using System;

namespace CSuma
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            decimal primerNumero = readDecimal("Primer numero: ");
            decimal segundoNumero = readDecimal("Segundo numero: ");
            decimal suma = primerNumero + segundoNumero;
            Console.WriteLine("Suma =  " + suma);


            //Console.Write("Primer numero: ");
            //string stringPrimerNumero = Console.ReadLine();
            //int primerNumero = int.Parse(stringPrimerNumero);
            //Console.Write("Segundo numero: ");
            //string stringSegundo = Console.ReadLine();
            //int segundoNumero = int.Parse(stringSegundo);
            //int suma = primerNumero + segundoNumero;
            // Console.WriteLine("La suma de los numeros es :" + suma);
        }

        private static decimal readDecimal(string label) {
            Console.Write(label);
            string stringDecimal = Console.ReadLine();
            return decimal.Parse(stringDecimal);



        }
    }
}
