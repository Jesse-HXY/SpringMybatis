package com.jesse.dao;

import org.apache.ibatis.annotations.Param;

public interface AccountDao {
    void addMoney(@Param("id")int id,@Param("money")double money);
    void deductMoney(@Param("id")int id,@Param("money")double money);
}
