using Microsoft.AspNetCore.Mvc;

namespace WebApplication1.Controllers
{
    public class DefaultController : Controller
    {
        public IActionResult Index(int? id, int a=30, int b=40)
        {
            return View();

            
        }
    }
}
