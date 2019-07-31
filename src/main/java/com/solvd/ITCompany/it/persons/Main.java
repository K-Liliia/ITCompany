package com.solvd.ITCompany.it.persons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.solvd.ITCompany.it.employees.Administrator;
import com.solvd.ITCompany.it.employees.BusinessAnalitic;
import com.solvd.ITCompany.it.employees.Developer;
import com.solvd.ITCompany.it.employees.Manager;
import com.solvd.ITCompany.it.employees.QA;
import com.solvd.ITCompany.it.employees.SystemEngineer;

public class Main {
	private static final Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		Client client1 = new Client("Jimmy", "Durante", 29, "male", true);
		Client client2 = new Client("Daniel", "Daly", 43, "male", false);
		Client client3 = new Client("Andrew Dice", "Clay", 55, "male", true);
		Client client4 = new Client("Colin", "Chapman", 51, "male", false);
		Client client5 = new Client("Alexis", "Carrel", 33, "female", false);
		Client client6 = new Client("Amiel", "Ivo", 30, "male", false);
		Client client7 = new Client("Araya", "Piers", 45, "female", true);

		ArrayList<Client> clients = new ArrayList<Client>();
		{
			clients.add(client1);
			clients.add(client2);
			clients.add(client3);
			clients.add(client4);
			clients.add(client5);
			clients.add(client6);
			clients.add(client7);
		}
		Map<Client, String> projects = new HashMap<Client, String>();
		projects.put(client1, "Scan and Perform");
		projects.put(client2, "Hera");
		projects.put(client3, "Yes-Profit");
		projects.put(client4, "Aragosaurus");
		projects.put(client5, "Opal-Ninja");
		projects.put(client6, "Nyx");
		projects.put(client7, "Eos");

		for (String value : projects.values()) {
			logger.info("Value: " + value);
		}
		Administrator administrator1 = new Administrator("Jeniffer", "Underhill", 35, "female", 8, 1200, "");
		Administrator administrator2 = new Administrator("Andy", "Goldsworthy", 28, "male", 4, 850, "");
		Administrator administrator3 = new Administrator("Eva", "Rainerr", 30, "female", 5, 900, "");
		Administrator administrator4 = new Administrator("Emma", "Vinder", 27, "female", 3, 700, "");
		Administrator administrator5 = new Administrator("Anna", "Carnegie", 26, "female", 2, 500, "pregnant");
		Administrator administrator6 = new Administrator("Jean", "Ingelow", 23, "female", 1, 300, "");
		Administrator administrator7 = new Administrator("Carlos", "Gardel", 32, "male", 6, 1000, "");

		ArrayList<Administrator> administrators = new ArrayList<Administrator>();
		{
			administrators.add(administrator1);
			administrators.add(administrator2);
			administrators.add(administrator3);
			administrators.add(administrator4);
			administrators.add(administrator5);
			administrators.add(administrator6);
			administrators.add(administrator7);
		}

		BusinessAnalitic businessAnalitic1 = new BusinessAnalitic("Fred", "Gallagher", 47, "male", 20, 2500);
		BusinessAnalitic businessAnalitic2 = new BusinessAnalitic("Helen", "Garner", 35, "female", 12, 1500);
		BusinessAnalitic businessAnalitic3 = new BusinessAnalitic("Indira", "Gandhi", 28, "female", 5, 1000);

		ArrayList<BusinessAnalitic> businessAnalitics = new ArrayList<BusinessAnalitic>();
		{
			businessAnalitics.add(businessAnalitic1);
			businessAnalitics.add(businessAnalitic2);
			businessAnalitics.add(businessAnalitic3);

		}
		SystemEngineer systemEngineer1 = new SystemEngineer("Dave", "Eggers", 25, "male", 3, 800);
		SystemEngineer systemEngineer2 = new SystemEngineer("Elliot", "Cass", 30, "male", 5, 1200);
		SystemEngineer systemEngineer3 = new SystemEngineer("William", "Clay", 34, "male", 7, 1500);
		SystemEngineer systemEngineer4 = new SystemEngineer("Colin", "Fey", 23, "male", 2, 500);
		SystemEngineer systemEngineer5 = new SystemEngineer("Tommy", "Franks", 32, "male", 4, 1100);
		SystemEngineer systemEngineer6 = new SystemEngineer("Milton", "Friedman", 28, "male", 3, 800);

		ArrayList<SystemEngineer> systemEngineers = new ArrayList<SystemEngineer>();
		{
			systemEngineers.add(systemEngineer1);
			systemEngineers.add(systemEngineer2);
			systemEngineers.add(systemEngineer3);
			systemEngineers.add(systemEngineer4);
			systemEngineers.add(systemEngineer5);
			systemEngineers.add(systemEngineer6);
		}
		QA qualityEngineer1 = new QA("Ivan", "Kartvelli", 23, "male", 0, 300);
		QA qualityEngineer2 = new QA("Valeriy", "Andro", 24, "male", 1, 900);
		QA qualityEngineer3 = new QA("David", "Valeev", 25, "male", 1, 900);
		QA qualityEngineer4 = new QA("Sergey", "Arto", 26, "male", 1, 900);
		QA qualityEngineer5 = new QA("Kurt", "Klovitss", 27, "male", 2, 1500);
		QA qualityEngineer6 = new QA("Nick", "Van", 28, "male", 3, 2500);
		QA qualityEngineer7 = new QA("Alex", "Milkosh", 29, "male", 2, 1500);
		QA qualityEngineer8 = new QA("Leila", "Dankevitch", 30, "female", 3, 2500);
		QA qualityEngineer9 = new QA("Patrisia", "Curass", 23, "female", 0, 300);
		QA qualityEngineer10 = new QA("Emilio", "Treko", 24, "male", 1, 900);

