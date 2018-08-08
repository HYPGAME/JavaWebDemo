package com.hyp.charpter1.service;

/**
 * @Author: yp.huang
 * @Create time: 2018/8/8 15:48
 */

import com.hyp.charpter1.model.Customer;
import com.hyp.charpter1.util.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 提供客户数据服务
 */
public class CustomerService {

    private static final String DRIVER;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWORD;

    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);


    static {
        Properties conf = PropsUtil.loadProps("config.properties");
        DRIVER = conf.getProperty("jdbc.driver");
        URL = conf.getProperty("jdbc.url");
        USERNAME = conf.getProperty("jdbc.username");
        PASSWORD = conf.getProperty("jdbc.password");

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            LOGGER.error("can not load jdbc driver", e);
        }
    }


    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList (String keyword){
        //todo
        return null;
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id) {
        //todo
        return null;
    }

    /**
     * 创建客户
     */
    public boolean createCustomer (Map<String, Object> fieldMap) {
        //todo
        return false;
    }

    /**
     * 更新客户
     */
    public boolean updateCutomer(long id, Map<String, Object> fieldMap) {
        //todo
        return false;
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomer(long id){
        //todo
        return false;
    }
}
