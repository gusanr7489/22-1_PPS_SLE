class Solution {
public:
    bool backspaceCompare(string s, string t) {
        vector<char> a;
        vector<char> b;
        int length;
        for(int i = 0; i < s.length(); i++){
            if(s[i] == '#'){
                if(a.size() == 0)continue;
                a.pop_back();
            }
            else a.push_back(s[i]);
        }
        for(int i = 0; i < t.length(); i++){
            
            if(t[i] == '#'){
                if(b.size() == 0)continue;
                b.pop_back();
            }
            else b.push_back(t[i]);
        }
        
        
        if(a.size() != b.size()){
            return false;
        }
        for(int i = 0; i <a.size(); i++){
            if(a[i] != b[i])return false;
        }

        return true;
    }
};