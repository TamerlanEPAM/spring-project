package kz.zhabassov.project.dao;

import kz.zhabassov.project.entity.Entity;

public interface Dao {
    void insert(Entity entity);
    void update(Entity entity);
    void delete(Entity entity);
}
