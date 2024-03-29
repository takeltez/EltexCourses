package eltex.tasks;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Collection <User> users = new ArrayList <User> ();

        users.add(new User());
        users.add(new User());

        User user1 = ((ArrayList <User>) users).get(0);
        User user2 = ((ArrayList <User>) users).get(1);

        Passport passport1 = new Passport();
        Passport passport2 = new Passport();
        Address address = new Address();

        Collection <Lang> langs = new ArrayList <Lang> ();

        langs.add(new Lang ());
        langs.add(new Lang ());

        Lang lang1 = ((ArrayList <Lang>) langs).get(0);
        Lang lang2 = ((ArrayList <Lang>) langs).get(1);

        user1.setFio("Kozhuhovskiy Gennady");
        user2.setFio("Ramus Eugene");

        passport1.setSeries("45 07");
        passport1.setNumber("691152");
        passport2.setSeries("37 05");
        passport2.setNumber("033791");

        address.setCity("Novosibirsk");
        address.setStreet("Kluch-Kamishenskoe plato");
        address.setBuilding("14");

        lang1.setTitle("Java");
        lang2.setTitle("C++");

        passport1.setUser(user1);
        passport2.setUser(user2);
        user1.setPassport(passport1);
        user2.setPassport(passport2);

        user1.setAddress(address);
        user2.setAddress(address);
        address.setTenants(users);


        user1.setLang(langs);
        user2.setLang(langs);
        lang1.setUsers(users);
        lang2.setUsers(users);

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
            throw e;
        }

        Session session =sessionFactory.openSession();
        session.beginTransaction();
        session.save(passport1);
        session.save(passport2);
        session.save(user1);
        session.save(user2);
        session.save(address);
        session.save(lang1);
        session.save(lang2);
        session.getTransaction().commit();
        session.close();
    }
}
