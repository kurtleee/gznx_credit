package com.uniview.agriculture.controller;

import com.uniview.agriculture.pojo.JointGroup;
import com.uniview.agriculture.pojo.JointGroupMember;
import com.uniview.agriculture.service.JointGroupMemberService;
import com.uniview.agriculture.service.JointGroupService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Yuki
 * @Date: 2024/8/28 - 下午4:29
 */
@RestController
@Api(tags = "联保小组管理")
public class JointController {

    @Autowired
    private JointGroupService jointGroupService;

    @Autowired
    private JointGroupMemberService jointGroupMemberService;

    /**
     * 查询所有联保小组信息
     *
     */
    @GetMapping("/joint")
    @ApiOperation("查询所有联保小组信息")
    public List<JointGroup> getJointGroups() {
        // 获取所有联保小组信息
        List<JointGroup> jointGroups = jointGroupService.getJointGroups();

        // 遍历每个联保小组，根据联保小组id 查询其成员客户信息
        for (JointGroup jointGroup : jointGroups) {
            // 获取联保小组id
            Long jointGroupId = jointGroup.getGroupId();

            // 根据联保小组id 查询其成员客户姓名
            List<String> members = jointGroupMemberService.getJointGroupMemberNameByGroupId(jointGroupId);

            // 将查询到的成员客户姓名列表转换为一个字符串，例如：组长 + 成员1, 成员2, ...
            String allMembers = jointGroup.getLeaderCustomerName() + ", " + String.join(", ", members);

            // 设置到联保小组对象中（你需要确保JointGroup类中有一个字段来保存这些信息）
            jointGroup.setMemberNames(allMembers);
        }

        return jointGroups;
    }



}
