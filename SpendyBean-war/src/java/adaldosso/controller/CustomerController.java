package adaldosso.controller;

import adaldosso.entities.Customer;
import adaldosso.model.CustomerFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author daldosso
 */
@Named(value = "customerController")
@SessionScoped
public class CustomerController implements Serializable {
    
    @EJB
    private CustomerFacade customerFacade;
    
    private Customer customer = new Customer();

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public CustomerController() {
    }
    
    public List<Customer> findAll() {
        return this.customerFacade.findAll();
    }
    
    public String add() {
        this.customerFacade.create(this.customer);
        this.customer = new Customer();
        return "index";
    }

    public String edit(Customer c) {
        this.customer = c;
        return "edit";
    }
    
    public String edit() {
        this.customerFacade.edit(this.customer);
        this.customer = new Customer();
        return "edit";
    }
    
    public void delete(Customer c) {
        this.customerFacade.remove(c);
    }
    
}
