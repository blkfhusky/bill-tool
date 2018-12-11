package com.blkfhusky.core.client;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * Description:
 * User: blkfhusky
 * Date: 2018-12-05
 * Time: 4:34 PM
 */
@FeignClient(value = "message-server")
public interface MessageClient {


}
