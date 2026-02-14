package Leetcode.Medium;
public class Lexicographically_Smallest_Equivalent_String_1061 {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int leaders[]=new int[26];
        for(int i=0;i<26;i++){
            leaders[i]=i;
        }
        for(int i=0;i<s1.length();i++){
            int Left=s1.charAt(i)-'a';
            int Right=s2.charAt(i)-'a';
            change(Left,Right,leaders);
        }
        for(int i=0;i<26;i++){
            leaders[i]=find(leaders[i],leaders);
        }
        char[] base = baseStr.toCharArray();
        for(int i=0;i<baseStr.length();i++){
            base[i]=(char)(leaders[baseStr.charAt(i)-'a']+'a');
        }
        String str = String.valueOf(base);
        return str;

    }

    public static void change(int left,int right,int leaders[]){
            int Left=find(leaders[left],leaders);
            int Right=find(leaders[right],leaders);
            if(Left<Right){
                leaders[Right]=Left;
            }else{
                leaders[Left]=Right;
            }
    }
    public static int find(int node,int []leaders){
        if(leaders[node]==node)return node;
        leaders[node]=find(leaders[node],leaders);
        return leaders[node];

    }
}