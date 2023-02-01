package com.pagehelper.mapper;


import com.pagehelper.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author smallmayi
 */
@Mapper
public interface UserMapper {
    List<User> queryList();
}




