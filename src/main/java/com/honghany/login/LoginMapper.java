package com.honghany.login;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    int selectTest();
}
