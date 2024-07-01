#include <vector>
#include <algorithm>
#include <numeric>

void testing(long long n, std::vector<long long> sol)
{
    std::vector<long long> ans = Decomp::decompose(n);
    bool success = false;
    if ( ans == sol ) {
        printVector(ans);
        printVector(sol);
        std::cout << "GOOD\n";
        success = true;
    } else {
        if (ans.empty() || (ans.size() >= 1 && ans[0] == n)) {
            printVector(ans);
            printVector(sol);
            std::cout << "Bad answer\n";
            success = false;
        } else {
            bool st = issorted(ans.begin(), ans.end());
            long long tot = std::inner_product( ans.begin(), ans.end(), ans.begin(), 0LL );
            bool t = (tot == n * n);
            if ((st == false) || (t == false)) {
                std::cout << "** Error. Not increasinly sorted or bad sum of squares\n **";
                printVector(ans);
                printVector(sol);
                std:: cout << "Sorted: " << st << " Total: " << tot << " Wanted: " << n*n << std::endl;
                success = false;
            } else {
                std::cout << "GOOD: Increasing and total correct\n";
                success = true;
            }
        }
    }
    Assert::That(success, Equals(true));
}
Describe(decompose_Tests)
{
    It(Fixed_Tests)
    {
        testing(50, {1,3,5,8,49});
        testing(44, {2,3,5,7,43});
        testing(2, {});
    }
};
