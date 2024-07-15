std::string to_alternating_case(const std::string& str)
{
    std::string result;
    result.reserve(str.size()); // Предварительное выделение памяти под строку `result` того же размера, что и str
    std::transform(str.begin(), str.end(), std::back_inserter(result),
        [](unsigned char c) { return std::tolower(c) == c ? std::toupper(c) : std::tolower(c); });
    return result;
}