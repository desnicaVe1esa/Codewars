#include <criterion/criterion.h>
#include <inttypes.h>

extern uint64_t hamber(int n);

static void assert_data(int n, uint64_t expected)
{
    uint64_t actual = hamber(n);
    if (actual != expected)
        cr_assert_fail("*Actual*: %"PRIu64"\nExpected: %"PRIu64"\nN: %i", actual, expected, n);
    else
        cr_assert(1);
}

Test(Sample_Test, should_return_a_hamber)
{
    assert_data(5, 5);
    assert_data(8, 9);
    assert_data(11, 15);
    assert_data(14, 20);
    assert_data(17, 27);
    assert_data(20, 36);
    assert_data(23, 48);
    assert_data(26, 60);
    assert_data(29, 75);
    assert_data(32, 90);
    assert_data(35, 108);
    assert_data(38, 128);
    assert_data(41, 150);
    assert_data(44, 180);
    assert_data(47, 216);
    assert_data(50, 243);
    assert_data(53, 270);
    assert_data(56, 320);
    assert_data(59, 375);
    assert_data(62, 405);
}