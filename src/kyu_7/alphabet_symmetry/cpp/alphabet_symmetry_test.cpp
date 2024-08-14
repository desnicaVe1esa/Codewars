#include <vector>

Describe(SampleTests)
{
    It(should_pass_sample_tests)
    {
        using v = std::vector<int>;
        Assert::That(solve({ "abode", "ABc", "xyzD" }), Equals(v{ 4, 3, 1 }), ExtraMessage(R"(Invalid result for [ "abode", "ABc", "xyzD" ])"));
        Assert::That(solve({ "abide", "ABc", "xyz" }), Equals(v{ 4, 3, 0 }), ExtraMessage(R"(Invalid result for [ "abide", "ABc", "xyz" ])"));
        Assert::That(solve({ "IAMDEFANDJKL", "thedefgh", "xyzDEFghijabc" }), Equals(v{ 6, 5, 7 }), ExtraMessage(R"(Invalid result for [ "IAMDEFANDJKL", "thedefgh", "xyzDEFghijabc" ])"));
        Assert::That(solve({ "encode", "abc", "xyzD", "ABmD" }), Equals(v{ 1, 3, 1, 3 }), ExtraMessage(R"(Invalid result for [ "encode", "abc", "xyzD", "ABmD" ])"));
        Assert::That(solve({}), Equals(v{}), ExtraMessage(R"(Invalid result for [ ])"));
    }
};