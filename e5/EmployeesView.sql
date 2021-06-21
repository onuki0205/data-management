create view EmployeesView
as
select employees.name as Employee, age, positions.name as Position, departments.name as Department from employees
inner join positions on employees.positionid = positions.id
inner join deptstaff on employees.id = deptstaff.employeeid
inner join departments on departments.id = deptstaff.departmentid;
