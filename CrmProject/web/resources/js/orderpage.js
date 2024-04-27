/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */


// Sample data for completed and pending orders
const completedOrders = [
  {
    id: 1,
    customerName: "John Doe",
    orderDate: "2023-03-15",
    totalAmount: 120.50,
    status: "completed"
  },
  {
    id: 2,
    customerName: "Jane Smith",
    orderDate: "2023-03-14",
    totalAmount: 75.25,
    status: "completed"
  }
];

const pendingOrders = [
  {
    id: 3,
    customerName: "Bob Johnson",
    orderDate: "2023-03-13",
    totalAmount: 99.99,
    status: "pending"
  },
  {
    id: 4,
    customerName: "Alice Brown",
    orderDate: "2023-03-12",
    totalAmount: 150.00,
    status: "pending"
  }
];

// Display completed orders
const completedOrdersList = document.getElementById("completed-orders-list");

completedOrders.forEach(function(order) {
  const li = document.createElement("li");
  li.innerHTML = `
    <span>Order ID: ${order.id}</span>
    <span>Customer Name: ${order.customerName}</span>
    <span>Order Date: ${order.orderDate}</span>
    <span>Total Amount: ${order.totalAmount}</span>
    <span>Status: ${order.status}</span>
  `;
  completedOrdersList.appendChild(li);
});

// Display pending orders
const pendingOrdersList = document.getElementById("pending-orders-list");

pendingOrders.forEach(function(order) {
  const li = document.createElement("li");
  li.innerHTML = `
    <span>Order ID: ${order.id}</span>
    <span>Customer Name: ${order.customerName}</span>
    <span>Order Date: ${order.orderDate}</span>
    <span>Total Amount: ${order.totalAmount}</span>
    <span>Status: ${order.status}</span>
  `;
  pendingOrdersList.appendChild(li);
});