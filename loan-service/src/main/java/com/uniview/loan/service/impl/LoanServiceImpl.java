package com.uniview.loan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.loan.pojo.Loan;
import com.uniview.loan.service.LoanService;
import com.uniview.loan.mapper.LoanMapper;
import org.springframework.stereotype.Service;

/**
* @author kurtlee
* @description 针对表【loan】的数据库操作Service实现
* @createDate 2024-08-28 14:33:32
*/
@Service
public class LoanServiceImpl extends ServiceImpl<LoanMapper, Loan>
    implements LoanService{

    @Override
    public Loan findById(Long loanId) {
        return getById(loanId);
    }
}




