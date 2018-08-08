package com.hyp.charpter1.service;

/**
 * @Author: yp.huang
 * @Create time: 2018/8/8 15:48
 */

import com.hyp.charpter1.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * 提供客户数据服务
 */
public class CustomerService {

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
