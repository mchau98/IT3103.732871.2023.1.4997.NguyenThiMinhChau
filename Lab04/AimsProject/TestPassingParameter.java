package Lab04.AimsProject;

import Lab_03.AimsProject.DigitalVideoDisc;

public class TestPassingParameter {
    static class DVDWrapper {
        Lab_03.AimsProject.DigitalVideoDisc disc;

        DVDWrapper(Lab_03.AimsProject.DigitalVideoDisc disc) {
            this.disc = disc;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Lab_03.AimsProject.DigitalVideoDisc jungleDVD = new Lab_03.AimsProject.DigitalVideoDisc("Jungle");
        Lab_03.AimsProject.DigitalVideoDisc cinderellaDVD = new Lab_03.AimsProject.DigitalVideoDisc("Cinderella");
        DVDWrapper jungleDVDWrapper = new DVDWrapper(jungleDVD);
        DVDWrapper cinderellaDVDWrapper = new DVDWrapper(cinderellaDVD);

        swap(jungleDVDWrapper, cinderellaDVDWrapper);
        System.out.println("jungle dvd title: " + jungleDVDWrapper.disc.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVDWrapper.disc.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }
    public static void swap(DVDWrapper dvd1, DVDWrapper dvd2){
        Lab_03.AimsProject.DigitalVideoDisc tmp = dvd1.disc;
        dvd1.disc = dvd2.disc;
        dvd2.disc = tmp;
    }

    public static void changeTitle(Lab_03.AimsProject.DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}