#include<iostream>
#include<algorithm>
#include<iterator>
#include<array>
using namespace std;

int main()
{
	array<int, 5> arr = { 9 , 5 , 1, 3, 7 };
	sort(arr.begin(), arr.end());
	
	int a[] = { 9 , 5 , 1, 3, 7 };
	sort(begin(a), end(a));
																													
	for (int i : a)																						
	{																														
		cout << i << "\t";																							
	}																							
	cout << endl;					


	for (int i : arr)
	{
		cout << i << "\t";
	}
	cout << endl;
}