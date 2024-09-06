package com.uniview.personal.controller;

import com.uniview.common.utils.ParamData;
import com.uniview.common.utils.ResponseData;
import com.uniview.personal.service.ContractsService;
import com.uniview.personal.service.LoanExtensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author：lixin
 * @Package：com.uniview.personal.controller
 * @Project：gznx_credit
 * @name：LoanExtensionController
 * @Date：2024/9/3 10:41
 * @Filename：LoanExtensionController
 * @Description：
 */
@RestController
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private ContractsService contractsService;
    /**
     * 查询合同列表
     */
    @GetMapping("/findAll")
    public ResponseData<?> findAll(){
        return contractsService.findAll();
    }
}
