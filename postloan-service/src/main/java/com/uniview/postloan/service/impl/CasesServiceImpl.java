package com.uniview.postloan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.postloan.pojo.Cases;
import com.uniview.postloan.service.CasesService;
import com.uniview.postloan.mapper.CasesMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【cases(案件信息表)】的数据库操作Service实现
* @createDate 2024-09-03 11:10:01
*/
@Service
public class CasesServiceImpl extends ServiceImpl<CasesMapper, Cases>
    implements CasesService{

}




