DECLARE
    CURSOR cust_cursor IS
        SELECT c.CustomerID, l.LoanID, l.InterestRate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
        WHERE c.Age > 60;
BEGIN
    FOR rec IN cust_cursor LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE LoanID = rec.LoanID;

        DBMS_OUTPUT.PUT_LINE(
            'Discount applied to Loan ID: ' || rec.LoanID ||
            ' New Interest Rate: ' || (rec.InterestRate - 1) || '%'
        );
    END LOOP;

    COMMIT;
END;
/
