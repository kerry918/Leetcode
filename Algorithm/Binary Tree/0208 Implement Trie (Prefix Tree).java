class Trie {
  // dummy node
  private Node root; 
  /** Initialize your data structure here. */
  public Trie() {
    // empty character
    root = new Node('\0'); 
  }
  
  /** Inserts a word into the trie. */
  public void insert(String word) {
    Node curr = root; 
    // loop over all character
    for (int i = 0; i < word.length(); i++){
      char c = word.charAt(i); 
      // creating new node with the character at the index
      if (curr.children[c - 'a'] == null) curr.children[c - 'a'] = new Node(c); 
      // moving down the chain
      curr = curr.children[c - 'a']; 
    }
    curr.isWord = true; 
  }
  
  /** Returns if the word is in the trie. */
  public boolean search(String word) {
    Node node = getNode(word); 
    return node != null && node.isWord; 
  }
  
  /** Returns if there is any word in the trie that starts with the given prefix. */
  public boolean startsWith(String prefix) {
    return getNode(prefix) != null; 
  }
  
  // helper function
  private Node getNode(String word){
    // return the very last node in the word 
    Node curr = root; 
    // loop over the word
    for (int i = 0; i < word.length(); i++){
      char c = word.charAt(i); 
      // check if node at c is created
      if (curr.children[c - 'a'] == null) return null; 
      curr = curr.children[c - 'a']; 
    }
    return curr; 
  }
  
  class Node {
    public char c; 
    public boolean isWord; 
    // store children 26
    public Node[] children; 
    
    // constructor
    public Node(char c){
      this.c = c; 
      isWord = false; 
      children = new Node[26]; 
    }
  }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */