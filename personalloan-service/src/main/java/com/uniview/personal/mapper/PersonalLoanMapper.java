package com.uniview.personal.mapper;

import com.uniview.personal.pojo.PersonalLoan;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kurtlee
* @description 针对表【personal_loan】的数据库操作Mapper
* @createDate 2024-08-28 14:26:44
* @Entity com.uniview.personal.pojo.PersonalLoan
*/
@Mapper
public interface PersonalLoanMapper extends BaseMapper<PersonalLoan> {

}




