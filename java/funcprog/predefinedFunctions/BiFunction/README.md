BiFunction:

    interface BiFunction <T, U, R> 
    {
        public R apply (T t, U u);
        // default method andThen
    }