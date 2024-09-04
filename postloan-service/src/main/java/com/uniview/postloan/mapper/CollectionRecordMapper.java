package com.uniview.postloan.mapper;

import com.uniview.postloan.pojo.CollectionRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.cloud.client.loadbalancer.RequestData;

import java.util.List;

/**
* @author Administrator
* @description 针对表【collection_record(催收记录)】的数据库操作Mapper
* @createDate 2024-08-31 16:08:05
* @Entity com.uniview.postloan.pojo.CollectionRecord
*/
/**
 * 催收记录数据访问对象接口，定义与催收记录相关的数据库操作。
 */
public interface CollectionRecordMapper extends BaseMapper<CollectionRecord> {
    //插入催收记录
    void insertCollectionRecord(CollectionRecord record);
    //根据任务id查询催收记录
    List<CollectionRecord> findCollectionRecordsByTaskId(int taskId);

}




