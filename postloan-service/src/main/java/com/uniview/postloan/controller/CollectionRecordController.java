package com.uniview.postloan.controller;
import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.CollectionRecord;
import com.uniview.postloan.service.CollectionRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 催收记录Controller
 */
@RestController
@RequestMapping("/collection-record")
public class CollectionRecordController {

    @Autowired
    private CollectionRecordService collectionRecordService;
    //查询催收记录列表
    @PostMapping("/getCollectionRecordList")
    public ResponseData<?> getCollectionRecordList(@RequestBody CollectionRecord collectionRecord) {
        return collectionRecordService.getCollectionRecordList(collectionRecord);
    }

}
