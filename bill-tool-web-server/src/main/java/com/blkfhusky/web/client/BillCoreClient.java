package com.blkfhusky.web.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Description:
 * User: blkfhusky
 * Date: 2018-12-05
 * Time: 4:12 PM
 */
@FeignClient(value = "${bill-tool.server.core}")
@RequestMapping(value = "/api/core")
public interface BillCoreClient {

    @PostMapping(value = "/cal")
    Map<String, Object> calculate(@RequestBody String str);
}
