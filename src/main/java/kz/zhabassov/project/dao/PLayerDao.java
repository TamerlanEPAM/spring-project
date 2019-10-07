package kz.zhabassov.project.dao;

import kz.zhabassov.project.entity.Entity;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

public class PlayerDao implements Dao, InitializingBean {
    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

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
        String sql = "SELECT name, position, skill_level, team FROM player WHERE player_id = ?";
        return null;
    }

    @Override
    public Entity findByEntity(Entity entity) {
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (jdbcTemplate == null){
            throw new BeanCreationException("Must set jdbcTemplate on PlayerDao");
        }
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }
}
