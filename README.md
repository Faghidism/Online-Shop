# Online Clothing Store

## Project Description
A Java-based online shopping system for a clothing store with **client-server architecture** and **mandatory GUI implementation** (Java Swing). The system supports two user roles: customers and administrators, each with distinct functionalities.

---

## Core Features

### **User Management**
- **All users** (customers/admins) can:
  - Register (`signUp`) with username/password
  - Authenticate (`signIn`) 
- **Role-based access control** after login

### **Customer Functions**
- Browse available clothing products
- View product details (price, stock)
- Add items to cart
- Submit orders (reduces stock on server)
- View order history

### **Admin Functions**
- **CRUD Operations**:
  - Add/edit/delete products
  - Restock inventory
- View all customer orders (with usernames)
- Manage pending orders

---

## Technical Specifications

### **Client-Server Architecture**
| Component   | Responsibility                          |
|-------------|-----------------------------------------|
| **Server**  | Handles requests (auth, orders, inventory) |
| **Client**  | GUI interface for users; communicates with server |

### **GUI Requirements**
- Clean, intuitive design (affects grading)
- Product display with images (optional but recommended)
- Shopping cart interface
- Admin dashboard for inventory/order management

### **Data Flow**
1. Customer selects item → Added to local cart
2. Order submitted → Server validates stock → Updates database
3. Admin sees new order in dashboard

---

## Advanced Java Concepts
- **Networking**: Socket programming for client-server communication
- **Multithreading**: Handle concurrent user requests
- **File I/O**: Persistent storage for user/product data
- **Design Patterns**: MVC (Model-View-Controller) encouraged

---

## Bonus Points
- **Creative Features** (pre-approved by TAs):
  - Product ratings/reviews
  - Discount codes
  - Order tracking
- **Enhanced GUI**:
  - Animations
  - Dark mode
  - Responsive layouts

---

## Example Workflow
```plaintext
[Customer]
1. Login → Browse Products → Add to Cart → Checkout
2. Server: "Order received. Stock updated."

[Admin]
1. Login → Add New Product (Name: "T-Shirt", Price: $20, Stock: 100)
2. View Orders → See "User123 ordered 2 T-Shirts"
