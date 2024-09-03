package com.uniview.workflow.feign;

import com.uniview.common.utils.ResponseData;
import com.uniview.workflow.dto.CreditApplicationsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author ：zx
 * @date ：Created in 2024/9/3 16:11
 * @description：
 * @modified By：
 * @version: $
 */
@FeignClient(value = "loan-server", url = "http://127.0.0.1:8787/loans")
public interface ApplicationFeign {
    @PostMapping("/updateStatus")
    ResponseData<?> updateStatus(@RequestBody CreditApplicationsDTO creditApplicationsDTO);
}
