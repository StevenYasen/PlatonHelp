package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.Set;

public interface RoleDao {
    public Set<Role> getAllRoles();
    public Role getRoleByName(String name);
    public Set<Role> getSetOfRoles(String[] roleNames);
    public void addRole(Role role);
    public void editRole(Role role);
    public Role getRoleById(Long id);
}
