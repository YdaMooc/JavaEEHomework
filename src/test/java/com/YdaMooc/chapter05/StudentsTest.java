package com.YdaMooc.chapter05;

import com.YdaMooc.chapter05.dao.ClassMapper;
import com.YdaMooc.chapter05.dao.StudentMapper;
import com.YdaMooc.chapter05.pojo.Class;
import com.YdaMooc.chapter05.pojo.Students;
import com.YdaMooc.utils.JDBCUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

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
        Students student = mapper.selectStudent(2);
        System.out.println(student.toString());
    }

    // ��ѯ�༶��Ϣ��һ�Զ��ѯ�༶ѧ����Ϣ
    @Test
    public void findAllClassTest() {
        ClassMapper mapper = sqlSession.getMapper(ClassMapper.class);
        Class cls = mapper.selectClassById(2);
        System.out.println(cls.toString());
    }

    // ���ݰ༶id���Ҷ�Ӧѧ��
    @Test
    public void findStudentByClassIdTest() {
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Students> student = mapper.findStudentByClassId(2);
        System.out.println(student.toString());
    }

    @After
    public void destory() {
        sqlSession.commit();
        sqlSession.close();
    }
}
