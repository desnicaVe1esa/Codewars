std::vector<std::string> solution(const std::string &s) {
    std::vector <std::string> res;
    for (int i = 0; i < s.length(); i += 2) res.push_back(s.substr(i, 2));
    if (s.length() % 2) res[res.size() - 1] += "_";
    return res;
}