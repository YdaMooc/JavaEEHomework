package com.YdaMooc.chapter03;

import com.YdaMooc.chapter02.utils.JDBCUtils;
import com.YdaMooc.chapter03.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    private SqlSession sqlSession;

    @Before
    public void init() {
        sqlSession = JDBCUtils.getSqlSession();
    }

    @Test
    public void findStudentByNameOrMajorTest() {
        Student student = new Student();
        List<Student> students = sqlSession.selectList("com.YdaMooc.chapter03.pojo.Student." +
                "findStudentByNameAndMajor", student);
//        List<Student> students = sqlSession.selectList("findStudentByNameAndMajor", student);
        for (Student s : students) {
            System.out.println(s);
        }
    }

    @Test
    public void findByListTest() {
        // ����List���ϣ���װ��ѯid
        List<Integer> ids = new ArrayList<Integer>();
        // ��С��5��idֵ����List��
        for (int i = 1; i < 5; i++) {
            ids.add(i);
        }
        List<Student> students = sqlSession.selectList("com.YdaMooc.chapter03.pojo.Student." +
                "findByList", ids);
        for (Student s : students) {
            System.out.println(s);
        }
    }

    @After
    public void destory() {
        sqlSession.commit();
        sqlSession.close();
    }
}
