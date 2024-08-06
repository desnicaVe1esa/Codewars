#include <vector>
#include <utility>

void testequal(std::vector<std::pair <std::string, std::string>> ans, std::vector<std::pair <std::string, std::string>> sol) {
    Assert::That(ans, Equals(sol));
}

Describe(partline_Tests)
{
    It(Fixed_Tests_partlist)
    {
        std::vector<std::string> s = {"cdIw", "tzIy", "xDu", "rThG"};
        std::vector<std::pair <std::string, std::string>> sol = {{"cdIw", "tzIy xDu rThG"}, {"cdIw tzIy", "xDu rThG"}, {"cdIw tzIy xDu", "rThG"}};
        std::vector<std::pair <std::string, std::string>> ans = PartList::partlist(s);
        testequal(ans, sol);

        s = {"I", "wish", "I", "hadn't", "come"};
        sol = {{"I", "wish I hadn't come"}, {"I wish", "I hadn't come"}, {"I wish I", "hadn't come"}, {"I wish I hadn't", "come"}};
        ans = PartList::partlist(s);
        testequal(ans, sol);

        s = {"vJQ", "anj", "mQDq", "sOZ"};
        sol = {{"vJQ", "anj mQDq sOZ"}, {"vJQ anj", "mQDq sOZ"}, {"vJQ anj mQDq", "sOZ"}};
        ans = PartList::partlist(s);
        testequal(ans, sol);
    }
};
