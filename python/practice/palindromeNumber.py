s="1"
k=2
for i in range(int(input())):
    print(s)
    s=s[:int(len(s)/2)+1]
    p=s[::-1]
    s=s+str(k)+p
    k+=1
    
# # s="1"
# # k=2
# # for i in range(int(input())):
# #     print(s)
# #     s=s[:int(len(s)/2)+1]
# #     p=s[::-1]
# #     s=s+str(k)+p
# #     k+=1
# for i in range(0,int(input())): 
#     print([1,121,12321,1234321,123454321,12345654321,1234567654321,123456787654321,12345678987654321][i])
# for i in range(1,int(input())+1):
#     print((10**i//9)**2)
