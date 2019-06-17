package kr.hs.dgsw.board_back.Domain;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select id, account, email, created, updated")
    public List<User> findAll();

    @Delete("delete from user where id=#{id}")
    public int deleteById(@Param("id") Long id);

    //@Insert("insert into user(account, password, username, email) values(#{account}, #{password}")
    public Long add(User user);
    public int modify(User user);
    public User findById(Long id);
}
