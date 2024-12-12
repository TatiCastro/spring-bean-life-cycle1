package acc.br.bean.life.cycle.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Weapon implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean, BeanFactoryAware {
    private String name;
    private int health;
    private String beanName;
    private ApplicationContext applicationContext;
    private BeanFactory beanFactory;

    public Weapon(String name) {
        this.name = name;
        System.out.println("1. Instantiation: A new weapon has been created.");
    }

    public String getName() {
        return name;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("2. BeanNameAware: Setting bean name: " + name);
        this.beanName = name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("4. ApplicationContextAware: Setting application context for Weapon.");
        this.applicationContext = applicationContext;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println("3. BeanFactoryAware: Setting bean factory for Weapon: " + getName());
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("7. Initialization: Weapon " + getName() + " is undergoing intensive training.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("11. DisposableBean: Weapon " + getName() + " is saying goodbye and resting.");
    }

    public void customInit() {
        System.out.println("8. Custom Initialization: Executing custom init for " + getName());
    }

    public void customDestroy() {
        System.out.println("13. Custom Destruction: Final actions for Weapon: " + getName() + "is bidding farewell and performing a final action.");
    }

    private void restAndRecover() {
        System.out.println("12. DisposableBean: " + getName() + " is resting and recovering energy.");
    }

    @PostConstruct
    public void init() {
        System.out.println("6. @PostConstruct: Weapon " + getName() + " s being initialized.");
    }
    @PreDestroy
    public void preDestroy() {
        System.out.println("10. @PreDestroy: Weapon " + getName() + " is being prepared for destruction.");
    }
}
