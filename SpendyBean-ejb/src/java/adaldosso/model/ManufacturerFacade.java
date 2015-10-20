package adaldosso.model;

import adaldosso.entities.Manufacturer;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alberto Dal Dosso
 */
@Stateless
public class ManufacturerFacade extends AbstractFacade<Manufacturer> {
    @PersistenceContext(unitName = "SpendyBean-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ManufacturerFacade() {
        super(Manufacturer.class);
    }

}
