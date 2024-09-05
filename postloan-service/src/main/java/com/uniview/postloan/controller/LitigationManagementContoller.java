package com.uniview.postloan.controller;

import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.CollectionRecord;
import com.uniview.postloan.pojo.LitigationManagement;
import com.uniview.postloan.service.LitigationManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/litigation-management")
public class LitigationManagementContoller {
    @Autowired
    private LitigationManagementService litigationManagementService;
    @GetMapping("/getLitigationManagementList")
    public ResponseData<?> getLitigationManagementList() {
        return litigationManagementService.getLitigationManagementList();
    }
}
