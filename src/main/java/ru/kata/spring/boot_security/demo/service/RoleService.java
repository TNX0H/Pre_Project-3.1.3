package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    List<Role> getAllRoles();

    Role addRole(String userRole);

    Role findById(long id);
    Set<Role> findByIdRoles(List<Long> roles);
}
