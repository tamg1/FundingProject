package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class SponsorTest {
    private Sponsor testSponsor1;
    private Sponsor testSponsor2;

    @BeforeEach
    void runBefore() {
        testSponsor1 = new Sponsor("Mary Mae");
        testSponsor2 = new Sponsor("Hiroshi Masuda");
    }

    @Test
    void testConstructor() {
        assertEquals("Mary Mae", testSponsor1.getName());
        assertEquals(0, testSponsor1.getNumProjectsFunded());
    }

    @Test
    void testConstructorSecondCase() {
        assertEquals("Hiroshi Masuda", testSponsor2.getName());
        assertEquals(0, testSponsor2.getNumProjectsFunded());
    }

    @Test
    void testFundProject() {
        assertEquals(0, testSponsor1.getNumProjectsFunded());
        testSponsor1.fundProject();
        assertEquals(1, testSponsor1.getNumProjectsFunded());
        testSponsor1.fundProject();
        assertEquals(2, testSponsor1.getNumProjectsFunded());
    }
}
