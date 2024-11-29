package com.YdaMooc.chapter05;

import com.YdaMooc.chapter05.dao.ClassMapper;
import com.YdaMooc.chapter05.dao.StudentMapper;
import com.YdaMooc.chapter05.pojo.Students;
import com.YdaMooc.chapter05.utils.JDBCUtils;
import com.YdaMooc.chapter05.pojo.Class;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentsTest {
    private SqlSession sqlSession = null;

    @Before
    public void init() {
        sqlSession = JDBCUtils.getSqlSession();
    }

    // ��ѯѧ����Ϣ
    @Test
    public void findStudentByIdTest() {
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Students students = mapper.selectStudent(2);
        System.out.println(students.toString());
    }

    // ��ѯ�༶��Ϣ��һ�Զ��ѯ�༶ѧ����Ϣ
    @Test
    public void findAllClassTest() {
        ClassMapper mapper = sqlSession.getMapper(ClassMapper.class);
        Class cls = mapper.selectClassById(2);
        System.out.println(cls.toString());
    }

    @After
    public void destory() {
        sqlSession.commit();
        sqlSession.close();
    }
}
