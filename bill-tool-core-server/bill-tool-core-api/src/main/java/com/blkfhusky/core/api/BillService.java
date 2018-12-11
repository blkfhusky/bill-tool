package com.blkfhusky.core.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Description:
 * User: blkfhusky
 * Date: 2018-12-05
 * Time: 4:25 PM
 */
@RestController
@RequestMapping(value = "/api/core")
public interface BillService {

    @PostMapping(value = "/cal")
    Map<String, Object> calculate(@RequestBody String str);
}
