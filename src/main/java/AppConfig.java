import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.pluralsight.repository.CustomerHibernate;
import com.pluralsight.repository.CustomerHibernateImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

/**
 * Created by ritesh on 3/1/17.
 */
@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

//    @Bean(name = "customerService")
//    public CustomerService getCustomerService() {
//        //final CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerHibernate());
//
//        final CustomerServiceImpl customerService = new CustomerServiceImpl();
//
//        //customerService.setCustomerHibernate(getCustomerHibernate());
//
//        return customerService;
//    }
//
//    @Bean(name = "customerRepository")
//    public CustomerHibernate getCustomerHibernate() {
//        return new CustomerHibernateImpl();
//    }
}
