package com.uniview.personal.feign;

import com.uniview.common.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author：lixin
 * @Package：com.uniview.personal.feign
 * @Project：gznx_credit
 * @name：UserFeign
 * @Date：2024/9/2 12:07
 * @Filename：UserFeign
 * @Description：
 */
@FeignClient(name = "user-server", url = "http://localhost:8082")
public interface UserFeign {
    @GetMapping("getUserById")
    public UserDto getUserById(Long id);
}
