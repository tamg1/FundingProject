package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class SponsorTest {
    private Sponsor testSponsor;

    @BeforeEach
    void runBefore() {
        testSponsor = new Sponsor("Mary Mae");
    }

    @Test
    void testConstructor() {
        assertEquals("Mary Mae", testSponsor.getName());
        assertEquals(0, testSponsor.getNumProjectsFunded());
    }

    @Test
    void testFundProject() {
        testSponsor.fundProject();
        assertEquals(1, testSponsor.getNumProjectsFunded());
        testSponsor.fundProject();
        assertEquals(2, testSponsor.getNumProjectsFunded());
    }
}
