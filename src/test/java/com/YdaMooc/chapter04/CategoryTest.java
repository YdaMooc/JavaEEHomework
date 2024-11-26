package com.YdaMooc.chapter04;

import com.YdaMooc.chapter04.pojo.Category;
import com.YdaMooc.chapter04.utils.JDBCUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CategoryTest {
    private SqlSession sqlSession = null;

    @Before
    public void init() {
        sqlSession = JDBCUtils.getSqlSession();
    }

    @Test
    public void findCategoryTest() {
        Category category = sqlSession.selectOne("com.YdaMooc.chapter04.pojo.Category." +
                "findCategoryWithProduct", 1);
        System.out.println(category);
    }

    @Test
    public void findCategory2Test() {
        Category category = sqlSession.selectOne("com.YdaMooc.chapter04.pojo.Category." +
                "findCategoryWithProduct2", 2);
        System.out.println(category);
    }

    @After
    public void destory() {
        sqlSession.commit();
        sqlSession.close();
    }
}
