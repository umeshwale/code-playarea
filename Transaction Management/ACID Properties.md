# ACID Properties of a Transaction 

ACID: 
    A - Atomacity
    C - Consistency
    I - Isolation
    D - Durability
    
A : Atomicity:

    Either ALL or NONE 
    
    Example:
      1. Debit funds from Sender account 
      2. Credit funds in receiver account 

      All operations above should be performed as a single unit only. 
      If debit from Sender's account completed and credit into receiver's account fails then there may be chance 
      of data inconsistency problem
      
C : Consistency:

    Before the transaction START and after the transaction COMPLETE sum of money should be SAME (consistent)
    
     Example:
      Before Transaction Start 
          Debit Account Balance = 200
          Credit Account Balance = 200
        ===================================
                              Total = 400
                              
      1. Make a transaction of 100Rs transfer from Debit Account to Credit Account 

      After Transaction COMPLETE 
            Debit Account Balance = 100
            Credit Account Balance = 300
          ===================================
                                Total = 400

I : Isolation :

    This is the property of converting parallel schedule to serial schedule. 
    
    This property ensures that multiple transactions can occur concurrently without leading to the inconsistency of database state. 
    Transactions occur independently without interference. 
    Changes occurring in a particular transaction will not be visible to any other transaction until that particular change in that 
    transaction is written to memory or has been committed. 
    This property ensures that the execution of transactions concurrently will result in a state that is equivalent to a state achieved 
    these were executed serially in some order. 
    
    Example 
    Lets say we have X = 500 & Y = 500 
    Consider two transactions T1 and T2. 
  
    Transaction T1 will do below operations - 
        1. Read(X)
        2. X := X * 100
        3. Write(X)
        4. Read(Y)
        5. Y := Y-50
        6. Write(Y)
        
    Transaction T2 will do below operations - 
        1. Read(X)
        2. Read(Y)
        3. Z := X+Y
        4. Write(Z)

    Suppose T1 has been executed till Read (Y) and then T2 starts. 
    As a result , interleaving of operations takes place due to which T2 reads correct value of X but incorrect value of Y and sum computed by 
    T2: (X+Y = 50, 000+500=50, 500) 
    is thus not consistent with the sum at end of transaction: 
    T1: (X+Y = 50, 000 + 450 = 50, 450). 
    This results in database inconsistency, due to a loss of 50 units.
    Hence, transactions must take place in isolation and changes should be visible only after they have been made to the main memory. 

    
D : Durability:
  
    This property ensures that once the transaction has completed execution, the updates and modifications to the database are stored in 
    and written to disk and they persist even if a system failure occurs. 
    These updates now become permanent and are stored in non-volatile memory. 
    The effects of the transaction, thus, are never lost. 
    
    
    
    
