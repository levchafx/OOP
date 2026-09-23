DROP TABLE IF EXISTS Phonebook;

CREATE TABLE Phonebook (
    IdPhoneBook INT PRIMARY KEY,
    LastName VARCHAR(50),
    Phone BIGINT
);

INSERT INTO Phonebook (IdPhoneBook, LastName, Phone) VALUES (1, 'Ivanov', 375291234567);
INSERT INTO Phonebook (IdPhoneBook, LastName, Phone) VALUES (2, 'Petrov', 375291234568);
INSERT INTO Phonebook (IdPhoneBook, LastName, Phone) VALUES (3, 'Sidorov', 375291234569);
INSERT INTO Phonebook (IdPhoneBook, LastName, Phone) VALUES (4, 'Kuznetsov', 375291234570);
INSERT INTO Phonebook (IdPhoneBook, LastName, Phone) VALUES (5, 'Smirnov', 375291234571);
