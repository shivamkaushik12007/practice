#include <assert.h>
#include <ctype.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* readline();
char* ltrim(char*);
char* rtrim(char*);

int parse_int(char*);


 int upper(int n,int arr[],int t){
     if(t>=arr[n-1])
        return n;
    int l=0;
    int r=n;
    int mid;
    while(l<r){
        mid=(l+r)/2;
        if(arr[mid]<=t){
            l=mid+1;
        }else{
            r=mid;
        }
    }
    int k=l==r?l:mid;
    return k;
 }
 int cmp(const void* a,const void* b){
     return *(int *)a-*(int *)b;
 }
int* counts(int teamA_count, int* teamA, int teamB_count, int* teamB, int* result_count) {
    qsort(teamA,teamA_count,sizeof(int),cmp);
    int* res=(int *)malloc(sizeof(int)*teamB_count);
    for(int i=0;i<teamB_count;i++){
        int up=upper(teamA_count,teamA,teamB[i]);
        res[i]=up;
    }
    *result_count=teamB_count;
    return res;
}

int main()
{
    FILE* fptr = fopen(getenv("OUTPUT_PATH"), "w");

    int teamA_count = parse_int(ltrim(rtrim(readline())));

    int* teamA = malloc(teamA_count * sizeof(int));

    for (int i = 0; i < teamA_count; i++) {
        int teamA_item = parse_int(ltrim(rtrim(readline())));

        *(teamA + i) = teamA_item;
    }

    int teamB_count = parse_int(ltrim(rtrim(readline())));

    int* teamB = malloc(teamB_count * sizeof(int));

    for (int i = 0; i < teamB_count; i++) {
        int teamB_item = parse_int(ltrim(rtrim(readline())));

        *(teamB + i) = teamB_item;
    }

    int result_count;
    int* result = counts(teamA_count, teamA, teamB_count, teamB, &result_count);

    for (int i = 0; i < result_count; i++) {
        fprintf(fptr, "%d", *(result + i));

        if (i != result_count - 1) {
            fprintf(fptr, "\n");
        }
    }

    fprintf(fptr, "\n");

    fclose(fptr);

    return 0;
}

char* readline() {
    size_t alloc_length = 1024;
    size_t data_length = 0;

    char* data = malloc(alloc_length);

    while (true) {
        char* cursor = data + data_length;
        char* line = fgets(cursor, alloc_length - data_length, stdin);

        if (!line) {
            break;
        }

        data_length += strlen(cursor);

        if (data_length < alloc_length - 1 || data[data_length - 1] == '\n') {
            break;
        }

        alloc_length <<= 1;

        data = realloc(data, alloc_length);

        if (!data) {
            data = '\0';

            break;
        }
    }

    if (data[data_length - 1] == '\n') {
        data[data_length - 1] = '\0';

        data = realloc(data, data_length);

        if (!data) {
            data = '\0';
        }
    } else {
        data = realloc(data, data_length + 1);

        if (!data) {
            data = '\0';
        } else {
            data[data_length] = '\0';
        }
    }

    return data;
}

char* ltrim(char* str) {
    if (!str) {
        return '\0';
    }

    if (!*str) {
        return str;
    }

    while (*str != '\0' && isspace(*str)) {
        str++;
    }

    return str;
}

char* rtrim(char* str) {
    if (!str) {
        return '\0';
    }

    if (!*str) {
        return str;
    }

    char* end = str + strlen(str) - 1;

    while (end >= str && isspace(*end)) {
        end--;
    }

    *(end + 1) = '\0';

    return str;
}

int parse_int(char* str) {
    char* endptr;
    int value = strtol(str, &endptr, 10);

    if (endptr == str || *endptr != '\0') {
        exit(EXIT_FAILURE);
    }

    return value;
}
