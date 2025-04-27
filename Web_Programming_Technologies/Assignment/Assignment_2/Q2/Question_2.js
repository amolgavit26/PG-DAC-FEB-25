

function displayData(){
    const firstName = document.getElementById("firstName").value;
    const lastName = document.getElementById("lastName").value;
    const contactNo = document.getElementById("contactNo").value;
    const emailID = document.getElementById("emailID").value;
    
    



    const details = document.getElementById("details");
    details.innerHTML = `
    <p><strong>First Name : ${firstName}</strong></p>
    <p><strong>Last Name : ${lastName}</strong></p>
    <p><strong>Contact Number : ${contactNo}</strong></p>
    <p><strong>Email ID : ${emailID}</strong></p>
    `;
}
