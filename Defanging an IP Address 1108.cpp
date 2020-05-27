class Solution {
public:
    string defangIPaddr(string address) {
        for(int i = 0; i < address.length(); i++){
            if (address[i+1] == '.'){
                address.insert(++i,"[");
                i+=2;
                address.insert(i,"]");
            }
        }
        return address; 
    }
};
