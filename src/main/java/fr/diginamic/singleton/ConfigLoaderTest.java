package fr.diginamic.singleton;

public class ConfigLoaderTest
{
	public static void main(String[] args)
	{
        ConfigLoader configLoader = ConfigLoader.getInstance();

        String dbUrl = configLoader.getProperty("db.url");
        String dbUser = configLoader.getProperty("db.user");
        String dbPassword = configLoader.getProperty("db.password");

        System.out.println("DB URL: " + dbUrl);
        System.out.println("User: " + dbUser);
        System.out.println("Pass: " + dbPassword);
    }
}
