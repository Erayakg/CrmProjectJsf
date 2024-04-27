// Get the edit buttons and modal element
const editButtons = document.getElementsByClassName("edit-button");
const editModal = document.getElementById("edit-modal");

// Add a click event listener to each edit button
for (let i = 0; i < editButtons.length; i++) {
    editButtons[i].addEventListener("click", function () {
        // Set the product name and price in the modal form
        const productName = this.getAttribute("data-product-name");
        const productPrice = this.getAttribute("data-product-price");
        document.getElementById("product-name-edit").value = productName;
        document.getElementById("product-price-edit").value = productPrice;

        // Open the modal
        editModal.style.display = "block";
    });
}

const editForm = document.querySelector("#edit-modal form");
editForm.addEventListener("submit", function (event) {
    event.preventDefault();

    // Get the product ID, name, and price from the modal form
    const productId = document.getElementById("product-id").value;
    const productName = document.getElementById("product-name-edit").value;
    const productPrice = document.getElementById("product-price-edit").value;

    // Update the product in the table
    updateProductInTable(productId, productName, productPrice);

    // Close the modal
    editModal.style.display = "none";
});

// Function to update product details in the table
function updateProductInTable(productId, productName, productPrice) {
    // Assuming product ID is stored as an attribute in the table row
    const rows = document.querySelectorAll('tbody tr');
    for (let i = 0; i < rows.length; i++) {
        if (rows[i].getAttribute('data-product-id') === productId) {
            rows[i].cells[0].textContent = productName; // Update product name
            rows[i].cells[1].textContent = `$${productPrice}`; // Update product price
            break;
        }
    }
}

// Add a click event listener to the modal close button
const closeBtn = editModal.getElementsByClassName("close")[0];
closeBtn.addEventListener("click", function () {
    editModal.style.display = "none";
});

// Add a click event listener to the modal background
const modalBackground = editModal.getElementsByClassName("modal-background")[0];
modalBackground.addEventListener("click", function () {
    editModal.style.display = "none";
});
