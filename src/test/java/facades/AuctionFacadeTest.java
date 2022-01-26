package facades;

import entities.Auction;
import entities.DTO.AuctionDTO;
import org.junit.jupiter.api.*;
import utils.EMF_Creator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AuctionFacadeTest {

    private static EntityManagerFactory emf;
    private static AuctionFacade facade;

    @BeforeAll
    public static void beforeAll(){

        emf = EMF_Creator.createEntityManagerFactoryForTest();
        facade = AuctionFacade.getAuctionFacade(emf);

    }


    @AfterAll
    public static void tearDownClass(){

    }

    @BeforeEach
    public void setUP(){
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();

            em.persist(new Auction("testname","testdate","testtime","testlocation"));
            em.getTransaction().commit();

        }finally {
            em.close();
        }
    }

    @AfterEach
    public void tearDown(){
    }

    @Test
    public void testGetAllAction(){

        List<AuctionDTO> actual = facade.getAllAuctions();
        int expected = 1;

        assertEquals(expected,actual.size());

    }

    @Test
    public void notEmpty(){

        List<AuctionDTO> auctionDTOList = facade.getAllAuctions();

        assertTrue(auctionDTOList.size() > 0);

    }


}
