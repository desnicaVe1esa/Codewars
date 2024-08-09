#include <sstream>
#include <string>

using namespace std;

class SequenceSum{
  int count;
  public:
  SequenceSum (int);
  string showSequence();
};

SequenceSum::SequenceSum (int c) {
  count = c;
}

string SequenceSum::showSequence(){
    if (count < 0) return to_string(count) + "<0";
    if (!count) return "0=0";
    stringstream ss; ss << 0;
    for (int i = 1; i <= count; ++i)
      ss << '+' << i;
    ss << " = " << count * (count+1) / 2;
    return ss.str();
}