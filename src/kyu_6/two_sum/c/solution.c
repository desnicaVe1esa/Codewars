void twoSum(unsigned count, const int numbers[count], int target, unsigned *index1, unsigned *index2)
{
  for(*index1=0; *index1<count; ++*index1)
    for(*index2=*index1+1; *index2<count; ++*index2)
      if( numbers[*index1]+numbers[*index2] == target )
         return;
}