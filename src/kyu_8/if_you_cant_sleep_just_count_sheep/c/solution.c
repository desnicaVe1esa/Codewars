char* count_sheep(int n)
{
  char* result = (char*)calloc(n, 11*sizeof(char));
  for (int i = 1; i <= n; i++)
  {
    sprintf(result + strlen(result), "%d sheep...", i);
  }
  return result;
}