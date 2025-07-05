using System.ComponentModel.DataAnnotations;

namespace CourierManagementSystem.Models
{
    public class Order
    {
        public int Id { get; set; }

        public string? TrackingNumber { get; set; }

        [Required]
        public string Description { get; set; }

        [Required]
        public string PickupAddress { get; set; }

        [Required]
        public string DeliveryAddress { get; set; }

        public string Status { get; set; } = "Pending";

        public DateTime OrderDate { get; set; } = DateTime.Now;

        public DateTime? EstimatedDeliveryDate { get; set; }

        public int UserId { get; set; }
        public User? User { get; set; }
    }
}
