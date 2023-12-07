INSERT INTO roles (id, name) VALUES (1, 'ROLE_USER'),(2,'ROLE_ADMIN');

INSERT INTO users (name, mail, password, username, last_name, age) VALUES ('adminus','admin@mail.ru', '$2a$12$aZ0EneSIaS/io4XWvLFoS.16Kkv2DvvIEfw/Onu34CTsh.NvEPjb.', 'admin', 'adminov', 30),('userus','user@mail.ru', '$2a$12$hHfnZqiovJqXjZ6DOE8qQOnjyiZJOnW6YHB/eO96SQRoJltSTQ1MS', 'user', 'userov', 12);

INSERT INTO users_role (user_id, role_id) VALUES (1, 2),(1, 1), (2, 1);