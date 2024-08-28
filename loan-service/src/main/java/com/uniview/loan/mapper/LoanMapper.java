package com.uniview.loan.mapper;

import com.uniview.loan.pojo.Loan;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kurtlee
* @description 针对表【loan】的数据库操作Mapper
* @createDate 2024-08-28 14:33:32
* @Entity com.uniview.loan.pojo.Loan
*/
@Mapper
public interface LoanMapper extends BaseMapper<Loan> {

}




