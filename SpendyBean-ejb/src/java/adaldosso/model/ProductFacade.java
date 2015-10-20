package adaldosso.model;

import adaldosso.entities.Product;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alberto Dal Dosso
 */
@Stateless
public class ProductFacade extends AbstractFacade<Product> {
    @PersistenceContext(unitName = "SpendyBean-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductFacade() {
        super(Product.class);
    }

}
