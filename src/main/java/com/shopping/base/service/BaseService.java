package com.shopping.base.service;

import com.shopping.base.entity.BaseEntity;
import com.shopping.base.repository.BaseRepo;
import jakarta.persistence.MappedSuperclass;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@MappedSuperclass
public abstract class BaseService<T extends BaseEntity<ID>,ID extends Number> {
    @Autowired
    private  BaseRepo<T,ID> baseRepo;

    public List<T> findAll(){
        return baseRepo.findAll();
    }

    public T findById(ID id){
        return baseRepo.findById(id).orElse(null);
    }

    public T getOne(ID id){
        return baseRepo.getById(id);
    }

    public Optional<T> getByID(ID id){
        return baseRepo.findById(id);
    }

    public T insert(T t){
        return baseRepo.save(t);
    }

    public T persist(T t){
        return baseRepo.saveAndFlush(t);
    }
    public T update(T t){
        return  baseRepo.save(t);
    }
    public void deleteById(ID id){
        baseRepo.deleteById(id);
    }
    public void deleteAll(List<ID> ids){
        ids.forEach(
                baseRepo::deleteById
        );
    }
}
