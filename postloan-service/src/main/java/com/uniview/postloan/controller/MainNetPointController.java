package com.uniview.postloan.controller;

import com.uniview.common.utils.ParamData;
import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.MainNetPoint;
import com.uniview.postloan.service.MainNetPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/main-net-point")
public class MainNetPointController {
    @Autowired
    private MainNetPointService mainNetPointService;
    //查询催收管理规则配置列表
    @PostMapping("/getMainNetPointList")
    public ResponseData<?> getMainNetPointList(@RequestBody MainNetPoint mainNetPoint) {
        return mainNetPointService.getMainNetPointList(mainNetPoint);
    }
}
