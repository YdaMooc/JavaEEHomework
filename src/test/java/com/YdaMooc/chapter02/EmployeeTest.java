package com.YdaMooc.chapter02;

import com.YdaMooc.chapter02.pojo.Employee;
import com.YdaMooc.chapter02.utils.JDBCUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class EmployeeTest {
    private SqlSession sqlSession;

    @Before
    public void init() {
        sqlSession = JDBCUtils.getSqlSession();
    }

    @Test
    public void findAllEmployee() {
        List<Employee> list = sqlSession.selectList("findAllEmployee");
        for (Employee employee : list) {
            System.out.println("查找所有员工: " + employee);
        }
    }

    @Test
    public void findEmployeeById() {
        List<Employee> list = sqlSession.selectList("findEmployeeById", 1);
        for (Employee employee : list) {
            System.out.println("根据ID查找员工: " + employee);
        }
    }

    @Test
    public void addEmployee() {
        Employee employee = new Employee();
        employee.setAge(21);
        employee.setName("吴勇达");
        employee.setPosition("员工");

        int i = sqlSession.insert("addEmployee", employee);
        System.out.println("是否新增成功: " + i);
    }

    @Test
    public void updateEmployee() {
        Employee employee = new Employee();
        employee.setId(4);
        employee.setAge(21);
        employee.setName("吴勇达");
        employee.setPosition("部长");

        int i = sqlSession.update("updateEmployee", employee);
        System.out.println("是否更新成功: " + i);
    }

    @Test
    public void deleteEmployeeById() {
        int i = sqlSession.delete("deleteEmployeeById", 4);
        System.out.println("是否删除成功: " + i);
    }

    @After
    public void destory() {
        sqlSession.commit();
        sqlSession.close();
    }
}
