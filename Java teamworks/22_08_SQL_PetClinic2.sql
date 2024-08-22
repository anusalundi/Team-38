-- Calculate total Sales by City
SELECT Owners.City, SUM(Procedures.Price) AS TotalSales
FROM Sales JOIN Pets ON Sales.PetID = Pets.PetID
JOIN Owners ON Pets.OwnerID = Owners.OwnerID
JOIN Procedures ON Sales.ProcedureCode = Procedures.ProcedureCode
GROUP BY Owners.City;

-- Calculate total Sales by Pet Kind
SELECT Pets.Kind, SUM(Procedures.Price) AS TotalSales
FROM Sales JOIN Pets ON Sales.PetID = Pets.PetID
JOIN Procedures ON Sales.ProcedureCode = Procedures.ProcedureCode
GROUP BY Pets.Kind;

-- Calculate total Sales by City and Pet Kind
SELECT Owners.City, Pets.Kind, SUM(Procedures.Price) AS TotalSales
FROM Sales JOIN Pets ON Sales.PetID = Pets.PetID
JOIN Owners ON Pets.OwnerID = Owners.OwnerID
JOIN Procedures ON Sales.ProcedureCode = Procedures.ProcedureCode
GROUP BY Owners.City, Pets.Kind;

--Calculate Average sales by City
SELECT Owners.City, AVG(Procedures.Price) AS AverageSales
FROM Sales JOIN Pets ON Sales.PetID = Pets.PetID
JOIN Owners ON Pets.OwnerID = Owners.OwnerID
JOIN Procedures ON Sales.ProcedureCode = Procedures.ProcedureCode
GROUP BY Owners.City;
