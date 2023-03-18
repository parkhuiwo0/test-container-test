package com.github.parkhuiwo0.testcontainer.domain;

import javax.persistence.EntityNotFoundException;
import java.util.Collection;

public interface UserSelector<T extends User> {

    T get(long id) throws EntityNotFoundException;

    Collection<? extends T> getAll();
}
