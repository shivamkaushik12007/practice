#include<stdio.h>
#include<iostream>
using namespace std;
int strlen(char* str){
	int i=0;
	while(str[i]!='\0'){
		i++;
	}
	return i;
}

void strcpy(char* str1,char* str2){
	int n=strlen(str2);
	for(int i=0;i<n;i++){
		str1[i]=str2[i];
	}
	str1[n]='\0';
}

char *strcat(char *str1, const char *str2)
{
    size_t i,j;
    for (i = 0; str1[i] != '\0'; i++)
        ;
    for (j = 0; str2[j] != '\0'; j++)
        str1[i+j] = str2[j];
    str1[i+j] = '\0';
    return str1;
}
char *strrev(char *str1){
	int n=strlen(str1);
	char ch;
	int i;
	for(i=0;i<n/2;i++){
		ch=str1[i];
		str1[i]=str1[n-i-1];
		str1[n-i-1]=ch;
	}
	str1[n]='\0';
	return str1;
}

int strcmp(char* str1,char* str2){
	int i=0;
	while(str1[i]!='\0'&&str2[i]!='\0'){
		if(str1[i]==str2[i]){
			i++;
			continue;
		}
		return str1[i]-str2[i];
	}
	if(str1[i]!='\0')
		return 1;
	else if(str2[i]!='\0')
		return -1;
	
	return 0;
}

int strchr(char* str,char ch){
	int n=strlen(str);
	for(int i=0;i<n;i++){
		if(str[i]==ch)
			return 1;
	}
	return 0;
}

int strstr(char* str1,char* str2){
	int n1=strlen(str1);	
	int n2=strlen(str2);
	for(int i=0;i<n1-n2;i++){
		int j=0;
		while(str2[j]!='\0'){
			if(str1[i+j]!=str2[j])
				break;
			
			j++;
		}
		if(j==n2)
			return i;
	}
	return -1;
}

int main(){
	char ch[50];
	cin>>ch;
	char ch2[50];
	strcpy(ch2,ch);
//	cout<<strcmp(ch2,ch);
	strrev(ch2);
//	cout<<ch2;
	strcat(ch2,ch);
	cout<<ch2;
//	cout<<strchr(ch2,'k');
	cout<<strstr(ch2,"hk");
}
