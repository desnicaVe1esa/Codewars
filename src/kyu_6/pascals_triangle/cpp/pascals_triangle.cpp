std::vector<long long> pascalsTriangle(int n) {
    std::vector<long long> res;
    for (int l = 0; l < n; ++l) {
        for (long num = 1, j = 0; j <= l; num = num * (l - j) / (j + 1), ++j) {
            res.push_back(num);
        }
    }
    return res;
}