package org.apache.dubbo.springboot.demo.provider;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.springboot.demo.TestService;

/**
 * @author 丁成文
 * @date 2022/5/18
 */
@DubboService
public class TestServiceImpl implements TestService {
    @Override
    public void test1(String msg) {

    }
}
