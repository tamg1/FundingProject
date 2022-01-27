package ui;

import java.util.List;
import model.ProjectInNeed;
import model.Sponsor;

public class HelpingHandApp {
    public static void main(String[] args) {
        ProjectInNeed foodBankProject = new ProjectInNeed("Community Food Bank", 10000);
        ProjectInNeed animalRescueProject = new ProjectInNeed("Animal Rescue", 100);
        Sponsor bikeShopSponsor = new Sponsor("Bike Shop");
        Sponsor universitySponsor = new Sponsor("University");
        Sponsor coffeeShopSponsor = new Sponsor("Coffee Shop");

        foodBankProject.fund(bikeShopSponsor, 5000);
        foodBankProject.fund(bikeShopSponsor, 3000);

        animalRescueProject.fund(universitySponsor, 50);
        animalRescueProject.fund(coffeeShopSponsor, 30);

        System.out.println("Status of project 'Community Food Bank':");
        printSponsors(foodBankProject.getSponsors());

        System.out.println("Status of project 'Animal Rescue':");
        printSponsors(animalRescueProject.getSponsors());
    }

    private static void printSponsors(List<Sponsor> sponsors) {
        for (Sponsor sponsor : sponsors) {
            System.out.println("=> Sponsor " + sponsor.getName() + " (funded "
                    + sponsor.getNumProjectsFunded() + " projects)");
        }
    }
}
