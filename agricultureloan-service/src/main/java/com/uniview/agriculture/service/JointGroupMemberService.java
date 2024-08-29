package com.uniview.agriculture.service;

import com.uniview.agriculture.pojo.JointGroupMember;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author yuki
* @description 针对表【tb_joint_group_member(联保成员表)】的数据库操作Service
* @createDate 2024-08-28 16:17:58
*/
public interface JointGroupMemberService extends IService<JointGroupMember> {
    /**
     * 根据组号查询联保小组成员姓名
     */
    List<String> getJointGroupMemberNameByGroupId(Long groupId);

}
