package kz.zhabassov.project.dao;

import kz.zhabassov.project.entity.Entity;

import java.util.List;

public interface Dao {
    void insert(Entity entity);
    void update(Entity entity);
    void delete(Entity entity);
    List<Entity> findAll();
    Entity findById(int id);
    Entity findByEntity(Entity entity);
}
