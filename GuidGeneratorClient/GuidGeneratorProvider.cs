using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using GuidGeneratorClient.ServiceReference1;

namespace GuidGeneratorClient
{
    public class GuidGeneratorProvider : IDisposable
    {
        private readonly GuidGeneratorServiceClient _guidGenerator;
        public GuidGeneratorProvider()
        {
            _guidGenerator = new GuidGeneratorServiceClient();
        }

        public string Generate()
        {
            return _guidGenerator.Generate();
        }

        public void Dispose()
        {
            _guidGenerator.Close();
        }
    }
}
