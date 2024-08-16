const sendMessage = f => {
    f=f.split('');
    var ans='';
    var u=0;
    for (var i=0; i<f.length; ++i)
    {
        if (f[i]>='a' && f[i]<='z')
            if (u==1)
            {
                ans+='#';
                u=0;
            }
        if (f[i]>='A' && f[i]<='Z')
            if (u==0)
            {
                ans+='#';
                u=1;
            }
        f[i]=f[i].toLowerCase();
        if (f[i]=='a')
        {
            if (ans[ans.length-1]=='2')
                ans+=' ';
            ans+='2';
        }
        if (f[i]=='b')
        {
            if (ans[ans.length-1]=='2')
                ans+=' ';
            ans+='22';
        }
        if (f[i]=='c')
        {
            if (ans[ans.length-1]=='2')
                ans+=' ';
            ans+='222';
        }
        if (f[i]=='d')
        {
            if (ans[ans.length-1]=='3')
                ans+=' ';
            ans+='3';
        }
        if (f[i]=='e')
        {
            if (ans[ans.length-1]=='3')
                ans+=' ';
            ans+='33';
        }
        if (f[i]=='f')
        {
            if (ans[ans.length-1]=='3')
                ans+=' ';
            ans+='333';
        }
        if (f[i]=='g')
        {
            if (ans[ans.length-1]=='4')
                ans+=' ';
            ans+='4';
        }
        if (f[i]=='h')
        {
            if (ans[ans.length-1]=='4')
                ans+=' ';
            ans+='44';
        }
        if (f[i]=='i')
        {
            if (ans[ans.length-1]=='4')
                ans+=' ';
            ans+='444';
        }
        if (f[i]=='j')
        {
            if (ans[ans.length-1]=='5')
                ans+=' ';
            ans+='5';
        }
        if (f[i]=='k')
        {
            if (ans[ans.length-1]=='5')
                ans+=' ';
            ans+='55';
        }
        if (f[i]=='l')
        {
            if (ans[ans.length-1]=='5')
                ans+=' ';
            ans+='555';
        }
        if (f[i]=='m')
        {
            if (ans[ans.length-1]=='6')
                ans+=' ';
            ans+='6';
        }
        if (f[i]=='n')
        {
            if (ans[ans.length-1]=='6')
                ans+=' ';
            ans+='66';
        }
        if (f[i]=='o')
        {
            if (ans[ans.length-1]=='6')
                ans+=' ';
            ans+='666';
        }
        if (f[i]=='p')
        {
            if (ans[ans.length-1]=='7')
                ans+=' ';
            ans+='7';
        }
        if (f[i]=='q')
        {
            if (ans[ans.length-1]=='7')
                ans+=' ';
            ans+='77';
        }
        if (f[i]=='r')
        {
            if (ans[ans.length-1]=='7')
                ans+=' ';
            ans+='777';
        }
        if (f[i]=='s')
        {
            if (ans[ans.length-1]=='7')
                ans+=' ';
            ans+='7777';
        }
        if (f[i]=='t')
        {
            if (ans[ans.length-1]=='8')
                ans+=' ';
            ans+='8';
        }
        if (f[i]=='u')
        {
            if (ans[ans.length-1]=='8')
                ans+=' ';
            ans+='88';
        }
        if (f[i]=='v')
        {
            if (ans[ans.length-1]=='8')
                ans+=' ';
            ans+='888';
        }
        if (f[i]=='w')
        {
            if (ans[ans.length-1]=='9')
                ans+=' ';
            ans+='9';
        }
        if (f[i]=='x')
        {
            if (ans[ans.length-1]=='9')
                ans+=' ';
            ans+='99';
        }
        if (f[i]=='y')
        {
            if (ans[ans.length-1]=='9')
                ans+=' ';
            ans+='999';
        }
        if (f[i]=='z')
        {
            if (ans[ans.length-1]=='9')
                ans+=' ';
            ans+='9999';
        }
        if (f[i]==' ')
        {
            if (ans[ans.length-1]=='0')
                ans+=' ';
            ans+='0';
        }
        if (f[i]=='.')
        {
            if (ans[ans.length-1]=='1')
                ans+=' ';
            ans+='1';
        }
        if (f[i]==',')
        {
            if (ans[ans.length-1]=='1')
                ans+=' ';
            ans+='11';
        }
        if (f[i]=='?')
        {
            if (ans[ans.length-1]=='1')
                ans+=' ';
            ans+='111';
        }
        if (f[i]=='!')
        {
            if (ans[ans.length-1]=='1')
                ans+=' ';
            ans+='1111';
        }
        if (f[i]=='\'')
        {
            if (ans[ans.length-1]=='*')
                ans+=' ';
            ans+='*';
        }
        if (f[i]=='-')
        {
            if (ans[ans.length-1]=='*')
                ans+=' ';
            ans+='**';
        }
        if (f[i]=='+')
        {
            if (ans[ans.length-1]=='*')
                ans+=' ';
            ans+='***';
        }
        if (f[i]=='=')
        {
            if (ans[ans.length-1]=='*')
                ans+=' ';
            ans+='****';
        }
        if ((f[i]>='0' && f[i]<='9')||f[i]=='*'||f[i]=='#')
        {
            if (ans[ans.length-1]==f[i])
                ans+=' '
            ans+=f[i]+'-';
        }
    }
    return ans;
}