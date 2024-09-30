//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bonjour !"); //La politesse avant tout
        System.out.println("Je vais vous poser quelques questions pour en savoir plus sur vous.");
        Scanner myObj = new Scanner(System.in);

        System.out.println("Quelle est votre année de naissance ?");
        int année = myObj.nextInt();
        System.out.println("Vous avez donc " + (2024 - année) + " ans !"); // On cherche l'âge de la personne

      if (année == 2020 || année == 2008 || année == 1996 || année == 1984 || année == 1972) {
            System.out.println("Vous êtes du signe astrologique chinois du Rat. ");
        } else if (année == 2021 || année == 2009 || année == 1997 || année == 1985 || année == 1973) {
            System.out.println("Vous êtes du signe astrologique chinois du Boeuf. ");
        } else if (année == 2022 || année == 2010 || année == 1998 || année == 1986 || année == 1974) {
            System.out.println("Vous êtes du signe astrologique chinois du Tigre. ");
        } else if (année == 2023 || année == 2011 || année == 1999 || année == 1987 || année == 1975) {
            System.out.println("Vous êtes du signe astrologique chinois du Lapin. ");
        } else if (année == 2024 || année == 2012 || année == 2000 || année == 1988 || année == 1976) {
            System.out.println("Vous êtes du signe astrologique chinois du Dragon. ");
        } else if (année == 2013 || année == 2001 || année == 1989 || année == 1977) {
            System.out.println("Vous êtes du signe astrologique chinois du Serpent. ");
        } else if (année == 2014 || année == 2002 || année == 1990 || année == 1978) {
            System.out.println("Vous êtes du signe astrologique chinois du Cheval. ");
        } else if (année == 2015 || année == 2003 || année == 1991 || année == 1979) {
            System.out.println("Vous êtes du signe astrologique chinois de la Chèvre. ");
        } else if (année == 2016 || année == 2004 || année == 1992 || année == 1980) {
            System.out.println("Vous êtes du signe astrologique chinois du Singe. ");
        } else if (année == 2017 || année == 2005 || année == 1993 || année == 1981) {
            System.out.println("Vous êtes du signe astrologique chinois du Coq. ");
        } else if (année == 2018 || année == 2006 || année == 1994 || année == 1982) {
            System.out.println("Vous êtes du signe astrologique chinois du Chien. ");
        } else if (année == 2019 || année == 2007 || année == 1995 || année == 1983) {
            System.out.println("Vous êtes du signe astrologique chinois du Cochon. ");
        } else if (année < 1972) {
            System.out.println("Vous êtes un peu trop âgé pour ce test...");
        } else {
            System.out.println("Vous n'êtes donc pas encore né !");
        }

        System.out.println("Passons maintenant à une nouvelle question, quel est votre mois de naissance ?"); /*Nous avons besoin du jour et du mois de naissance pour déterminer le signe astrologique occidental, nous demanderons le jour de naissance à la prochaine entrée. */
        String mois = myObj.next();
        System.out.println("C'est mon mois préféré !"); //C'est une réponse générique, donc peut-être un mensonge...

        System.out.println("Et pour finir votre jour de naissance?");
        int jour = myObj.nextInt();

        String month = mois.toLowerCase();
        if ("Mars".equals(month) && jour < 21) {
            System.out.println("Vous êtes donc du signe Poissons !");
        } else if ((mois.equals("mars") || mois.equals("Mars")) && jour >= 21) {
            System.out.println("Vous êtes donc du signe Bélier !");
        } else if ((mois.equals("avril") || mois.equals("Avril")) && jour < 20) {
            System.out.println("Vous êtes donc du signe Bélier !");
        } else if ((mois.equals("avril") || mois.equals("Avril")) && jour >= 20) {
            System.out.println("Vous êtes donc du signe Taureau !");
        } else if ((mois.equals("mai") || mois.equals("Mai")) && jour < 21) {
            System.out.println("Vous êtes donc du signe Taureau !");
        } else if ((mois.equals("mai") || mois.equals("Mai")) && jour >= 21) {
            System.out.println("Vous êtes donc du signe Gémeaux");
        } else if ((mois.equals("juin") || mois.equals("Juin")) && jour < 22) {
            System.out.println("Vous êtes donc du signe Gémeaux");
        } else if ((mois.equals("juin") || mois.equals("Juin")) && jour >= 22) {
            System.out.println("Vous êtes donc du signe Cancer");
        } else if ((mois.equals("juillet") || mois.equals("Juillet")) && jour < 23) {
            System.out.println("Vous êtes donc du signe Cancer");
        } else if ((mois.equals("juillet") || mois.equals("Juillet")) && jour >= 23) {
            System.out.println("Vous êtes donc du signe Lion");
        } else if ((mois.equals("août") || mois.equals("Août") || mois.equals("aout") || mois.equals("Aout")) && jour < 23) {
            System.out.println("Vous êtes donc du signe Lion");
        } else if ((mois.equals("août") || mois.equals("Août") || mois.equals("aout") || mois.equals("Aout")) && jour >= 23) {
            System.out.println("Vous êtes donc du signe Vierge");
        } else if ((mois.equals("septembre") || mois.equals("Septembre")) && jour < 23) {
            System.out.println("Vous êtes donc du signe Vierge");
        } else if ((mois.equals("septembre") || mois.equals("Septembre")) && jour >= 23) {
            System.out.println("Vous êtes donc du signe Balance");
        } else if ((mois.equals("octobre") || mois.equals("Octobre")) && jour < 24) {
            System.out.println("Vous êtes donc du signe Balance");
        } else if ((mois.equals("octobre") || mois.equals("Octobre")) && jour >= 24) {
            System.out.println("Vous êtes donc du signe Scorpion");
        } else if ((mois.equals("novembre") || mois.equals("Novembre")) && jour < 23) {
            System.out.println("Vous êtes donc du signe Scorpion");
        } else if ((mois.equals("novembre") || mois.equals("Novembre")) && jour >= 23) {
            System.out.println("Vous êtes donc du signe Sagittaire");
        } else if ((mois.equals("décembre") || mois.equals("Décembre")) && jour < 23) {
            System.out.println("Vous êtes donc du signe Sagittaire");
        } else if ((mois.equals("décembre") || mois.equals("Décembre")) && jour >= 23) {
            System.out.println("Vous êtes donc du signe Capricorne");
        } else if ((mois.equals("janvier") || mois.equals("Janvier")) && jour < 21) {
            System.out.println("Vous êtes donc du signe Capricorne");
        } else if ((mois.equals("janvier") || mois.equals("Janvier")) && jour >= 21) {
            System.out.println("Vous êtes donc du signe Verseau");
        } else if ((mois.equals("février") || mois.equals("Février") || mois.equals("fevrier") || mois.equals("Fevrier")) && jour < 20) {
            System.out.println("Vous êtes donc du signe Verseau");
        } else if ((mois.equals("février") || mois.equals("Février") || mois.equals("fevrier") || mois.equals("Fevrier")) && jour >=20) {
            System.out.println("Vous êtes donc du signe Poisson");
        } else {
            System.out.println("Vous n'êtes pas réglé selon le calendrier géorgien");
    }
        System.out.println("Si je récapitule vous êtes donc né le " + jour+ " " + mois +" "+ année +" c'est bien ça ?");
     }
}
