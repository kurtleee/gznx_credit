package com.uniview.personal.controller;

import com.uniview.personal.dto.CreditApplicationDTO;
import com.uniview.personal.pojo.CreditApplications;
import com.uniview.personal.service.CreditApplicationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author：lixin
 * @Package：com.uniview.personal.controller
 * @Project：gznx_credit
 * @name：BusinessHandlingController
 * @Date：2024/8/28 19:08
 * @Filename：BusinessHandlingController
 * @Description：
 */
@RestController
@RequestMapping("/personal")
public class BusinessHandlingController {
    @Autowired
    private CreditApplicationsService creditApplicationsService;


    /**
     * 根据条件查询申请列表
     */
    @PostMapping("/getApplications")
    public List<CreditApplications> getApplications(@RequestBody CreditApplicationDTO creditApplicationDTO){
        return creditApplicationsService.getApplications(creditApplicationDTO);
    }
}
