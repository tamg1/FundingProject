package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProjectInNeedTest {
    private ProjectInNeed project;

    @BeforeEach
    void runBefore() {
        project = new ProjectInNeed("Community Food Bank", 10000);
    }

    @Test
    void testConstructor() {
        assertEquals("Community Food Bank", project.getTitle());
        assertEquals(10000, project.getTarget());
        assertEquals(0, project.getAmountFunded());
    }

    @Test
    void testIncreaseTargetBy() {
        project.increaseTargetBy(100);
        assertEquals(10100, project.getTarget());

        project.increaseTargetBy(200);
        assertEquals(10300, project.getTarget());
    }

    @Test
    void testDecreaseTargetBy() {
        project.decreaseTargetBy(100);
        assertEquals(9900, project.getTarget());

        project.decreaseTargetBy(200);
        assertEquals(9700, project.getTarget());
    }

    @Test
    void testFundProject() {
        project.fund(500);
        assertEquals(500, project.getAmountFunded());

        project.fund(750);
        assertEquals(1250, project.getAmountFunded());
    }
}