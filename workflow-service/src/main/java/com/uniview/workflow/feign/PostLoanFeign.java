package com.uniview.workflow.feign;

import com.uniview.common.utils.ResponseData;
import com.uniview.workflow.dto.PostLoanDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@FeignClient(value = "postloan-service" , url = "http://localhost:8081/postloan-followup-list")
public interface PostLoanFeign {
    @PostMapping("/updateStatus")
    ResponseData<?> updateStatus(@RequestBody PostLoanDto postLoanDto);
}
