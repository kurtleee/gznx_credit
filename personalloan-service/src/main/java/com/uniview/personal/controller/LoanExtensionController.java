package com.uniview.personal.controller;

import com.uniview.common.utils.ParamData;
import com.uniview.common.utils.ResponseData;
import com.uniview.personal.dto.ApplicationQueryDTO;
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
@RequestMapping("/extension")
public class LoanExtensionController {
    @Autowired
    private LoanExtensionService loanExtensionService;
    /**
     * 查询展期列表
     */
    @GetMapping("/findAll")
    public ResponseData<?> findAll(@RequestBody ParamData<?> paramData){
        return loanExtensionService.findAll(paramData);
    }

    /**
     * 查询原借据
     */
    @GetMapping("/findByIOU")
    public ResponseData<?> findByIOUs(@RequestParam("IOU") String IOU){
        return loanExtensionService.findByIOU(IOU);
    }
}
