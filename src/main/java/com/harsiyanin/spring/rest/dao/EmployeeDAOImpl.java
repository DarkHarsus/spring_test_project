package com.harsiyanin.spring.rest.dao;

import com.harsiyanin.spring.rest.entity.Employee;
import com.koloboke.collect.map.hash.HashObjObjMaps;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        List<Employee> allEmployees = session.createQuery("from Employee", Employee.class)
                .getResultList();
        return allEmployees;
    }

    @Override
    public Map<String, Employee> getEmployeesMap(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        Map<String, Employee> employeeMap = HashObjObjMaps.newMutableMap();
        return Map.of();
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employee employee = session.get(Employee.class, id);
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Employee> query = session.createQuery("delete from Employee where id=:EmployeeId");
        query.setParameter("EmployeeId", id);
        query.executeUpdate();
    }
}
