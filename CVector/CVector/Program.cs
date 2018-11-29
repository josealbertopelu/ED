using System;

namespace CVector
{
    class Vector
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
        }

        public static int BinarySearch(int[] v, int x){
           
            int ini = 0;
            int fin = v.Length - 1;
            int mitad = (ini + fin)/2;
            while (ini <= fin && v[mitad] != x)
            {
                if (x < v[mitad - 1])
                {
                    fin = mitad - 1;
                }
                else
                {
                    ini = mitad + 1;
                }
                    mitad = (ini + fin) / 2;

            }
            return v[mitad];
        }
    }
}