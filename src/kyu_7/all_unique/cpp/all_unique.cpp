#include <string>
#include <hash_set>

bool hasUniqueChars(std::string s)
{
    __gnu_cxx::hash_set <char> prepared;
    for (int i = 0; i < s.length(); i++)
    {
        prepared.insert(s[i]);
    }
    return prepared.size() == s.length();
}