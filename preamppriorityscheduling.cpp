#include<iostream>
using namespace std;
int main()
{
    int bt[20], p[20], at[20], pr[20], arr[20], sum = 0, i, j, k, n, pos, temp;
    float wt[20], tat[20], total=0, avg_wt, avg_tat;
   
    cout<<"Enter Total Number of Process:";
    cin>>n;

    cout<<"\nEnter Arrival Time, Burst Time and Priority\n";
        
    for(i=0;i<n;i++)
    {
        cout<<"\nP["<<i+1<<"]\n";
        cout<<"Arrival Time:";
        cin>>at[i];
        cout<<"Burst Time:";
        cin>>bt[i];
        cout<<"Priority:";
        cin>>pr[i];
        p[i]=i+1;
    }
    i=1;
    k=0;
    while(i<n)
    {
        pos=i;
        sum += bt[i-1];
        while(k<n)
        {
            if(sum>=at[k+1])
            {
                arr[k] = p[k+1];
                k++;
            }
            else
            {
                break;
            }
        }
        for(j=i+1; j<=k; j++)
        {
            if(pr[j]<pr[pos] && at[j]<sum)
                pos=j;
        }
        temp=pr[i];
        pr[i]=pr[pos];
        pr[pos]=temp;
        
        temp=at[i];
        at[i]=at[pos];
        at[pos]=temp;
        
        temp=bt[i];
        bt[i]=bt[pos];
        bt[pos]=temp;
        
        temp=p[i];
        p[i]=p[pos];
        p[pos]=temp;
        i++;
    }
    wt[0]=0; 
    for(i=1; i<n; i++)
    {
        wt[i]=0;
        for(j=0;j<i;j++)
            wt[i]+=bt[j];
        wt[i] = wt[i] - at[i];    
        total += wt[i];
    }
    avg_wt=total/n;      
    total=0;
    cout<<"\nProcess\t    Burst Time    \tWaiting Time\tTurnaround Time";
    for(i=0; i<n; i++)
    {
        tat[i] = bt[i]+wt[i];
        total += tat[i];
        cout<<"\nP["<<p[i]<<"]\t\t  "<<bt[i]<<"\t\t    "<<wt[i]<<"\t\t\t"<<tat[i];
    }
    avg_tat=total/n;     
    cout<<endl;
        cout<<endl<<"  ";
    for(i=0; i<n; i++)
    {
    cout<<"p["<<p[i]<<"]"<<"   ";
    }
    cout<<endl;
    temp =0;
    cout<<" "<<temp<<"     ";
    for(i=0; i<n; i++)
    {
        temp += bt[i];
        cout<<temp<<"     ";
    }
    cout<<endl;
    cout<<"\n\nAverage Waiting Time="<<avg_wt;
    cout<<"\nAverage Turnaround Time="<<avg_tat;
    return 0;
}
