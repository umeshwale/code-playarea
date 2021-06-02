# Transaction Management in JDBC 

Process of combining all related operations in single unit and executing on the rule "EITHER ALL OR NONE"
is called as Transaction Management. 

Example 1: Funds Transfer 

    1. Debit funds from Sender account 
    2. Credit funds in receiver account 

    All operations above should be performed as a single unit only. 
    If debit from Sender's account completed and credit into receiver's account fails then there may be chance 
    of data inconsistency problem. 
    
Example 2: Movie Ticket Reservation

    Below operations needs to be performed to complete this transaction 
    
    1. Verify the status
    2. Reserve Tickets
    3. Payment
    4. Issue tickets 

    All operations above should be performed as a single unit only. 
    If some operation success and some operation fail then there is data inconsisterncy problem. 


Pransaction Properties - ACID 

    A - Atomocity
    C - Consistency
    I - Isolation
    D - Durability
    
Types of Transaction 

    1. Local Transaction 
          If all the transactions are performed on the same database then it is called as local transactions
    2. Global Transaction 
          If it is performed on multiple databases then it is called as global transactions. 
          

# How to implement transaction in JDBC

Below 3 operations are used to implement transaction management in JDBC 

   1. con.setAutoCommit(false) 
   2. con.commit();
   3. con.rollback();

1. con.setAutoCommit(false) : Disable auto commit mode of JDBC

        By default auto commit mode is enabled i.e. after executing every SQL statement the changes will be commited 
        automatically in the database. 
        We can disable this autocommit mode as follow - 
        
        con.setAutoCommit(false) 
        
2. con.commit() :

        If all the operations are completed then we can commit the transaction by using following method
        
        con.commit();
        
3.con.rollback() :

        If any SQL fails then we will be able to rollback operation which is already completed using rollback method 
        
        con.rollback();
                
Example Code Snippet 

        con.setAutoCommit(false)
        
        try {
                operation 1
                operation 2
                operation 3
                con.commit();
        } catch (SQLException e) 
        {
            con.rollback();
        }
