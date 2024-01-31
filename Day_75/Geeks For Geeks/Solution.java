static void insert(TrieNode root, String key)
{
    TrieNode curr=root;
    for(int i=0;i<key.length();i++) 
    {
        int index=key.charAt(i)-'a';
        if(curr.children[index]==null) 
        {
            curr.children[index]=new TrieNode();
		}
		curr=curr.children[index];
	}
	curr.isEndOfWord=true;
}

static boolean search(TrieNode root, String key){
    if(root==null) 
    {
        return false;
    }
    TrieNode curr=root;
    for(int i=0;i<key.length();i++) 
    {
        int index=key.charAt(i)-'a';
        if(curr.children[index]==null) 
        {
            return false;
		}
		curr=curr.children[index];
	}
	return curr.isEndOfWord;
}
