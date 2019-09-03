int lengthOfLastWord(const char* str) {
    int j=0,i;
    int count=0;
    int n=strlen(str);
    for(i=n-1;i>=0;i--){
        if(str[i]!=' ')
            j++;
            
        if(j!=0){
        
        if(str[i]==' '){
            break;
        }
        count++;
        }
    }
    return count;
}
