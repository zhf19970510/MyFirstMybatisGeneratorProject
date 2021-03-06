package com.zhf.mapper;

import com.zhf.pojo.Users;
import com.zhf.pojo.UsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Jan 06 14:06:46 CST 2020
     */
    long countByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Jan 06 14:06:46 CST 2020
     */
    int deleteByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Jan 06 14:06:46 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Jan 06 14:06:46 CST 2020
     */
    int insert(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Jan 06 14:06:46 CST 2020
     */
    int insertSelective(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Jan 06 14:06:46 CST 2020
     */
    List<Users> selectByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Jan 06 14:06:46 CST 2020
     */
    Users selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Jan 06 14:06:46 CST 2020
     */
    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Jan 06 14:06:46 CST 2020
     */
    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Jan 06 14:06:46 CST 2020
     */
    int updateByPrimaryKeySelective(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Mon Jan 06 14:06:46 CST 2020
     */
    int updateByPrimaryKey(Users record);
}