package com.hyp.charpter1.service;

/**
 * @Author: yp.huang
 * @Create time: 2018/8/8 15:48
 */

import com.hyp.charpter1.helper.DatabaseHelper;
import com.hyp.charpter1.model.Customer;
import com.hyp.charpter1.util.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 提供客户数据服务
 */
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList (){
        Connection connection = DatabaseHelper.getConnection();
        try {
            String sql = "SELECT * FROM customer";
            return DatabaseHelper.queryEnttyList(Customer.class, sql, connection);
        } finally {
            DatabaseHelper.closeConnection(connection);
        }
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
