package com.thinkconstructive.dbdemo.repository;

import com.thinkconstructive.dbdemo.entity.storeInformation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StoreInformationRepository extends CrudRepository<storeInformation, Integer > {

    List<storeInformation> findBybookName(String name);
    List<storeInformation> findBybookDetail(String detail);
}

