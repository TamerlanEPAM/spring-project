package kz.zhabassov.project.dao;

import kz.zhabassov.project.entity.Entity;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PenaltyOfPlayerInGameDao implements Dao, InitializingBean {
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(Entity entity) {

    }

    @Override
    public void update(Entity entity) {

    }

    @Override
    public void delete(Entity entity) {

    }

    @Override
    public List<Entity> findAll() {
        return null;
    }

    @Override
    public Entity findById(int id) {
        return null;
    }

    @Override
    public Entity findByEntity(Entity entity) {
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (jdbcTemplate == null){
            throw new BeanCreationException("Must set jdbcTemplate on PenaltyOfPlayerINGameDao");
        }
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
