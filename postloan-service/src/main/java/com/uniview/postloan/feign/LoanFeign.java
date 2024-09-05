package com.uniview.postloan.feign;

import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.dto.LoanDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "loan-service", url = "http://localhost:8084/loans")
public interface LoanFeign {
    //根据借款id查询借款信息
    @GetMapping("/loanById")
    ResponseData<LoanDto> getLoanById(@RequestParam("loanId") Long loanId);
}
