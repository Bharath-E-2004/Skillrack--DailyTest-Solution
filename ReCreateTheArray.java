void recreateArr(int *arr,int X,int Y){
  int n=Y-X+1;
  for(int i=0;i<n;i++)
      arr[i]=arr[i]+X-1;
  return;
}
