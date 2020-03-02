package dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdministratorMapper<Administrator, Page> {
    int deleteByPrimaryKey(Integer administratorId);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    Administrator selectByPrimaryKey(Integer administratorId);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);

//    custom

    Administrator selectByUsername(@Param("username") String username);

    int batchDelete(@Param("administratorIds") List<Integer> administratorIds);

//    Page<Administrator> selectList();

}
