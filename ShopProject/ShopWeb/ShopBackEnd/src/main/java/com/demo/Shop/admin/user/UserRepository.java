package com.demo.Shop.admin.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Shop.common.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

}
