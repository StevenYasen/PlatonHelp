package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.Set;

public interface RoleService {
    Set<Role> getAllRoles();
    Role getRoleByName(String name);
    Set<Role> getSetOfRoles(String[] roleNames);
    void addRole(Role role);
    void editRole(Role role);
    Role getRoleById(long id);
}
