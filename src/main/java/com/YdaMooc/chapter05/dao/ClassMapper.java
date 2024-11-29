package com.YdaMooc.chapter05.dao;

import com.YdaMooc.chapter05.pojo.Class;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface ClassMapper {

    @Select("SELECT * FROM t_class WHERE id=#{id}")
    @Results({@Result(id = true, column = "id", property = "id"),
            @Result(column = "classname", property = "classname"),
            @Result(column = "id", property = "studentList",
                    many = @Many(select = "com.YdaMooc.chapter05.dao.StudentMapper." +
                            "findStudentByClassId"))})
    Class selectClassById(int id);
}
