package adaldosso.model;

import adaldosso.entities.MicroMarket;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alberto Dal Dosso
 */
@Stateless
public class MicroMarketFacade extends AbstractFacade<MicroMarket> {
    @PersistenceContext(unitName = "SpendyBean-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MicroMarketFacade() {
        super(MicroMarket.class);
    }

}
