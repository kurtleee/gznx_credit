package com.uniview.postloan.service;

import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.CollectionRecord;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Administrator
* @description 针对表【collection_record(催收记录)】的数据库操作Service
* @createDate 2024-08-31 16:08:05
*/
public interface CollectionRecordService extends IService<CollectionRecord> {

    ResponseData<?> getCollectionRecordList();

    /**
     * 新增催收记录
     * @param collectionRecord
     * @return
     */
    ResponseData<?> addCollectionRecord(CollectionRecord collectionRecord);
}
