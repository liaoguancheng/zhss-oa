package com.zhss.oa.flow.service;

import com.zhss.oa.flow.mapper.ApplicationMapper;
import com.zhss.oa.flow.model.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private ApplicationMapper applicationMapper;
    public void createApplication(Application application) {
        applicationMapper.createApplication(application);
    }

    public void delete(Long id) {
        applicationMapper.delete(id);
    }

    public Application findById(Long id) {
       return applicationMapper.findById(id);
    }
}
