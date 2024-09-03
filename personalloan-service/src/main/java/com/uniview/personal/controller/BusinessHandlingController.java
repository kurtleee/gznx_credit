package com.uniview.personal.controller;

import com.uniview.common.utils.ParamData;
import com.uniview.common.utils.ResponseData;
import com.uniview.personal.dto.ApplicationQueryDTO;
import com.uniview.personal.dto.ApplyApplicationDTO;
import com.uniview.personal.dto.AssociatedBusinessQueryDTO;
import com.uniview.personal.pojo.AssociatedBusinessInformation;
import com.uniview.personal.pojo.CreditApplications;
import com.uniview.personal.service.AssociatedBusinessInformationService;
import com.uniview.personal.service.CreditApplicationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @Autowired
    private AssociatedBusinessInformationService associatedBusinessInformationService;
    /**
     * 条件查询申请列表
     */
    @PostMapping("/getApplications")
    public ResponseData<?> getApplications(@RequestBody ParamData<ApplicationQueryDTO> paramData){
        return creditApplicationsService.getApplications(paramData);
    }

    /**
     * 新增业务申请
     */
    @PostMapping("/applyApplications")
    public ResponseData<?> applyApplications(@RequestBody ApplyApplicationDTO applyApplicationDTO){
        return creditApplicationsService.applyApplications(applyApplicationDTO);
    }

    /**
     * 续贷申请
     */
    @PostMapping("/renewal")
    public ResponseData<?> renewal(@RequestBody AssociatedBusinessInformation businessInformation) {
        return associatedBusinessInformationService.renewal(businessInformation);
    }

    /**
     * 关联业务列表查询
     */
    @PostMapping("/getAssociatedBusinessList")
    public ResponseData<?> getAssociatedBusinessList(@RequestBody AssociatedBusinessQueryDTO associatedBusinessQueryDTO) {
        return associatedBusinessInformationService.getAssociatedBusinessList(associatedBusinessQueryDTO);
    }

}
