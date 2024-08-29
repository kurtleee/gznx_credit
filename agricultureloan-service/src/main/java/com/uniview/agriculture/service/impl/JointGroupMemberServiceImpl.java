package com.uniview.agriculture.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.agriculture.pojo.JointGroupMember;
import com.uniview.agriculture.service.JointGroupMemberService;
import com.uniview.agriculture.mapper.JointGroupMemberMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
* @author yuki
* @description 针对表【tb_joint_group_member(联保成员表)】的数据库操作Service实现
* @createDate 2024-08-28 16:17:58
*/
@Service
public class JointGroupMemberServiceImpl extends ServiceImpl<JointGroupMemberMapper, JointGroupMember>
    implements JointGroupMemberService{

    /**
     * 根据组号查询联保小组成员姓名
     */
    @Override
    public List<String> getJointGroupMemberNameByGroupId(Long groupId) {

    return list(new LambdaQueryWrapper<JointGroupMember>().eq(JointGroupMember::getGroupId, groupId))
        .stream().map(JointGroupMember::getCustomerName).collect(Collectors.toList());
    }

}




