--a--
select * from EmployeesView where department = 'Marketing';

--b--
select department , count(*) from EmployeesView GROUP BY Department;

--c--
select distinct Employee from EmployeesView where age <= 45 and age >= 30 and Position = 'Accountant';
