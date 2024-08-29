package com.uniview.agriculture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.agriculture.pojo.JointGroup;
import com.uniview.agriculture.service.JointGroupService;
import com.uniview.agriculture.mapper.JointGroupMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author yuki
* @description 针对表【tb_joint_group(联保小组表)】的数据库操作Service实现
* @createDate 2024-08-28 16:17:58
*/
@Service
public class JointGroupServiceImpl extends ServiceImpl<JointGroupMapper, JointGroup>
    implements JointGroupService{
    /**
     * 查询所有联保小组信息
     *
     */
    @Override
    public List<JointGroup> getJointGroups() {
        return list();
    }
}




