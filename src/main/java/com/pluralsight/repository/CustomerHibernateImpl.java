package com.pluralsight.repository;

import com.pluralsight.object.CustomerObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * Created by ritesh on 2/18/17.
 */
@Repository("customerRepository")
public class CustomerHibernateImpl implements CustomerHibernate {

    @Value("${dbUsername}")
    private String dbUsername;

    final CustomerObject customer = new CustomerObject();

    public void setCustomer(final String firstName) {

        customer.setFirstName(firstName);
    }

    public String findCustomer() {

        System.out.println(dbUsername);

       return customer.getFirstName();
    }
}
