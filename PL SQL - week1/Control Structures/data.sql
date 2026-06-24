CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER(5,2),
    DueDate DATE,
    CONSTRAINT fk_customer
        FOREIGN KEY (CustomerID)
        REFERENCES Customers(CustomerID)
);


CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Age NUMBER,
    Balance NUMBER(12,2),
    IsVIP VARCHAR2(5)
);

INSERT INTO Loans VALUES
(1001, 101, 9.50, SYSDATE + 15);

INSERT INTO Loans VALUES
(1002, 102, 10.00, SYSDATE + 45);

INSERT INTO Loans VALUES
(1003, 103, 8.75, SYSDATE + 20);

INSERT INTO Loans VALUES
(1004, 104, 11.00, SYSDATE + 10);

INSERT INTO Loans VALUES
(1005, 105, 9.25, SYSDATE + 25);


INSERT INTO Customers VALUES
(101, 'John Smith', 65, 15000, 'FALSE');

INSERT INTO Customers VALUES
(102, 'Mary Johnson', 45, 8000, 'FALSE');

INSERT INTO Customers VALUES
(103, 'Robert Brown', 70, 25000, 'FALSE');

INSERT INTO Customers VALUES
(104, 'Linda Davis', 58, 12000, 'FALSE');

INSERT INTO Customers VALUES
(105, 'James Wilson', 62, 9500, 'FALSE');


COMMIT;