		ArrayList<QA> qualityEngineers = new ArrayList<QA>();
		{
			qualityEngineers.add(qualityEngineer1);
			qualityEngineers.add(qualityEngineer2);
			qualityEngineers.add(qualityEngineer3);
			qualityEngineers.add(qualityEngineer4);
			qualityEngineers.add(qualityEngineer5);
			qualityEngineers.add(qualityEngineer6);
			qualityEngineers.add(qualityEngineer7);
			qualityEngineers.add(qualityEngineer8);
			qualityEngineers.add(qualityEngineer9);
			qualityEngineers.add(qualityEngineer10);
		}

		Manager manager1 = new Manager("Sam", "Harris", 28, "male", 4, 1500, "Administrative");
		Manager manager2 = new Manager("Max", "Heindel", 28, "male", 4, 1500, "Communication");
		Manager manager3 = new Manager("Andy", "Goldsworthy", 29, "male", 5, 2500, "Development");
		Manager manager4 = new Manager("Tina", "Fey", 45, "female", 20, 1500, "Financing");
		Manager manager5 = new Manager("Elliot", "Cass", 42, "male", 15, 1500, "Legal");
		Manager manager6 = new Manager("Jimmy", "Durante", 31, "male", 5, 2500, "PortfolioSupport");
		Manager manager7 = new Manager("Robert", "Banks", 28, "male", 4, 2000, "Development");
		Manager manager8 = new Manager("Sandra", "Carey", 30, "female", 6, 3000, "Development");
		Manager manager9 = new Manager("Eric", "Cantona", 32, "male", 7, 3500, "Development");

		ArrayList<Manager> managers = new ArrayList<Manager>();
		{
			managers.add(manager1);
			managers.add(manager2);
			managers.add(manager3);
			managers.add(manager4);
			managers.add(manager5);
			managers.add(manager6);
			managers.add(manager7);
			managers.add(manager8);
			managers.add(manager9);
		}
		Developer developer1 = new Developer("Oleksandr", "Golovin", 30, "male", 4, 2500);
		Developer developer2 = new Developer("Oleksandra", "Dankovitch", 34, "female", 9, 4000);
		Developer developer3 = new Developer("Volodymyr", "Bakhtin", 39, "male", 12, 7000);
		Developer developer4 = new Developer("Serhii", "Dobryi", 40, "male", 10, 5500);
		Developer developer5 = new Developer("Anastasiia", "Brutch", 20, "female", 2, 1500);
		Developer developer6 = new Developer("Yaroslav", "Olekshyn", 44, "male", 15, 9000);
		Developer developer7 = new Developer("Vladyslav", "Herts", 19, "male", 1, 1000);
		Developer developer8 = new Developer("Dariia", "Kharuta", 36, "female", 9, 5000);
		Developer developer9 = new Developer("Vadym", "Litkovych", 25, "male", 3, 2000);
		Developer developer10 = new Developer("Vitalii", "Bronich", 46, "male", 11, 6000);
		Developer developer11 = new Developer("Arkadiy", "Milkosh", 22, "male", 1, 1000);
		Developer developer12 = new Developer("Vasiliy", "Pure", 23, "male", 1, 1000);
		Developer developer13 = new Developer("Katarina", "Klovitss", 24, "female", 1, 1000);
		Developer developer14 = new Developer("Mick", "Jevr", 24, "male", 2, 1500);
		Developer developer15 = new Developer("Duke", "Valeev", 25, "male", 2, 1500);
		Developer developer16 = new Developer("Oleksandr", "Berinskiy", 26, "male", 2, 1500);
		Developer developer17 = new Developer("Oliver", "Huston", 28, "male", 4, 2500);
		Developer developer18 = new Developer("Esmiralda", "Treko", 32, "female", 6, 3500);
		Developer developer19 = new Developer("Jeniffer", "Underhill", 25, "female", 1, 1000);
		Developer developer20 = new Developer("Hertruda", "Velvetto", 30, "female", 5, 3000);
		Developer developer21 = new Developer("Pauline", "Kael", 28, "female", 3, 2000);
		Developer developer22 = new Developer("Garry", "Kasparov", 27, "male", 3, 2000);
		Developer developer23 = new Developer("Alan", "Kay", 26, "male", 2, 1500);

		ArrayList<Developer> developers = new ArrayList<Developer>();
		{
			developers.add(developer1);
			developers.add(developer2);
			developers.add(developer3);
			developers.add(developer4);
			developers.add(developer5);
			developers.add(developer6);
			developers.add(developer7);
			developers.add(developer8);
			developers.add(developer9);
			developers.add(developer10);
			developers.add(developer11);
			developers.add(developer12);
			developers.add(developer13);
			developers.add(developer14);
			developers.add(developer15);
			developers.add(developer16);
			developers.add(developer17);
			developers.add(developer18);
			developers.add(developer19);
			developers.add(developer20);
			developers.add(developer21);
			developers.add(developer22);
			developers.add(developer23);

		}

	}
}
