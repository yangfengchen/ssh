package com.yzb.ssh.service.impl;

import com.yzb.ssh.dao.TIphoneDao;
import com.yzb.ssh.service.TIphoneService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/4/23.
 */
@Service
public class TIphoneServiceImpl implements TIphoneService{

    @Resource
    private TIphoneDao tIphoneDao;
}
