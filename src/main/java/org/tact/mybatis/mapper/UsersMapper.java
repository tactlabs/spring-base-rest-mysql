package org.tact.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.tact.mybatis.domain.Users;

@Mapper
public interface UsersMapper {

    @Select("select * from users")
    List<Users> findAll();

    @Insert("insert into users(name,salary) values(#{name},#{salary})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    void insert(Users users);
}
