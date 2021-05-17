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


