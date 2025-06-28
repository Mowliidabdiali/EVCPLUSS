import java.util.Scanner;

public class evc {
    public static void main(String[] args) {

        // Fureyaasha lagula shaqaynayo xogta isticmaaleha
        Scanner input = new Scanner(System.in);

        // Koodhka laga bilaabo adeegga EVCPLUS
        String pinCODE = "*770#";

        // Lacagta haraaga ah ee akoonka ku jirta
        int haraaga = 100;

        // Isticmaaleha oo gelinaya koodhka USSD
        String pincode_Entering = input.next();

        // Haddii uu sax yahay koodhka USSD
        if (pinCODE.equals(pincode_Entering)) {
            System.out.println("-EVCPLUS-");
            System.out.println("Fadlan Gali PIN-kaaga (Enter PIN)");
        } else {
            // Haddii uu qalad yahay
            System.out.println("ERROR");
        }

        // PIN-ka saxda ah ee loo aqoonsanyahay
        int pinentering1 = 1234;

        // Isticmaaleha oo gelinaya PIN-kiisa
        int pinentering2 = input.nextInt();

        // Haddii PIN-ku sax yahay
        if (pinentering1 == pinentering2) {
            // Liiska adeegyada la heli karo
            System.out.println("-EVCPLUS-");
            System.out.println("1. Itus Haraagaaga");
            System.out.println("2. Kaarka Hadalka");
            System.out.println("3. Uwareeji EVCPLUS");
            System.out.println("4. Warbixin Kooban");
            System.out.println("5. Salaam Bank");
            System.out.println("6. Bixi Biil");
            System.out.println("7. Iibso Xirmo Data");
            System.out.println("8. Samee Payment");
            System.out.println("9. Ka Noqo");

            // Isticmaaleha oo dooranaya adeeg
            int choosingPhase2 = input.nextInt();

            // Doorashada 1aad: Tus haraaga
            if (choosingPhase2 == 1) {
                System.out.println("Haraagaaga waa $" + haraaga);
            }

            // Doorashada 2aad: Adeegyada kaarka hadalka
            else if (choosingPhase2 == 2) {
                System.out.println("-Kaarka Hadalka-");
                System.out.println("1. Ku Shubo Airtime");
                System.out.println("2. Ugu Shub Airtime");
                System.out.println("3. Ku Shubo Internet");
                System.out.println("4. Ka Noqo");
                int kaarkaHadalka = input.nextInt();

                // Ku shubo Airtime
                if (kaarkaHadalka == 1) {
                    System.out.println("Fadlan gali lacagta aad rabto inaad ku shubato:");
                    int GaliLacgta = input.nextInt();

                    if (GaliLacgta > haraaga) {
                        System.out.println("Haraagaaga kugu ma filna!");
                    } else {
                        System.out.println("Ma hubtaa inaad $" + GaliLacgta + " ku shubatid?");
                        System.out.println("1. Haa");
                        System.out.println("2. Maya");
                        int GoaanHAAmaya = input.nextInt();

                        if (GoaanHAAmaya == 1) {
                            System.out.println("Waad ku guulaysatay! Waxaad ku shubatay $" + GaliLacgta);
                        } else if (GoaanHAAmaya == 2) {
                            System.out.println("Hawsha waa laga noqday. Mahadsanid.");
                        } else {
                            System.out.println("Doorasho khaldan ayaad samaysay.");
                        }
                    }
                }

                // Ugu shub Airtime qof kale
                else if (kaarkaHadalka == 2) {
                    System.out.println("Fadlan gali lacagta aad ugu shubayso:");
                    int lacag = input.nextInt();
                    System.out.println("Gali lambarka qofka:");
                    int lambar = input.nextInt();

                    System.out.println("Ma hubtaa inaad $" + lacag + " ugu shubayso " + lambar + "?");
                    System.out.println("1. Haa");
                    System.out.println("2. Maya");
                    int goaan = input.nextInt();

                    if (goaan == 1) {
                        System.out.println("Waad u shubtay $" + lacag + " qofka lambarkiisu yahay " + lambar);
                    } else {
                        System.out.println("Hawsha waa laga noqday.");
                    }
                }

                // Ku shubo internet xirmo
                else if (kaarkaHadalka == 3) {
                    System.out.println("Dooro nooca xirmada:");
                    System.out.println("1. Maalinle");
                    System.out.println("2. Isbuucle");
                    System.out.println("3. Bille");
                    System.out.println("4. Ka Noqo");

                    int xirmo = input.nextInt();
                    System.out.println("Gali lacagta:");
                    int lacag = input.nextInt();

                    if (xirmo == 1) {
                        System.out.println("Waxaad ku shubatay xirmo maalinle ah $" + lacag);
                    } else if (xirmo == 2) {
                        System.out.println("Waxaad ku shubatay xirmo isbuucle ah $" + lacag);
                    } else if (xirmo == 3) {
                        System.out.println("Waxaad ku shubatay xirmo bille ah $" + lacag);
                    } else if (xirmo == 4) {
                        System.out.println("Hawsha waa laga noqday.");
                    } else {
                        System.out.println("Doorasho khaldan");
                    }
                }

                // Ka noqoshada adeegga
                else if (kaarkaHadalka == 4) {
                    System.out.println("Waa laga noqday adeegga. Mahadsanid.");
                } else {
                    System.out.println("Doorasho khaldan (1 ilaa 4).");
                }
            }

            // U wareeji EVCPLUS lacag
            else if (choosingPhase2 == 3) {
                System.out.println("Gali lambarka aad u wareejinayso:");
                int number = input.nextInt();
                System.out.println("Gali lacagta aad dirayso:");
                int amount = input.nextInt();
                System.out.println("Ma hubtaa inaad u wareejinayso $" + amount + " lambarka " + number + "?");
                System.out.println("1. Haa");
                System.out.println("2. Maya");
                int confirm = input.nextInt();

                if (confirm == 1) {
                    System.out.println("Waxaad u wareejisay $" + amount + " lambarka " + number);
                    System.out.println("Haraagaaga cusub waa $" + (haraaga - amount));
                } else {
                    System.out.println("Hawsha waa laga noqday.");
                }
            }

            // Warbixin kooban
            else if (choosingPhase2 == 4) {
                System.out.println("1. Falka ugu dambeeyay");
                System.out.println("2. Wareejintii ugu dambaysay");
                System.out.println("3. 3-da fal ee ugu dambaysay");
                int warbixin = input.nextInt();

                if (warbixin == 1) {
                    System.out.println("Gali lambarka:");
                    int lambar = input.nextInt();
                    System.out.println("Gali lacagta:");
                    int lacag = input.nextInt();
                    System.out.println("Waxaad u wareejisay $" + lacag + " lambarka " + lambar);
                }
            }

            // Salaam Bank
            else if (choosingPhase2 == 5) {
                System.out.println("-Salaam Bank-");
                System.out.println("1. Itus haraagaaga");
                System.out.println("2. Lacag dhigasho");
                System.out.println("3. Lacag qaadasho");
                System.out.println("4. Ka bax");
                int dookh = input.nextInt();
                // Waxaa la kordhin karaa hadhow adeegyada Salaam Bank
            }

            // Bixi biil
            else if (choosingPhase2 == 6) {
                input.nextLine(); // Buffer-ka nadiifi
                System.out.println("Magaca shirkadda:");
                String shirkad = input.nextLine();
                System.out.println("Lacagta:");
                int lacag = input.nextInt();
                System.out.println("Waxaad $"+lacag+" ugu dirtay shirkadda "+shirkad+".");
            }

            // Iibso Data Plan
            else if (choosingPhase2 == 7) {
                System.out.println("1. 1GB Maalinle - $1");
                System.out.println("2. 5GB Todobaadle - $4");
                System.out.println("3. 10GB Bille - $10");
                System.out.print("Dooro: ");
                int xulasho = input.nextInt();

                switch (xulasho) {
                    case 1:
                        System.out.println("1GB Maalinle ayaad iibsatay.");
                        break;
                    case 2:
                        System.out.println("5GB Todobaadle ayaad iibsatay.");
                        break;
                    case 3:
                        System.out.println("10GB Bille ayaad iibsatay.");
                        break;
                    default:
                        System.out.println("Doorasho khaldan.");
                }
            }

            // Samee Payment
            else if (choosingPhase2 == 8) {
                System.out.print("Gali lambarka qofka lacagta: ");
                int lambar = input.nextInt();
                System.out.print("Gali lacagta: ");
                int lacag = input.nextInt();
                System.out.println("Waxaad $"+lacag+" u dirtay lambarka "+lambar+".");
            }

            // Ka bax
            else if (choosingPhase2 == 9) {
                System.out.println("Waad ka baxday. Mahadsanid!");
            }

            // Doorasho khaldan
            else {
                System.out.println("Doorasho aan sax ahayn. Isku day mar kale!");
            }

        } else {
            // PIN khaldan
            System.out.println("PIN-ka aad gelisay waa khaldan. Fadlan isku day mar kale.");
        }

        // Scanner-ka xiro
        input.close();
    }
}
