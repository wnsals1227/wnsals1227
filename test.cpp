#include<iostream>

using namespace std;

int main()
{
	char address[100];
	cin.getline(address , 100 , '\n');
	cout << address << endl;





	char c[] = { 'H' , 'e' , 'l' , 'l' , 'o' ,'\0' };
	char c2[] = "Hello";
	const char* c3 = "Hello World";

	cout << sizeof(c2) << endl;
	cout << c << endl;
	cout << c3 << endl;

	printf("%s\n",c);

	for (size_t i = 0; i < sizeof(c2); i++)
	{
		cout << c[i];
	}
	cout << endl;
}