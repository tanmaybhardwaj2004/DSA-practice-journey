#include<iostream>
using namespace std;
int main()
{   int n=4;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<i*2+1;j++)
        {
            cout<<" ";
        }
        for(int k=0;k<i*2+1;k++)
        {
            cout<<"*";
        }
        for(int l=0;l<n-i-1;l++)
        {
            cout<<" ";
        }
        cout<<endl;
    }
}

/*
PYRAMID PATTERN
   *
  ***
 *****
*******

*/
