package com.zhss.oa.auth.service;

import com.zhss.oa.auth.mapper.AuthorizationMapper;
import com.zhss.oa.auth.model.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {

    @Autowired
    private AuthorizationMapper authorizationMapper;


    public void authorizize(Authorization authorization) {
        authorizationMapper.authorize(authorization);
    }

    public void unauthorize(Long id) {
        authorizationMapper.unauthorize(id);
    }

    public Authorization findById(Long id) {
        return authorizationMapper.findById(id);
    }
}
