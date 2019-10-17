package com.zhss.oa.flow.service;

import com.zhss.oa.flow.model.Application;

public interface ApplicationService {

    public void createApplication(Application application);
    public void delete(Long id);
    public Application findById(Long id);

}
