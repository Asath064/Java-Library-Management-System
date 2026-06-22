CREATE DATABASE librarydb;

USE librarydb;

CREATE TABLE books (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    author VARCHAR(100),
    status VARCHAR(20)
);

INSERT INTO books(title, author, status)
VALUES
('Java Programming', 'James Gosling', 'Available'),
('Data Structures', 'Mark Allen', 'Available');
