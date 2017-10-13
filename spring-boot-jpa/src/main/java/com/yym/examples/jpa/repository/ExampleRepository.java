package com.yym.examples.jpa.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;

/**
 * Created by yaoyimin on 2017/10/13
 * JPA允许自己创建基于Repository的基类接口,可以根据不同的场景来定制自己向暴露的方法
 * allows us create our own base RepositoryBean , thus can exposes the given method ,only need annotated the interface <see> {@link NoRepositoryBean}<see/>
 * <p>
 *     here is an example
 * </p>
 */
@NoRepositoryBean
public interface ExampleRepository<T , ID extends Serializable> extends Repository<T , ID> {

	T findOne(ID id);

	T save(T entity);
}
