package com.uniview.postloan.mapper;

import com.uniview.postloan.pojo.Cases;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author Administrator
* @description 针对表【cases(案件信息表)】的数据库操作Mapper
* @createDate 2024-09-03 11:10:01
* @Entity com.uniview.postloan.pojo.Cases
*/
public interface CasesMapper extends BaseMapper<Cases> {
    int insertCase(Cases cases);
}




