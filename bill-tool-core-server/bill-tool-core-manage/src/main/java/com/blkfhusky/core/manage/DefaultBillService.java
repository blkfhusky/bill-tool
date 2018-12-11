package com.blkfhusky.core.manage;

import com.blkfhusky.core.api.BillService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Description:
 * User: blkfhusky
 * Date: 2018-12-05
 * Time: 4:26 PM
 */
@Service(value = "defaultBillService")
public class DefaultBillService implements BillService {

    @Override
    public Map<String, Object> calculate(String str) {
        System.out.println("正在计算" + str);
        return null;
    }
}
