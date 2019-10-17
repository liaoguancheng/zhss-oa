package com.zhss.oa.flow.service;

import com.zhss.oa.flow.model.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:application-flow.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationServiceTest {

    @Autowired
    ApplicationService  applicationService;
    
    @Test()
    public void testCreate(){
        Application  application = new Application();
        application.setEmployeeId(10L);
        application.setDays(3);
        applicationService.createApplication(application);
        Long id = application.getId();
        Assert.assertEquals(true,(long)id>0);
    }


    @Test
    public void testFindById(){
        Application  application = new Application();
        application.setEmployeeId(10L);
        application.setDays(3);
        applicationService.createApplication(application);
        Long id = application.getId();
        Assert.assertEquals(true,(long)id>0);
        application = applicationService.findById(application.getId());
        Assert.assertEquals(true,application != null);
    }


}
