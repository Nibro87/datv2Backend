package facades;

import entities.DTO.AuctionDTO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.ws.rs.WebApplicationException;
import java.util.List;

public class AuctionFacade {

    private static EntityManagerFactory emf;
    private static AuctionFacade instance;

    public AuctionFacade() {
    }

    public static AuctionFacade getAuctionFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new AuctionFacade();
        }
        return instance;
    }

    public List<AuctionDTO> getAllAuctions() {
        EntityManager em = emf.createEntityManager();
        try{
            TypedQuery<AuctionDTO> query = em.createQuery("SELECT a FROM action a",AuctionDTO.class);
            List<AuctionDTO> auctionDTOList = query.getResultList();
            if(auctionDTOList.isEmpty()){
                throw new WebApplicationException("the database does not contain any auctions!");
            }

            return auctionDTOList;
        }finally {
            em.close();
        }
    }


}
