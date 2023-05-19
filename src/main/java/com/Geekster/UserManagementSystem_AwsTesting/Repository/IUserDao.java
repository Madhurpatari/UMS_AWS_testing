package com.Geekster.UserManagementSystem_AwsTesting.Repository;

import com.Geekster.UserManagementSystem_AwsTesting.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDao extends JpaRepository<User, Long> {
}
