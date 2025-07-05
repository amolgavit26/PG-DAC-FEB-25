using System.ComponentModel.DataAnnotations;

namespace CourierManagementSystem.Models
{
    public class User
    {
        public int Id { get; set; }

        [Required]
        public string Email { get; set; }

        [Required]
        public string PasswordHash { get; set; }

        public string Role { get; set; } = "User"; 

        public string Name { get; set; }
    }
}
