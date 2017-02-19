package com.pluralsight.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.pluralsight.repository.CustomerHibernate;
import org.springframework.stereotype.Service;

/**
 * Created by ritesh on 2/18/17.
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerHibernate customerHibernate;

    public CustomerServiceImpl() {

    }

    //@Autowired
    public CustomerServiceImpl(final CustomerHibernate customerHibernate) {
        this.customerHibernate = customerHibernate;
    }

    //@Autowired
    public void setCustomerHibernate(final CustomerHibernate customerHibernate) {
        this.customerHibernate = customerHibernate;
    }

    public void setCustomerFirstName() {
        customerHibernate.setCustomer("Ritesh");
    }

    public String findCustomer() {
        setCustomerFirstName();
        return customerHibernate.findCustomer();
    }
}
