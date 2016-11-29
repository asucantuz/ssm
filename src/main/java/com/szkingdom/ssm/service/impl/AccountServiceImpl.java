package com.szkingdom.ssm.service.impl;

import com.szkingdom.ssm.dao.IAccountDao;
import com.szkingdom.ssm.entity.Account;
import com.szkingdom.ssm.service.IAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tian on 2016/7/30.
 */


@Service
public class AccountServiceImpl implements IAccountService {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IAccountDao accountDao;

    public Account loginService(Account account) {

        LOG.info("accountDao.login(account)");
        return accountDao.login(account);
    }
}
