package com.uniview.loan.controller;

import com.uniview.common.utils.ResponseData;
import com.uniview.loan.pojo.CreditApplications;
import com.uniview.loan.pojo.Loan;
import com.uniview.loan.service.CreditApplicationsService;
import com.uniview.loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：zx
 * @date ：Created in 2024/8/29 14:22
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
@RequestMapping("/loans")
public class LoanController {
    @Autowired
    private LoanService loanService;
    @Autowired
    private CreditApplicationsService applicationsService;

    @PostMapping("/apply")
    public ResponseData<?> applyForLoan(@RequestBody Loan loan) {
        loanService.save(loan);
        return new ResponseData<>().success();
    }

    @PostMapping("/updateStatus")
    public ResponseData<?> updateStatus(@RequestBody CreditApplications creditApplications) {
        applicationsService.updateById(creditApplications);
        return new ResponseData<>().success();
    }
}
