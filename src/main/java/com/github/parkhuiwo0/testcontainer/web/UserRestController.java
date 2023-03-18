package com.github.parkhuiwo0.testcontainer.web;

import com.github.parkhuiwo0.testcontainer.domain.User;
import com.github.parkhuiwo0.testcontainer.domain.UserSelector;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/users")
class UserRestController {

    private final UserSelector<User> userSelector;

    @GetMapping("/{userId}")
    public User get(@PathVariable("userId") long userId) {
        return userSelector.get(userId);
    }
}
