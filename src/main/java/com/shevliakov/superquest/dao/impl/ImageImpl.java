/* (C)2023 */
package com.shevliakov.superquest.dao.impl;

import com.shevliakov.superquest.dao.Dao;
import com.shevliakov.superquest.entity.Image;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class ImageImpl implements Dao<Image> {

    @Override
    public List<Image> getAll() {
        EntityManager entityManager;
        EntityManagerFactory sessionFactory =
                Persistence.createEntityManagerFactory("com.shevliakov.superquest");
        entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Image> pictures =
                entityManager.createQuery("SELECT p FROM Image p", Image.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return pictures;
    }

    @Override
    public Image getById(int id) {
        EntityManager entityManager;
        EntityManagerFactory sessionFactory =
                Persistence.createEntityManagerFactory("com.shevliakov.superquest");
        entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Image picture = entityManager.find(Image.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return picture;
    }

    public Image getByName(String imageName) {
        EntityManager entityManager;
        EntityManagerFactory sessionFactory =
                Persistence.createEntityManagerFactory("com.shevliakov.superquest");
        entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Image picture =
                entityManager
                        .createQuery(
                                "SELECT p FROM Image p WHERE p.imageName = :imageName", Image.class)
                        .setParameter("imageName", imageName)
                        .getSingleResult();
        entityManager.getTransaction().commit();
        entityManager.close();
        return picture;
    }
}
