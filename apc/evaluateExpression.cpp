 int val(string s)
{
    return stoi(s);
}
int Solution::evalRPN(vector<string> &a) {
stack<string> s;
int i = 0;
while( i  < a.size() )
{
    if( a[i] == "+" || a[i] == "-" || a[i] == "/" || a[i] == "*" )
    {
        int n1 = val(s.top());
        s.pop();
        int n2 = val(s.top());
        s.pop();
        if(a[i] == "+")
        n1 = n1 + n2;
        if(a[i] == "-")
        n1 = n2 - n1;
        if(a[i] == "/")
        n1 = n2 / n1;
        if(a[i] == "*")
        n1 = n1 * n2;
        s.push(to_string(n1));
    }
    else
    {
        s.push(a[i]);
    }
    i++;
}
return val(s.top());
}
