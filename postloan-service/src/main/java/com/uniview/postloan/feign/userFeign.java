package com.uniview.postloan.feign;

import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.CollectionTask;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * userFeign调用user表中的branch_id字段
 */
@FeignClient(value = "user-service" , url = "http://localhost:8086")
public interface userFeign {
    //获取代收任务
    @PostMapping("/getCollectionTask")
    ResponseData<?> getCollectionTask(@RequestBody CollectionTask collectionTask);
}
