package com.YdaMooc.chapter01;

import com.YdaMooc.chapter01.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class UserTest {

    @Test
    public void findById() throws IOException {
        // 1. ��ȡ���������ļ�
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2. ����sqlSessionFactory��������
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        // 3. ����sqlSession����
        SqlSession sqlsession = sqlSessionFactory.openSession();

        // 4. ִ��sql��䣬sql����Ψһ��ʶ��namespace.statementId
        User user = sqlsession.selectOne("com.YdaMooc.chapter01.pojo.User.findById", 1);

        System.out.println(user.toString());

        // 5. �ͷ���Դ
        sqlsession.close();
    }

    @Test
    public void findAllUser() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlsession = sqlSessionFactory.openSession();
        for (int i = 1; i <= 3; i++) {
            User user = sqlsession.selectOne("com.YdaMooc.chapter01.pojo.User.findById", i);
            System.out.println(user);
        }
        sqlsession.close();
    }

    @Test
    public void homeWork() {
        String resources = "mybatis-config.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("findById", 1);
        System.out.println(user.getUname());
        sqlSession.close();
    }
}
