package com.github.parkhuiwo0.testcontainer.domain.impl;

import com.github.parkhuiwo0.testcontainer.domain.User;
import com.github.parkhuiwo0.testcontainer.domain.UserSelector;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Collection;

@Service
@RequiredArgsConstructor
class UserSelectorImpl implements UserSelector<User> {

    private final UserRepository userRepository;

    @Override
    public User get(long id) throws EntityNotFoundException {
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(String.format("userId = %d not found.", id)));
    }

    @Override
    public Collection<? extends User> getAll() {
        return userRepository.findAll();
    }
}
