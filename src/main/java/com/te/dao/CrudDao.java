package com.te.dao;

import java.util.HashMap;

public interface CrudDao<T> extends BaseDao {

   

    /**
     * 获取单条数据
     *
     * @param id
     * @return
     */
    public T get(Integer id);

    /**
     * 获取单条数据
     *
     * @param entity
     * @return
     */
    public T get(T entity);

    /**
     * 获取单条数据
     *
     * @param search
     * @return
     */
    public T findOne(HashMap<String, Object> search);

    /**
     * 插入数据
     *
     * @param entity
     * @return
     */
    public int insert(T entity);

    /**
     * 更新数据
     *
     * @param entity
     * @return
     */
    public int update(T entity);

    /**
     * 删除数据（一般为逻辑删除，更新status字段为0）
     *
     * @param id
     * @return
     * @see public int delete(T entity)
     */
    @Deprecated
    public int delete(Integer id);

    /**
     * 计算总数
     * @param search
     * @return
     */
    Integer countAll(HashMap<String, Object> search);

    Integer countAll(T entity);

}
