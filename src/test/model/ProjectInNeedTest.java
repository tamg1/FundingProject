package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProjectInNeedTest {

    private ProjectInNeed foodBankProject;
    private ProjectInNeed animalRescueProject;

    private Sponsor bikeShopSponsor;
    private Sponsor universitySponsor;

    @BeforeEach
    void runBefore() {
        foodBankProject = new ProjectInNeed("Community Food Bank", 10000);
        animalRescueProject = new ProjectInNeed("Animal Rescue", 100);
        bikeShopSponsor = new Sponsor("Bike Shop");
        universitySponsor = new Sponsor("University");
    }

    @Test
    void testConstructor() {
        assertEquals("Community Food Bank", foodBankProject.getTitle());
        assertEquals(10000, foodBankProject.getTarget());
        assertEquals(0, foodBankProject.getAmountFunded());
        assertNotNull(foodBankProject.getSponsors());
        assertEquals(0, foodBankProject.getSponsors().size());
    }

    @Test
    void testConstructorSecondCase() {
        assertEquals("Animal Rescue", animalRescueProject.getTitle());
        assertEquals(100, animalRescueProject.getTarget());
        assertEquals(0, animalRescueProject.getAmountFunded());
        assertNotNull(animalRescueProject.getSponsors());
        assertEquals(0, animalRescueProject.getSponsors().size());
    }

    @Test
    void testIncreaseTargetBy() {
        foodBankProject.increaseTargetBy(100);
        assertEquals(10100, foodBankProject.getTarget());

        foodBankProject.increaseTargetBy(200);
        assertEquals(10300, foodBankProject.getTarget());
    }

    @Test
    void testIncreaseTargetByOneDollar() {
        foodBankProject.increaseTargetBy(1);
        assertEquals(10001, foodBankProject.getTarget());
    }


    @Test
    void testDecreaseTargetBy() {
        foodBankProject.decreaseTargetBy(100);
        assertEquals(9900, foodBankProject.getTarget());

        foodBankProject.decreaseTargetBy(200);
        assertEquals(9700, foodBankProject.getTarget());
    }

    @Test
    void testDecreaseTargetByOneDollar() {
        foodBankProject.decreaseTargetBy(1);
        assertEquals(9999, foodBankProject.getTarget());
    }

    @Test
    void testDecreaseTargetByPartiallyFundedToTarget() {
        foodBankProject.fund(bikeShopSponsor, 900);

        foodBankProject.decreaseTargetBy(9100);
        assertEquals(900, foodBankProject.getTarget());
    }

    @Test
    void testDecreaseTargetByToZero() {
        foodBankProject.decreaseTargetBy(10000);
        assertEquals(0, foodBankProject.getTarget());
    }

    @Test
    void testFundProject() {
        foodBankProject.fund(bikeShopSponsor, 500);
        assertEquals(500, foodBankProject.getAmountFunded());

        foodBankProject.fund(bikeShopSponsor, 750);
        assertEquals(1250, foodBankProject.getAmountFunded());
    }

    @Test
    void testFundProjectOneDollar() {
        foodBankProject.fund(bikeShopSponsor, 1);
        assertEquals(1, foodBankProject.getAmountFunded());
    }

    @Test
    void testFundProjectToTarget() {
        foodBankProject.fund(bikeShopSponsor, 10000);
        assertEquals(10000, foodBankProject.getAmountFunded());
    }

    @Test
    void testFundProjectSponsorsAdded() {
        foodBankProject.fund(bikeShopSponsor, 1);
        assertEquals(1, foodBankProject.getSponsors().size());
        assertEquals(bikeShopSponsor, foodBankProject.getSponsors().get(0));

        foodBankProject.fund(universitySponsor, 1);
        assertEquals(2, foodBankProject.getSponsors().size());
        assertEquals(universitySponsor, foodBankProject.getSponsors().get(1));
    }

    @Test
    void testFundProjectSponsorsAmountIncremented() {
        foodBankProject.fund(bikeShopSponsor, 1);
        assertEquals(1, bikeShopSponsor.getNumProjectsFunded());

        foodBankProject.fund(bikeShopSponsor, 1);
        assertEquals(2, bikeShopSponsor.getNumProjectsFunded());
    }
}