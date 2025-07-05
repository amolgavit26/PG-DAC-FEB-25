using CourierManagementSystem.Data;
using CourierManagementSystem.DTOs;
using CourierManagementSystem.Models;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;

namespace CourierManagementSystem.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    [Authorize]
    public class OrderController : ControllerBase
    {
        private readonly ApplicationDbContext _context;

        public OrderController(ApplicationDbContext context)
        {
            _context = context;
        }

        // POST: api/order/create
        [HttpPost("create")]
        public IActionResult Create(Order order)
        {
            
            var userEmail = User.Identity?.Name;
            var user = _context.Users.FirstOrDefault(u => u.Email == userEmail);
            if (user == null)
                return Unauthorized(new { message = "User not found." });

            order.UserId = user.Id; 
            order.TrackingNumber = Guid.NewGuid().ToString().Substring(0, 8);
            order.Status = "Pending";
            order.OrderDate = DateTime.Now;
            order.EstimatedDeliveryDate = DateTime.Now.AddDays(3);

            _context.Orders.Add(order);
            _context.SaveChanges();
            return Ok(order);
        }

        // GET: api/order/user
        [HttpGet("user")]
        [Authorize(Roles = "User")]
        public IActionResult GetUserOrders()
        {
            var userEmail = User.Identity?.Name;
            var user = _context.Users.FirstOrDefault(u => u.Email == userEmail);
            if (user == null) return Unauthorized();

            var orders = _context.Orders.Where(x => x.UserId == user.Id).ToList();
            return Ok(orders);
        }

        // GET: api/order/{id}
        [HttpGet("{id}")]
        public IActionResult GetById(int id)
        {
            var order = _context.Orders.Find(id);
            if (order == null) return NotFound();
            return Ok(order);
        }

        // GET: api/order/track/{trackingNumber}
        [HttpGet("track/{trackingNumber}")]
        [AllowAnonymous]
        public IActionResult TrackOrder(string trackingNumber)
        {
            var order = _context.Orders.FirstOrDefault(o => o.TrackingNumber == trackingNumber);
            if (order == null)
                return NotFound(new { message = "Tracking number not found." });

            return Ok(new
            {
                order.TrackingNumber,
                order.Status,
                order.PickupAddress,
                order.DeliveryAddress,
                order.Description, 
                order.OrderDate,
                order.EstimatedDeliveryDate
            });
        }

        // GET: api/order
        [HttpGet]
        [Authorize(Roles = "Admin")]
        public IActionResult GetAll()
        {
            var orders = _context.Orders.ToList();
            return Ok(orders);
        }

        // PUT: api/order/{id}/status
        [HttpPut("{id}/status")]
        [Authorize(Roles = "Admin")]
        public IActionResult UpdateStatus(int id, [FromBody] UpdateStatusDto dto)
        {
            var order = _context.Orders.Find(id);
            if (order == null) return NotFound();

            order.Status = dto.Status;
            _context.SaveChanges();

            return Ok(new { message = "Order status updated successfully.", order });
        }
    }
}
