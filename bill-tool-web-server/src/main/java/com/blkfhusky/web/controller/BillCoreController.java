package com.blkfhusky.web.controller;

import com.blkfhusky.web.client.BillCoreClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 账单controller
 * User: blkfhusky
 * Date: 2018-12-04
 * Time: 4:52 PM
 */
@RestController
@RequestMapping("/bill-tool/core")
public class BillCoreController {

    @Autowired
    private BillCoreClient billCoreClient;

    @PostMapping(value = "/cal")
    public String calculate() {
        billCoreClient.calculate("test1");
        return "finish";
    }
}
