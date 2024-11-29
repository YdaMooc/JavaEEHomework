package com.YdaMooc.chapter05.dao;

import com.YdaMooc.chapter03.pojo.Student;
import com.YdaMooc.chapter05.pojo.Students;
import org.apache.ibatis.annotations.Select;

public interface StudentMapper {
    @Select("SELECT * FROM t_students_2 WHERE cid=#{id}")
    Students findStudentByClassId(int cid);

    @Select("SELECT * FROM t_students_2 WHERE id=#{id}")
    Students selectStudent(int id);
}
