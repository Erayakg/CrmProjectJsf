/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */


// Form validation
const form = document.getElementById("admin-login-form");
const personnelServiceNumber = document.getElementById("personnel-service-number");
const password = document.getElementById("password");

form.addEventListener("submit", function(event) {
  event.preventDefault();

  if (personnelServiceNumber.value.length < 5) {
    alert("Personnel Service Number must be at least 5 digits long.");
    return;
  }

  if (password.value.length < 8) {
    alert("Password must be at least 8 characters long.");
    return;
  }

  // If all validation checks pass, submit the form
  form.submit();
});

// Form animation
const formInputs = document.querySelectorAll(".form-group input[type='text'], .form-group input[type='password']");

formInputs.forEach(function(input) {
  input.addEventListener("focus", function() {
    input.style.animation = "input-focus 0.3s ease-in-out";
  });

  input.addEventListener("blur", function() {
    input.style.animation = "";
  });
});

const formButton = document.querySelector(".form-group button[type='submit']");

formButton.addEventListener("mouseover", function() {
  formButton.style.animation = "button-hover 0.3s ease-in-out";
});

formButton.addEventListener("mouseout", function() {
  formButton.style.animation = "";
});