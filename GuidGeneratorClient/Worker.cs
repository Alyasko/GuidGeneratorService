using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GuidGeneratorClient
{
    public class Worker
    {
        public void Run()
        {
            Console.WriteLine("Generating new GUID using remote WCF service...");

            var generator = new GuidGeneratorProvider();
            var guid = generator.Generate();

            Console.WriteLine($"Generated GUID:\n{guid}");
        }
    }
}
