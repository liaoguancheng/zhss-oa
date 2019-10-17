package com.zhss.oa.auth.service;

import com.zhss.oa.auth.model.Authorization;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:application-auth.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AuthorizationServiceTest {

    @Autowired
    AuthorizationService authorizationService;
    @Test()
    public void testAuthorize(){
        Authorization authorization = new Authorization();
        authorization.setEmployeeId(10L);
        authorization.setRoleId(1L);
        authorizationService.authorizize(authorization);
        Long id = authorization.getId();
        Assert.assertEquals(true,(long)id>0);
    }

    @Test
    public void testFindById(){
        Authorization authorization = new Authorization();
        authorization.setEmployeeId(10L);
        authorization.setRoleId(1L);
        authorizationService.authorizize(authorization);
        Long id = authorization.getId();
        Assert.assertEquals(true,(long)id>0);
        authorization = authorizationService.findById(authorization.getId());
        Assert.assertEquals(true,authorization != null);
    }

    @Test
    public void testUnauthorize(){

        Authorization authorization = new Authorization();
        authorization.setEmployeeId(10L);
        authorization.setRoleId(1L);
        authorizationService.authorizize(authorization);
        Long id = authorization.getId();
        Assert.assertEquals(true,(long)id>0);
        authorizationService.unauthorize(authorization.getId());
        Authorization au = authorizationService.findById(authorization.getId());
        Assert.assertEquals(true,au == null);
    }
}
