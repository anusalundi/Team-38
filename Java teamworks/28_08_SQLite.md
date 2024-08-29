```sql
CREATE TABLE Customers (
    CustomerID INTEGER PRIMARY KEY,
    FirstName TEXT,
    LastName TEXT,
    Email TEXT
);

INSERT INTO Customers (FirstName, LastName, Email) VALUES 
('John', 'Doe', 'john.doe@example.com'),
('Jane', 'Smith', 'jane.smith@example.com'),
('Alice', 'Brown', 'alice.brown@example.com');

CREATE TABLE Products (
    ProductID INTEGER PRIMARY KEY,
    ProductName TEXT,
    Price REAL
);

INSERT INTO Products (ProductName, Price) VALUES 
('Laptop', 999.99),
('Smartphone', 499.99),
('Tablet', 299.99);

CREATE TABLE Orders (
    OrderID INTEGER PRIMARY KEY,
    CustomerID INTEGER,
    ProductID INTEGER,
    OrderDate TEXT,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID),
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);

INSERT INTO Orders (CustomerID, ProductID, OrderDate) VALUES 
(1, 1, '2024-08-22'),
(2, 2, '2024-08-22'),
(3, 3, '2024-08-23');
```

![image](https://github.com/user-attachments/assets/6377c2ee-dcff-438a-a1ce-3bd4b4d455fb)

![image](https://github.com/user-attachments/assets/550982bb-78f3-4d3d-8540-7df38126573b)

![image](https://github.com/user-attachments/assets/dabcdc85-2b01-4a9a-b2f2-0271e04fa70d)
