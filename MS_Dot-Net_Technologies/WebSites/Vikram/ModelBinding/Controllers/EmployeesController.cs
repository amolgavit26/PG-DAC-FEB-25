using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using ModelBinding.Models;

namespace ModelBinding.Controllers
{
    public class EmployeesController : Controller
    {
        // GET: EmployeesController
        //Employees/Index  
        public ActionResult Index()
        {
            List<Employee> emps = Employee.GetAllEmployees();
            return View(emps);
        }

        // GET: EmployeesController/Details/5
        //Employees/Details/123
        public ActionResult Details(int id)
        {
            Employee obj = Employee.GetSingleEmployee(id);
            if (obj == null)
            {
                ViewBag.message = "not found";
                //return NotFound();
            }
            return View(obj);
        }

        // GET: EmployeesController/Create
        //Employees/Create
        //[HttpGet]
        public ActionResult Create()
        {
            return View();
        }

        // POST: EmployeesController/Create
        [HttpPost]
        [ValidateAntiForgeryToken]

        //MODEL BINDING - Ensure PROPERTY names are same as HTML Control names
        public ActionResult Create(Employee obj)
        {
            try
            {
                Employee.Insert(obj);
                //return RedirectToAction("Index");
                ViewBag.message = "Success";
                return View();
            }
            catch (Exception ex)
            {
                ViewBag.message =  ex.Message;
                return View();
            }
        }

        ////BINDING - Ensure parameter names (variable names) are same as HTML Control names
        //public ActionResult Create(int EmpNo, string Name, decimal Basic, int DeptNo )
        //{
        //    try
        //    {

        //        return RedirectToAction("Index");
        //    }
        //    catch
        //    {
        //        return View();
        //    }
        //}
        //public ActionResult Create(IFormCollection collection)
        //{
        //    try
        //    {
        //        string Name = collection["Name"];
        //        string EmpNo = collection["EmpNo"];
        //        string Basic = collection["Basic"];
        //        string DeptNo = collection["DeptNo"];
        //        //return RedirectToAction(nameof(Index));
        //        return RedirectToAction("Index");
        //    }
        //    catch
        //    {
        //        return View();
        //    }
        //}

        // GET: EmployeesController/Edit/5
        public ActionResult Edit(int id)
        {
            Employee obj = Employee.GetSingleEmployee(id);
            return View(obj);
        }
        // POST: EmployeesController/Edit/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(int id, Employee obj)
        {
            try
            {
                Employee.Update(obj);
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: EmployeesController/Delete/5
        public ActionResult Delete(int id)
        {
            Employee obj = Employee.GetSingleEmployee(id);
            return View(obj);
        }
        // POST: EmployeesController/Delete/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Delete(int id,Employee obj)
        {
            try
            {
                //Employee.Delete2(obj);
                Employee.Delete(id);
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }
    }
}
