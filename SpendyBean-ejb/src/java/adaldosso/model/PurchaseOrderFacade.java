package adaldosso.model;

import adaldosso.entities.PurchaseOrder;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alberto Dal Dosso
 */
@Stateless
public class PurchaseOrderFacade extends AbstractFacade<PurchaseOrder> {
    @PersistenceContext(unitName = "SpendyBean-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PurchaseOrderFacade() {
        super(PurchaseOrder.class);
    }

}
