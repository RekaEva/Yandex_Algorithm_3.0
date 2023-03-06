#include<iostream>
using namespace std;

int main(){
    int a,b,mas[101]={0};
    cin>>a>>b;
    mas[0]=1;
    for(int i=1;i<=a;i++){
    
    for(int j=i-1;j>=0;j--){
        mas[i]+=mas[j];
        if((i-b)==j)break;
    }
    if(i<b) mas[i]++;
    }
    if(a==1)cout<<"1"<<endl ;
    else 
        cout<<mas[a-2]<<endl;
}