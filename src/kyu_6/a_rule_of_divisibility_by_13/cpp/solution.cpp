class Thirteen
{
public:
    static long long thirt(long long n);
};

long long Thirteen::thirt(long long n){
  int divs[6] = {1, 10, 9, 12, 3, 4};
  while(n >= 100){
    long long aux = n;
    n = 0;
    for(int i = 0; aux != 0; n += (aux%10)*divs[i%6], aux /= 10, i++);
  }
  return n;
}