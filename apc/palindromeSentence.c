int isPalindrome(char* str) {
    int n=strlen(str);
    int j=0,i,k=0;
    
    char ch[1000000];
    for(i=0;i<n;i++){
        if(str[i]>='a'&&str[i]<='z'||str[i]>='A'&&str[i]<='Z'||str[i]>='0'&&str[i]<='9'){
            char c=str[i];
            if(str[i]>='A'&&str[i]<='Z'){
                c=c+32;
            }
            ch[k++]=c;
        }
    }
    ch[k]='\0';
    // int n1=strlen(ch);
    for(i=0;i<k/2;i++){
        if(ch[i]!=ch[k-1-i]){
            j++;
            break;
        }
    }
    if(j==1)
    return 0;
    
    return 1;
}
