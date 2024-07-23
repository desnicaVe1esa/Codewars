std::pair<std::size_t, std::size_t> two_sum(const std::vector<int>& numbers, int target) {
    for(auto i = 0; i < numbers.size(); i++)
      for(auto j = i+1; j < numbers.size(); j++)
        if(numbers[i] + numbers[j] == target) return {i, j};
}