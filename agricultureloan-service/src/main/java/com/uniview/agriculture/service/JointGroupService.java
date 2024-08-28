package com.uniview.agriculture.service;

import com.uniview.agriculture.pojo.JointGroup;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author yuki
* @description 针对表【tb_joint_group(联保小组表)】的数据库操作Service
* @createDate 2024-08-28 16:17:58
*/
public interface JointGroupService extends IService<JointGroup> {
    /**
     * 根据联保小组编号查询联保小组信息
     * @param jointId
     */
    JointGroup getJointGroupByJointId(String jointId);

}
