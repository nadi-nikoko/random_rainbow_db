package com.randonrainbow.springboot.demo.DAO;


import com.randonrainbow.springboot.demo.entity.Video;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


/*
Spring @Repository annotation is used to indicate that
the class provides the mechanism
for storage, retrieval, search, update and delete
operation on objects.
*/
@Repository
 class VideoDAOImp implements VideoDAO {

    // @Autowired is used for automatic dependency injection
    // in this specific case its necessary because EntityManager is not a bean
    @Autowired
    //the EntityManager is the primary interface for managing entities in JPA
    private EntityManager entityManager;

    @Override
    public List<Video> findAll() {
        //TypedQuery is a query to execute a query against the database
        TypedQuery<Video> theQuery = entityManager.createQuery("FROM Video", Video.class);
        List<Video> videos = theQuery.getResultList();
        return videos;
    }

    @Override
    public Video findById(int id) {
        /*
        The EntityManager interface in JPA provides methods to manage entities,
        including persisting, merging, removing, and querying entities.
        It acts as a bridge between your application and the database,
        managing the lifecycle of entity instances.
        */
        Video video = entityManager.find(Video.class, id);
        return video;
    }

    @Transactional
    @Override
    public Video save(Video video) {
        Video videoDB = entityManager.merge(video);
        return videoDB;
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        Video video = entityManager.find(Video.class, id);
        entityManager.remove(video);
    }
}
