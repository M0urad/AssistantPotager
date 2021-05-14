package test;

import java.util.Scanner;

import javax.persistence.EntityManager;

import dao.*;
import metier.*;
import plante.*;
import plante.Plante;
import util.*;


public class App {

	
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
	
	
	private static void accueil() {
		System.out.println("		~~~~Thousand Sunny Little Garden~~~~");
		System.out.println("---- Bienvenue sur votre Assistant Potager ----");
		System.out.println("Faire un choix :");
		System.out.println("1 - Se connecter");
		System.out.println("2 - Créer un compte");
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
		System.out.println("\n---- Création de compte ----");
		int pres=0;
		String login;
		//do {
			login = saisieString("Veuillez choisir un nom d'utilisateur, il vous servira à vous connecter.");
//			for(Compte test : comptes) {
//				if(login.equals(test.getLogin())) {
//					pres=1;
//					System.out.println("Nom d'utilisateur déjà utilisé, veuillez en choisir un autre.");
//				}
//				else pres=0;
//			}
//		}while(pres==1);

		String password = saisieString("Veuillez saisir un mot de passe.");

		String email = saisieString("Veuillez saisir une adresse mail. On ne vous enverra pas de newsletters dont vous vous fichez promis.");

		String ville = saisieString("Veuillez saisir votre adresse.");

		Compte user= new Compte(login, password, email, ville);
		//comptes.add(user);

		System.out.println("Bienvenue "+ login + ". Votre compte a bien été créé.");

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
	Plante courgette = new Courgettes("Coucou");
	Context.get_instance().getDaoP().add(courgette);
	}

private static void ajoutTomate() {
	Plante tomtom = new Tomates("Tomtom");
	Context.get_instance().getDaoP().add(tomtom);
	}

	private static void menuRecettes() {		
	}

	private static void menuTuto() {
	}

	public static void main(String[] args) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		em.close();
		menuPrincipal();
		Context.get_instance().getEmf().close();
	}
}
