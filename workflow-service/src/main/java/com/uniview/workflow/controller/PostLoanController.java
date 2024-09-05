package com.uniview.workflow.controller;

import com.uniview.common.utils.ResponseData;
import com.uniview.workflow.dto.CreditApplicationsDTO;
import com.uniview.workflow.dto.PostLoanDto;
import com.uniview.workflow.service.PostLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post-loan")
public class PostLoanController {
    @Autowired
    private PostLoanService postLoanService;
    @PostMapping("/startApproval")
    public ResponseData<?> startApproval(@RequestBody PostLoanDto postLoanDto) {
        return postLoanService.startPostLoan(postLoanDto);
    }

    @GetMapping("/clientManager")
    public ResponseData<?> clientManager() {
        return postLoanService.clientManager();
    }

    @GetMapping("/clientManagerPostLoan/{taskId}/{flag}")
    public ResponseData<?> clientManagerPostLoan(@PathVariable("taskId") String taskId, @PathVariable("flag") Integer flag) {
        return postLoanService.clientManagerPostLoan(taskId, flag);
    }

    @GetMapping("/networkManager")
    public ResponseData<?> networkManager() {
        return postLoanService.networkManager();
    }

    @GetMapping("/networkManagerPostLoan/{taskId}/{flag}")
    public ResponseData<?> networkManagerPostLoan(@PathVariable("taskId") String taskId, @PathVariable("flag") Integer flag) {
        return postLoanService.networkManagerPostLoan(taskId, flag);
    }

    @GetMapping("/department")
    public ResponseData<?> department() {
        return postLoanService.department();
    }
    @GetMapping("/departmentApproval/{taskId}/{flag}")
    public ResponseData<?> departmentPostLoan(@PathVariable("taskId") String taskId, @PathVariable("flag") Integer flag) {
        return postLoanService.departmentPostLoan(taskId, flag);
    }




}
