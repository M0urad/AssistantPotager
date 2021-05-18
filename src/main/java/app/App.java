package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import dao.*;
import metier.*;
import plante.*;
import plante.Plante;
import util.*;




public class App {
	
	public static List<Plante> plantes=new ArrayList();
	public static List<Compte> comptes=new ArrayList();
	public static List<MaPlante> mesPlantes=new ArrayList();
	public static Compte compte=new Compte();

	
	public static String saisieString(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextLine();
	}

	public static int saisieInt(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextInt();
	}

	public static double saisieDouble(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextDouble();
	}
	
	private static void init() {
		plantes=Context.get_instance().getDaoP().findAll();
		comptes=Context.get_instance().getDaoC().findAll();
		mesPlantes=Context.get_instance().getDaoMP().findAll();
	
	}
	
	
	private static void accueil() {
		System.out.println("		~~~~Thousand Sunny Little Garden~~~~");
		System.out.println("---- Bienvenue sur votre Assistant Potager ----");
		System.out.println("Faire un choix :");
		System.out.println("1 - Se connecter");
		System.out.println("2 - Cr�er un compte");
		System.out.println("3 - Exit");

		int choix= saisieInt("");
		switch(choix) {
		case 1 : seConnecter();break;
		case 2 : creerCompte();break;
		case 3 : System.exit(0);break;
		default : accueil();break;
		}
	}

	private static void creerCompte() {
		System.out.println("\n---- Cr�ation de compte ----");
		int pres=0;
		String login;
		//do {
			login = saisieString("Veuillez choisir un nom d'utilisateur, il vous servira � vous connecter.");
//			for(Compte test : comptes) {
//				if(login.equals(test.getLogin())) {
//					pres=1;
//					System.out.println("Nom d'utilisateur d�j� utilis�, veuillez en choisir un autre.");
//				}
//				else pres=0;
//			}
//		}while(pres==1);

		String password = saisieString("Veuillez saisir un mot de passe.");

		String email = saisieString("Veuillez saisir une adresse mail. On ne vous enverra pas de newsletters dont vous vous fichez promis.");

		String ville = saisieString("Veuillez saisir votre adresse.");

		//Compte user= new Compte(login, password, email, ville);
		//comptes.add(user);

		System.out.println("Bienvenue "+ login + ". Votre compte a bien �t� cr��.");

		menuPrincipal();		
	}

	private static void seConnecter() {
		Compte c=null;
		String login = saisieString("Saisir votre login");
		String password = saisieString("Saisir votre password");

//		for(Compte test : comptes) {
//			if(login.equals(test.getLogin()) && password.equals(test.getPassword())) {
//				c=test;
//			}
//		}

		if(c instanceof Compte)
		{
			menuPrincipal();
		}
		
		else 
		{
			System.out.println("Identifiants invalides \n");
			accueil();
		}
	}		
	
	private static void menuPrincipal() {
		System.out.println("		~~~~Thousand Sunny Little Garden~~~~");
		System.out.println("---- Bienvenue sur votre Assistant Potager ----");
		System.out.println("Faire un choix :");
		System.out.println("1 - Meteo");
		System.out.println("2 - Mon Potager");
		System.out.println("3 - Mes recettes");
		System.out.println("4 - News et Tutoriels");
		System.out.println("5 - Exit");



		int choix= saisieInt("");
		switch(choix) {
		case 1 : menuMeteo();break;
		case 2 : menuPotager();break;
		case 3 : menuRecettes();break;
		case 4 : menuTuto();break;
		case 5 : accueil();break;
		default : menuPrincipal();break;
		}
	}

	private static void menuMeteo() {
		// TODO Auto-generated method stub
		
	}

	private static void menuPotager() {
		System.out.println("---- Bienvenue sur votre Assistant Potager ----");
		System.out.println("Faire un choix :");
		System.out.println("1 - Ajouter des plantes");
		System.out.println("2 - ???");
		System.out.println("3 - ???");
		System.out.println("4 - ???");
		System.out.println("5 - Retour");



		int choix= saisieInt("");
		switch(choix) {
		case 1 : ajoutPlante();break;
		//case 2 : ???();break;
		//case 3 : ???();break;
		case 5 : menuPrincipal();break;
		default : menuPotager();break;
		}		
	}

	private static void ajoutPlante() {
		ajoutTomate();
		ajoutCourgette();
	}

private static void ajoutCourgette() {
	//Plante courgette = new Courgettes("Coucou");
	//Context.get_instance().getDaoP().add(courgette);
	}

private static void ajoutTomate() {
	//Plante tomtom = new Tomates("Tomtom");
	//Plante tomtom2 = new Tomates("Tomtom", "description", );

	//Context.get_instance().getDaoP().add(tomtom);
	}

	private static void menuRecettes() {		
	}

	private static void menuTuto() {
	}

	public static void main(String[] args) {

	
		init();
		System.out.println(plantes);
		System.out.println(comptes);
		System.out.println(mesPlantes);
		menus.pageSeConnecter.seConnecter(comptes);
		//menus.pageHomeGarden.genererPageHomeGarden(compte);
		
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		em.close();
//		Plante tomtomy=new Tomate();
//		tomtomy=Context.get_instance().getDaoP().findById(1);
////		Context.get_instance().getDaoP().delete(tomtomy);
//		Context.get_instance().getDaoP().add(tomtomy);
//		Plante kakarott = new Carotte();
//		Context.get_instance().getDaoP().delete(kakarott);
//		Context.get_instance().getDaoP().add(kakarott);
		
//		
//		Tomate tomtomy=new Tomate();
//		Context.get_instance().getDaoP().add(tomtomy);
//		Plante kakarott = new Carotte();
//		Context.get_instance().getDaoP().add(kakarott);
//
//		Compte compte1 = new Compte("user23", "user23", "Paris", "750019","FR","LOL@GMAIL.com");
//		Context.get_instance().getDaoC().add(compte1);
//
//		MaPlante toto = new MaPlante("Toto",LocalDate.parse("2021-05-17"),tomtomy,compte1);
//		Context.get_instance().getDaoMP().add(toto);
//		MaPlante koko = new MaPlante("Kakarott",LocalDate.parse("2021-05-17"),kakarott,compte1);
//		Context.get_instance().getDaoMP().add(koko);

		//menuPrincipal();
	}
}
