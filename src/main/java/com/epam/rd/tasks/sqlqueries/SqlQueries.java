package com.epam.rd.tasks.sqlqueries;

/**
 * Implement sql queries like described
 */
public class SqlQueries {
    //Select all employees sorted by last name in ascending order
    //language=HSQLDB
    String select01 = "SELECT id, lastname, salary FROM employee ORDER BY LASTNAME;";

    //Select employees having no more than 5 characters in last name sorted by last name in ascending order
    //language=HSQLDB
    String select02 = "SELECT id, lastname, salary FROM employee where (length(lastname)<6) ORDER BY LASTNAME ASC;";

    //Select employees having salary no less than 2000 and no more than 3000
    //language=HSQLDB
    String select03 = "SELECT id, lastname, salary FROM employee where salary between 1999 and 3001;";

    //Select employees having salary no more than 2000 or no less than 3000
    //language=HSQLDB
    String select04 = "SELECT id, lastname, salary FROM employee where salary not between 2001 and 2999;";

    //Select all employees assigned to departments and corresponding department
    //language=HSQLDB
    String select05 = "SELECT id, lastname, salary, department.name FROM department left join employee on department.id = employee.department where lastname is not null;";

    //Select all employees and corresponding department name if there is one.
    //Name column containing name of the department "depname".
    //language=HSQLDB
    String select06 = "SELECT id, lastname, salary, department.name as depname FROM employee left join department on department.id = employee.department;";

    //Select total salary pf all employees. Name it "total".
    //language=HSQLDB
    String select07 = "SELECT SUM(salary) as total from employee;";

    //Select all departments and amount of employees assigned per department
    //Name column containing name of the department "depname".
    //Name column containing employee amount "staff_size".
    //language=HSQLDB
    String select08 = "SELECT department.name as depname, (Select count(department) from employee where employee.department=department.id) as staff_size from department join employee on department.id = employee.department order by department.name asc;";

    //Select all departments and values of total and average salary per department
    //Name column containing name of the department "depname".
    //language=HSQLDB
    String select09 = "SELECT department.name as depname, (Select sum(salary) from employee where employee.department=department.id) as total, (Select avg(salary)from employee where employee.department=department.id) as average from department join employee on department.id = employee.department;";

    //Select lastnames of all employees and lastnames of their managers if an employee has a manager.
    //Name column containing employee's lastname "employee".
    //Name column containing manager's lastname "manager".
    //language=HSQLDB
    String select10 = "Select lastname as manager, (select lastname from employee where id in ) as employee from employee;";


}
