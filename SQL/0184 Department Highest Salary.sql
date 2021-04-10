# Write your MySQL query statement below
SELECT 
  d1.Name Department, 
  e1.Name Employee, 
  e1.Salary 
FROM 
  Employee e1, 
  Department d1,
  (SELECT DepartmentID, MAX(Salary) Salary FROM Employee GROUP BY DepartmentID) m1
WHERE 
  e1.DepartmentId = d1.Id
  AND e1.DepartmentId = m1.DepartmentId
  AND e1.Salary = m1.Salary