DECLARE
    CURSOR c_discount IS
        SELECT l.LoanID
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
        WHERE TRUNC(MONTHS_BETWEEN(SYSDATE, c.DOB) / 12) > 60;

BEGIN
    FOR rec IN c_discount LOOP
        UPDATE Loans
        SET InterestRate = InterestRate * 0.99
        WHERE LoanID = rec.LoanID;
    END LOOP;

    COMMIT;
END;
/
