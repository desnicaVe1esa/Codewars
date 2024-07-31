Describe(sample_test)
{
    It(even_length)
    {
       do_test("abcdef", {"ab", "cd", "ef"});
       do_test("HelloWorld", {"He", "ll", "oW", "or", "ld"});
    }
    It(odd_length)
    {
       do_test("abcde", {"ab", "cd", "e_"});
       do_test("LovePizza", {"Lo", "ve", "Pi", "zz", "a_"});
    }
};