SELECT * FROM Pets WHERE Kind='Dog' AND Name GLOB '*An*';
SELECT * FROM pets WHERE kind= 'Cat' OR kind= 'Rabbit';
SELECT * FROM pets WHERE age BETWEEN 1 AND 5;
SELECT City, COUNT(*) AS OwnerCount FROM owners GROUP BY City ORDER BY OwnerCount DESC LIMIT 5;
