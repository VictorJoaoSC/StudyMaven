package org.joao.estagio.JPA.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Pessoa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pessoa p = new Pessoa(null,"João",(byte)19);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste-jpa");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        
        
    }
}
