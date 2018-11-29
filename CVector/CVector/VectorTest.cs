using NUnit.Framework;
using System;
namespace CVector
{
    [TestFixture()]
    public class VectorTest
    {
        [Test()]
        public void BinarySearch()
        {

            Assert.AreEqual(-1, Vector.BinarySearch(new int[] { 45 }, 33));
            Assert.AreEqual(3, Vector.BinarySearch(new int[] {2,3,4,5,6,7,10 },5));
            Assert.AreEqual(0, Vector.BinarySearch(new int[] {-2,3,7,8,12,65 },-2));
            Assert.AreEqual(5, Vector.BinarySearch(new int[] {-2,3,7,8,12,65 },65));
        }
    }
}
