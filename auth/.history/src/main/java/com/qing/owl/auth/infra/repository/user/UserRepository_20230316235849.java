package com.qing.owl.auth.infra.repository.user;

import org.springframework.data.repository.Repository;

import com.qing.owl.auth.infra.repository.user.persistence.UserDo;

public interface UserRepository extends Repository<UserDo, Long> {
    public void save(){
        
    }
}
