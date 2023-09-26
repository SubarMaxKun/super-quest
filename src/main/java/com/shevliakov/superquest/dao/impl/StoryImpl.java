/* (C)2023 */
package com.shevliakov.superquest.dao.impl;

import com.shevliakov.superquest.dao.Dao;
import com.shevliakov.superquest.entity.Story;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class StoryImpl implements Dao<Story> {

    @Override
    public List<Story> getAll() {
        EntityManager entityManager;
        EntityManagerFactory sessionFactory =
                Persistence.createEntityManagerFactory("com.shevliakov.superquest");
        entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Story> stories =
                entityManager.createQuery("SELECT s FROM Story s", Story.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return stories;
    }

    @Override
    public Story getById(int id) {
        EntityManager entityManager;
        EntityManagerFactory sessionFactory =
                Persistence.createEntityManagerFactory("com.shevliakov.superquest");
        entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Story story = entityManager.find(Story.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return story;
    }
}
