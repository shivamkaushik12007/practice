import re
def fun(s):
    if not("@" in s and "." in s and s.index("@")<s.index(".")):
        return False
    a=s[:s.index("@")]
    regex = re.compile('[@!#$%^&*()<>?/\|}{~:]') 
    if (regex.search(a) or len(a)==0):
        return False
    a=s[s.index("@")+1:s.index(".")]
    if not (a.isalnum() or len(a)==0):
        return False
    a=s[s.index(".")+1:]
    if not(len(a)>0 and len(a)<4):
        return False
    return True
    # return True if s is a valid email, else return False

def filter_mail(emails):
    return list(filter(fun, emails))

if __name__ == '__main__':
    n = int(input())
    emails = []
    for _ in range(n):
        emails.append(input())

filtered_emails = filter_mail(emails)
filtered_emails.sort()
print(filtered_emails)
