import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.pluralsight.repository.CustomerHibernate;
import com.pluralsight.repository.CustomerHibernateImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by ritesh on 3/1/17.
 */
@Configuration
@ComponentScan({"com.pluralsight"})
@PropertySource("app.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }


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
