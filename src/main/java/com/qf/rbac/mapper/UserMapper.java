package com.qf.rbac.mapper;

import com.qf.rbac.entity.User;
import com.qf.rbac.entity.UserExample;
import com.qf.rbac.entity.dto.LoginDTO;
import com.qf.rbac.entity.dto.UserDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    //根据名字去查用户id
    User selectUser(String name);

    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    LoginDTO selectUserByPhone(Long phone);

    List<UserDTO> selectAllUser();

    List<UserDTO> selectAllUserByInput(Long phone,Integer roleid,Boolean isvip);

    List<UserDTO> selectUserDtoByInput(Long phone, Integer roleid, Boolean isvip);

    int updateRolesById(Long id, String roles);

    int updateRoleInfo(Long id, Integer roleid, String roles);

    List<UserDTO> getUserRoleId();
}