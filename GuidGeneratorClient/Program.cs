using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GuidGeneratorClient
{
    class Program
    {
        static void Main(string[] args)
        {
            var worker = new Worker();
            worker.Run();
        }
    }
}
