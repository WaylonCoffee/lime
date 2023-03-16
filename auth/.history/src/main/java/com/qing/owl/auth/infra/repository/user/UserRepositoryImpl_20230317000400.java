package com.qing.owl.auth.infra.repository.user;

import com.qing.owl.auth.domain.user.entity.User;
import com.qing.owl.auth.domain.user.repository.UserRepository;
import com.qing.owl.auth.infra.repository.user.assembler.UserAssembler;
import com.qing.owl.auth.infra.repository.user.persistence.UserDo;

public class UserRepositoryImpl implements UserRepository {
    public void save(User user) {
        UserDo userDo = UserAssembler.INSTANCE.userToUserDo(user);
    }
}
