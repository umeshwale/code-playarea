#GIT

    Git is a distributed revision control and source code management system 
    with an emphasis on speed. 
    
    **Advantages of Git**
        - Free and open source
        - Fast and small
        - Implicit backup
        - Security
        - No need of powerful hardware
        - Easier branching
    
    **Basic workflow of Git**
        Step 1 − You modify a file from the working directory.
        Step 2 − You add these files to the staging area.
        Step 3 − You perform commit operation that moves the files from the staging area.
                 After push operation, it stores the changes permanently to the Git repository.
        
        Suppose you modified two files, namely “sort.c” and “search.c” and you want two different commits for each operation. 
        You can add one file in the staging area and do commit. After the first commit, repeat the same procedure for another file.
        
            # First commit
            [bash]$ git add sort.c
            
            # adds file to the staging area
            [bash]$ git commit –m “Added sort operation”
            
            # Second commit
            [bash]$ git add search.c
            
            # adds file to the staging area
            [bash]$ git commit –m “Added search operation”
        
        