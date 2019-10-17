package com.zhss.oa.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @ClassName:
 * @Description:
 * @Author:Liaogc
 * @CreateDate:
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:/spring-web.xml","classpath*:/application-web.xml"})
public class ControllerTest {


    @Test
    public void testController(){

    }

}
