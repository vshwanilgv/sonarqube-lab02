package com.example;

import org.junit.jupiter.api.Test;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void testUserServiceCreation() {
        UserService service = new UserService();
        assertNotNull(service);
    }

    @Test
    void testFindUserThrowsSQLException() {
        UserService service = new UserService();
        // This will throw SQLException because we don't have a real database
        assertThrows(SQLException.class, () -> service.findUser("testUser"));
    }

    @Test
    void testDeleteUserThrowsSQLException() {
        UserService service = new UserService();
        // This will throw SQLException because we don't have a real database
        assertThrows(SQLException.class, () -> service.deleteUser("testUser"));
    }
}
